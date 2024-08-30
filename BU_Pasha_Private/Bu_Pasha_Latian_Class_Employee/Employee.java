package BU_Pasha_Private.Bu_Pasha_Latian_Class_Employee;
public class Employee {
    private String nama;
    private double gaji;

    public Employee(String nama, double gaji){
        this.nama = nama;
        this.gaji = gaji;

    }

    public Employee(){
        nama = "Unknown";
        gaji = 0;
    }

    public void print(){
        System.out.println("Nama Karyawan: " + this.nama);
        System.out.println("Gaji Karyawan: " + this.gaji);
    }

    //Getter
    public String getName(){
        return nama;
    }
    public double getSalary(){
        return gaji;
    }

    //Setter
    public void setName(String nama){
        this.nama = nama;
    }
    public void setSalary(double gaji){
        this.gaji = gaji;
    }
}
