import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

public class EmployeeSerializationDeserialization {
    public static void main(String[] args) {
        try {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("John", 101));
            employees.add(new Employee("Alice", 102));
            employees.add(new Employee("Bob", 103));

            // Serialize and write employees to a file
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees.ser"));
            outputStream.writeObject(employees);
            outputStream.close();

            // Deserialize and read employees from the file
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("employees.ser"));
            List<Employee> loadedEmployees = (List<Employee>) inputStream.readObject();
            inputStream.close();

            // Print the name and id for each loaded employee
            for (Employee employee : loadedEmployees) {
                System.out.println("Name: " + employee.getName() + ", ID: " + employee.getId());
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
