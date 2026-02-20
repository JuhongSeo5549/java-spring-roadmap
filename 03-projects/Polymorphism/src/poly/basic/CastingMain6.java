package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {
        Parent parent1 = new Parent(); // new Parent() = instanceof Parent
        System.out.println("parent1 호출");
        call(parent1);

        Child child1 = new Child(); // new Child() = instanceof Child
        System.out.println("child1 호출");
        call(child1);

    }

    private static void call(Parent parent) {
        parent.parentMethod();

        // Java 16부터 instanceof를 사용하면서 동시에 변수 선언이 가능핟.
        // Child 인스턴스인 경우 childMethod() 실행
        if (parent instanceof Child child) {
            System.out.println("Child instance OK");
            child.childMethod();
        }
    }
}
