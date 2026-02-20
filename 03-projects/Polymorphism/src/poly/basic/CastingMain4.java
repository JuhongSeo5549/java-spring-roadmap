package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    static void main(String[] args) {
        Parent parent1 = new Child(); // Child 인스턴스 있음.
        Child child1 = (Child) parent1;
        child1.childMethod(); // 문제 없음

        Parent parent2 = new Parent(); // Child 인스턴스없음.
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
        child2.childMethod(); // 실행 불가

        /* 컴파일 오류 vs 런타임오류
        *  컴파일 오류는 변수명 오타, 잘못된 클래스 이름 사용등 Java 프로그램을 실행하기 전에 발생하는 오류이다. (좋은 오류)
        *  런타임 오류는 프로그램이 실행되고 있는 시점에 발생하는 오류이다. (안좋은 오류)
        * */
    }
}
