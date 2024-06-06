import java.util.*;
class Shift
{
    int m,n;
    int mat[][];
    
    Shift(int mm,int nn)
    {
        m=mm;
        n=nn;
        mat=new int[m][n];
    }
    
    void input()
    {
        
        Scanner sc=new Scanner(System.in);
        int i,j;
   System.out.println("ENTER THE ELEMENTS");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
    }
    
    void cyclic(Shift p)
    { 
        int i,j,k;
      
         for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
              if(i==0)
              {
                mat[m-1][j]=p.mat[i][j];
            }
            else
            {
                mat[i-1][j]=p.mat[i][j];
            }
        
    }}}
    
    void display()
    {
        int i,j;
         for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            { 
                System.out.print(mat[i][j]+"\t");
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
                Shift ob1=new Shift(s,p);
                Shift ob2=new Shift(s,p);
                ob1.input();
                ob2.cyclic(ob1);
                ob2.display();
            }
        }
        