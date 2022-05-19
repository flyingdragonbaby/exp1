package cn.hnust.yj.pojo;

public class Course {
    private int id;
    private String name;
    private int hours;
    private School school;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "" +
                "课程id=" + this.id +
                ", 课程名=" + name +
                ", 课时=" + hours +
                ", " + school
                ;
    }
}

