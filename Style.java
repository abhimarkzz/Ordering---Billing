class Style {
    static void line() {
        System.out.println("──────────────────────────────────────────────────────────");
    }

    static void title(String text) {
        System.out.println("\n──────────────── " + text + " ────────────────");
    }

    static void center(String text) {
        System.out.printf("%30s%n", text);
    }
}
