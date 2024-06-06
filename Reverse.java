import java.util.*;
class Reverse
{
    static int Reversenum(int num)
    {
        String s=""+num;
        int l=s.length();
        int i;
        String s2="";
       for(i=0;i<l;i++)
       {
           char ch=s.charAt(i);
           s2=ch+s2;
        }
        int n=Integer.parseInt(s2);
        return n;
    }
    
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            int i,j;
            int n;
            System.out.println("ENTER THE SIZE OF ARRAY");
            n=sc.nextInt();
            int a[][]=new int[n][n];
            int b[][]=new int[n][n];
            System.out.println("ENTER THE ELEMENTS OF ARRAY");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                   a[i][j]=sc.nextInt();
                }
            }
            System.out.println("ORIGINAL MATRIX:");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    System.out.print(a[i][j]+"\t");
                }
                 System.out.println();
            }
            System.out.println();
            
            System.out.println("NEW ARRAY:");
            for(i=0;i<n;i++)
            {
                for(j=0;j<n;j++)
                {
                    b[i][j]=Reversenum(a[i][j]);
                    
                    System.out.print(b[i][j]+"\t");
                }
                System.out.println();
            }
            
        }
    }

