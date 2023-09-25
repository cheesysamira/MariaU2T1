public class Student {

        // instance variables
        private String name;
        private int age;
        private double heightInInches;
        private double GPA;

        // constructor
        public Student(String studentName, int studentAge, double studentHeightInInches, double studentGPA) {
            name = studentName;
            age = studentAge;
            heightInInches = studentHeightInInches;
            GPA = studentGPA;
        }

        // method that introduces the Cat
        public void introduce() {
            System.out.println("Hello, this is " + name + " and I am " + age + " years old!");
            System.out.println("I am also " + heightInInches + " inches tall. And lastly...");
            if (GPA >= 65) {
                System.out.println("My GPA is " + GPA + ", which is passing!");
            } else {
                System.out.println("My GPA is " + GPA + ", which is failing..");
            }
        }

        // method that prints Cat info
        public void printStudentInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Height (in inches): " + heightInInches);
            System.out.println("GPA: " + GPA);

        }
    }
