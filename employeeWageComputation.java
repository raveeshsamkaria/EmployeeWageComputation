public class employeeWageComputation
{
    public static void main(String[] args)
    {
        System.out.println(">---< EMPLOYEE WAGE COMPUTATION >---<");
        System.out.println("-------------------------------------");

        int empRatePerHr=20, PRESENT=1;
        int empWage=0, empHrs=0;

        int employee=(int)(Math.random()*10)%2;
        if(PRESENT==employee)
        {
            System.out.println("Employee Is Present");
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

