import java.util.Scanner;

class EmpSal{

    static double calculateBonus(double sal, int bonuspercent){
        return sal*bonuspercent/100;
    }

    static double calculateTax(String role, double sal){
        double taxpercent;
        
        if (role.equalsIgnoreCase("Manager")) {
            taxpercent = 10;
        }
        else if (role.equalsIgnoreCase("Engineer")) {
            taxpercent = 8;
        }
        else if (role.equalsIgnoreCase("Intern")) {
            taxpercent = 5;
        }
        else{
            taxpercent = 0;
        }

        return sal*taxpercent/100;
    }

}


public class EmployeeMngSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Emplyee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Role: ");
        String role = sc.nextLine();
        role.equalsIgnoreCase(role);

        System.out.println("Enter Base Salary: ");
        double sal = sc.nextDouble();

        System.out.println("Enter Bonus percentage: ");
        int bonuspercent = sc.nextInt();

        double Bonus = EmpSal.calculateBonus(sal, bonuspercent);

        double grossSal = sal+Bonus;

        double Tax = EmpSal.calculateTax(role, sal);

        double netSal = sal-Tax;


        System.out.println("----Employee System-----");
        System.out.println("Employee ID: "+id);
        System.out.println("Role: "+role);
        System.out.println("Gross salary: "+grossSal);
        System.out.println("Tax Deduction: "+Tax);
        System.out.println("Net Salary: "+netSal);


        sc.close();
    }
}


