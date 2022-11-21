import java.util.*;
import java.util.Arrays;
 class nqueen{
     final  int n=4;
      void printsolution(int board[][]){
      int i,j;
      for( i=0;i<n;i++){
           for( j=0;j<n;j++){
             System.out.print(" "+board[i][j]+" " );
            }
            System.out.println(" ");    
      }
}     
      boolean issafe(int board[][],int row,int coloumn){
       int i,j;
       for(i=0;i<coloumn;i++){
          if(board[row][i]==1){
            return false;
           }
       }
       for(i=row,j=coloumn;i>=0&&j>=0;i--,j--){
          if(board[i][j]==1){
            return false; 
          }
       }
      for(i=row,j=coloumn;i<n&&j>=0;i++,j--){
          if(board[i][j]==1){
            return false; 
          }
       }
      return true;

}
     boolean solve(int board[][],int coloumn){
        if(coloumn>=n){
           return true;
         }
       for(int i=0;i<n;i++){
         if(issafe(board,i,coloumn)){
              board[i][coloumn]=1;
             if(solve(board,coloumn+1)==true){
              return true;
               }
             board[i][coloumn]=0;
           }
        }
     return false;

} 
     boolean print(){
     int board[][]={{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};
     if(solve(board,0)==false){
        System.out.println("solution does not exists");
            return false;

      }
     printsolution(board);
     return true;
     }
     public static void main(String[] args) {
      nqueen obj=new nqueen();
      obj.print();
     }


}