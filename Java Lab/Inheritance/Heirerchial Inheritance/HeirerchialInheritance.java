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
class HeirerchialInheritance
{
public static void main(String[] args)
{
ChildChild obj = new ChildChild();
obj.mul();
Child obj1 = new Child();
obj1.sum();
}
} 