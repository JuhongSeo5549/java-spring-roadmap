package poly.basic;

// upcasting vs downcasting
public class CastingMain3 {

    public static void main(String[] args) {

        Child child = new Child();

        // 부모 타입으로 변환하는 경우에는 다음과 같이 캐스팅 코드인 (타입)를 생략할 수 있다.
        Parent parent1 = (Parent) child; // 생략안하는 방식은 사용 x
        Parent parent2 = child; // 업캐스팅은 생략 가능, 생략 권장

        parent1.parentMethod();
        parent2.parentMethod();

    }
}
