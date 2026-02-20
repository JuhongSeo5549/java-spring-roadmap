package poly.basic;

public class CastingMain5 {

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
        // instanceof 키워드는 오른쪽 대상의 자식 타입을 왼쪽에서 참조하는 경우에도 true를 반환한다.
        /*
        * new Parent() instanceof Parent // parent가 Parent의 인스턴스를 참조하는 경우 : true
        * new Child() instanceof Parent // parent가 Child의 인스턴스를 참조하는 경우 : true
        * 즉, 오른쪽에 있는 타입이 왼쪽에 있는 인스턴스의 타입이 들어갈 수 있는지 대입해도면 된다.
        * */
        if (parent instanceof Child) {
            System.out.println("Child instance OK");
            Child child = (Child) parent;
            child.childMethod();
        } else {
            System.out.println("Not Child instance ");
        }
    }
}
