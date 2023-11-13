import java.util.Scanner;

public class nolpositifnegatif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bilangan;

        System.out.println("Masukkan nilai sembarang");
        bilangan = input.nextInt();

        if (bilangan == 0){
            System.out.println("Bilangan nol");

        }
        else if (bilangan > 0){
            System.out.println("Bilangan positif");
        }
        else{
            System.out.println("Bilangan negatif");
        }
    }
}
