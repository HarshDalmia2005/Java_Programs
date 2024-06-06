class Holder
{
    int Q[];
    int cap;
    int front;
    int rear;
    
    Holder(int n)
    {
        cap=n;
        front=0;
        rear=0;
        Q=new int[cap];
    }
    
    void addint(int v)
    {
        if (front==0)
        {
            front=1;
            rear=1;
           
            Q[rear]=v;
        }
        else if(rear+1<cap)
        {
            Q[++rear]=v;
        }
        else
        {
            System.out.println("HOLDER IS FULL");
        }
    }
    
    int removeint()
    {
        if (front==0)
        {
            return -999;
        }
        else
        {
            int k=Q[front];
            
            if(front==rear)
            {
                front=0;
                rear=0;
            }
            else
            front++;
            return k;
        }
    }
    
    void display()
    {
        int i;
        if(front==rear)
        {
            System.out.println("HOLDER IS EMPTY");
        }
        else
        {
            for(i=front;i<=rear;i++)
            {
               System.out.println(Q[i]);
            }
        }
    }
}
            