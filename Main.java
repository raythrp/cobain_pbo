package latihan;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 21 September 2023
 * @author Rayhan Athar Prasnaputra
 * 140810220055
 */
public class Main {

    public static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        PersegiPanjang satu = new PersegiPanjang();

        inputPersegiPanjang(satu);

        outPersegiPanjang(satu);
    }

    public static void outPersegiPanjang(PersegiPanjang a) {
        System.out.println("Keliling: " + df.format(a.getKeliling()));
        System.out.println("Luas: " + df.format(a.getLuas()));
    }

    public static void inputPersegiPanjang(PersegiPanjang a) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang\n>> ");
        a.setPanjang(sc.nextInt());
        System.out.print("Lebar\n>> ");
        a.setLebar(sc.nextInt());
    }

}
