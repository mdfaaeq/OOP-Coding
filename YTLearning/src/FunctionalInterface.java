@java.lang.FunctionalInterface
interface Jam{
    void show();
}
public class FunctionalInterface {
    public static void main(String[] args) {
        Jam jam = new Jam() {
            public void show() {
                System.out.println("in show");
            }
        };
        jam.show();
    }
}
