//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        double a,b,c,u,Alan;


        Scanner girdi = new Scanner(System.in);


        System.out.println("1.Kenarı Giriniz : ");
        a = girdi.nextDouble();


        System.out.println("2.Kenarı Giriniz : ");
        b = girdi.nextDouble();


        System.out.println("3.Kenarı Giriniz : ");
        c = girdi.nextDouble();

        u = (a + b + c) / 2;
        System.out.println("Ucgenin cevresi : "+u);

        Alan =  Math.sqrt (u * (u - a) * (u - b) * (u - c));

        System.out.println("Ucgenin alani :"+Alan);






    }
}