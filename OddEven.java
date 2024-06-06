import java.util.*;
class OddEven
{
    int m;
    int a[];
    OddEven(int mm)
    {
        m=mm;
        a= new int[m];
    }
    
    void fillarray()
    { 
        int i;
        System.out.println("ENTER THE ELEMENTS");
        Scanner sc =new Scanner(System.in);
        for(i=0;i<m;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    
    OddEven arrange(OddEven P,OddEven Q)
    {
        OddEven R=new OddEven(P.m+Q.m);
        int i,t=0;
        for(i=0;i<P.m;i++)
        {
            if(P.a[i]%2==1)
            {
                R.a[t++]=P.a[i];
            }
        }
        
         for(i=0;i<Q.m;i++)
        {
            if(Q.a[i]%2==1)
            {
                R.a[t++]=Q.a[i];
            }
        }
        
         for(i=0;i<P.m;i++)
        {
            if(P.a[i]%2==0)
            {
                R.a[t++]=P.a[i];
            }
        }
        
         for(i=0;i<Q.m;i++)
        {
            if(Q.a[i]%2==0)
            {
                R.a[t++]=Q.a[i];
            }
        }
        return R;
    }
    
    void display()
    {
        int i;
        for(i=0;i<m;i++)
        {
            System.out.print(a[i] +"\t");
        }
        System.out.println();
    }
    
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
         System.out.print("enter size of array 1 ");
         int s=sc.nextInt();
           System.out.print("enter size of array 2 ");
         int p=sc.nextInt();
        OddEven P=new  OddEven(s);
         OddEven Q=new OddEven(p);
          OddEven R=new  OddEven(s+p);
          P.fillarray();
          Q.fillarray();
          R=R.arrange(P,Q);
           System.out.print("ARRAY 1 :");
          P.display();
           System.out.print("ARRAY 2 :");
          Q.display();
           System.out.print(" Arranged ARRAY  :");
          R.display();
        }
    }
          
    