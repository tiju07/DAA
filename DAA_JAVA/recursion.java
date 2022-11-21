import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;

public class recursion{
public static int fib(int n){
   if(n==0||n==1){

   return n;

  }
  return fib(n-2)+fib(n-1);
}
public static void main(String args[]){
  System.out.println("Enter the number");
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  long start=System.currentTimeMillis();
  for(int i=0;i<n;i++){
  System.out.println(fib(i)+"" );
   


}
long end=System.currentTimeMillis();
System.out.println("");
System.out.println("total time required "+(end-start)+" ms");




}
}