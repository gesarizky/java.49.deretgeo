
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gesa Rizky Nugraha
 */
public class deretgeo {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" *************************************************************");
        System.out.println(" *Masukkan Nilai Awal Deret  ");
        System.out.println(" *************************************************************");

        double a = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai Rasio Deret  ");
        System.out.println(" ************************************************************* ");

        double r = sc.nextInt();

        System.out.println(" ************************************************************* ");
        System.out.println(" *Masukkan Nilai Deret  ");
        System.out.println(" ************************************************************* ");

        double n = sc.nextInt();

        double hasilun = Math.pow(r, (n - 1)) * a;
        double hasilsn = a * (Math.pow(r, n) - 1) / (r - 1);

        System.out.println(" *********************************************************** ");
        System.out.println(" Maka Nilai Suku ke "+n+" = " + hasilun);
        System.out.println(" Maka Nilai Penjumlahan Deret  = " + hasilsn);
        System.out.println(" *********************************************************** ");
    }

}
