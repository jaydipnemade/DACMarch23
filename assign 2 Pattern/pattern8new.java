class pattern8new {

    public static void main(String args[]) {

        for (int i = 5; i >= 1; i--) {

            for (int j = 5; j >= (6 - i); j--) {
                System.out.print(" ");
            }

            for (int k = i; k <= 5; k++) {
                System.out.print(k + " ");
            }
            System.out.println(" ");
        }
    }
}