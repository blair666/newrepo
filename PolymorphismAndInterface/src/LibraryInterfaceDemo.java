public class LibraryInterfaceDemo {
    public static void main(String[] args)
    {

        //Test case #1
        System.out.println("Test KidUse1: ");
        KidUser kid1 = new KidUser(10, "Kids");
        KidUser kid2 = new KidUser(18, "Fiction");
        System.out.println("Age is "+ kid1.getAge());
        kid1.registerAccount();
        System.out.println(kid1.getBookType());
        kid1.requestBook();

        System.out.println("Test KidUser2: ");
        System.out.println("Age is " + kid2.getAge());
        kid2.registerAccount();
        System.out.println(kid2.getBookType());
        kid2.requestBook();



        //Test case #2
        System.out.println("\n********");
        AdultUser adult1 = new AdultUser(5, "Kids");

        System.out.println("Test AdultUser1: ");
        System.out.println("Age is "+ adult1.getAge());
        adult1.registerAccount();
        System.out.println(adult1.getBookType());
        adult1.requestBook();

        AdultUser adult2 = new AdultUser(23, "Fiction");
        System.out.println("Test AdultUser2: ");
        System.out.println("Age is "+ adult2.getAge());
        adult2.registerAccount();
        System.out.println(adult2.getBookType());
        adult2.requestBook();

    }
}