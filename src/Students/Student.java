package Students;



public class Student {
    private String schoolName;
    private Integer grade;
    private String name;
    private String surname;


    public Student(String schoolName, Integer grade, String name, String surname)
    {
        this.schoolName = schoolName;
        this.grade = grade;
        this.name = name;
        this.surname = surname;
    }


    public String getName(){

        return name;
    }
}
