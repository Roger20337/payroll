import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner kb= new Scanner(System.in);
        int EmployementType;
        double HoursWorked,TotalSales,FixedSalary,HourPayment,TotalPayment;
        HourPayment=10.23;
        FixedSalary=400;
        do {
           System.out.println("Choose your employement type: ");
           System.out.println("1- Salaried employee");
           System.out.println("2- Hourly employee");
           System.out.println("3- Commission employee");
           System.out.println("4- Salaried-commission employee");
            EmployementType= kb.nextInt();
       } while (EmployementType<=0||EmployementType>4);
        if (EmployementType==1){
            System.out.println("you have an fixed salary of £"+FixedSalary+" weekly");
        }
        else if(EmployementType==2){
            System.out.println("How many wours have you worked this week? ");
            HoursWorked= kb.nextDouble();
            TotalPayment=HoursWorked*HourPayment;
            System.out.println("This week your payment will be £ "+TotalPayment);
        }
        else if(EmployementType==3){
            System.out.println("How much have you sold this week? ");
            TotalSales= kb.nextDouble();
            TotalPayment=TotalSales*0.08;
            System.out.println("This week your Payment will be £ "+TotalPayment);
        }
        else{
            System.out.println("How much have you sold this week? ");
            TotalSales=kb.nextDouble();
            TotalPayment=(FixedSalary*1.1)+(TotalSales*0.05);
            System.out.println("Your Salary this week will be £ "+TotalPayment);
        }

    }
}
