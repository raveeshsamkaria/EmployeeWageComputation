public class employeeWageComputation
{
    static final int PRESENT=1;
    public static void main(String[] args)
    {
        System.out.println(">---< EMPLOYEE WAGE COMPUTATION >---<");
        System.out.println("-------------------------------------");
        int employee=(int)(Math.random()*10)%2;
        if(PRESENT==employee)
            System.out.println("Employee Is Present");
        else
            System.out.println("Employee Is Absent");
    }
}

