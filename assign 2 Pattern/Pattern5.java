/*
A  
B B  
C C C  
D D D D  
E E E E E  */

class Pattern5 {
    public static void main(String args[]) {
        int A = 65;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (A + i) + " ");
            }
            System.out.println(" ");

        }

    }
}