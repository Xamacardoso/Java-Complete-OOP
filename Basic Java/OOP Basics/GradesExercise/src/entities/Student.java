package GradesExercise.src.entities;

public class Student {
    public String name;
    public double grade1, grade2, grade3;

    public double getFinalGrade(){
        return this.grade1 + this.grade2 + this.grade3;
    }
}
