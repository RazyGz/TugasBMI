import javax.swing.JOptionPane;
public class operators {
    public static void main(String[] args) {
        int angka1 = 14;
        int angka2 = 20;

        int hasilJumlah = angka1+angka2;
        int hasilKurang= angka1-angka2;
        int hasilKali= angka1*angka2;
        int hasilBagi= angka1/angka2;
        int hasilModus= angka1%angka2;
        System.out.println("Hasil Penjumlahan: "+hasilJumlah);
        System.out.println("Hasil Pengurangan: "+hasilKurang);
        System.out.println("Hasil Perkalian: "+hasilKali);
        System.out.println("Hasil Pembagian: "+hasilBagi);
        System.out.println("Hasil Modulus: "+hasilModus);

        String nama= JOptionPane.showInputDialog("Masukkan Nama: ");
    }
}