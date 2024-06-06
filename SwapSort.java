import java.util.*;
class SwapSort
{
    String wrd;
    int len;
    String swapwrd;
    String sortwrd;
    
    SwapSort()
    {
        wrd="";
        swapwrd="";
        sortwrd="";
        len=0;
    }
    
    void readword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE WORD");
        wrd=sc.next();
        wrd=wrd.toUpperCase();
        len=wrd.length();
    }
    
    void swapchar()
    {
        char ch1=wrd.charAt(0);
        char ch2=wrd.charAt(len-1);
        swapwrd=ch2+(wrd.substring(1,len-1))+ch1;
    }
    
    void sortword()
    {
         for(char ch='A';ch<='Z';ch++)
        {
        for(int i=0;i<len;i++)
        {
       
            if(wrd.charAt(i)==ch)
            {
                sortwrd+=ch;
            }
        }
    }
}

void display()
{
    
        System.out.println("ORIGINAL WORD"+"\t"+wrd);
        System.out.println("SWAPPED WORD"+"\t"+swapwrd);
        System.out.println("SORTED WORD"+"\t"+sortwrd);
    }
    
    
      public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
              SwapSort ob=new SwapSort();
ob.readword();
ob.swapchar();
ob.sortword();
ob.display();
}}   