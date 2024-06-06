import java.util.*;
class PrimeAdam
{
   static boolean isPrime(int n)
    {
        int i;int p=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                p++;
            }
        }
        if(p==2)
        return true;
        else 
        return false;
    }
    
   static boolean isAdam(int n)
    {
        int m=n*n;int i;String s1="";
        String s3="";
        String s=""+n;
        int len=s.length();
        
        for(i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            s1=ch+s1;
        }
        int num=Integer.parseInt(s1);
        int m1=num*num;
        String s2=""+m1;
        int l=s2.length();
        
        for(i=0;i<l;i++)
        {
            char ch=s2.charAt(i);
            s3=ch+s3;
        }
        int n2=Integer.parseInt(s3);
        
        if(n2==m)
        return true;
        else 
        return false;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int m,n;int k;int s=0;
        System.out.println("ENTER THE RANGE");
        m=sc.nextInt();
        n=sc.nextInt();
        if(m<n)
        {
            System.out.println("PRIME-ADAM INTEGERS ARE:");
            for(k=m;k<=n;k++)
            {
                if(isPrime(k)==true && isAdam(k)==true)
                {
                    System.out.print(k+",");
                    s++;
                }
            }
            if(s==0)
            { 
                
                    System.out.print("NIL");
                }
                 System.out.println();
                 System.out.println("FREQUENCY OF PRIME-ADAM INTEGER IS:"+s);
            }
            else
            {
                System.out.println("INVALID INPUT");
            }
        }
    }