package codeWarClasses;

public class yourOrderPlease {
    public static String order(String words) {
        int espacios;
        int espacios2;
        String ord = "";

        for (int j = 0; j < 9; j++) {
            espacios = 0;

            for (int i = 0; i < words.length(); i++) {
                if (words.charAt(i) == ' ')
                    espacios++;
                if (words.charAt(i) == (char) j + 1) {
                    espacios2 = 0;

                    for (int q = 0; q <= words.length(); q++) {
                        if (words.charAt(q) == ' ')
                            espacios2++;
                        if (espacios2 == espacios) {
                            ord = ord + words.charAt(q);
                        }
                    }
                }
            }
        }
        System.out.println(ord);
        return ord;
    }
}
