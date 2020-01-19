package Other.StudentFamily1.src.edu.gemini.student.service;

import Other.StudentFamily1.src.edu.gemini.student.person.Adult;
import Other.StudentFamily1.src.edu.gemini.student.person.Child;
import java.util.Date;
import java.util.List;

/**
 * Класс для отдела ЗАГСа
 */
public class RegistryOfficeService {

    public boolean checkMarriage(Adult husband, Adult wife,
                                 String marriageNumber, Date marriageDate, String marriageOffice) {
        System.out.println("Проверка наличия брака");
        return true;
    }

    public boolean checkChildren(Adult husband, Adult wife, List<Child> children) {
        System.out.println("Проверка списка детей");
        return true;
    }

}
