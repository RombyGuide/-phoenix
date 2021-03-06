package classEx;

public class TestClassA {

    // Демонстрация вызова внутренних классов в методе
    public void test() {
        InternalClassContainer.PublicStaticExample e1 = new InternalClassContainer.PublicStaticExample();
        InternalClassContainer.StaticExample e2 = new InternalClassContainer.StaticExample();
        //classEx.InternalClassContainer.PublicExample e3 = new classEx.InternalClassContainer.PublicExample();
        //classEx.InternalClassContainer.Example e4 = new classEx.InternalClassContainer.Example();
    }

    // Демонстрация вызова внутренних классов в статическом методе
    public static void staticTest() {
        InternalClassContainer.PublicStaticExample e1 = new InternalClassContainer.PublicStaticExample();
        InternalClassContainer.StaticExample e2 = new InternalClassContainer.StaticExample();
        //classEx.InternalClassContainer.PublicExample e3 = new classEx.InternalClassContainer.PublicExample();
        //classEx.InternalClassContainer.Example e4 = new classEx.InternalClassContainer.Example();
    }
}
