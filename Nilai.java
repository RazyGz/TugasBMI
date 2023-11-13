import java.util.Scanner;

public class Nilai {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukkan nama");
        String nama = input.nextLine();
        System.out.println("Masukkan Nilai" + nama);
        int nilai = input.nextInt();

        String predikat,kategori;
        //96-100
        if(nilai > 96 && nilai <= 100){
        predikat = "A+";
        kategori = "sangat baik";}

        else if (nilai > 90 && nilai <= 95){
            predikat = "A";
            kategori = "sangat baik";
        }
        System.out.println("Nama: + nama");
        System.out.println("Nilai:"+ nilai);
        System.out.println("predikat + kategori");
    }
}
