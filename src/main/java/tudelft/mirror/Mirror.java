package tudelft.mirror;

public class Mirror {

    public String mirrorEnds(String string) {
        StringBuilder mirror = new StringBuilder();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
                mirror.append(string.charAt(i));
            } else {
                break;
            }
        }

        return mirror.toString();
    }
}

