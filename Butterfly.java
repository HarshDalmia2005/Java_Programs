import java.util.*;
class Butterfly
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
            int i,j,p,t;int n=5;
            
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                {
                     System.out.print('*');
                    }
                    
                    for(p=1;p<=2*(n-i);p++)
                    { 
                        System.out.print(" ");
                    }
                    
                      for(j=1;j<=i;j++)
                {
                     System.out.print('*');
                    }
                    System.out.println();
                }
                    
           for(i=n;i>=1;i--)
           {
                for(j=1;j<=i;j++)
                {
                     System.out.print('*');
                    }
                    
                    for(p=1;p<=2*(n-i);p++)
                    { 
                        System.out.print(" ");
                    }
                    
                        for(j=1;j<=i;j++)
                {
                     System.out.print('*');
                    }
                    
                    
                    
                 System.out.println();
                }}}}