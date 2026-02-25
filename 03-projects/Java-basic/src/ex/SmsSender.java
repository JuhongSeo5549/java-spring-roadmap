package ex;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String msg) {
        System.out.println("SMS발송 : " + msg);
    }

}
