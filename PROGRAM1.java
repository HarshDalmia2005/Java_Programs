import java.util.*;
class PROGRAM1
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j,M,N;
        System.out.println("ENTER ROW AND COLUMN SIZE");
        M=sc.nextInt();
        N=sc.nextInt();
        if(M>2&& N>2&& M<10&& N<10)
        {
            
        int A[][]=new int[M][N];
        System.out.println("ENTER"+" "+M*N+" "+"ELEMENTS");
        
        for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
                A[i][j]=sc.nextInt();
                
            }
        }
       
        System.out.println("ORIGINAL MATRIX");
          for(i=0;i<M;i++)
        {
            for(j=0;j<N;j++)
            {
                System.out.print(A[i][j]+"\t");
    }
    System.out.println();
}

         System.out.println("MIRROR MATRIX");
        
        for(i=0;i<M;i++)
        {
        for(j=N-1;j>=0;j--)
        {
                System.out.print(A[i][j]+"\t");
            }
            System.out.println();
        } 
        
          
            int s=0;
        for(i=M-1;i>=0;i--)
        {
        for(j=0;j<N;j++)
        {
           if(i==0&&j==0 || i==0&&j==N-1 || i==M-1&& j==0 || i==M-1&& j==N-1)
           {
               s=s+A[i][j];
            }
            else
            {
                continue;
            }
  
        }
    }
     System.out.println("SUM OF FOUR CORNER ELEMENTS");
     System.out.println(s);
}

    else
    {
         System.out.println("INVALID INPUT");
      }
}
}
    
