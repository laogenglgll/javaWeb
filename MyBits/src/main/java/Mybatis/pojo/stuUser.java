package Mybatis.pojo;

public class stuUser {

    private int id;
    private int studentId;
    private String sname;
    private int sgrade;
    private int gradeRanking;
    private int studentClass;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSgrade() {
        return sgrade;
    }

    public void setSgrade(int sgrade) {
        this.sgrade = sgrade;
    }

    public int getGradeRanking() {
        return gradeRanking;
    }

    public void setGradeRanking(int gradeRanking) {
        this.gradeRanking = gradeRanking;
    }

    public int getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(int studentClass) {
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", sname='" + sname + '\'' +
                ", sgrade=" + sgrade +
                ", gradeRanking=" + gradeRanking +
                ", studentClass=" + studentClass +
                '}';
    }
}
