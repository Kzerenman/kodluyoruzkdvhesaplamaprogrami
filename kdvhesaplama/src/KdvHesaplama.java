import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

// değişkenler tanımlandı. veri girişi için scanner kodu kullanılacak
double anaPara, kdv, kdvli, kdv18=18, kdv8=8;


// kullanıcıdan para değeri alınması
        Scanner input = new Scanner(System.in);
        System.out.print("ANA PARA GİRİNİZ : ");
        anaPara = input.nextDouble();

        //girilen anaparanın istenen degerler içerinde olup olmadığuını sorgulandı
        boolean kosul1 = anaPara >=0;
        boolean kosul2 = anaPara < 1000;
        boolean kosul3 = anaPara >=1000;
        boolean sonuc = kosul1 && kosul2 ;

        // kdv değeri sorgulama sonucuna göre işlemler aktarıldı ve sonuçlar ekrana yazdırıldı
        System.out.println("KDV'Lİ FİYAT : " + anaPara);

        kdv = sonuc ? kdv18 : kdv8;
        kdvli = anaPara + ((anaPara*kdv)/100);

        System.out.println("KDV'Lİ FİYAT : " + kdvli);
        System.out.println("KDV TUTARI : " + kdv/ 10);
    }
}
