public class employeeWageComputation
{
    static final int empRatePerHr=20, is_Part_Time=2, is_Full_Time=1, noOfWorkDay=20, maxHrsInMonth=100;
    static int empHrs=0, totalEmpHrs = 0, totalWorkDay=0, totalEmpWage=0;

    public static void wageComputation()
    {
        while( totalWorkDay < noOfWorkDay && totalEmpHrs <= maxHrsInMonth )
        {
            int employee=(int)(Math.random()*10)%3;
            switch(employee)
            {
                case is_Part_Time:	empHrs = 4;
                                    break;
                case is_Full_Time:	empHrs = 8;
                                    break;
                default:			empHrs = 0;
            }
            totalWorkDay++;
            totalEmpHrs += empHrs;
            System.out.println("Day : " + totalWorkDay + ", Work Hours:" + totalEmpHrs);
        }
        totalEmpWage = totalEmpHrs * empRatePerHr;
        System.out.println("Total Wages for Month : "+ totalEmpWage);
    }

    public static void main(String[] args)
    {
        System.out.println(">---< EMPLOYEE WAGE COMPUTATION >---<");
        System.out.println("-------------------------------------");
        wageComputation();
    }
}

