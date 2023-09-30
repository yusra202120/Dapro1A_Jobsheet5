import java.util.Scanner;

public class PemilihanPercobaan230 {
    public static void main(String[] args) {
        Scanner input30 = new Scanner(System.in);
        String nilaiHuruf = "null";

        System.out.print("Nilai uas     : ");
        float uas = input30.nextFloat();
        System.out.print("Niali uts     : ");
        float uts = input30.nextFloat();
        System.out.print("Nilai kuis    : ");
        float kuis = input30.nextFloat();
        System.out.print("Nilai tugas   : ");
        float tugas = input30.nextFloat();

        float total = (uas* 0.4F) + (uts*0.3F) + (kuis * 0.1F) + (tugas * 0.2F);
        String message = total < 65 ? "Remidi" : "Tidak remidi";
        System.out.println("Nilai akhir = " + total +" sehingga " + message);

        if (total > 80 && total <= 100) { 
            nilaiHuruf = "A";
        } else if (total > 73 && total <= 80) { 
            nilaiHuruf = "B+";
        } else if (total > 65 && total <= 73) { 
            nilaiHuruf = "B";
        } else if (total > 60 && total <= 65) {
            nilaiHuruf = "C="; 
        }else if (total > 50 && total <= 60) { 
            nilaiHuruf = "C";
        } else if (total > 39 && total <= 50) { 
            nilaiHuruf = "D";
        } else if (total <= 39) {
            nilaiHuruf = "E";
        }

        System.out.println("Nilai Kompetensi yaitu " + nilaiHuruf);
    }
}
