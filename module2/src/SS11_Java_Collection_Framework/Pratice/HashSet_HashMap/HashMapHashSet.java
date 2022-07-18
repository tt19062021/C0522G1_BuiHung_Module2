package SS11_Java_Collection_Framework.Pratice.HashSet_HashMap;

import java.util.*;

public class HashMapHashSet {

    public static void main(String[] args) {
        Student student1 = new Student("Nam",20, "HN");
        Student student2 = new Student("Hung",21, "HN");
        Student student3 = new Student("Ha",22, "HN");
//        Map<Integer, Student> studentMap = new HashMap<>();

        Map<Integer,Student> studentMap1 = new LinkedHashMap<>();
        studentMap1.put(1,student1);
        studentMap1.put(2,student2);
        studentMap1.put(3,student3);
        studentMap1.put(4,student1);

        System.out.println(studentMap1);

        /**
         * Duyet map forEach cho HashMap
         */
//        for(Map.Entry<Integer,Student> student : studentMap.entrySet()){
//            System.out.println(student);
//        }
        /**
         * Duyet map forEach cho LinkedHashMap
         * Lay key
         * lay value
         */
//        for(Integer key:studentMap1.keySet()){
//            System.out.println("Key : " + key);
//        }
        for(Student value: studentMap1.values()){
            System.out.println("value:" + value);
        }

//        Set<Student> studentSet = new HashSet<>();
//        studentSet.add(student1);
//        studentSet.add(student2);
//        studentSet.add(student3);
//        studentSet.add(student1);
//
//        for(Student student : studentSet){
//            System.out.println(student.toString());
//        }
    }
}
