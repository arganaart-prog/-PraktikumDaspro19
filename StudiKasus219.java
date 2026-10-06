import java.util.Scanner;
public class StudiKasus219 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int jumlahDokumen;
        int juara;

        System.out.print("Nama mahasiswa: ");
        namaMahasiswa = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/Mandiri): ");
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

        } else {
            System.out.println("Jenis kegiatan belum diproses pada commit ini.");
        }

        sc.close();
    }
}