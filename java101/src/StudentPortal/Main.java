package StudentPortal;

public class Main {
    public static void main(String[] args) {
        Course math = new Course("Mathematics", "MATH101","MATH");
        Course physics = new Course("Physics", "PHYS101", "PHYS");
        Course chem = new Course("Chemistry", "CHEM101", "CHEM");

        Teacher inst1 = new Teacher("Nikola Tesla", "0905440000", "PHYS");
        Teacher inst2 = new Teacher("Leonhard Euler", "0905434343", "MATH");
        Teacher inst3 = new Teacher("Marie Curie", "0905422226665", "CHEM");

        math.addTeacher(inst2);
        physics.addTeacher(inst1);
        chem.addTeacher(inst3);
        math.printTeacher();
        physics.printTeacher();
        chem.printTeacher();

        Student std1 = new Student("John Doe", "199299", 1, math, physics, chem);
        std1.addBulkExamNote(66,45,86);
        std1.addBulkVerbalNote(75,86,90);
        std1.isPass();

        Student std2 = new Student("Jane Doe", "288388", 1,math, physics, chem);
        std2.addBulkExamNote(99,86,79);
        std2.addBulkVerbalNote(100,96,89);
        std2.isPass();

        Student std3 = new Student("Mark Zuck", "366466", 1, math, physics, chem);
        std3.addBulkExamNote(24,54,36);
        std3.addBulkVerbalNote(32,46,15);
        std3.isPass();
    }
}
