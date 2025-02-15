interface A1 {
    // By default interface variables are final and static
    int age = 21;
    String area = "Colombo";

    void show();
    void config();
}
// Multiple interface
interface A2 {
    void run();
}
interface A3 extends A2 {

}
class B1 implements A1,A2 {
    public void config() {
        System.out.println("in config");
    }
    public void show() {
        System.out.println("in show");
    }
    public void run() {
        System.out.println("in run");
    }
}
public class Interface {
    public static void main(String[] args) {
        A1 a = new B1();
        a.config();
        a.show();
        System.out.println(A1.age);
        System.out.println(A1.area);

    }
}
