import java.util.Scanner;
public class TugasFlowchart113 {
    public static void main(String[] args){
        Scanner input13 = new Scanner(System.in);
        
        int bil1, bil2, bil3 ;

        System.out.print("Masukkan Bilangan 1= ");
        bil1 = input13.nextInt();
        System.out.print("Masukkan Bilangan 2= ");
        bil2 = input13.nextInt();
        System.out.print("Masukkan Bilangan 3= ");
        bil3 = input13.nextInt();

        if (bil1> bil2 && bil1> bil3) {
            System.out.println("Bil 1 adalah bilangan terbesar");
        }
        else if (bil2 > bil1 && bil2 > bil3){
            System.out.println("Bil 2 adalah bilangan terbesar");
        }
        else {
            System.out.println("Bil 3 adalah bilangan terbesar");
        }
    }

    }

