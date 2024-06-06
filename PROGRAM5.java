import java.util.*;
class PROGRAM5
{
     public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int i,j,N;
        System.out.print("ENTER N=");
        N=sc.nextInt();
        if( N>3 && N<10)   //checking validity of input
        {
            
        String M[][]=new String[N][N];
    
          System.out.print("ENTER FIRST CHARACTER:"); //taking character as user input
          String ch=sc.next();
         for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
               if(i==0&&j==0 || i==0&&j==N-1 || i==N-1&& j==0 || i==N-1&& j==N-1)// condition for corner elements
               {
                    M[i][j]=ch; //placing the character in array
                }
            }
        }
        
         System.out.print("ENTER SECOND CHARACTER:");
          String ch1=sc.next();
         for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                if(i==0 ||i==N-1||j==0|| j==N-1)
                {
               if(i==0&&j==0 || i==0&&j==N-1 || i==N-1&& j==0 || i==N-1&& j==N-1)
               {
                   continue;
                }
                else{
                     M[i][j]=ch1;
            }
        }}}
         System.out.print("ENTER THIRD CHARACTER:");
          String ch2=sc.next();
         for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                if(i!=0 && i!=N-1 &&j!=0&& j!=N-1)
                {
                       M[i][j]=ch2;
                    }
                }
            }
            
             System.out.println("FORMED MATRIX");
              for(i=0;i<N;i++)
          {
            for(j=0;j<N;j++)
            {
               System.out.print(M[i][j]+"\t");// printing the formed matrix
            }
             System.out.println();
            }
            
        }
        else 
        {
             System.out.println("SIZE IS OUT OF RANGE");
            }
        }
    }
