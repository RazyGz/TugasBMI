import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        //1. Membuat program sederhana BMI
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Berat Badan : ");
        double Berat = input.nextDouble();

        System.out.print("Masukkan Tinggi Badan : ");
        double Tinggi = input.nextDouble();

        System.out.println();

        double konversiBerat = Berat * 2.205;
        double konversiTinggi = Tinggi / 2.54;
        double RumusBmi = konversiBerat / konversiTinggi*konversiTinggi *703;
        System.out.println("BMI = " + RumusBmi);

        //2. Menghitung volume bangun ruang
        //a.Bola V = 4/3 x 22/7  x r³
        Scanner inputBola = new Scanner (System.in);
        System.out.print("Masukkan Jari Jari : ");
        double JariJari = inputBola.nextDouble();

        double PhiPhi = 3.14;
        double volumeBola = 4/3 * PhiPhi * JariJari * JariJari;
        System.out.println("volume Bola Adalah : "+ volumeBola);

        //b. Tabung
        //Tabung V = phi x r x r x t
        Scanner inputTabung = new Scanner(System.in);

        System.out.println("Masukkan Jari Jari : ");
        
    }
}
