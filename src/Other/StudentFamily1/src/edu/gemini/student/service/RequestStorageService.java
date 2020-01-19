package Other.StudentFamily1.src.edu.gemini.student.service;

import Other.StudentFamily1.src.edu.gemini.student.person.ServiceClient;

/**
 * Класс для хранения списка заявлений
 */
public class RequestStorageService {

    private static final int MAX_COUNT = 3;
    //
    private int count = 0;

    public ServiceClient getUncheckedClient() {
        System.out.println("Выбрано заявление");
        if (count < MAX_COUNT) {
            count++;
            return new ServiceClient();
        } else {
            return null;
        }
    }

    public void updateClient(ServiceClient client, boolean accept) {
        System.out.println("Клиент проверен");
    }
}
