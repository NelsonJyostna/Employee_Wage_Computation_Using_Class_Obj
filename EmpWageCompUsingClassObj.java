public class EmpWageCompUsingClassObj
{


           int Salery=0;

           private int WAGE_PER_HR=20;
           private int FULL_DAY_PER_HR=8;
           private int IS_PRESENT=1;

           // private final int WAGE_PER_HR=20;
           // private final int FULL_DAY_PER_HR=8;
           // private final int IS_PRESENT=1;

           // private static final int WAGE_PER_HR=20;
           // private static final int FULL_DAY_PER_HR=8;
           // private static final int IS_PRESENT=1;



      public void getRandom()
         {
           double empCheck = Math.floor(Math.random() * 10) % 2;
           if  (IS_PRESENT == empCheck )
             {
                System.out.println("Employee is Present");
                Salery = FULL_DAY_PER_HR*WAGE_PER_HR;
                System.out.println("Salery : "+Salery);
             }
           else
             {
              System.out.println("Employee is Abscent");
             }
         }

      public static void main(String[ ] args)
         {
         System.out.println("Welcome to Employee Wage Computation Program");
         EmpWageCompUsingClassObj e = new EmpWageCompUsingClassObj();
         e.getRandom();
       }
}


