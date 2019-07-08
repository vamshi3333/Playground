import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner ln=new Scanner(System.in);
    int n=ln.nextInt();
    int first_digit=n/100;
    int second_digit=((n/10)%10);
    int third_digit=n%10;
    int sum=(third_digit*100)+(second_digit*10)+first_digit;
    System.out.println(sum);
     
  }
}