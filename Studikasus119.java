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
