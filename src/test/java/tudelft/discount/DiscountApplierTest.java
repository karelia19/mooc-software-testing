package tudelft.discount;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountApplierTest {

    private ProductDao dao;
    private DiscountApplier applier;

    @BeforeEach
    void setup() {
        dao = Mockito.mock(ProductDao.class);
        applier = new DiscountApplier(dao);
    }

    @Test
    void appliesDiscountToBusinessProduct() {
        Product businessProduct = new Product("Laptop", 100.0, "BUSINESS");
        Mockito.when(dao.all()).thenReturn(Arrays.asList(businessProduct));

        applier.setNewPrices();

        assertEquals(90.0, businessProduct.getPrice());
    }

    @Test
    void increasesPriceForHomeProduct() {
        Product homeProduct = new Product("Oven", 200.0, "HOME");
        Mockito.when(dao.all()).thenReturn(Arrays.asList(homeProduct));

        applier.setNewPrices();

        assertEquals(220.0, homeProduct.getPrice(), 0.01);
    }

    @Test
    void doesNotChangePriceForOtherCategory() {
        Product otherProduct = new Product("Ball", 50.0, "SPORTS");
        Mockito.when(dao.all()).thenReturn(Arrays.asList(otherProduct));

        applier.setNewPrices();

        assertEquals(50.0, otherProduct.getPrice());
    }

    @Test
    void handlesMultipleProductsWithDifferentCategories() {
        Product business = new Product("Laptop", 100.0, "BUSINESS");
        Product home = new Product("Oven", 100.0, "HOME");
        Product other = new Product("Ball", 100.0, "SPORTS");

        Mockito.when(dao.all()).thenReturn(Arrays.asList(business, home, other));

        applier.setNewPrices();

        // Usamos un margen de error de 0.01
        assertEquals(90.0, business.getPrice(), 0.01);
        assertEquals(110.0, home.getPrice(), 0.01);
        assertEquals(100.0, other.getPrice(), 0.01);
    }
}
