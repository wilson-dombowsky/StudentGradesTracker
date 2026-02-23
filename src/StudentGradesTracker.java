public class StudentGradesTracker {

    public static class Student {
        String name;
        int grade;

        public Student(String n, int g) {
            name = n;
            grade = g;
        }

        public String getName() { return name; }
        public int getGrade() { return grade; }
    }
    public static void main(String[] args) {
        Student[] students = {
                new Student("John Doe", 85),
                new Student( "Jane Doe", 97),
                new Student( "James Smith", 76),
                new Student( "Josh Allen", 100)
    };

        System.out.println("Average grade:" + findAverage(students));
        System.out.println("Highest grade:" + findHighestGrade(students));
        System.out.println("Number of students above 90:" + countAboveThreshold(students, 90));

        System.out.println("Students above 90:");
        printNamesAboveThreshold(students, 90);
    }

    public static double findAverage(Student[] students) {
        int sum = 0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getGrade();
        }
        return (double) sum / students.length;
    }
    public static int findHighestGrade(Student[] students) {
        int max = students[0].getGrade();
        for (int i = 1; i < students.length; i++) {
            if (students[i].getGrade() > max) {
                max = students[i].getGrade();
            }
        }
        return max;
    }

    public static int countAboveThreshold(Student[] students, int threshold) {
        int count = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGrade() >= threshold) {
                count++;
            }
        }
        return count;
    }

    public static void printNamesAboveThreshold(Student[] students, int threshold) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getGrade() >= threshold) {
                System.out.println(students[i].getName());
            }
        }
    }
}