/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan11.formatting;

/**
 *
 * @author Aditya
 * NAMA     : Aditya Nur Iskandar
 * KELAS    : PBO2/IF2
 * NIM      : 10117070
 * Deskripsi Program : Program ini berisi program untuk mengetahui tentang 
 * Formatting.
 */
public class PBO210117070Latihan11Formatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 3546764;
        int iMinus = -i;
        System.out.println("i\t:\t"+i);
        System.out.printf("%%d\t:\t%d%n",i);
        System.out.printf("%%10d\t:\t%10d%n",i);
        System.out.printf("%%+10d\t:\t%+10d%n",i);
        System.out.printf("%%+10d\t:\t%+10d%n",iMinus);
        System.out.printf("%%,10d\t:\t%,10d%n",i);
        System.out.printf("%%-10d\t:\t%-10d%n",i);
        double f = 5675482.982;
        System.out.println("f\t:\t"+f);
        System.out.printf("%%f\t:\t%f%n", f);
        System.out.printf("%%.2f\t:\t%.2f%n", f);
        System.out.printf("%%12.2f\t:\t%12.2f%n", f);
        System.out.printf("%%,12.2f\t:\t%,12.2f%n", f);
        
        
    }
    
}
