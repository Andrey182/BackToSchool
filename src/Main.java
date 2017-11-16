public class Main {
    public static void main(String[] args) {
        Teacher teacherOne = new Teacher("Bob SiO2", 10, "M", 4000.0, "Math");
        People peopleOne = new People("Alexander Perepeliny-Yaichki", 33, "M");
        Student studentOne = new Student("Victor Kucha", 19, "M", "156UCF", 3.8);
        CollegeStudent collegeStudentOne = new CollegeStudent("Dima Punktir", 18, "M", "461UOU", 4.5, 4, "English");
        String[] people = {teacherOne.toString(),
                peopleOne.toString(),
                studentOne.toString(),
                collegeStudentOne.toString()
        };
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i]);
        }
    }
}