import java.util.*;
class MatRev
{
   int arr[][];
   int m,n;
   
   MatRev(int mm,int nn)
   {
       m=mm;
       n=nn;
       arr=new int[m][n];
    }
    
    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                
                arr[i][j]=sc.nextInt();
            }
        }
    }
    
    int reverse(int x)
    {
        int r=0;
        while(x!=0)
        {
        r=(r*10)+(x%10);
        x=x/10;
    }
        return r; 
    }
    
    void revMat(MatRev P)
    {
        int i,j;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr[i][j]=reverse(P.arr[i][j]);
            }
        }
    }
    
    void show()
    {
        int i,j;
         for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                 System.out.print(arr[i][j]+"\t");
                } 
                System.out.println();
            }
        }
        
        
        public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter size of array 1 ");
         int s=sc.nextInt();
         int p=sc.nextInt();
    MatRev ob=new MatRev(s,p);
     MatRev ob1=new MatRev(s,p);
      ob.fillarray();
       ob1.revMat(ob);
      ob1.show();
    }
}
        