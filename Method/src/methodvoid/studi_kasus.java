/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodvoid;

/**
 *
 * @author ATIK
 */
public class studi_kasus {
    public static String tulisan = "Selamat Belajar Method pada Java!";

	public static void cetakTulisan(){
		System.out.println(tulisan);
	}

	public static void cetakNama(String nama){
		System.out.println("Nama saya adalah "+nama);
	}

	public static void main(String[] args){
		cetakTulisan();
		cetakNama("Atiqotuz Zummah");
	}
}

