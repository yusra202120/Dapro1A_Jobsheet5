import java.util.Scanner;

public class PemilihanPercobaan130 {
    public static void main(String[] args) {
        Scanner input30 = new Scanner (System.in);

        int angka;

        System.out.print("Masukkan Sebuah Bilangan : ");
        angka = input30.nextInt();

        String output = (angka%2==0)?"Bilangan Genap":"Bilangan Ganjil";
        System.out.println(angka + " adalah " + output);
        
    }
}
