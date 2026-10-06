import java.util.Scanner;

public class StudiKasus219 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama mahasiswa  : ");
        String nama = input.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = input.nextLine().trim().toUpperCase();

        boolean lomba = jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI");
        boolean pkm = jenis.equals("PKM");
        boolean lainnya = jenis.equals("LAINNYA");

       
        if (lomba) {
            System.out.print("Jumlah dokumen  : ");
            int dokumen = input.nextInt();
            System.out.print("Peringkat juara : ");
            int juara = input.nextInt();

            if (juara >= 1 && juara <= 3) {                
                if (dokumen == 4) {                          
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Bukan juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }
        }

    
        if (pkm) {
            System.out.print("Jumlah dokumen  : ");
            int dokumen = input.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            int statusPkm = input.nextInt();

            if (statusPkm == 1) {                          
                if (dokumen == 4) {                          
                    System.out.println("Status : Dokumen lengkap dan PKM lolos pendanaan. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang " + (4 - dokumen)
                            + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : PKM tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
            }
        }
        if (lainnya) {
            System.out.println("Status : Kegiatan lainnya tidak memperoleh dana penghargaan.");
        }

        if (!lomba && !pkm && !lainnya) {
            System.out.println("Status : Jenis kegiatan tidak valid.");
        }

        input.close();
    }
}