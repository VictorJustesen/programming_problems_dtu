import java.util.Scanner;

public class andengradsligning {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indtast værdien til a");
        double a=input.nextDouble();

        System.out.println("Indtast værdien til b");
        double b=input.nextDouble();

        System.out.println("Indtast værdien til c");
        double c=input.nextDouble();

        double d=b*b-(4*a*c);
        System.out.println((Math.pow(d, 0.5))); //kan ikke opløfte i en halv
        if (d>0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2 * a);
            System.out.println("d er:"+d);
            System.out.println("rod 1 er:"+r1);
            System.out.println("rod 2 er: "+r2);
        }
        if (d==0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2 * a);
            System.out.println(r1);
        }
        if (d<0) {
            d=-d;
            double r1 = (-b + (Math.pow(d, 0.5))) / (2 * a);
            double r2 = (-b - (Math.pow(d, 0.5))) / (2 * a);
            System.out.println("d er:-"+d);
            System.out.println("rødderne er "+((-b)/(2*a))+"±"+((Math.pow(d, 0.5))/(2*a)+"i"));
        }

    }
}