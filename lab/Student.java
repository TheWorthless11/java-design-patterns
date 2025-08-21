package lab;
public class Student {
    private String id;
    private String name;
    private int age;

    // No-arg constructor
    public Student() {}

    // All-args constructor
    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters
    public String getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // Setters
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

     public static void main (String[] args) {
        Student s = new Student("101", "Mahhia", 21);
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}

