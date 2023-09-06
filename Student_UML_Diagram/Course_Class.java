
package javaapplication27;

  
public class Student {
     private String name;
     private String ID;
     private String dept;
     
     public Student(){
     }
     
     public Student(String name, String ID, String dept){
     this.name = name;
     this.ID = ID;
     this.dept = dept;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
     
    public void printInfo() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student ID: " + this.ID);
        System.out.println("Department: " + this.dept);
    }
}

