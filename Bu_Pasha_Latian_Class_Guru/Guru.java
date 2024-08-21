package Bu_Pasha_Latian_Class_Guru;

public class Guru {
    int id;
    String nama, mapel, alamat;

    public Guru(int id, String nama, String mapel, String alamat) {
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;

    }

    public Guru(){
        
        id = 0;
        nama = "Unknown";
        mapel = "Unknown";
        alamat = "Unknown";
    }

    public void profil(){
        System.out.println("=== Profil Guru ===");
        System.out.println("ID: " + this.id);
        System.out.println("Nama: " + this.nama);
        System.out.println("Mapel: " + this.mapel);
        System.out.println("Alamat: " + this.alamat);

    }

}
