import java.util.*;
class Adder
{
    int a[]=new int [2];
    
    Adder()
    {
        a[0]=0;
        a[1]=0;
    }
    
    void readtime()
    {
         Scanner sc=new Scanner(System.in);
        int i;
         System.out.println("ENTER THE ARRAY ELEMENTS");
        for(i=0;i<2;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    
    void addtime(Adder x,Adder y)
    {
       
        a[0]=x.a[0]+y.a[0];
        a[1]=x.a[1]+y.a[1];
        
        if(a[1]>60)
        {
            a[1]-=60;
            a[0]+=1;
        }
    }
    
    void disptime()
    {
         System.out.println(a[0]+"hours"+"\t"+a[1]+"minutes");
        }
        
         public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                Adder ob1=new Adder();
                Adder ob2=new Adder();
                Adder ob3=new Adder();
        ob1.readtime();
        ob2.readtime();
        ob3.addtime(ob1,ob2);
        ob3.disptime();
    }
}