
package javaapplication9;

public class JavaApplication9 {

    public static void main(String[] args) {
        int sum1=0,sum2=0,sum3=0;
        int[][] arr = {
            {3,4,9},
            {2,9,11},
            {4,6,0}};
        for(int i=0; i<3 ; i++){
            for(int j=0; j<3 ; j++){
            sum1= sum1 + arr[i][j];
            }
            System.out.println("The sum of row-"+i+" is = "+sum1);
            sum1=0;
        }
        for(int i=0; i<3 ; i++){
            for(int j=0; j<3 ; j++){
            sum1= sum1 + arr[j][i];
            }
            System.out.println("The sum of COlumn-"+i+" is= "+sum1);
            sum1=0;
        }
        
        for(int i=0; i<3 ; i++){
            for(int j=0; j<3 ; j++){
            if(i+j== 2){
            sum2+= arr[i][j];}
            if(i==j){
            sum3+= arr[i][j];}}}
        System.out.println("The sum of the First Diagonal is "+sum3);
        System.out.println("The sum of the second Diagonal is "+sum2);
        
    }
    
}
