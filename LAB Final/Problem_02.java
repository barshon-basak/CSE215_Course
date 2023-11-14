public class StudentManager {

    public static void main(String[] args) throws IOException {
        // Create two new text files to store student information
        FileWriter student1Writer = new FileWriter("student_1.txt");
        FileWriter student2Writer = new FileWriter("student_2.txt");

        // Get student information from the user
        System.out.println("Enter student 1's name:");
        String student1Name = System.console().readLine();

        System.out.println("Enter student 1's ID:");
        int student1Id = Integer.parseInt(System.console().readLine());

        System.out.println("Enter student 1's department:");
        String student1Department = System.console().readLine();

        System.out.println("Enter student 2's name:");
        String student2Name = System.console().readLine();

        System.out.println("Enter student 2's ID:");
        int student2Id = Integer.parseInt(System.console().readLine());

        System.out.println("Enter student 2's department:");
        String student2Department = System.console().readLine();

        // Write student information to the text files
        student1Writer.write(student1Name + "\n");
        student1Writer.write(student1Id + "\n");
        student1Writer.write(student1Department + "\n");

        student2Writer.write(student2Name + "\n");
        student2Writer.write(student2Id + "\n");
        student2Writer.write(student2Department + "\n");

        // Close the text files
        student1Writer.close();
        student2Writer.close();

        // Create a new text file to store the combined student information
        FileWriter studentsWriter = new FileWriter("students.txt");

        // Read student information from the two text files
        BufferedReader student1Reader = new BufferedReader(new FileReader("student_1.txt"));
        BufferedReader student2Reader = new BufferedReader(new FileReader("student_2.txt"));

        // Create two new Student objects
        Student student1 = new Student(student1Reader.readLine(), student1Reader.readLine(), student1Reader.readLine());
        Student student2 = new Student(student2Reader.readLine(), student2Reader.readLine(), student2Reader.readLine());

        // Write the combined student information to the new text file
        studentsWriter.write(student1.toString() + "\n");
        studentsWriter.write(student2.toString() + "\n");

        // Close the new text file
        studentsWriter.close();
    }
}

public class StudentManagerTest {

    @Test
    public void testWriteStudentInfoToTextFiles() throws IOException {
        // Create a new StudentManager object
        StudentManager studentManager = new StudentManager();

        // Write student information to the text files
        studentManager.writeStudentInfoToTextFiles("Alice", 123, "Computer Science", "Bob", 456, "Mathematics");

        // Read student information from the text files
        BufferedReader student1Reader = new BufferedReader(new FileReader("student_1.txt"));
        BufferedReader student2Reader = new BufferedReader(new FileReader("student_2.txt"));

        // Assert that the student information was written to the text files correctly
        assertEquals("Alice", student1Reader.readLine());
        assertEquals("123", student1Reader.readLine());
        assertEquals("Computer Science", student1Reader.readLine());

        assertEquals("Bob", student2Reader.readLine());
        assertEquals("456", student2Reader.readLine());
        assertEquals("Mathematics", student2Reader.readLine());

        // Close the text files
        student1Reader.close();
        student2Reader.close();
    }
}
