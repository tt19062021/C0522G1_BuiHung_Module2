package MVCPerson.service;

import java.io.IOException;

public interface IStudentService {
    void findAll() throws IOException;

    void searchTeacherByIdAndName();

    void addStudent() throws IOException;

    void sortUp();

    void sortNameByBubble();
}
