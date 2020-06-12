public class EmpWageCompUsingClassObj
{


      private final int IS_PRESENT=1;
       //final int IS_PRESENT=1;

      private void getRandom()
         {
          double empCheck = Math.floor(Math.random() * 10) % 2;
          if  (IS_PRESENT == empCheck )
               System.out.println("Employee is Present");
          else
              System.out.println("Employee is Absent");

         }


     public static void main(String[ ] args)
       {
         System.out.println("Welcome to Employee Wage Computation Program");
         EmpWageCompUsingClassObj e = new EmpWageCompUsingClassObj();
         e.getRandom();
       }
}


