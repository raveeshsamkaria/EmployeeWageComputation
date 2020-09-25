import java.util.*;

interface EmpWageBuilder
{
    public void wageComputation( employeeWageComputation.Companyempwage obj );
}

public class employeeWageComputation implements EmpWageBuilder
{
    static final int is_Part_Time=2, is_Full_Time=1;

    ArrayList<Integer> empDailyMonthlyTotalWage = new ArrayList<Integer>();

    public void wageComputation(Companyempwage companyEmployee)
    {
        int empHrs=0, totalEmpHrs = 0, totalWorkDay=0, totalEmpWage=0, empDailyWage = 0;

        System.out.println(companyEmployee.getCompanyName() + " Employee Wage Computation");

        while( totalWorkDay < companyEmployee.getNumOfWorkingDays() && totalEmpHrs <= companyEmployee.getMaxHrsInMonth())
        {
            int employee=(int)(Math.random()*10)%3;
            switch(employee)
            {
                case is_Part_Time:	empHrs = 4;
					break;
                case is_Full_Time:	empHrs = 8;
					break;
                default:		empHrs = 0;
            }
            totalWorkDay++;
            totalEmpHrs += empHrs;
            empDailyWage = empHrs * companyEmployee.getEmpRatePerHour();
            empDailyMonthlyTotalWage.add( empDailyWage );
        }
        totalEmpWage=( totalEmpHrs * companyEmployee.getEmpRatePerHour());
        empDailyMonthlyTotalWage.add( totalEmpWage );
        companyEmployee.setTotalEmpWage( totalEmpWage );
    }

    public static void main(String[] args)
    {
        System.out.println(">---< EMPLOYEE WAGE COMPUTATION >---<");
        System.out.println("-------------------------------------");
        employeeWageComputation emp = new employeeWageComputation();
        ArrayList<Companyempwage> company = new ArrayList<Companyempwage>();
        while (true)
        {
            System.out.println("Enter Your Choice...");
            System.out.println("1. HP");
            System.out.println("2. DELL");
            System.out.println("3. ACER");
            System.out.println("4. Exit");

            Scanner sobj = new Scanner(System.in);
            int choice = sobj.nextInt();
            switch (choice)
            {
                case 1:
                    company.add(new Companyempwage("HP", 20, 20, 100));
                    emp.wageComputation(company.get(0));
                    System.out.println("Monthly Wages : " + company.get(0).getTotalEmpWage());
                    System.out.println( );
                    break;

                case 2:
                    company.add(new Companyempwage("DELL", 30, 25, 120));
                    emp.wageComputation(company.get(1));
                    System.out.println("Monthly Wages : " + company.get(1).getTotalEmpWage());
                    System.out.println( );
                    break;

                case 3:
                    company.add(new Companyempwage("ACER", 40, 20, 150));
                    emp.wageComputation(company.get(2));
                    System.out.println("Monthly Wages : " + company.get(2).getTotalEmpWage());
                    System.out.println( );
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice...!!! Enter The Valid Choice(1-4)...");
                    System.exit(0);
            }
        }
    }

    public static class Companyempwage
    {
        public String companyName=" ";
        public int empRatePerHr=0;
        public int noOfWorkDay=0;
        public int maxHrsInMonth=0;
        public int totalEmpWage=0;

        public Companyempwage(String companyName, int empRatePerHr, int noOfWorkDay, int maxHrsInMonth)
        {
            this.companyName=companyName;
            this.empRatePerHr=empRatePerHr;
            this.noOfWorkDay=noOfWorkDay;
            this.maxHrsInMonth=maxHrsInMonth;
        }

        public String getCompanyName()
        {
            return companyName;
        }
        public int getEmpRatePerHour()
        {
            return empRatePerHr;
        }

        public int getNumOfWorkingDays()
        {
            return noOfWorkDay;
        }

        public int getMaxHrsInMonth()
        {
            return maxHrsInMonth;
        }

        public void setTotalEmpWage( int totalEmpWage )
        {
            this.totalEmpWage = totalEmpWage;
        }

        public int getTotalEmpWage()
        {
            return totalEmpWage;
        }
    }
}
