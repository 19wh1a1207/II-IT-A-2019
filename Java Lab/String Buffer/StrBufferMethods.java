class StrBufferMethods
{
public static void main(String[] args)
{
StringBuffer name = new StringBuffer("This is my first ");
StringBuffer name1 = new StringBuffer("assignment");
name.append("Java ");
System.out.println(name);
name.append(name1);
System.out.println(name);
name.insert(17, "ever ");
System.out.println(name);
name.delete(16, 21);
System.out.println(name);
name.deleteCharAt(5);
System.out.println(name);
name.reverse();
System.out.println(name);
name.reverse();
System.out.println(name);
name.replace(4, 5, "was");
System.out.println(name);
char a = name.charAt(4);
System.out.println(a);
name.setCharAt(0, 't');
System.out.println(name);
int ind = name.indexOf("f");
System.out.println(ind);
int lsInd = name.lastIndexOf("a");
System.out.println(lsInd);
System.out.println(name.substring(5, 7));
int len = name.length();
System.out.println(len);
int cap = name.capacity();
System.out.println(cap);
}
}
