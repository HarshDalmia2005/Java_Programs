import java.util.*;
class A
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        {
            int i,j,p;
           
            for(i=0;i<=4;i++)
            {
                for(j=0;j<=4-i;j++)
                {
                   
                    System.out.print(" ");
                   
                }
                for(p=0;p<=i;p++)
            {
              
                    System.out.print('*');
              
            }
             for(p=0;p<=i;p++)
            {
                System.out.print('*');
                
            }
            System.out.println();
        }}}}