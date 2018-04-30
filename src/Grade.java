public class Grade {
    private int credits;
    private int grade;

    public Grade(int credits, int grade){
        this.credits = credits;
        this.grade = grade;
    }

    public void setCourse(int credits){
        this.credits = credits;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getCredits(){
        return credits;
    }

    public int getGrade(){
        return grade;
    }
}
