class exchange
{
int n;
boolean val = false;

synchronized void produce(int n)
{
if(val)
try
{
wait();
}
catch(InterruptedException e)
{
System.out.println("Interrupted Exception caught");
}
this.n = n;
val = true;
System.out.println("Produced: " +n);
notify();
}

synchronized int consume()
{
if(!val)
try
{
wait();
}
catch(InterruptedException e)
{
System.out.println("Interrupted Exception caught");
}
System.out.println("Consumed: "+n);
val = false;
notify();
return n;
}
}

class Producer implements Runnable
{
exchange obj;
Producer(exchange obj)
{
this.obj = obj;
new Thread(this, "Producer").start();
}
public void run()
{
int i = 0;
while(true)
{
obj.produce(i++);
}
}
}

class Consumer implements Runnable
{
exchange obj;
Consumer(exchange obj)
{
this.obj = obj;
new Thread(this, "Consumer").start();
}
public void run()
{
while(true)
{
obj.consume();
}
}
}

class Producer_Consumer
{
public static void main(String[] args)
{
exchange obj = new exchange();
new Producer(obj);
new Consumer(obj);
System.out.println("Ctrl + C to quit");
}
}