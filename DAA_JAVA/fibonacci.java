import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
public class fibonacci{
public static void main(String args[]){
int prenumber=0;
int nextnumber=1;
int sum;
System.out.println("enter you the number you want to diplay the fibonacci");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println(" fibonacci ("+n+") is ");
long start=System.nanoTime();
for(int i=0;i<n;i++){
System.out.println(+prenumber+" ");
sum=prenumber+nextnumber;
prenumber=nextnumber;
nextnumber=sum;
}
long end=System.nanoTime();
System.out.println(" ");
System.out.println("total time required ="+(end-start));
}
}