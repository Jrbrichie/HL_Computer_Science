package Unit5_Arrays.ClassRecord;

public class ClassRecord {

    private Student[] record;
    private int index;

    public ClassRecord(){
        record = new Student[10];
        index = 0;
    }
    /**
     * Adds a single Student s to the records
     * prints "Student successfully added" if there is space
     * Otherwise prints "Record is full"
     */
    public void addStudent(Student s){
        if(index < record.length){
            record[index] = s;
            index++;
            System.out.println("Student successfully added!");
        } else {
            System.out.println("Record is full!");
        }
    }

    /**
     * Prints all the students
     * added in the record excluding the null values
     */
    public void printRecord(){
        for(Student s : record){
            if(s != null){
                System.out.println(s);//invokes toString() of the student class
            } else {
                break;
            }
        }
    }

    /**
     * Searches the first occurrence of student with the name
     * @param name any name in the record array
     * @return the first Student in the record with the name,
     *         returns null otherwise
     */
    public Student searchStudent(String name){
        Student s = null;

        for(Student student : record){
            if(student.getName().equals(name)){
                s = student;
                break;
            }
        } return s;
    }

    /**
     * Finds the oldest student
     * @return the oldest Student in the record,
     *         returns null otherwise
     */
    public Student getOldestStudent(){
        if(index > 0){
            Student oldest = record[0];

            for(Student s : record){
                if(s.getAge() > oldest.getAge()){
                    oldest = s;
                }
            }

            return oldest;
        }
        return null;
    }

    /**
     * Calculate the class average
     * of all student averages in the record.
     * @return class average, 0.0 otherwise
     */
    public double getClassAverage(){
        if(index > 0){
            double average = 0.0;

            for(Student s : record){
                average += s.getAverage();
            }
            return average / (index + 1);
        }
        return 0.0;
    }

    /**
     * Returns the student that has
     * the highest grade average in the record.
     * @return
     */
    public Student getHighestAverageGrade(){
        Student highest = record[0];

        for(Student s : record){
            if(s.getAverage() > highest.getAverage()){
                highest = s;
            }
        }
        return highest;
    }

    /**
     * Returns an array of student ages from the record.
     * @return
     */
    public int[] getStudentAges(){
        int[] ages = new int[index];

        for(int i = 0; i < ages.length; i++){
            ages[i] = record[i].getAge();
        }
        return ages;
    }

    /**
     * Creates an array of student names
     * that has an average grade of 50 or higher.
     * @return array of names that has an average grade of 50 or higher
     */
    public String[] getPassingStudents(){
        int numPassing = 0;
        for(Student s : record){
            if(s.getAverage() >= 50){
                numPassing++;
            }
        }

        String[] passing = new String[numPassing];
        int j = 0;
        for(int i = 0; i < record.length; i++){
            if(record[i].getAverage() >= 50){
                passing[j] = record[i].getName();
                j++;
            }
        }
        return passing;
    }

    /**
     * Creates an array of remarks (P or F)
     * that corresponds to the student’s grade average.
     * P is for students with grade average 50 or higher
     * F is for students with grade average below 50
     * @return Array of String with P and F remarks
     */
    public String[] passFailRemarks(){
        String[] passFail = new String[index + 1];
        for(int i = 0; i < passFail.length; i++){
            if(record[i].getAverage() >= 50){
                passFail[i] = "P";
            } else {
                passFail[i] = "F";
            }
        }
        return passFail;
    }

    /**
     * Prints the names of students with age or higher
     * @param age
     */
    public void printByAge(int age){
        for(Student s : record){
            if(s != null){
                if(s.getAge() >= age){
                    System.out.print(s.getName() + ", ");
                }
            }
        }
        System.out.println();
    }

    /**
     * Creates an array of students from
     * index start to index end inclusive
     * @param start is >= 0 and start < end
     * @param end >= start and < record length
     * @return Array of students from records array
     */
    public Student[] groupStudents(int start, int end){
        Student[] group = new Student[end - start + 1];

        int j = 0;
        for(int i = start; i <= end; i++){
            if(record[i] != null){
                group[j] = record[i];
                j++;
            }
        }
        return group;
    }
}
