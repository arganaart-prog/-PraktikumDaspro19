import java.util.Scanner;

public class StudiKasus219 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        String status;
        int jumlahDokumen = 0;
        int juara = 0;
        int statusPendanaan = 0;

        System.out.print("Nama mahasiswa  : ");
        namaMahasiswa = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") ||
            jenisKegiatan.equalsIgnoreCase("BAKORMA") ||
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah dokumen  : ");
            jumlahDokumen = sc.nextInt();

            System.out.print("Peringkat juara : ");
            juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {

                if (jumlahDokumen == 4) {
                    status = "Berhak memperoleh dana penghargaan.";
                } else {
                    status = "Dokumen tidak lengkap (kurang "
                            + (4 - jumlahDokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }

            } else {
                status = "Tidak memperoleh dana penghargaan "
                        + "(hanya untuk Juara 1/2/3).";
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Jumlah dokumen  : ");
            jumlahDokumen = sc.nextInt();

            System.out.print("Status pendanaan PKM (1=lolos, 0=tidak) : ");
            statusPendanaan = sc.nextInt();

            if (statusPendanaan == 1) {

                if (jumlahDokumen == 4) {
                    status = "Berhak memperoleh dana penghargaan "
                            + "(PKM lolos pendanaan).";
                } else {
                    status = "Dokumen tidak lengkap (kurang "
                            + (4 - jumlahDokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.";
                }

            } else {
                status = "Tidak memperoleh dana penghargaan "
                        + "(PKM tidak lolos pendanaan).";
            }

        } else {

            status = "Tidak memperoleh dana penghargaan "
                    + "(jenis kegiatan tidak termasuk ketentuan).";
        }

        System.out.println();
        System.out.println("Nama mahasiswa  : " + namaMahasiswa);
        System.out.println("Jenis kegiatan  : " + jenisKegiatan);
        System.out.println("Jumlah dokumen  : " + jumlahDokumen);
        System.out.println("Peringkat juara : " + juara);
        System.out.println("Status : " + status);

        sc.close();
    }
}