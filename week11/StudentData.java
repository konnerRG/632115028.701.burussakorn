class Student{
    String name;
    int age;
    double gpa;
    //Object for Student class.
    public Student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    //Compare the names of 2 students.
    public boolean equals(Student std00){
        if(std00 instanceof Student){
            return name == ((Student)std00).name;
        }
        else{    
            return false;
        }
    }
    //Compare the age of 2 students.
    public boolean ageEquals(Student std00){
        if(std00 instanceof Student){
            return age == ((Student)std00).age;
        }
        else{
            return false;
        }
    }
    //Compare the gpa of 2 students.
    public boolean GPAEquals(Student std00){
        if(std00 instanceof Student){
            return gpa == ((Student)std00).gpa;
        }
        else{
            return false;
        }
    }
}

public class StudentData {
    public static void main(String[]args){
        //Initialize student object by name, age and GPA.
        Student std01 = new Student("Mark", 18, 4.00);
        Student std02 = new Student("Jane", 18, 2.20);
        Student std03 = new Student("Peter", 19, 4.00);
        Student std04 = new Student("Mark", 22, 1.75);

        //Write the equal statements to test the objects below.
        //name
        System.out.println("COMPARE NAME");
        System.out.println("Compare std01 to std02: "+std01.equals(std02));
        System.out.println("Compare std01 to std03: "+std01.equals(std03));
        System.out.println("Compare std02 to std04: "+std02.equals(std04));
        System.out.println("Compare std01 to std04: "+std01.equals(std04));
        //age
        System.out.println("\nCOMPARE AGE");
        System.out.println("Compare std01 to std02: "+std01.ageEquals(std02));
        System.out.println("Compare std03 to std04: "+std03.ageEquals(std04));
        System.out.println("Compare std01 to std03: "+std01.ageEquals(std03));
        //GPA
        System.out.println("\nCOMPARE GPA");
        System.out.println("Compare std01 to std03: "+std01.GPAEquals(std03));
        System.out.println("Compare std02 to std04: "+std02.GPAEquals(std04));
        System.out.println("Compare std02 to std03: "+std02.GPAEquals(std03));

    }
}
