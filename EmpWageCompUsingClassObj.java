public class EmpWageCompUsingClassObj
{


           public static final int IS_PART_TIME = 1 ;
           public static final int IS_FULL_TIME = 2 ;

           private final String company;
           private final int wagePerHr;
           private final int numOfWorkingDays;
           private final int maxHrPerMonth;

           //int salery = 0;
           int empHrs = 0;
          // int totalSalery = 0;
           int totalEmpHrs = 0;
           int totalWorkingDays = 0;

        public EmpWageCompUsingClassObj(String company, int wagePerHr,int numOfWorkingDays, int maxHrPerMonth)
          {
            this.company=company;
            this.wagePerHr=wagePerHr;
            this.numOfWorkingDays=numOfWorkingDays;
            this.maxHrPerMonth=maxHrPerMonth;
          }

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

       public int CalempWageForCompany()
         {
           while ( totalEmpHrs < maxHrPerMonth && totalWorkingDays < numOfWorkingDays )
             {
                       empHrs=getRandom();
                       totalWorkingDays++;
                       //salery = empHrs * wagePerHr;
                       totalEmpHrs = totalEmpHrs + empHrs;
              }
            int totalEmpWage = totalEmpHrs * wagePerHr;
            //System.out.println("Total Emp Wage For Company "+company+" is : "+totalEmpWage);
            System.out.println("Day:"+totalWorkingDays+" Emp Hr :"+empHrs);
            return totalEmpWage;
         }


      public static void main(String[ ] args)
         {
          System.out.println("Welcome to Employee Wage Computation Program");
          EmpWageCompUsingClassObj dMart = new EmpWageCompUsingClassObj("Dmart", 20 , 6, 100);
          EmpWageCompUsingClassObj bridgeLab = new EmpWageCompUsingClassObj("BridgeLab", 26 , 10, 150);
          EmpWageCompUsingClassObj reliance = new EmpWageCompUsingClassObj("Reliance", 10 , 9, 130);
          System.out.println("Total Emp Wage for company" + dMart.company + "is :" + dMart.CalempWageForCompany());
          System.out.println("Total Emp Wage for company" + bridgeLab.company + "is :" + bridgeLab.CalempWageForCompany());
          System.out.println("Total Emp Wage for company" + reliance.company + "is :" + reliance.CalempWageForCompany());
         }
}






