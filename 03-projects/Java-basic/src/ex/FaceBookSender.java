package ex;

public class FaceBookSender implements Sender{
    @Override
    public void sendMessage(String msg) {
        System.out.println("페이스북발송 : " + msg);
    }
}
