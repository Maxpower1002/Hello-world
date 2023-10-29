import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int twixPrice =5;
       int marsPrice =5;
       int snickersPrice =6;
       int colaPrice =7;
       boolean isCanBuy=false;

       System.out.println("Enter the amount of money");
       int moneyAmount =new Scanner(System.in).nextInt();
       if (moneyAmount>= twixPrice) {
           System.out.println("You can buy twix");
           isCanBuy=true;
        }
       if (moneyAmount>=marsPrice) {
           System.out.println("You can buy mars");
           isCanBuy=true;
       }
        if (moneyAmount>=snickersPrice)  {
            System.out.println("You can buy snickers");
            isCanBuy=true;
        }

       if (moneyAmount>=colaPrice) {
           System.out.println("You can buy cola");
           isCanBuy=true;
       }
       if (isCanBuy==false)
           System.out.println("Fuck you.No money no funny");

    }
}
