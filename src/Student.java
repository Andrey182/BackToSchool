public class Student extends People  {
    private String idNuber;
    private double gpa;
    Student(String name, int age, String gender, String idNumber, double gpa){
        super(name,age,gender);
        this.idNuber = idNumber;
        this.gpa = gpa;
    }

    public String getIdNuber() {
        return idNuber;
    }

    public void setIdNuber(String idNuber) {
        this.idNuber = idNuber;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String toString(){
        return super.toString()+"," + " student id" + getIdNuber()+ "," + " gpa:" + getGpa();}
}
