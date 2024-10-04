import java.util.Scanner;
public class TugasFlowchart213 {
    public static void main(String[] args){
        Scanner input13 = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;

        System.out.println("Masukkan Jenis Buku (kamus/novel/buku lain) : ");
        jenisBuku = input13.nextLine().toLowerCase();
        System.out.println("Masukkan Jumlah Buku : ");
        jumlahBuku = input13.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2)
            System.out.println("Diskon 12%");
            else if (jumlahBuku <= 2)
            System.out.println("Diskon 10%");
            
        }else if (jenisBuku.equalsIgnoreCase("novel")){
            if (jumlahBuku >3)
            System.out.println("Diskon 9%");
            else if (jumlahBuku <= 3)
            System.out.println("Diskon 8%");

        }else if (jenisBuku.equalsIgnoreCase("buku lain")){
            if (jumlahBuku > 3)
            System.out.println("Diskon 5%");
            else if (jumlahBuku <= 3)
            System.out.println("Diskon 0%");
        }
        else{
        System.out.println("Invalid");
         }
    }

}

