//Write a program covert roman to integer.

import java.util.Scanner;

public class Ques58 {

public static void main(String[] args) {
Scanner sc=new Scanner (System.in);
String st=sc.next();                 
int len=st.length();
int sum=roman_int(st.charAt(0));

if(len==2)         
{
if(roman_int(st.charAt(1))>sum)
sum=roman_int(st.charAt(1))-sum;
else
sum=sum+roman_int(st.charAt(1));

}
else {                 
int i=0;
        sum=0;
       
while(i<len-1)     
{    
    if( roman_int(st.charAt(i))>= roman_int(st.charAt(i+1)))
  {
sum+=roman_int(st.charAt(i));
i++;
  }

    else
          {      
             sum+=roman_int(st.charAt(i+1))-roman_int(st.charAt(i));
             i+=2;
           }
   
}
if(i==len-1)            
   { sum+=roman_int(st.charAt(i));
       
   }
}


System.out.println(Math.abs(sum));
}

static int roman_int(char ch) {

int hi = 0;
switch(ch) {
case 'I':hi=1 ; break;
case 'V':hi=5 ; break;
case 'X':hi=10; break;
case 'L':hi=50; break;
case 'C':hi=100; break;
case 'D': hi=500;break;
case 'M': hi=1000; break;
default: System.out.println("invalid input");
         
}
return hi;
}


}
