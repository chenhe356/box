package main;

/**
 * Created by zhangyan on 16/9/30.
 */
public class StudentDetailInfo {
    Student s;
    public StudentDetailInfo(Student s){
        this.s=s;
    }

    @Override
    public String toString() {
        return s.name+"'s detail infomation";
    }
}
