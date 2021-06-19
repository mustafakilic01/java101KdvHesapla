import java.util.Scanner;
public class kdvhesap {
    public static void main(String[] args) {

        //Scanner sınıfını tanımladık.
        Scanner deger = new Scanner(System.in);

        //İlk önce kullanıcının ödediği tutar.
        System.out.print("Lütfen ödemiş olduğunuz tutarı giriniz : ");
        double tutar = deger.nextDouble();

        //Ödenen tutara 1000 TL altı ise %18, 1000 TL üstü ise %8 KDV uygulama.
        int kdv = (tutar >= 1000)? 8 : 18;

        //Uygulanan KDV oranını gösterme.
        System.out.println("KDV oranı:" + kdv+"%");

        //Uygulanan KDV oranını tutardan hesaplatma.
        double tutardaKdv = ((tutar*kdv)/100);

        //KDV'siz tutar.
        double kdvsizTutar = ((tutar - tutardaKdv));

        //Ödenen tutarın KDVsiz tutarı.
        System.out.println("Ödenen KDV'siz tutar: " + kdvsizTutar);

        //Ödenen tutarın KDV tutarı.
        System.out.println("Ödenen KDV tutarı: " + tutardaKdv);

        //Ödenen toplam tutar(KDV + Ham ücret).
        System.out.println("KDV ile birlikte ödenen toplam tutar: " + (kdvsizTutar + tutardaKdv) );

    }
}
