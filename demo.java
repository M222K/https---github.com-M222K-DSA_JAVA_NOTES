import java.util.*;

public class demo{
  public static void main (String[] args){
  Scanner sc= new Scanner(System.in);

  int a= sc.nextInt();
  int b= sc.nextInt();
  int c= sc.nextInt();

  /*int max=a;
  if (b>max){
    max=b;
  }
  if (c>max){
    max=c;
  }
*/

// can also use math.max function to comapare to numbers 

  int max=Math.max(c,Math.max(a,b));
  System.out.println("the maximium value is "+max);

  }
}
