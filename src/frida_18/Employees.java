package frida_18;

public class Employees extends FSDcompany {
    private int age;
    private int salary;
    private String position;




    public Employees(int age, int salary, String position) {
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    public Employees(Long id, String name, String surname, int age, int salary, String position) {
        super(id, name, surname);
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return this.id +" "+ this.name+" "+ this.surname+" "+ this.age+" "+ this.salary+" "+ this.position;
    }
}
