package DI_IoC;

public class Main {
    public static void main(String[] args) {

        // IoC 컨테이너?로 볼 수 있음.
        ClassB classB1 = new ClassBImpl1();
        ClassB classB2 = new ClassBImpl2();

        //
        ClassA classA = new ClassAImpl2(classB2);

        classA.logic1();
        classA.logic2();
        classA.logic3();
    }
}
