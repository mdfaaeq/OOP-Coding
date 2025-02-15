class A{
    int age;
    public void show(){
        System.out.println("in show");
    }
    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}

class C{
    public void show(){
        System.out.println("in C show");
    }
}
abstract class D{
    public abstract void show();
}

public class Inner {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();

        // Anonymous Inner Class
        C obj2 = new C(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj2.show();

        D obj3 = new D(){
            public void show(){
                System.out.println("in abstract new show");
            }
        };
        obj3.show();
    }
}
