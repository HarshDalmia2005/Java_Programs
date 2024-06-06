import java.util.*;
class PROGRAM2
{
  static boolean isComposite(int num)
{ 
    int i,p=0;
    for(i=1;i<=num;i++)
    {
        if(num%i==0)
        {
            p++;
        }
    }
    if(p==2)
    return false;
    else
    return true;
}

static boolean isMagic(int num)
{
    while(num>9)
    {
       int s=0;
        while(num!=0)
        {
            int d=num%10;
            s=s+d;
            num=num/10;
        }
        num=s;
    }
    if(num==1)
    return true;
    else 
    return false;
}

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
       int i;int m,n;
    System.out.println("ENTER THE RANGE");
    m=sc.nextInt();
    n=sc.nextInt();
    if(m>0&& n>0&& m<n)
    {
        for(i=m;i<=n;i++)
        {
            if(isComposite(i)==true && isMagic(i)==true)
            {
                System.out.print(i+",");
            }}
        }
        else
        { 
            System.out.println("INVALID INPUT");
        }
    }
}
