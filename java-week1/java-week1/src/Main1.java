public class Main1 {
    public static void main(String[] args) {
        int score = 81;

        if (score >= 95) {
            System.out.println("점수: " + score + " -> A");
        } else if (score >= 82) {
            System.out.println("점수: " + score + " -> B");
        } else if (score >= 68) {
            System.out.println("점수: " + score + " -> C");
        } else if (score >= 50) {
            System.out.println("점수: " + score + " -> F");
        } else {
            System.out.println("점수: " + score + " -> F(under 50)");
        }

    }
}
