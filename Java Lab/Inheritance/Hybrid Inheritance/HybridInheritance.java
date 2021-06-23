class Base
{
int a = 10;
}
class Child extends Base
{
int b = 20;
void sum()
{
System.out.println("Sum of a and b is: "+(a + b));
}
}
class ChildChild extends Base
{
int c = 5;
void mul()
{
System.out.println("Product of a and c is: "+(a * c));
}
}
class D extends Child
{
int d;
void add()
{
d = a + b;
System.out.println("The value of d is: "+d);
}
}
class HybridInheritance
{
public static void main(String[] args)
{
Child obj1 = new Child();
obj1.sum();
ChildChild obj2 = new ChildChild();
obj2.mul();
D obj3 = new D();
obj3.add();
}
} 