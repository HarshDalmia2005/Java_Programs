import java.util.*;
class Pronic
{
    int num;
    Pronic()
    {
        num=0;
    }
    
    void acceptnum()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        num=sc.nextInt();
    }
     boolean isPronic(int v)
     {
         int c=0;
         if(v<=num)
         {
             if(v*(v+1)==num)
             {
                 return true;
                 
                }
                else
                {
                    return isPronic(v+1);
                }
            }
            else
            {
               return false; 
             
            }}
            
            void check()
            {
                int i;int flag=0;
                for(i=0;i<=num;i++)
                {
                    if (isPronic(i)==true)
                    {
                        flag=1;
                        break;
                    }
                    else
                    {
                        flag=0;
                        }
                    }
                    if(flag==1)
                    {
                        System.out.println("pronic number");
                    }
                    else{
                        System.out.println("not a pronic number");
                }}
                
                public static void main(String args[])
                {
                Scanner sc=new Scanner (System.in);
                Pronic ob=new Pronic();
                ob.acceptnum();
                ob.check();
            }
        }