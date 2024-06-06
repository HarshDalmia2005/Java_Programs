 import java.util.*;
class Count//find the pos. of the only set bit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;int c=0;int p=0;
         System.out.println("ENTER THE NUMBER");
         n=sc.nextInt();
         while(n!=0)
         {
             int bit=n&1;
             if(bit==1)
             {
                 c++;
                 p++;
                }
                else
                {
                  p++;
                }
                n=n>>1;
            }
            if(c==1)
            {
                
             System.out.println(p);
            }
            else
            {
                 System.out.println("-1");
                }
             
            }}