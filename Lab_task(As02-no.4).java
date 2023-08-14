package javaapplication15;

public class JavaApplication15 {

    public static void main(String[] args) {
        int sum=0,rowsum=0,colsum=0;
        int[][] mat = new int[4][4]; 
        int[] sumarr1 = new int[4];
        int[] sumarr2 = new int[4];
    for(int i=0; i<4 ; i++){
       for(int j=0 ; j<4 ; j++){
       mat[i][j] = (int)(1+Math.random()*(99));
       }}
    
       int min= mat[0][0];
       int max= mat[0][0];
    for(int i=0; i<4 ; i++){
        for(int j=0 ; j<4 ; j++){
           System.out.print(mat[i][j]+" ");;
       }
           System.out.println("");
    }
      for(int i=0; i<4 ; i++){
        for(int j=0 ; j<4 ; j++){
        sum+= mat[i][j];
        if(mat[i][j]> max){
        max= mat[i][j];}
        if(mat[i][j]< min){
        min= mat[i][j];}
        }
      } 
        System.out.println("The maximum element is "+max);
        System.out.println("The minimum element is "+min);
        
        for(int i=0; i<4; i++){
            for(int j=0 ; j<4 ; j++){
               rowsum += mat[i][j]; 
            }
            System.out.println("The sum of row "+(i+1)+" is "+rowsum );
            sumarr1[i] = rowsum;
            rowsum=0;
        }
        for(int i=0; i<4; i++){
            for(int j=0 ; j<4 ; j++){
               colsum += mat[j][i]; 
            }
            System.out.println("The sum of Column "+(i+1)+" is "+colsum );
            sumarr2[i] = colsum;
            colsum=0;
        }
        int lar1= sumarr1[0];
        int lar2= sumarr2[0];
        int count1=0,count2=0;
        
        for(int i=0 ; i<4 ; i++){
        if(lar1<sumarr1[i]){
        lar1= sumarr1[i];
        count1=i;
        }}
        System.out.println("The largest sum of the column no "+(count1+1));
        
        for(int i=0 ; i<4 ; i++){
        if(lar2<sumarr2[i]){
        lar2=sumarr2[i];
        count2=i;
        }}
        System.out.println("The largest sum of the column no "+(count2+1));
        
        int sum2=0, sum3=0;
       for(int i=0; i<4 ; i++){
            for(int j=0; j<4 ; j++){
            if(i+j== 3){
            sum2+= mat[i][j];}
            if(i==j){
            sum3+= mat[i][j];}}}
        System.out.println("The sum of the First Diagonal is "+sum3);
        System.out.println("The sum of the second Diagonal is "+sum2);
    }
    }

