package Bu_Pasha_Materi_Class;

//Driver Class
public class TesSiswa {
    public static void main(String[] args) {
        //Membuat Objek
        Siswa dhian = new Siswa();
        Siswa ochi = new Siswa();
        dhian.id = 32847978;
        dhian.nama = "Ardian Pratama";
        dhian.ipk = 1.0;
        ochi.id = 84320984;
        ochi.nama = "Navalosky Allenzo";
        ochi.ipk = 4.0;
        System.out.println("== Data Ardhian ==");
        System.out.println("ID: " + dhian.id);
        System.out.println("Nama: " + dhian.nama);
        System.out.println("IPK: " + dhian.ipk);
        System.out.println("== Data Ochi ==");
        System.out.println("ID: " + ochi.id);
        System.out.println("Nama: " + ochi.nama);
        System.out.println("IPK: " + ochi.ipk);
    }
}
