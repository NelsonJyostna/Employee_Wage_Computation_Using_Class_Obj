//import java.util.*;
class CompanyEmpWage
{

           public final String company;
           public final int wagePerHr;
           public final int numOfWorkingDays;
           public final int maxHrPerMonth;
           public int totalEmpWage;

      public CompanyEmpWage(String company,  int wagePerHr,int numOfWorkingDays, int maxHrPerMonth)
          {
            this.company = company;
            this.wagePerHr = wagePerHr;
            this.numOfWorkingDays = numOfWorkingDays;
            this.maxHrPerMonth = maxHrPerMonth;
          }


      public void setTotalEmpWage(int totalEmpWage)
          {
            this.totalEmpWage = totalEmpWage;
          }

      //@Override
      public String toString()
          {
            return "Total EmpWage For Company : "+company+" is "+totalEmpWage;
          }
}


public class EmpWageCompUsingClassObj
{

           public static final int IS_PART_TIME = 1 ;
           public static final int IS_FULL_TIME = 2 ;

           private int numOfCompany = 0;
           private CompanyEmpWage[] companyEmpWageArray;

           int empHrs = 0;
           int totalEmpHrs = 0;
           int totalWorkingDays = 0;

        public EmpWageCompUsingClassObj()
          {
            companyEmpWageArray = new CompanyEmpWage[5];
          }


        private void addCompanyEmpWage(String company, int wagePerHr,int numOfWorkingDays, int maxHrPerMonth)
          {
              companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, wagePerHr,numOfWorkingDays, maxHrPerMonth);
              numOfCompany++;
          }

         private void CalempWageForCompany()
           {
               for (int i=0; i<numOfCompany; i++)
                {
                   companyEmpWageArray[i].setTotalEmpWage(this.CalempWageForCompany(companyEmpWageArray[i]));
                   System.out.println(companyEmpWageArray[i]);
                }
           }

        public int getRandom()
         {
           double empCheck = Math.floor(Math.random() * 10 ) % 3;
             switch ((int)empCheck)
               {
                 case 1:
                       return 8;
                 case  2:
                       return 4;
                 default:
                      return 0;
               }
         }

       private int CalempWageForCompany( CompanyEmpWage companyEmpWage)
         {
           while ( totalEmpHrs <  companyEmpWage.maxHrPerMonth && totalWorkingDays <  companyEmpWage.numOfWorkingDays )
             {
                       empHrs=getRandom();
                       totalWorkingDays++;
                       //salery = empHrs * wagePerHr;
                       totalEmpHrs = totalEmpHrs + empHrs;
                       //totalEmpWage = totalEmpHrs * wagePerHr;
                      //System.out.println("Total Emp Wage For Company "+company+" is : "+totalEmpWage);
                       System.out.println("Day:"+totalWorkingDays+" Emp Hr :"+empHrs);
            }
            return  totalEmpHrs * companyEmpWage.wagePerHr;
         }


      public static void main(String[ ] args)
         {
          System.out.println("Welcome to Employee Wage Computation Program");
          EmpWageCompUsingClassObj empWageBuilder = new EmpWageCompUsingClassObj();
          empWageBuilder.addCompanyEmpWage("Dmart", 20 , 6, 100);
          empWageBuilder.addCompanyEmpWage("BridgeLab", 26 , 10, 150);
          empWageBuilder.addCompanyEmpWage("Reliance", 10 , 9, 130);
          empWageBuilder.CalempWageForCompany();
         }
}






