public class BannerApp {

    // Helper method to build O pattern
    public static String[] getOPattern() {
        return new String[]{
                String.join("", "  ***  "),
                String.join("", " *   * "),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", "*     *"),
                String.join("", " *   * "),
                String.join("", "  ***  ")
        };
    }

    // Helper method to build P pattern
    public static String[] getPPattern() {
        return new String[]{
                String.join("", " ***** "),
                String.join("", " *    *"),
                String.join("", " *    *"),
                String.join("", " ***** "),
                String.join("", " *     "),
                String.join("", " *     "),
                String.join("", " *     ")
        };
    }

    // Helper method to build S pattern
    public static String[] getSPattern() {
        return new String[]{
                String.join("", "  *****"),
                String.join("", " *     "),
                String.join("", " *     "),
                String.join("", "  **** "),
                String.join("", "      *"),
                String.join("", "      *"),
                String.join("", " ***** ")
        };
    }

    public static void main(String[] args) {

        String[] o = getOPattern();
        String[] p = getPPattern();
        String[] s = getSPattern();

        // Print banner using enhanced for loop logic
        for (int i = 0; i < 7; i++) {
            System.out.println(o[i] + "  " + o[i] + "  " + p[i] + "  " + s[i]);
        }
    }
}