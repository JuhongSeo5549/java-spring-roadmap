package ex;

public class EmailSender implements Sender{
    @Override
    public void sendMessage(String msg) {
        System.out.println("메일발송 : " + msg);
    }

}
