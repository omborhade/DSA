package Basic;

public class forloop {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            //for star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //for spaces
            for (int j = 1; j <= 2 * (4 - i); j++) {
                System.out.print(" ");
            }
            //for  stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

        //for second half
        for (int i = 4; i >= 1; i--) {
            //for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //for spaces
            for (int j = 1; j <= 2 * (4 - i); j++) {
                System.out.print(" ");
            }
            //for  stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}