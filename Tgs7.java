import java.util.Scanner;

public class Tgs7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Panjang");
        int sisi = input.nextInt();
        int luas = sisi*sisi;
        System.out.println("luas Persegi dengan nilai " + sisi + "adalah : " + luas);
    }
}
