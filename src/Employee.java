public class Employee extends Human {
    public double salary;
    public String position;

    public Employee(String fullName, int age, double salary, String position) {
        super(fullName, age);
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", position='" + position + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}
