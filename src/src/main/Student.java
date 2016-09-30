package main;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by zhangyan on 16/9/30.
 */
public class Student implements Comparable<Student>{
    public String name;
    public int score;
    public Student(String name,int score){
        this.name=name;
        this.score=score;
    }
    @Override
    public int compareTo(Student o) {
        if(o.score<this.score){
            return 1;
        }else if (o.score>this.score){
            return -1;
        }else {
            return 0;
        }
    }
    public String toString(){
        StringBuffer sb=new StringBuffer();
        sb.append("name:");
        sb.append(name);
        sb.append("");
        sb.append("score:");
        sb.append(score);
        return sb.toString();
    }
    public static void main(String []args){
        TreeMap map=new TreeMap();
        Student s1=new Student("1",100);
        Student s2=new Student("2",99);
        Student s3=new Student("3",97);
        Student s4=new Student("4",91);
        map.put(s1,new StudentDetailInfo(s1));
        map.put(s2,new StudentDetailInfo(s2));
        map.put(s3,new StudentDetailInfo(s3));
        map.put(s4,new StudentDetailInfo(s4));
        Map map1=((TreeMap)map).subMap(s4,s2);
        for (Iterator iterator=map1.keySet().iterator();iterator.hasNext();){
            Student key= (Student) iterator.next();
            System.out.println(key+"->"+map.get(key));
        }
    }
}
