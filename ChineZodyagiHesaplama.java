import java.util.Scanner;

public class ChineZodyagiHesaplama {
    public static void main(String[] args) {

        int dogumYili;

        Scanner input=new Scanner(System.in);
        System.out.print("Dogum Yilinizi Giriniz: ");
        dogumYili=input.nextInt();

        switch (dogumYili%12){
            case 0:
                System.out.println("Chine Zodyagi Burcunuz MAYMUN");
                break;
            case 1:
                System.out.println("Chine Zodyagi Burcunuz HOROZ");
                break;
            case 2:
                System.out.println("Chine Zodyagi Burcunuz KOPEK");
                break;
            case 3:
                System.out.println("Chine Zodyagi Burcunuz DOMUZ");
                break;
            case 4:
                System.out.println("Chine Zodyagi Burcunuz FARE");
                break;
            case 5:
                System.out.println("Chine Zodyagi Burcunuz OKUZ");
                break;
            case 6:
                System.out.println("Chine Zodyagi Burcunuz KAPLAN");
                break;
            case 7:
                System.out.println("Chine Zodyagi Burcunuz TAVSAN");
                break;
            case 8:
                System.out.println("Chine Zodyagi Burcunuz EJDERHA");
                break;
            case 9:
                System.out.println("Chine Zodyagi Burcunuz YILAN");
                break;
            case 10:
                System.out.println("Chine Zodyagi Burcunuz AT");
                break;
            case 11:
                System.out.println("Chine Zodyagi Burcunuz KOYUN");
                break;
        }
    }
}

/*
Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun
 */