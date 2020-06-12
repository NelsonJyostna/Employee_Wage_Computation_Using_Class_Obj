public class EmpWageCompUsingClassObj
{

           int salery = 0;
           int empHrs = 0;
           int totalSalery =0;
           //int day = 0;

           private int IS_PART_TIME = 1 ;
           private int IS_FULL_TIME = 2 ;
           private int WAGE_PER_HR = 20 ;
           private int NUM_WORKING_DAYS = 20;

      public void getRandom()
         {
           for ( int day=1; day<=NUM_WORKING_DAYS; day++ )
            {
              double empCheck = Math.floor(Math.random() * 10) % 3;
              switch ((int)empCheck)
              {
                   case 1:
                     {
                       System.out.println("Employee For Part Time");
                       empHrs = 8;
                       salery = empHrs * WAGE_PER_HR;
                       totalSalery= totalSalery + salery;
                       System.out.println("Total Salery : "+totalSalery);
                       break;
                      }
                   case 2:
                     {
                       System.out.println("Employee For Full Time");
                       empHrs = 4;
                       salery = empHrs * WAGE_PER_HR;
                       totalSalery= totalSalery + salery;
                       System.out.println("Total Salery : "+totalSalery);
                       break;
                     }
                  default:
                     {
                       System.out.println("Employee is Abscent");
                       empHrs = 0;
                       break;
                     }
                }
              //salery = empHrs * WAGE_PER_HR;
             // totalSalery= totalSalery + salery;
             //System.out.println("Total Salery : "+totalSalery);
            }
         }

      public static void main(String[ ] args)
         {
         System.out.println("Welcome to Employee Wage Computation Program");
         EmpWageCompUsingClassObj e = new EmpWageCompUsingClassObj();
         e.getRandom();
         }
}


