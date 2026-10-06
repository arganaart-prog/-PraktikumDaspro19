import java.util.Scanner;

public class Studikasus119 {
    public static void main(String[] args) {

        int Hargapercup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalbayar;
        int kembalian;

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = sc.nextInt();

        System.out.print("Masukkan uang bayar: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * Hargapercup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        }

        totalbayar = totalHarga - diskon;

    
        if (uangBayar >= totalbayar) {
            kembalian = uangBayar - totalbayar;

            System.out.println("Total harga : Rp" + totalHarga);
            System.out.println("Diskon      : Rp" + diskon);
            System.out.println("Total bayar : Rp" + totalbayar);
            System.out.println("Kembalian   : Rp" + kembalian);

        } else {
            kembalian = totalbayar - uangBayar;

            System.out.println("Total harga : Rp" + totalHarga);
            System.out.println("Diskon      : Rp" + diskon);
            System.out.println("Total bayar : Rp" + totalbayar);
            System.out.println("Uang tidak cukup");
            System.out.println("Kekurangan  : Rp" + kembalian);
        }

        sc.close();
    }
}

 
