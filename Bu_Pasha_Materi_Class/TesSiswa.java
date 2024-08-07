package Bu_Pasha_Materi_Class;

//Driver Class
public class TesSiswa {
    public static void main(String[] args) {
        //Membuat Objek
        Siswa dhianSigma = new Siswa();
        Siswa ochiSkibidi = new Siswa();
        dhianSigma.id = 32847978;
        dhianSigma.nama = "Ardian Pratama";
        dhianSigma.ipk = 1.0;
        ochiSkibidi.id = 84320984;
        ochiSkibidi.nama = "Navalovsky Allenzo";
        ochiSkibidi.ipk = -4.0;
        System.out.println("== Data Ardhian ==");
        System.out.println("ID: " + dhianSigma.id);
        System.out.println("Nama: " + dhianSigma.nama);
        System.out.println("IPK: " + dhianSigma.ipk);
        System.out.println("== Data ochiSkibidi ==");
        System.out.println("ID: " + ochiSkibidi.id);
        System.out.println("Nama: " + ochiSkibidi.nama);
        System.out.println("IPK: " + ochiSkibidi.ipk);
    }
}
