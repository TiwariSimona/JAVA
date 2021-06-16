public class pin
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
System.out.println("Enter the no. of digit:");
        int digit=sc.nextInt();
System.out.println("Enter the 1st number:");
        int x=sc.nextInt();
System.out.println("Enter the 2nd number:");
        int y=sc.nextInt();
System.out.println("Enter the 3rd number:");
        int z=sc.nextInt();
System.out.println("Enter the 4th number:");
        int w=sc.nextInt();
        int count=0,sum=0;
for(int i=1;i<=digit;i++)
        {
            int d1=x%10;
            int d2=y%10;
            int d3=z%10;
            int d4=w%10;
            int min=Math.min(d1,Math.min(d2,Math.min(d3,d4)));
            sum=sum+(int)(Math.pow(10,count)*min);
            count++;
            x=x/10;
            y=y/10;
            z=z/10;
            w=w/10;
        }
        int pin=sum;
System.out.println("the pin is "+pin);
System.out.println("Enter the message:");
        String a=sc.nextLine();
        a=sc.nextLine();
        a=a.replaceAll("\\s+","");
        a=a.toLowerCase();
        int length=a.length();
        int f=length/digit;
        String g="";
for(int i=1;i<=f;i++)
        {
            g=g+pin;
        }
        int rem;
        if(length%digit!=0)
        {
            rem=length%digit;
            rem=digit-rem;
            rem=(int)(Math.pow(10,rem));
            pin=pin/rem;
            g=g+pin;
        }
        String encrypt_message="";
for(int j=length-1;j>=0;j--)
        {
            char c=a.charAt(j);
            char d=g.charAt(j);
            if((int)(c)+(int)(d)-48>122)
            {
                int p=(int)(c)+(int)(d)-48-122+96;
                char c1=(char)p;
encrypt_message=c1+encrypt_message;
            }
            else
            {
                    int p=(int)(c)+(int)(d)-48;
                    char c1=(char)p;
encrypt_message=c1+encrypt_message;
             }
        }
encrypt_message=encrypt_message.toUpperCase();
System.out.print("the encrypt message is "+encrypt_message);
    }
}


