package BU_Pasha_Private.Bu_Pasha_Latian_Class_Employee;
public class driverEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.setName("Yanto");
        e1.setSalary(100_000_000);

        System.out.println("Nama: " + e1.getName());
        System.out.println("Gaji: " + e1.getSalary());
    }
}
