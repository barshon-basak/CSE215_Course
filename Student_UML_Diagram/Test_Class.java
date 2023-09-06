package javaapplication27;

public class JavaApplication27 {

    
    public static void main(String[] args) {
       
        Student student1 = new Student();
        
        student1.setName("Barshon Basak");
        student1.setDept("CSE");
        student1.setID("2311625642");
        
        System.out.println("Student 1 Information : ");
        student1.printInfo();
        System.out.println();
        
        Student student2 = new Student("Mr. X","2311634042","EEE");
        System.out.println("Student 2 Information : ");
        student2.printInfo();
    }
    
}
