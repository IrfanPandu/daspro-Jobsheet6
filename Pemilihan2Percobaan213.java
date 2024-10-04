import java.util.Scanner;
public class Pemilihan2Percobaan213{

    public static void main(String[] args) {
        Scanner input13 = new Scanner(System.in);
        System.out.println("masukkan pilihan menu : ");
        String menu,member;
        double diskon,total_bayar;
        int pilihan_menu, jumlah_beli ;
        int harga = 0;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.println("masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input13.nextInt();
        input13.nextLine();
        System.out.println("apakah anda member (ya/tidak) ? = ");
        member = input13.nextLine();
        System.out.println("--------------------------------------");

        if (member.equalsIgnoreCase("ya")) { 
            diskon = 0.10;
            System.out.println("besar diskon = 10%");
            if  (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("harga Ricebowl= " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000 ;
                System.out.println("harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga Paket Bunding = " + harga);
            } else {
                System.out.println("masukkanpilihan menu dengan benar");
                return;         }     
total_bayar = harga - (harga * diskon);
System.out.println("total bayar setelah diskon = " + total_bayar);


        } else if (member.equalsIgnoreCase("tidak")) {
            if  (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("harga Paket Bunding = " + harga);
            } else {
                System.out.println("masukkan pilihan menu dengan benar");
                return; 
            }
            System.out.println("total bayar = " + harga);

        } else {
            System.out.println("member tidak valid");
        System.out.println("--------------------------------------");

            
 

        
    }
    }
}