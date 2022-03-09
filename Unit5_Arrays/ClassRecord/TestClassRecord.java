package Unit5_Arrays.ClassRecord;

class TestClassRecord{
    public static void main(String[] args) {

        ClassRecord cr = new ClassRecord();

        cr.addStudent(new Student("John", 16, 90));
        Student jane = new Student("Jane", 15, 99);
        cr.addStudent(jane);
        cr.addStudent(new Student("Anne", 17, 45));
        cr.addStudent(new Student("Joy", 16, 89));
        cr.addStudent(new Student("Sam", 15, 49));
        cr.addStudent(new Student("Jane", 18, 75));
        cr.addStudent(new Student("Phil", 15, 85));
        cr.addStudent(new Student("Ben", 19, 95));
        cr.addStudent(new Student("Erik", 19, 99));
        cr.addStudent(new Student("Nathan", 15, 89));

        System.out.println();
        System.out.println("Printing all students...");
        cr.printRecord();

        System.out.println();
        System.out.println("Searching Sam...");
        System.out.println(cr.searchStudent("Sam"));

        System.out.println();
        System.out.println("Finds the oldest student...");
        System.out.println(cr.getOldestStudent());

        System.out.println();
        System.out.println("Calculate the class average...");
        System.out.println(cr.getClassAverage());

        System.out.println();
        System.out.println("Finds a student with the highest-grade...");
        System.out.println(cr.getHighestAverageGrade());

        System.out.println();
        System.out.println("The list of student's ages...");
        int[] ages = cr.getStudentAges();
        for(int i = 0; i < ages.length; i++){
            System.out.print(ages[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Students with average >= 50...");
        String[] passing = cr.getPassingStudents();
        for(int i = 0; i < passing.length; i++){
            System.out.print(passing[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Pass or Fail remarks for each student...");
        String[] passFail = cr.passFailRemarks();
        for(int i = 0; i < passFail.length; i++){
            System.out.print(passFail[i] + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Printing students with age above 18...");
        cr.printByAge(18);


        System.out.println();
        System.out.println("Printing a group of students...");
        Student[] students = cr.groupStudents(2, 4);
        for (Student s: students) {
            System.out.println(s);
        }
    }
}
