import java.util.*;
class Longest
{
    String s1;String s2="";
    int l;
   
    
    Longest()
    {
        l=0;
        
    }
    
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE");
        s1=sc.nextLine();
    }
    void arrange()
    { 
        StringTokenizer k= new StringTokenizer(s1);
       l= k.countTokens();
       String a[]=new String[l];
        int i;
        for(i=0;i<l;i++)
        {
            a[i]=k.nextToken();
           
        }
        
        for(i=0;i<l;i++)
        {         
          char ch=a[i].charAt(0);
          s2=s2+ch;
        }}
        void display()
        {
            System.out.println("new string "+s2);
            System.out.println("Original string"+" "+s1);
        }
        
        
 
    public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
Longest ob= new Longest();
ob.input();
ob.arrange();
ob.display();
}}
 
   
        
        
        
        