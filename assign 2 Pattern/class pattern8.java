class pattern8 {

    public static void main(String args[]) {

        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// for(int a=5;a>=1;a--)
// {
// for(int b=1;b<a;b++)
// {
// System.out.print(" ");
// }
// for(int c=a;c<=5;c++)
// {
// System.out.print(c+ " ");
// }
// System.out.println();
// }