
package javaapplication62;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;


public class JavaApplication62 {

    public static void main(String[] args) {
       
        try{
            File file=new File("student.txt");
            
            PrintWriter output=new PrintWriter(file);
            output.print("113098 ");
            output.println(20);
            output.print("115089 ");
            output.println(15);
            output.print("345678 ");
            output.println(12);
            output.print("234566 ");
            output.println(18);
            output.close();
            
            Scanner sc=new Scanner(file);
            Quiz[] arr=new Quiz[4];
            int i;
            
            for(i=0;i<4;i++){
                if(sc.hasNext()){
                    arr[i]=new Quiz(sc.next(),sc.nextInt());//arr[i] is a object ,so to initialize a object we need constructor
                    
                }
            }
            
            int max=arr[0].marks;
            String id1=arr[0].id;
            for(i=1;i<3;i++){
                if(arr[i].marks>max){
                    max=arr[i].marks;
                    id1=arr[i].id;
                }
            }
            
            for(i=0;i<4;i++){
                System.out.println("ID:"+arr[i].id);
                System.out.println("mark:"+arr[i].marks);
            }
            System.out.println("Highest mark obtained by ID: "+id1);
            
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
