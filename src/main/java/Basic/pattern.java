package Basic;

public class pattern {
    public static void main(String[] args) {
//           patern number 1
        /*for (int line = 1; line  <= 4 ; line++) {
            for(int star =1;star<=line;star++){
                System.out.print(" * ");
            }
            System.out.println();

        }

        //pattern no 2
         int n = 4;
        for(int line = 1;line<=n;line++){
            for(int star= 1;star<=n-line+1;star++){
                System.out.print(" * ");
            }
            System.out.println();
        }

        //patterm no 3 half pyramid

        for(int line =1;line<=4;line++){
            for(int number = 1;number<=line;number++){
                System.out.print(number);
            }
            System.out.println();
        }
*/
        //patter no 4 character pattern
       /* int n = 4;
        char ch ='A';
        for(int line = 1;line<=n;line++){
            for(int character =1;character<=line;character++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
*/
        //pattern 5
        //hollow rectangle

       /* for (int i = 1; i <=4 ; i++) {
            //inner loop for colums
            for(int j = 1 ; j<=5;j++){
                //for outer boundery print *
                if(i==1||i==4||j==1||j==5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
*/
        //patern 6 inverted rotated half pyramid

        /*for (int i = 1; i <=5; i++) {
            //for printing spaces
            for(int j = 1;j<=5-i;j++){
                System.out.print(" ");
            }
            //for printing stars
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
           System.out.println();

        }*/

        //pattern 7 inverted half pyramid with numbers
        /*for (int i = 1; i <=5; i++) {
            //inner loop colums
            for(int j = 1;j<=5-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }*/

        //floyd's triamgle
        /* int counter = 1;
        for (int i = 1; i <=5 ; i++) {
            //for printing numbers
            for(int j = 1; j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            //for printing spaces
            for(int j = 1;j<=5-i;j++){
              System.out.print(" ");
            }
           System.out.println();
        }*/

        //0-1 triangle
        /*for (int i = 1; i <=5 ; i++) {
            for(int j = 1;j<=i;j++){
                if((j+i) % 2 == 0){
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();


        }*/

        //butterfly pattern
        //first half
        /*for (int i = 1; i <= 4; i++) {
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


        //solid rhombus patter
      /*  for (int i = 1; i <=5 ; i++) {
            //for spaces
            for(int j =1;j<=5-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j = 1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();

        }*/

        //hollow rhombus

        for (int i = 1; i <=5; i++) {
            //for spaces
            for(int j = 1;j<=5-i;j++){
                System.out.print(" ");
            }
            //for star
            for(int j =1;j<=5;j++){
                if(i ==1 ||i ==5|| j == 1||j==5){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        //dimond pattern
        //for first half

     /*  for (int i = 1; i <=4 ; i++) {
            //for spaces
            for(int j =1;j<=4-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j =1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //second half
        for (int i = 4; i>=1 ; i--) {
            //for spaces
            for(int j =1;j<=4-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j =1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //number pyramid

     /*   for (int i = 1; i <= 5 ; i++) {
            //for spaces
            for(int j =1;j<=5-i;j++){
                System.out.print(" ");
            }
            //for numbers
            for(int j =1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();

        }*/
        //palyndromic pattern with numbers
      /*  for (int i = 1; i <=5 ; i++) {
            //for spaces
            for(int j =1;j<=5-i;j++){
                System.out.print(" ");
            }
            //for dscending numbers
            for(int j =i;j>=1;j--){
                System.out.print(j);
            }
            //for ascending order
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }*/

        //dimond pattern practice
       for (int i = 1; i <=5 ; i++) {
            //for spaces
            for(int j = 1; j<=5-i;j++){
                System.out.print(" ");
            }
            //for stars
            for(int j = 1;j<=(i*2)-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //secpnd half
        for (int i = 5; i>=1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            //for stars
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        //number pyramid

       /* for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();*/

            //palindromic pattern with numbers

            /*for (int i = 1; i < +5; i++) {
                //for spaces
                for (int j = 1; j <= 5 - i; j++) {
                    System.out.print(" ");

                }
                //for desending order
                for (int j = i; j >= 1; j--) {
                    System.out.print(j  );
                }
                //for ascending order
                for (int j = 2; j <= i; j++) {
                    System.out.print(j );
                }
                System.out.println();

            }*/

        }

    }




