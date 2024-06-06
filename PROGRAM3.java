import java.util.*;
class PROGRAM3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int i,j,N;
    System.out.println("ENTER THE SIZE OF THE SQUARE MATRIX");
    N=sc.nextInt();
    int M[][]=new int[N][N];
    if(N>3 && N<10)
    {
        System.out.print("ENTER THE ARRAY");
         for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
               M[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("ORIGINAL MATRIX:");
          for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                System.out.print(M[i][j]+"\t");
            }
            System.out.println();
        }
        
        int B[]=new int[2*N+2*(N-2)];
        int t=0;
          for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
               if(i==0 || i==N-1 || j==0 || j==N-1)
               {
                   B[t++]=M[i][j];
                }
                
            }
        }
        
        Arrays.sort(B);
   t=0;
    for(j=0;j<=N-1;j++)
            {
            
                    M[0][j]=B[t++];
                    
                }
    for(i=1;i<=N-1;i++)
        {
            M[i][N-1]=B[t++];
        }
    for(j=N-2;j>=0;j--)
        {
            M[N-1][j]=B[t++];
        }
    for(i=N-2;i>=1;i--)
        { 
            M[i][0]=B[t++];
        }
        
        
              System.out.println("REARRANGED MATRIX:");
         for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                System.out.print(M[i][j]+"\t");
            }
        
            System.out.println();
        }
        int f=1;int s=0;
         System.out.println("NON-BOUNDARY ELEMENTS ARE:");
         for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                if(i!=0 && i!=N-1 && j!=0 && j!=N-1)
                {
                     System.out.print(M[i][j]+"\t");
                f=f*M[i][j];
                s=s+M[i][j];
            }
        }
         System.out.println();
    }
    System.out.println();
    System.out.println("PRODUCT OF NON-BOUNDARY ELEMENTS="+f);
    System.out.println("SUM OF NON-BOUNDARY ELEMENTS="+s);
}
else 
{
    System.out.println("INVALID INPUT");
}
}
}