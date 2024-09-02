package BU_Pasha_Private.Bu_Pasha_Latian_Class_Employee;
public class driverEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        Employee e3 = new Employee();

        e1.setName("Yanto");
        e1.setSalary(100_000_000);
        e2.setName("Audy");
        e2.setSalary(90_000_000);
        e3.setName("Shabri");
        e3.setSalary(150_000_000);

        e1.setRating(2);
        e2.setRating(1000);
        e3.setRating(10);

        
        if ((e1.getRating() < 5) & (e1.getRating() > 3)){
            e1.cutSalary();
            System.out.println(e1.getName() + " Dipotong gajinya 10%");
        }
        else if (e1.getRating() < 3){
            e1.fire();
            System.out.println(e1.getName() + " Dipecat");
        }
        else if ((e1.getRating() >= 5) & (e1.getRating() < 8)){
            System.out.println(e1.getName() + " Aman");
        }
        else{
            e1.increaseSalary();
            System.out.println(e1.getName() + " Gajinya meningkat 20%");
        }
        if ((e2.getRating() < 5) & (e2.getRating() > 3)){
            e2.cutSalary();
            System.out.println(e2.getName() + " Dipotong gajinya 10%");
        }
        else if (e2.getRating() < 3){
            e2.fire();
            System.out.println(e2.getName() + " Dipecat");
        }
        else if ((e2.getRating() >= 5) & (e2.getRating() < 8)){
            System.out.println(e2.getName() + " Aman");
        }
        else{
            e2.increaseSalary();
            System.out.println(e2.getName() + " Gajinya meningkat 20%");
        }
        if ((e3.getRating() < 5) & (e3.getRating() > 3)){
            e3.cutSalary();
            System.out.println(e3.getName() + " Dipotong gajinya 10%");
        }
        else if (e3.getRating() < 3){
            e3.fire();
            System.out.println(e3.getName() + " Dipecat");
        }
        else if ((e3.getRating() >= 5) & (e3.getRating() < 8)){
            System.out.println(e3.getName() + " Aman");
        }
        else{
            e3.increaseSalary();
            System.out.println(e3.getName() + " Gajinya meningkat 20%");
        }

    

    }
}
