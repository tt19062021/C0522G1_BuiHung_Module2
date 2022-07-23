package MVCPerson.service;

import java.io.IOException;

public interface ITeacherService {
    void findAll() throws IOException;
    void searchById();
    void addTeacher() throws IOException;
}
