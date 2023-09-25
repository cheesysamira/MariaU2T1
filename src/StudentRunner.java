public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Meena", 16, 66, 100.39);
        student1.introduce();
        student1.printStudentInfo();

        System.out.println();

        Student student2 = new Student("Hollis", 17, 68.5, 99.99);
        student2.printStudentInfo();
        student2.introduce();
    }
}


