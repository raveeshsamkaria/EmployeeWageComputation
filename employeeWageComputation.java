public class employeeWageComputation
{
    public static void main(String[] args)
    {
        System.out.println(">---< EMPLOYEE WAGE COMPUTATION >---<");
        System.out.println("-------------------------------------");

        final int empRatePerHr=20, is_Part_Time=2, is_Full_Time=1, noOfDayInMonth=20;
        int empWage=0, empHrs=0, empWageForMonth=0;

        for ( int day = 1; day <= noOfDayInMonth; day++ )
        {
            int employee=(int)(Math.random()*10)%3;
            switch(employee)
            {
                case is_Part_Time:	System.out.println("Employee Is Part Time Present");
                                    empHrs = 4;
                                    break;
                case is_Full_Time:	System.out.println("Employee Is Full Time Present");
                                    empHrs = 8;
                                    break;
                default:			System.out.println("Employee Is Absent ");
                                    empHrs = 0;
            }
            empWage = empHrs * empRatePerHr;
            empWageForMonth += empWage;
            System.out.println("Day : " + day + ", Wage : " + empWage);
        }
        System.out.println("Total Wages for Month : "+empWageForMonth);
    }
}

