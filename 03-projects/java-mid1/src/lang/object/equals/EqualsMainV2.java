package lang.object.equals;

public class EqualsMainV2 {

    static void main(String[] args) {
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        //fals
        System.out.println("identity = " + (user1 == user2));

        //true
        System.out.println("equality = " + user1.equals(user2));

    }
}
