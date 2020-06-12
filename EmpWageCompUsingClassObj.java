public class EmpWageCompUsingClassObj
{

           int salery = 0;
           int empHrs = 0;
           int totalSalery = 0;
           int totalEmpHrs = 0;
           int totalWorkingDays = 0;

           private static final int IS_PART_TIME = 1 ;
           private static final int IS_FULL_TIME = 2 ;
           private static final int WAGE_PER_HR = 20 ;
           private static final int NUM_WORKING_DAYS = 20;
           private static final int MAX_HRS_IN_MONTH = 100;

        public int getRandom()
         {
           double empCheck = Math.floor(Math.random() * 10 ) % 3;
             switch ((int)empCheck)
               {
                 case 1:
                         return 8;
                 case 2:
                         return 4;
                 default:
                         return 0;
               }
        }

       public void empWageCal()
         {
           while ( totalEmpHrs < MAX_HRS_IN_MONTH && totalWorkingDays < NUM_WORKING_DAYS )
             {
                       empHrs=getRandom();
                       totalWorkingDays++;
                       salery = empHrs * WAGE_PER_HR;
                       totalEmpHrs = totalEmpHrs + empHrs;
              }
            totalSalery = totalEmpHrs * WAGE_PER_HR;
            System.out.println("Total Salery : "+totalSalery);
          }


      public static void main(String[ ] args)
         {
         System.out.println("Welcome to Employee Wage Computation Program");
         EmpWageCompUsingClassObj e = new EmpWageCompUsingClassObj();
         e.empWageCal();
         }
}






