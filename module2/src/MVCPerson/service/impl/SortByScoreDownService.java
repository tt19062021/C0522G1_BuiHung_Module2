package MVCPerson.service.impl;

import MVCPerson.model.Student;

import java.util.Comparator;

public class SortByScoreDownService implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
//        return (int)(o2.getScore() - o1.getScore())
        if(o2.getScore() - o1.getScore() < 0){
            return -1;
        }else {
            return 1;
        }

//        if(o2.getScore() < o1.getScore()){
//            return -1;
//        }else {
//            return 1;
//        }
        }
}
