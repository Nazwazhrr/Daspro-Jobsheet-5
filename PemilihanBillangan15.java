import java.util.Scanner;

/**
 * PemilihanBillangan15
 */
public class PemilihanBillangan15 {

    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        System.out.print("Masukkan angka:  ");
        int angka = input15.nextInt();
        String hasil;

        hasil = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        System.out.println(angka + " adalah " + hasil);
    }
}