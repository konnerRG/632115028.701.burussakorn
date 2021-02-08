public class Student {
    private String firstname = "Hello";
    private String lastname = "World";

    public Student(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    //Overriding method.
    public String returnString(){
        return "My first name is "+firstname+" and my lastname is "+lastname;
    }
    public static void main(String[]args){
        Student p = new Student("Hello","World");
        System.out.println(p.returnString());
    }
}
