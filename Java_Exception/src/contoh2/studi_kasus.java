/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh2;

/**
 *
 * @author ATIK
 */
public class studi_kasus {
     public static void main (String[] args){
        System.out.println("awal program");

        int x = 10;

        try {
            x = x / 0;
        }
        catch (Exception e){
            e.printStackTrace();
            System.out.println("error karena pembagian nol");
        }

        System.out.println(x);

        System.out.println("akhir program");
    }

    
}
