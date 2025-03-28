package tudelft.caesarshift;

public class CaesarShiftCipher {

    public String caesarShiftCipher(String message, int shift) {
        StringBuilder sb = new StringBuilder();
        shift = shift % 26; // Ajustar el desplazamiento para que no exceda el limite

        for (char currentChar : message.toCharArray()) {
            if (currentChar == ' ') {
                sb.append(' '); // Mantener espacios sin cambios
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                char shiftedChar = (char) (currentChar + shift);

                if (shiftedChar > 'z') {
                    shiftedChar = (char) (shiftedChar - 26); // Rotar dentro del los limites
                } else if (shiftedChar < 'a') {
                    shiftedChar = (char) (shiftedChar + 26);
                }

                sb.append(shiftedChar);
            } else {
                return "invalid"; // Si contiene caracteres incorrectoss
            }
        }
        return sb.toString();
    }
}

