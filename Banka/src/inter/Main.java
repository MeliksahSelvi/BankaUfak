package inter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Tutar Giriniz :");
        double price=input.nextDouble();

        System.out.print("Kart No Giriniz :");
        String cardNumber=input.next();

        System.out.print("Son Kullanim Tarihi Giriniz :");
        String date=input.next();

        System.out.print("Guvenlik Kodu Giriniz :");
        String cvc=input.next();

        System.out.println("1-A Bankasi");
        System.out.println("2-B Bankasi");
        System.out.print("Banka Seciniz :");
        int selectBank=input.nextInt();

        switch (selectBank){

            case 1:

                ABankasi aPos=new ABankasi("ABankasi","46313543453","123456");
                aPos.connect("127.1.1.1");
                aPos.payment(price,cardNumber,date,cvc);
                break;

            case 2:

                BBankasi bPos=new BBankasi("BBankasi","46313543","789987");
                bPos.connect("127.1.1.1");
                bPos.payment(price,cardNumber,date,cvc);
                break;

            default:
                System.out.println("Duzgun Secim Yapiniz!");
                break;

        }

    }
}
