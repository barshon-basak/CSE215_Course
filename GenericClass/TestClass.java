
package javaapplication43;

import java.util.ArrayList;

public class JavaApplication43 {

    public static void main(String[] args) {
       GenericClass<Integer> gcInteger = new GenericClass<Integer>(5);
       GenericClass<String> gcString = new GenericClass<String>("It is a string");
       
       NOrmalClass nc = new NOrmalClass(5.5);
       GenericClass<NOrmalClass> gcNormalClass = new GenericClass<NOrmalClass>(nc);
       
       gcInteger.printObject();
       gcString.printObject();
       gcNormalClass.printObject();
       
        ArrayList<NOrmalClass> a2= new ArrayList<NOrmalClass>();
        NOrmalClass nc1 = new NOrmalClass(55.6);
        NOrmalClass nc2 = new NOrmalClass(58.6);
        NOrmalClass nc3 = new NOrmalClass(55.6);
        NOrmalClass nc4 = new NOrmalClass(55.6);
        
      a2.add(nc1);
        a2.add(nc2);
        a2.add(nc3);
        a2.add(nc4);
        
      
         for(NOrmalClass x :a2){
            System.out.println(x);}
    }
    
}
