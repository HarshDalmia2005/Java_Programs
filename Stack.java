import java.util.*;
class Stack
{
    int a[];
    int s;
    int top;
    
    Stack(int x)
    {
        s=x;
        a=new int[s];
        top=-1;
    }
    
    void push(int x)
    {
        if(top+1<s)
        {
            a[++top]=x;
        }
        else
        {
            System.out.println("ITS FULL");
        }
    }
    
    int pop()
    {
        if(top==-1)
        {
            System.out.println("its empty");
            return -999;
        }
        else
        {
            int val=a[top];
            top=top-1;
            return val;
        }
    }
    
    void display()
    {
        int i;
        for(i=0;i<=top;i++)
        {
            System.out.println(a[i]);
        }
    }
}