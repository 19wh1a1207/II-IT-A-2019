class StrMethods{
public static void main(String[] args) {      
String name1 = "welcome";
String name2 = " to java programming";
name1 = name1.concat(name2);
System.out.println(name1);
int len = name1.length();
System.out.println(len);
char ch = name1.charAt(13);
System.out.println(ch);
String s1="java";  
String s2="java";  
String s3="JAVA";  
String s4="python";  
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));  
System.out.println(s1.equals(s4));
String s5="This is a sample text";  
System.out.println(s5.startsWith("This "));  
System.out.println(s5.startsWith("I guess"));
System.out.println(s5.endsWith("This "));  
System.out.println(s5.endsWith(" text")); 
String s6 = "This is indexOf method of a String";         
int index = s6.indexOf("method"); 
System.out.println("index of substring "+index);
index = s6.indexOf("method", 10);     
System.out.println("index of substring "+index);
index = s6.indexOf('e', 12);  
System.out.println("index of substring "+index);
s1="this is lastindexof example of a string";
index=s1.lastIndexOf('s'); 
System.out.println(index);  
index = s1.lastIndexOf('s', 5);
System.out.println(index);  
index = s1.lastIndexOf("of");
System.out.println(index);  
index = s1.lastIndexOf("of", 10);
System.out.println(index);
s1="Welcome to java programming";  
System.out.println(s1.substring(2,4)); 
System.out.println(s1.substring(2));
System.out.println(s1.toLowerCase());
System.out.println(s1.toUpperCase());
s1="        Welcome to java programming";  
System.out.println(s1.trim()); 
s1="Welcome to java programming";  
String a[] = s1.split("");
for(String i : a)
{
System.out.print(i);
}
s1="Welcome to c programming";  
s1 = s1.replace('c', 'j');
System.out.println(s1);
s1="java";  
s2="java";  
s3="JAVA";   
System.out.println(s1.equalsIgnoreCase(s2));  
System.out.println(s1.equalsIgnoreCase(s3));
}
}
