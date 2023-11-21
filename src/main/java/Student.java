import java.util.ArrayList;

public class Student {
    private String name;
    private long id;
    private ArrayList<Double> grades;
    public Student(String name, long id) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void addGrade(double grade) {
        grades.add(grade);
    }
    public ArrayList<Double> getGrades() {
        return grades;
    }
    public double getGradeAverage() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}