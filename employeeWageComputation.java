public class employeeWageComputation
{
    public static void main(String[] args)
    {
        System.out.println(">---< EMPLOYEE WAGE COMPUTATION >---<");
        System.out.println("-------------------------------------");

        int PRESENT=1, empRatePerHr=20, is_Part_Time=2, is_Full_Time=1;
        int empWage=0, empHrs=0;

        int employee=(int)(Math.random()*10)%3;
        if(employee == is_Part_Time)
        {
            System.out.println("Employee Is Part Time Present");
            empHrs=4;
        }
        else if (employee == is_Full_Time )
        {
            System.out.println("Employee Is Full Time Present");
            empHrs=8;
        }
        else
        {
            System.out.println("Employee Is Absent");
            empHrs=0;
        }
        empWage = empHrs * empRatePerHr;
        System.out.println("Employee Wage : "+empWage);
    }
}

