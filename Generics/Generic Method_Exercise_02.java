
package javaapplication72;

public class JavaApplication72 {

    public static void main(String[] args) {
            
        Demo1 D=new Demo1();
        Integer[] integers = {1, 2, 3, 4, 5};
        String[] strings = {"London", "Paris", "New York", "Austin"}; 
        D.<Integer>print(integers);
        D.<String>print(strings);
    }
    
}
class Demo1{
public static <T> void print(T[] list){
    for(int i=0; i<list.length; i++){
        System.out.println(list[i]+" ");
    }
    System.out.println();
}

}
