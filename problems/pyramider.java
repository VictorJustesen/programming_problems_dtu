
import java.util.Scanner;

        public class pyramider {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("indtast værdien af a: ");
                int a = input.nextInt();
                int y, i, j;


                for (y = a; y > 0; y--) {
                    System.out.println("dette er pyramide nummer: "+y);
                    for (i = y; i > 0; i--) {
                        for (j = i; j > 0; j--) {
                            System.out.print("#");
                        }

                        System.out.println();
                    }
                    System.out.println();
                }
            }
}