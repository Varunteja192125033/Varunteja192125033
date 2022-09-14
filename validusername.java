public static void main(String[] args) {
        int n = getInt("Give a number: ");
        char c = '1';
        printChar(n, c);

    }

    public static int getInt(String prompt) {
        int input;

        System.out.print(prompt);
        input = console.nextInt();

        return input;
    }

    public static void printChar(int n, char c) {
        for (int i = n; i > 0; i--) {
            System.out.println(c);
        }

    }