package Unut6.exampels;

public class course {
    private String teacherName;
    private String subject;
    private String currentGrade;
    private int period;

    public course(String teacherName, String subject, String currentGrade, int period) {
        this.teacherName = teacherName;
        this.subject = subject;
        this.currentGrade = currentGrade;
        this.period = period;
    }

    public course(String subject, int period) {
        this.subject = subject;
        this.period = period;
        this.teacherName= "None";
        this.currentGrade = "nOne";
    }

    @Override
    public String toString() {
        return "course{" +
                "teacherName='" + teacherName + '\'' +
                ", subject='" + subject + '\'' +
                ", currentGrade='" + currentGrade + '\'' +
                ", period=" + period +
                '}';
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    //write a


}
