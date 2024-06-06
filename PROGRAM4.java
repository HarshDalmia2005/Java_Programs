import java.util.*;
class PROGRAM4
{
   static int increasing(String s)
    {
        int i,flag=1;
        
        for(i=0;i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
            if(ch>s.charAt(i+1))
            {
                flag=0;
                break;
        }}
        return flag;
    }
    
    static int decreasing(String s)
    {
         int i,flag=1;
        
        for(i=0;i<s.length()-1;i++)
        {
            char ch=s.charAt(i);
            if(ch<s.charAt(i+1))
            {
                flag=0;
                break;
            }
        }
        return flag;
    }
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
           
            System.out.println("ENTER A NUMBER");
           String s1=sc.next();
        
            int f=1;int i;
          for(i=0;i<s1.length()-1;i++)
        {
            char ch1=s1.charAt(i);
            if(Character.isDigit(ch1))
            {
                f=1;
                continue;
        }
    else
{
    f=0;
    break;
}}
            if (f==1)
            {
                if(increasing(s1)==1)
                {
                    System.out.println(s1+"\t IS AN INCREASING NUMBER");
                }
                else if(decreasing(s1)==1)
                {
                    System.out.println(s1+"\t IS A DECREASING NUMBER");
                }
                else
                {
                    System.out.println(s1+"\t IS A BOUNCY NUMBER");
                }
            }
            else
            {
                System.out.println("INVALID INPUT");
            }
           
        
    } } 