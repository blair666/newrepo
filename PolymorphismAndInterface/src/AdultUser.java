import java.awt.*;

public class AdultUser implements ILibraryUser {

    private int age;
    String bookType;

    public AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    //get age
    public int getAge()
    {
        return age;
    }

    public String getBookType()
    {
        return bookType;
    }

    public void registerAccount()
    {

        if(age <= 11)
        {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }else if(age >= 12)
        {
            System.out.println("You have successfully registered under an Adult Account.");
        }
    }


    public void requestBook()
    {
//There are two ways
//this.bookType
//getBookType()
        if(getBookType().equals("Fiction"))
        {
            System.out.println("Book issued successfully, please return the book within 7 days.\n");
        }else
        {
            System.out.println("Oops, you are allowed to take only adult Fiction books.\n");
        }
    }
}
