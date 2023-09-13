
package javaapplication31;


public class Person {
    
    private String name;
    private long nid;
    
    public Person(){
    }
    
    public Person(String name, long nid){
        this.name= name;
        this.nid= nid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNid() {
        return nid;
    }

    public void setNid(long nid) {
        this.nid = nid;
    }
    
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", nid=" + nid +'}';
    }
}

