import java.util.*;
class Encrypt//
{
   String wrd;
   String newwrd;
   int len;
   Encrypt()
   {
       wrd="";
       newwrd="";
       len=0;
    }
    void acceptword()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE WORD");
        wrd=sc.nextLine();
        wrd=wrd.toUpperCase();
    }
    
    void freqvowcon()
    {
        int c=0,p=0;
        len=wrd.length();
        int i;
        for(i=0;i<len;i++)
        {
            char ch=wrd.charAt(i);
            if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                c++;
            }
            else
            {
                p++;
            }}
            System.out.println("FREQUENCY OF VOWELS ="+""+c);
            System.out.println("FREQUENCY OF CONSONANTS ="+""+p);
        }
        
    void nextVowel()
    {
        len=wrd.length();
        int j;
        for(j=0;j<len;j++)
        {
            char ch2=wrd.charAt(j);
            if(ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U')
            {
                if(ch2=='A')
                {
                    ch2='E';
                    newwrd=newwrd+ch2;
                }
                else if(ch2=='E')
                {
                    ch2='I';
                    newwrd=newwrd+ch2;
                }
                else if(ch2=='I')
                {
                    ch2='O';
                    newwrd=newwrd+ch2;
                }
                else if(ch2=='O')
                {
                    ch2='U';
                    newwrd=newwrd+ch2;
                }
                else
                {
                    ch2='A';
                    newwrd=newwrd+ch2;
                }
            }
            else
            {
               newwrd=newwrd+ch2;
            }
        }}
        
        void display()
        {
         System.out.println("ORIGINAL WORD IS \t"+wrd);
         System.out.println("ENCRYPTED WORD IS \t"+newwrd);
        }
        
        public static void main(String args[])
        {
            Scanner sc =new Scanner(System.in);
            Encrypt ob=new Encrypt();
            ob.acceptword();
            ob.freqvowcon();
            ob.nextVowel();
            ob.display();
        }
    }
            
                
            