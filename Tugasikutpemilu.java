import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Tugasikutpemilu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Umur Anda");
        int umur = input.nextInt();

        if (umur >= 17){
            System.out.println("ANDA BOLEH IKUT PEMILU");
        } 
        else {
            System.out.println("ANDA TIDAK BOLEH IKUT PEMILU");
        }
    }
}
