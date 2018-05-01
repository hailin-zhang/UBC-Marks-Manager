package Classes;

public class Grade {
    private double credits;
    private double grade;

    public Grade(double credits, double grade){
        this.credits = credits;
        this.grade = grade;
    }

    public void setCourse(double credits){
        this.credits = credits;
    }

    public void setGrade(double grade){
        this.grade = grade;
    }

    public double getCredits(){
        return credits;
    }

    public double getGrade(){
        return grade;
    }
}
