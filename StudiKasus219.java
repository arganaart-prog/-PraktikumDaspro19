import java.util.Scanner;

public class StudiKasus219 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int juara;
        int statusPendanaan;

        System.out.print("Nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri/PKM/Lainnya): ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("Mandiri")) {

            System.out.print("Peringkat juara (1/2/3, isi 0 jika bukan juara): ");
            juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {

                System.out.print("Jumlah dokumen yang diupload (0-4): ");
                jumlahDokumen = sc.nextInt();

                if (jumlahDokumen == 4) {
                    System.out.println("Nama mahasiswa : " + namaMahasiswa);
                    System.out.println("Jenis kegiatan : " + jenisKegiatan);
                    System.out.println("Status         : Berhak memperoleh dana penghargaan");
                    System.out.println("Alasan         : Juara " + juara + " dan dokumen lengkap.");
                } else {
                    System.out.println("Nama mahasiswa : " + namaMahasiswa);
                    System.out.println("Jenis kegiatan : " + jenisKegiatan);
                    System.out.println("Status         : Dana penghargaan tidak diberikan");
                    System.out.println("Alasan         : Dokumen tidak lengkap.");
                    System.out.println("Kekurangan     : " + (4 - jumlahDokumen) + " dokumen.");
                }

            } else {
                System.out.println("Nama mahasiswa : " + namaMahasiswa);
                System.out.println("Jenis kegiatan : " + jenisKegiatan);
                System.out.println("Status         : Dana penghargaan tidak diberikan");
                System.out.println("Alasan         : Hanya Juara 1, 2, atau 3 yang memperoleh dana.");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos): ");
            statusPendanaan = sc.nextInt();

            if (statusPendanaan == 1) {

                System.out.print("Jumlah dokumen yang diupload (0-4): ");
                jumlahDokumen = sc.nextInt();

                if (jumlahDokumen == 4) {
                    System.out.println("Nama mahasiswa : " + namaMahasiswa);
                    System.out.println("Jenis kegiatan : " + jenisKegiatan);
                    System.out.println("Status         : Berhak memperoleh dana penghargaan");
                    System.out.println("Alasan         : PKM lolos pendanaan dan dokumen lengkap.");
                } else {
                    System.out.println("Nama mahasiswa : " + namaMahasiswa);
                    System.out.println("Jenis kegiatan : " + jenisKegiatan);
                    System.out.println("Status         : Dana penghargaan tidak diberikan");
                    System.out.println("Alasan         : Dokumen tidak lengkap.");
                    System.out.println("Kekurangan     : " + (4 - jumlahDokumen) + " dokumen.");
                }

            } else {
                System.out.println("Nama mahasiswa : " + namaMahasiswa);
                System.out.println("Jenis kegiatan : " + jenisKegiatan);
                System.out.println("Status         : Dana penghargaan tidak diberikan");
                System.out.println("Alasan         : PKM tidak lolos pendanaan.");
            }

        } else {

            System.out.println("Nama mahasiswa : " + namaMahasiswa);
            System.out.println("Jenis kegiatan : " + jenisKegiatan);
            System.out.println("Status         : Dana penghargaan tidak diberikan");
            System.out.println("Alasan         : Jenis kegiatan tidak termasuk ketentuan.");
        }

        sc.close();
    }
}