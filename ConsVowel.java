import java.util.*;
class ConsVowel 
{
    String s1,s2;
    int l;
    
    ConsVowel()
    {
        s1="";
        l=0;
        
    }
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE WORD");
        s1=sc.next();
    }
void Arrange()
{
int i;String w="";String v="";
l=s1.length();
for(i=0;i<l;i++)
{
char ch= s1.charAt(i);
if(ch=='a' || ch=='e' || ch=='i'|| ch=='o'||ch=='u')
{
    w=w+ch;
}
else
{
    v=v+ch;
}
}
s2=w+v;
}

void print()
{
    System.out.println("ORIGINAL WORD IS "+s1);
    System.out.println("NEW WORD IS"+s2);
    
}

public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
ConsVowel ob= new ConsVowel();
ob.input();
ob.Arrange();
ob.print();
}}
 