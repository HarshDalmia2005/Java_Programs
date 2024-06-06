import java.util.*;
class Rearrange
{
    String txt;
    String cxt;
    int len;
    
    Rearrange()
    {
        txt="";
        cxt="";
        len=0;
    }
    
    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE WORD");
        txt=sc.nextLine();
        txt=txt.toUpperCase();
    }
    
    void convert()
    {
        len=txt.length();
        int i;int p=0;
        for(i=0;i<len;i++)
        {
            char ch=txt.charAt(i);
            if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                
                break;
            }
            else
            {
                p++;
            }
        }
        
        if(p==1)
        {
            cxt=txt+"Y";
        }
        else if(p>1&& p<len)
        {
            cxt=txt.substring(p,len)+txt.substring(0,p)+"C";
        }
        else 
        {
            cxt=txt+"N";
        }
    }
    
    void display()
    {
        System.out.println("ORIGINAL WORD"+"\t"+txt);
        System.out.println("CHANGED WORD"+"\t"+cxt);
    }
    
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    Rearrange ob=new Rearrange();
    ob.readword();
    ob.convert();
    ob.display();
}
}