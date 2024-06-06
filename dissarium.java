import java.util.*;
class dissarium
{
    int diss(int n,int p)
    {
        if(p==0)
        return 0;
        else
        return (int)Math.pow(n%10,p) + diss(n/10,p-1);
    }
   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        dissarium ob=new dissarium();
        System.out.println("enter"+"\t");
        int n=sc.nextInt();
        int p=sc.nextInt();
         int h=ob.diss(n,p);
        if(h==n)
        System.out.println("DISSARIUM");
        else
        System.out.println("NOT");}}