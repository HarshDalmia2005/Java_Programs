import java.util.*;
class Matrix
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j,n;
        System.out.println("ENTER SIZE");
        n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("ENTER"+" "+n*n+" "+"ELEMENTS");
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
                
            }
        }
       
        System.out.println("ORIGINAL MATRIX");
         System.out.println();
          for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
    }
    System.out.println();
}

         System.out.println("CLOCKWISE ROTATED MATRIX");
         System.out.println();
        for(i=0;i<n;i++)
        {
        for(j=n-1;j>=0;j--)
        {
                System.out.print(a[j][i]+"\t");
            }
            System.out.println();
        } 
        
           System.out.println("ANTICLOCKWISE ROTATED MATRIX");
            System.out.println();
        for(i=n-1;i>=0;i--)
        {
        for(j=0;j<n;j++)
        {
                System.out.print(a[j][i]+"\t");
            }
            System.out.println();
        }
        
      }
}
    
