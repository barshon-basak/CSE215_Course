
package javaapplication43;

public class GenericClass<T> {
    private T obj;
    
    public GenericClass(T obj){
    this.obj= obj;
    }

    GenericClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void printObject(){
        System.out.println("Object :"+String.valueOf(obj));
    }
}
