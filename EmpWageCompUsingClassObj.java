public class EmpWageCompUsingClassObj
{

           int Salery = 0;
           int empHrs = 0;

           private int IS_PART_TIME = 1 ;
           private int IS_FULL_TIME = 2 ;
           private int WAGE_PER_HR = 20;


      public void getRandom()
         {
           double empCheck = Math.floor(Math.random() * 10) % 3;

           switch ((int)empCheck)
              {
                case 1:
                 {
                   System.out.println("Employee is Present");
                   empHrs = 8;
                   break;
                  }
                case 2:
                 {
                   System.out.println("Employee is Present");
                   empHrs = 4;
                   break;
                 }
              default:
                 {
                  System.out.println("Employee is Abscent");
                  break;
                 }
            }
          Salery = empHrs * WAGE_PER_HR;
          System.out.println("Salery : "+Salery);
         }


      public static void main(String[ ] args)
         {
         System.out.println("Welcome to Employee Wage Computation Program");
         EmpWageCompUsingClassObj e = new EmpWageCompUsingClassObj();
         e.getRandom();
       }
}


