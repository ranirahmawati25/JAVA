/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingglobal;

/**
 *
 * @author willy
 */
public class KambingGlobal {

    //variabel jumlah kambing menjadi variabel instance
    int jumlahKambing = 88;
    
       public void getJumlahKambing(){
        System.out.println("Jumlah Kambing: "+ jumlahKambing);
       }
            public void tambahKambing(){
                jumlahKambing = jumlahKambing + 5;
                System.out.println("Jumlah Kambing setelah ditambah: "+ jumlahKambing);  
            }
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //Menampilkan jumlah kabing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing 
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
    }
    
    
}
