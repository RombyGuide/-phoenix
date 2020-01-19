package Other.StudentFamily2.src.edu.gemini.student;

import Other.StudentFamily1.src.edu.gemini.student.person.ServiceClient;
import Other.StudentFamily2.src.edu.gemini.student.service.RequestStorageService;

public class CheckRequest {

    public void checkRequests() {
        // Подготовить нужные объекты
        RequestStorageService rsService = new RequestStorageService();

        ServiceClient sc = null;
        do {
            System.out.println();
            sc = rsService.getUncheckedClient();

            if (sc != null) {
                ClientThread ct = new ClientThread(sc, rsService);
                ct.start();
            }
 
        } while (sc != null);
    }

    public static void main(String[] args) {
        CheckRequest checkReq = new CheckRequest();

        checkReq.checkRequests();
    }

}
