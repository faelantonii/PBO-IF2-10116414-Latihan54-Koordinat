/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan54_Koordinat;

/**
 *
 * @author sweenutt
 * Nama       : Fael Antoni Wijaya 
 * Kelas      : PBO2/IF 2 
 * Nim        : 10116414
 * Deskripsi  : Program menampilkan data koordinat
 */
public class PBO_IF2_10116414_Koordinat {
    public static void main(String[] args) {
        int x = 10;
        int y = 4;
        String warna = "Jingga";
        WarnaKoordinat w = new WarnaKoordinat(x,y,warna);
        w.setNamaWarna(warna);
        w.setX(x);
        w.setY(y);
        
        System.out.println("Warna Koordinat : " + w.getNamaWarna());
        System.out.println("Koordinat Sumbu : " + w.getX() + ", y : " + w.getY());
    
    }
}
