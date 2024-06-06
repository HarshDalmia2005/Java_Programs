import java.util.Scanner;
class Palindrome
{
    String s1,s2="";
    int l;
    Palindrome()
    {
       int l=0;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE WORD");
        s1=sc.next();
    }
    boolean check()
    {
        int i;
        l=s1.length();
        for(i=0;i<l;i++)
        {
           char ch=s1.charAt(i);
           s2=ch+s2;
        }
        if (s1.equals(s2))
        return true;
        else
        return false;
    }
    void display()
    {
        if(check()==true)
        System.out.println("PALINDROME"+""+s2);
else
System.out.println("NOT PALINDROME");
}

public static void main(String args[])
{
Scanner sc =new Scanner(System.in);
Palindrome ob= new Palindrome();
 ob.input();
ob.display();
}}       