public class Teacher extends People {
    private double salary;
    private String subject;

    Teacher(String name, int age, String gender, double salary, String subject) {
        super(name,age,gender);
        this.salary=salary;
        this.subject=subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String toString() {
        return super.toString()+"," + " subject:" + getSubject()+"," + " salary:" + getSalary();
    }
}
