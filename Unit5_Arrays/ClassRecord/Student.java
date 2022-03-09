package Unit5_Arrays.ClassRecord;

public class Student {

    private static int CLASS_OF = 2023; //same for all student objects

    //value varies for each instance of the student object
    private String name;
    private int age;
    private double average;

    //used to create a student object, and sets initial values for name, ade, and average
    public Student(String n, int a, double g){
        name = n;
        age = a;
        average = g;
    }

    //non-static method that returns a static value
    public int getClassOf(){
        return CLASS_OF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    @Override
    public String toString(){
        return "Name: " + name + ", Age: " + age + ", Average: " + average;
    }
}

