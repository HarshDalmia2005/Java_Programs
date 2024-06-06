import java.util.*;
class Capital
{
    String sent;
    int freq;
    
    Capital()
    {
        sent="";
        freq=0;
    }
    
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SENTENCE");
        sent=sc.nextLine();
    }
    
    boolean isCap(String w)
    {
         char ch=w.charAt(0);
         if(Character.isUpperCase(ch))
         return true;
         else
         return false;
        }
        
        
        void display()
        {
            int c=0;int i;
            System.out.println("SENTENCE IS"+"\t"+sent);
            StringTokenizer k=new StringTokenizer(sent);
            int l=k.countTokens();
            String a[]=new String[l];
             
            for(i=0;i<l;i++)
            {
                a[i]=k.nextToken();
            }
            
             for(i=0;i<l;i++)
            {
                if(isCap(a[i])==true)
                {
                    c++;
                }
            }
            
             System.out.println("FREQUENCY IS"+"\t"+c);
            }
            
            public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                Capital ob=new Capital();
                ob.input();
                ob.display();
            }
        }
        
        
         