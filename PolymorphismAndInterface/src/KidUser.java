
public class KidUser implements ILibraryUser {

    private int age;
    String bookType;

    //Constructor
    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    //get age
    public int getAge() {
        return age;
    }

    public String getBookType() {
        return bookType;
    }

    public void registerAccount() {
        if (getAge() <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }


    public void requestBook() {
        if (getBookType().equals("Kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days.\n");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.\n");
        }
    }
}

/*
//This is the second way to write child class KidUser
//KidUser extends from AdultUser


public class KidUser extends AdultUser {


    //Constructor from parent class Ad
    public KidUser(int age, String bookType) {
        super(age, bookType);
    }

    //get age
    public int getAge() {
        return age;
    }

    public String getBookType() {
        return bookType;
    }

    public void registerAccount() {
        if (getAge() <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        } else {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }


    public void requestBook() {
        if (getBookType().equals("Kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }

}
*/

