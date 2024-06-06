import java.util.*;
class Exchange
{
    String sent;
    String rev;
    int size;
    
    Exchange()
    {
        sent="";
        rev="";
        size=0;
    }
    
    void readsentence()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE");
        sent=sc.nextLine();
    }
    
   void exfirstlast()
   {
       StringTokenizer k=new StringTokenizer(sent);
       size=k.countTokens();
       String a[]=new String[size];
       String x="";
       int i;
       for(i=0;i<size;i++)
       {
           a[i]=k.nextToken();
        }
         for(i=0;i<size;i++)
       {
           int l=a[i].length();
           if(l>1)
           {
               
           rev+=(a[i].charAt(l-1))+(a[i].substring(1,l-1))+(a[i].charAt(0));
           rev+=" ";
           }
           else
           {
               rev+=a[i];
               rev=rev+" ";
            }
        }}
        
        void display()
        {
             System.out.println("ORIGINAL SENTENCE"+"\t"+sent);
              System.out.println("NEW SENTENCE"+"\t"+rev);
            }
            
            public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    Exchange ob=new Exchange();
    ob.readsentence();
    ob.exfirstlast();
    ob.display();
}
}
      
    