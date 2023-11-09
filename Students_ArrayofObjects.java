public class Students {
    // Method 1 with parameters name[], id[], CGPA[]
    public void displayStudentInfo(String[] name, int[] id, double[] CGPA) {
        if (name.length != id.length || name.length != CGPA.length) {
            System.out.println("Invalid input arrays. Lengths must match.");
            return;
        }

        System.out.println("Student Information:");
        for (int i = 0; i < name.length; i++) {
            System.out.println("Name: " + name[i]);
            System.out.println("ID: " + id[i]);
            System.out.println("CGPA: " + CGPA[i]);
        }

        // Calculate and display the sum and average of CGPA
        double sum = 0.0;
        for (double cgpa : CGPA) {
            sum += cgpa;
        }
        double average = sum / CGPA.length;

        System.out.println("Sum of CGPA: " + sum);
        System.out.println("Average CGPA: " + average);
    }

    // Method 2 with parameters name[], marks[]
    public void displayTopScorer(String[] name, int[] marks) {
        if (name.length != marks.length) {
            System.out.println("Invalid input arrays. Lengths must match.");
            return;
        }

        int maxMarks = -1;
        String topScorer = null;

        for (int i = 0; i < name.length; i++) {
            if (marks[i] > maxMarks) {
                maxMarks = marks[i];
                topScorer = name[i];
            }
        }

        System.out.println("Top Scorer Information:");
        System.out.println("Name of the Top Scorer: " + topScorer);
        System.out.println("Marks of the Top Scorer: " + maxMarks);
    }

    public static void main(String[] args) {
        Students students = new Students();

        String[] names = { "Alice", "Bob", "Charlie", "David" };
        int[] ids = { 101, 102, 103, 104 };
        double[] cgpa = { 3.5, 3.8, 3.9, 3.7 };
        students.displayStudentInfo(names, ids, cgpa);

        System.out.println();

        int[] marks = { 95, 87, 98, 89 };
        students.displayTopScorer(names, marks);
    }
}
