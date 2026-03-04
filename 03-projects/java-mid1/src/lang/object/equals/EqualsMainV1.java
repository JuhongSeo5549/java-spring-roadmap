package lang.object.equals;

public class EqualsMainV1 {

    static void main(String[] args) {
        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");

        //(==)은 동일성이기 때문에 false로 나온다(userV1,userV2는 다른메모리이고 참조값이다름)
        System.out.println("identity = " + (userV1 == userV2));

        //(equals)는 동일성 이지만 false로 나오는 이유는 기본 equals 메서드 내부는 == 이다.
        /*
        public boolean equals(Object obj) {
            return (this == obj);
        }
        */
        // 오버라이딩해서 따로 사용해야한다.
        /* 실행순서
        * userV1.equals(userV2)
        * return (userV1 == userV2)
        * return (x001 == x002)
        * return false
        * */
        System.out.println("identity = " + (userV1.equals(userV2)));
    }
}
