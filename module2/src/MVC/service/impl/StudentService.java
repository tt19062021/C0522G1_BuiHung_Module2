package MVC.service.impl;

import MVC.controller.MainController;
import MVC.model.Student;
import MVC.service.IStudentService;

public class StudentService implements IStudentService {

    @Override
    public void findAll() {
        for (int i = 0; i < PersonService.count; i++) {
            if (PersonService.people[i] instanceof Student) {
                System.out.println(PersonService.people[i]);
            }
        }

    }
}
