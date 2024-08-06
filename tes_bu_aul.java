import java.util.Scanner;

public class tes_bu_aul {
    public static void main(String[] args) {
        // String nama="Shabri";
        // String alamat="Singosari";
        // int usia=16;
        // char jenisKelamin='l';
        // double beratBadan=58.00;
        // boolean status=true;
        // System.out.println("Nama saya " + nama);
        // System.out.println("Alamat saya di " + alamat);
        // System.out.println("Usia saya " + usia);
        // System.out.println("Gender saya " + jenisKelamin);
        // System.out.println("Beratku " + beratBadan);
        // System.out.println("Status " + status); 
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.next();
        System.out.println("Yow " + nama + ", yang semangat belajar Javanya");
        System.out.println("Kalo boleh tau, umur berapa nih? ");
        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        System.out.println("Ohh umur " + umur + " ya...");
        System.out.print("Lakik (L) atau Perempuan (P)? ");
        char gender = input.next().charAt(0);
        System.out.println("Okee " + gender + " yaa");
    }
}

//Shortcut : ctrl + / untuk ngubah jadi command
//Shortcut : alt + shift + up/down arrow untuk copas secara otomatis ke row berikutnya
//Shortcut : ctrl + alt + up/down arrow untuk memperbanyak kursor ke row berikutnya
//Shortcut : ctrl + d untuk memperbanyak kursor ke kode yang sama saja
//Shortcut : ctrl + a, kemudian alt + shift + s untuk merapikan codingan
