class Ak{
    public void m(){
        System.out.println("A");
    }
}
class Bk extends Ak{
    @Override
    public void m(){
        System.out.println("B");
    }
}

public class Annotation {
    public static void main(String[] args) {
        Ak a = new Bk();
        a.m();
    }
}
