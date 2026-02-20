package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();

        // 단 자식의 기능은 호출 할 수 없다. 컴파일 오류 발생
        // poly.childMethod();

        // 다운캐스팅(부모 타입 -> 자식 타입)
        Child child = (Child) poly; // x001
        child.childMethod();

        /*
        * 일시적 다운캐스팅 - 해당메서드를 호출하는 순간만 다운캐스팅
        * 연산자 우선순위가 poly.childMethod(); 기 때문에, ((Child) poly)로 연산자 우선순의를 변경한다.
        * ((Child) poly).childMethod(); // 다운캐스팅을 통해 부모타입을 자식 타입으로 변환 후 기능 호출
        * ((Child) x001).childMethod(); // 참조값을 읽은 다음 자식 타입으로 다운캐스팅
        */
        ((Child) poly).childMethod();
    }
}
