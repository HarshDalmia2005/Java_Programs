 import java.util.*;
class Mix
{
    String wrd;
    int len;
    
    Mix()
    {
        len=0;
        wrd="";
    }
    
    void feedword()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("ENTER THE WORD");
         wrd=sc.next();
         wrd=wrd.toUpperCase();
         len=wrd.length();
        }
       
 
 
void mix_word(Mix P,Mix Q)
{
    int s=(P.len<Q.len)?P.len:Q.len;



for(int i=0;i<s;i++)
{
 wrd+=P.wrd.charAt(i)+""+Q.wrd.charAt(i);
}
 
 if(P.len>Q.len)
 {
     wrd+=P.wrd.substring(Q.len);
    }
    else
    {
        wrd+=Q.wrd.substring(P.len);
    }
}

void display()
{
    System.out.println("WORD IS"+"\t"+wrd);
}

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    Mix ob=new Mix();
     Mix ob1=new Mix();
      Mix ob2=new Mix();
      
     
      ob.feedword();
       ob1.feedword();
      ob2.mix_word(ob,ob1);
      ob2.display();
    }
}
    
    