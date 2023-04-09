package AllPrograms;

public class Employee {
    private String name;
    private int age;
    private String location;

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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee(String name, int age, String location) {
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public Employee(){

    }

    public static void main(String[] args) {
        Employee e = new Employee();
        Employee e1 = new Employee("Dileep1",25,"Chennai");
        e.setName("Dileep");
        e.setAge(25);
        e.setLocation("Hyderabad");

        System.out.println(e.getName()+" \t "+ e.getAge()+ "\t "+e.getLocation());
        System.out.println(e1.getName()+" \t "+ e1.getAge()+ "\t "+e1.getLocation());

    }
}
