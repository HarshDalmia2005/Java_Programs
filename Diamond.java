import java.util.*;
class Diamond
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
            int i,j,p,t=2;int n=4;
            
             
            for(i=1;i<=n;i++)
            {
                 for(j=1;j<=(n-i);j++)
                {
                    System.out.print(" ");
                    System.out.print(" ");
                    }
                    for(j=1;j<=(2*i-1);j++)
                {
                    System.out.print('*'+" ");
                }
            
             System.out.println();
            }
            
             for(i=n;i>=1;i--)
            {
                 for(j=1;j<=(n-i);j++)
                {
                    System.out.print(" ");
                    System.out.print(" ");
                    }
                    for(j=1;j<=(2*i-1);j++)
                {
                    System.out.print('*'+" ");
                }
            
             System.out.println();
            }
              
            for(i=1;i<=t;i++)
            {
                
                 for(j=1;j<=(n-i);j++)
                {
                    System.out.print(" ");
                    System.out.print(" ");
                    }
                    for(j=1;j<=(2*i-1);j++)
                {
                    System.out.print('*'+" ");
                }
            
             System.out.println();
            }
        }}}