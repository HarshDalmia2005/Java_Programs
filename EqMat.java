import java.util.*;
class EqMat
{
   int a[][];
   int m,n;
   
   EqMat(int mm,int nn)
   {
       m=mm;
       n=nn;
       a=new int[m][n];
    }
    
    void readarray()
    {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                
                a[i][j]=sc.nextInt();
            }
        }
    }
    
    int check(EqMat P,EqMat Q)
    {
        int i,j;int p=0;
         for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(P.a[i][j]==Q.a[i][j])
                {
                   p++;
                }
                else
                {
                    break;
                    
                }
            }}
            if(p==m*n)
            return 1;
            else
            return 0;
        }
            
            void print()
            {
                int i,j;
                 for(i=0;i<m;i++)
                 {
                    for(j=0;j<n;j++)
                  {
                System.out.print(a[i][j]+"\t");
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
    EqMat ob=new  EqMat(s,p);
    EqMat ob1=new  EqMat(s,p);
    EqMat ob2=new  EqMat(s,p);
      ob.readarray();
       ob1.readarray();
       if(ob2.check(ob,ob1)==1)
       {
           System.out.println("Equal MATRIX");
           ob.print();
           System.out.println();
           ob1.print();
    }
    else
    {
    System.out.println("not equal");
}
}}
    