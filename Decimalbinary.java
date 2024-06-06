import java.util.*;
class Decimalbinary
{
    int Decibin(int n)
    {
        if(n==0)
        return 0;
        else
        return(n%2)+ 10*Decibin(n/2);
    }
    
 public static void main(String args[])
    {
     Scanner sc =new Scanner(System.in);
Decimalbinary ob= new Decimalbinary();
System.out.println("ENTER");
int n=sc.nextInt();
System.out.println("answer is"+ ob.Decibin(n));
}}   