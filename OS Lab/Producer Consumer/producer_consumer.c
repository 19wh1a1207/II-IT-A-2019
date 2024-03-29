#include<stdio.h>
#include<stdlib.h>
 
int mutex=1, full=0, empty=5, quan=0;
 
int main()
{
    int n;
    void producer();
    void consumer();
    int wait(int);
    int signal(int);
    printf("\n1.Producer\n2.Consumer\n3.Exit");
    while(1)
    {
        printf("\nEnter your choice:");
        scanf("%d",&n);
        switch(n)
        {
            case 1: if((mutex==1)&&(empty!=0))
                        producer();
                    else
                        printf("Buffer is full!!");
                    break;
            case 2: if((mutex==1)&&(full!=0))
                        consumer();
                    else
                        printf("Buffer is empty!!");
                    break;
            case 3:
                    exit(0);
                    break;
        }
    }
   
    return 0;
}
 
int wait(int s)
{
    return (--s);
}
 
int signal(int s)
{
    return(++s);
}
 
void producer()
{
    empty=wait(empty);
    mutex=wait(mutex);
    quan++;
    printf("Producer produces the item %d\n",quan);
    mutex=signal(mutex);
    full=signal(full);
}
 
void consumer()
{
    full=wait(full);
    mutex=wait(mutex);
    printf("Consumer consumes item %d\n",quan);
    quan--;
    mutex=signal(mutex);
    empty=signal(empty);
}