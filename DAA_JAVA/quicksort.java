import java.util.Arrays;
public class quicksort{
public static int partition(int arr[],int low,int high){
int pivot=arr[(low+high)/2];
while(low<=high){
        while(arr[low]<pivot){

        low++;

        }
        while(arr[high]>pivot){

        high--;

        }
      if(low<=high){
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        low++;
        high--;
      }



}
return low;



}
public static void recursion(int arr[],int low,int high){
       int pi=partition( arr, low, high);
      if(low<pi-1){

      recursion(arr,low,pi-1);

}
     if(high>pi){

       recursion(arr,pi,high);

}

}
public static  void printarr(int arr[],int len){
    for(int i=0;i<len;i++){
    System.out.print(arr[i]+" ");

}


}
public static void main(String args[]){
int arr[]={13,7,14,1,34,15,16,19};
int len=arr.length;
quicksort obj=new quicksort();
 System.out.println("Unsorted array");
obj.printarr(arr,len);

obj.recursion(arr,0,len-1);
System.out.println(" ");
System.out.println("sorted array");
obj.printarr(arr,len);
}




}