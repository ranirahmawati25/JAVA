package latihan4.kambing;

public class Latihan4Kambing {
    
    public void tambahKambing(){
    //Deklarasi variabel lokal
    int jumlahKambing = 0;
    
    jumlahKambing = jumlahKambing + 5;
    System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        Latihan4Kambing kambingJantan = new Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}