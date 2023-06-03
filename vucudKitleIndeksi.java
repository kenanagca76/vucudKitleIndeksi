package vucutKitleIndeksi;
import java.util.Scanner;
public class vucutKitleIndeksi {
    /*
    Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
     */
    public static void main(String[] args) {
        double boy,vki;
        int kilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (metre cinsinden) Giriniz : ");
        boy = input.nextDouble();

        System.out.print("Lütfen Kilonuzu Girin : ");
        kilo = input.nextInt();

        vki = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + vki);

    }
}
