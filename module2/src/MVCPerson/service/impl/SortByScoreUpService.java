package MVCPerson.service.impl;

import MVCPerson.model.Student;

import java.util.Comparator;

public class SortByScoreUpService implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o1.getScore() -o2.getScore());
    }
}
