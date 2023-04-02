public class lab4q2 {
    private String name;
    private int age;

    public lab4q2(String name, int age) {
        this.name = name; // "this" refers to the current instance of the Person class
        this.age = age;   // and is used to disambiguate between the instance variable "name" and the parameter "name"
    }

    public String getName() {
        return this.name; // "this" is not strictly necessary here, but it makes it clear that we're returning the instance variable
    }

    public int getAge() {
        return age; // we don't need to use "this" here, because there's no ambiguity with the parameter name
    }

    public void setName(String name) {
        this.name = name; // here, "this" is necessary to disambiguate between the instance variable "name" and the parameter "name"
    }

    public void setAge(int age) {
        this.age = age; // "this" is not strictly necessary here, but it makes it clear that we're setting the instance variable
    }
    public static void main(String args[])
    {
        lab4q2 o1 = new lab4q2("ishaan", 20);
        System.out.println(o1.getName() + " " + o1.getAge());
        o1.setAge(12);
        o1.setName("wadhwa");
        System.out.println(o1.getName() + " " + o1.getAge());
    }
}

