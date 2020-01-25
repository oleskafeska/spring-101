package di.injection.service;

public class EmailServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {

        System.out.println("Sent message to " + receiver + " with message: " + message);
    }
}
