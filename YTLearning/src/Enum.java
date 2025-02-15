enum Status{
    Running, Failed, Pending, Success;
}

public class Enum {
    public static void main(String[] args) {
        Status status = Status.Success;
        System.out.println(status);
        // Checking the index of the objects
        System.out.println(status.ordinal());
        // Getting all the elements
        Status[] ss = Status.values();
        for (Status s : ss) {
            System.out.println(s);
        }
        switch (status){
            case Success:
                System.out.println("All good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Please Wait");
                break;
            case Running:
                System.out.println("Done");
                break;
        }
    }
}
