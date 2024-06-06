import java.util.*;
class Changeletter
{
    int l;String s1;
    String s2;
    
    Changeletter()
    {
        l=0;
        s1="";
        s2="";
    }
    
    void input()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("ENTER THE WORD");
        s1=sc.nextLine();
    }
    
    void casechange()
    {
        char ch;
        char ch1;
        int i;
        l=s1.length();
        for(i=0;i<l;i++)
        {
            ch=s1.charAt(i);
            
            if(ch=='Z')
            {
                ch1='a';
                s2=s2+ch1;
            }
            else if (ch=='z')
            {
                ch1='A';
                 s2=s2+ch1;
            }
            else
            {
                if(Character.isUpperCase(ch))
                {
                    ch1=(char)(ch+33);
                }
                else
                {
                    ch1=(char)(ch-31);
                }
            s2=s2+ch1;
        }
    }
}

void display()
{
    System.out.println("Original word \t"+s1);
    System.out.println("New word \t"+s2);
}

public static void main(String args[])
{
     Scanner sc =new Scanner(System.in);
     Changeletter ob=new Changeletter();
     ob.input();
     ob.casechange();
     ob.display();
    }
}
            