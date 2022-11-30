package emo;

public class Employee implements Comparable {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }



    public String getName() {
        return "Employee";
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Object o) {
        Employee other = (Employee) o;
        return Integer.compare(this.getSalary(), other.getSalary());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
