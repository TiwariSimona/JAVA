//Write a program to display whether a number is magic number or not. A magic number is a number whose sum of the digits when added gives result 1.

class Ques56
{
   public static boolean checkMagic(int num)
   {
       int sum = 0;
       
       while (num > 0 || sum > 9)
       {
           if (num == 0)
           {
               num = sum;
               sum = 0;
           }
           sum += num % 10;
           num /= 10;
       }
      

       return (sum == 1);
   }
   
   public static void main(String args[])
    {
     int num = 1234;
     if (checkMagic(num))
        System.out.println("yes, magic Number");
          
     else
        System.out.println("No, not a magic Number");
    }
}
