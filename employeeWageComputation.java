public class employeeWageComputation
{
    public static int wageComputation(String companyName, int empRatePerHr, int noOfWorkDay, int maxHrsInMonth)
    {
        final int is_Part_Time=2, is_Full_Time=1;
        int empHrs=0, totalEmpHrs = 0, totalWorkDay=0, totalEmpWage=0;

        System.out.println(">---< Welcome To " + companyName+ " >---<");
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
        }
        totalEmpWage = totalEmpHrs * empRatePerHr;
        return totalEmpWage;
    }

    public static void main(String[] args)
    {
        System.out.println(">---< EMPLOYEE WAGE COMPUTATION >---<");
        System.out.println("-------------------------------------");
        employeeWageComputation emp = new employeeWageComputation();
        int []wages=new int[3];
        wages[0]=emp.wageComputation("HP", 20, 20, 100);
        System.out.println("Employee Monthly Wage Is "+wages[0] + " In HP");
        wages[1]=emp.wageComputation("DELL", 30, 25, 120);
        System.out.println("Employee Monthly Wage Is "+wages[1] + " In DELL");
        wages[2]=emp.wageComputation("ACER", 40, 20, 150);
        System.out.println("Employee Monthly Wage Is "+wages[2] + " In ACER");
    }
}

