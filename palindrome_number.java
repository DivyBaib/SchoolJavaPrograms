import java.util.*;
class PalindromeNumber
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    String number="";
    String number_rev="";
    System.out.println("Enter a number");
    number=sc.next();
    for(int i=number.len-1;i>=0;i++)
    {
      number_rev = number_rev + number[i];
    }
    if(number_rev==number)
    {
      System.out.println(number + " is palindrome");
    }
    else
    {
      System.out.println(number + " is not palindrome");
    }
  }
}
