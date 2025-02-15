import java.lang.FunctionalInterface;

@FunctionalInterface
// Lambda expression works with only a Functional Interface
interface learn{
    int add(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        // learn lambda = (a, b) -> return a + b; - in this case the return keyword is not necessary.
        learn lambda = (a, b) -> a + b;
        System.out.println(lambda.add(2, 3));
    }
}
