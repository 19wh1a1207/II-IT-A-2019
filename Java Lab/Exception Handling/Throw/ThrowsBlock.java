public class ThrowsBlock
{
  static void checkMarks(int mark) throws ArithmeticException 
  {
    if (mark < 37)
    {
      throw new ArithmeticException("You fail");
    }
    else
    {
      System.out.println("You will pass");
    }
  }

  public static void main(String[] args)
  {
    checkMarks(35);
  }
}