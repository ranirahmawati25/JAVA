/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingstaticdankonstanta;

/**
 *
 * @author willy
 */
public class Mamalia {
    //Variabel jumlahKambing dideklarasikan sebagai statik
    public static int jumlahKambing;
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
       Mamalia.jumlahKambing = 485000;
       System.out.println(NAMA_KAMBING + "memiliki kambing sebanyak "
                            + Mamalia.jumlahKambing);
    }
}

