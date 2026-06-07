interface LibraryUser {
    void registerAccount();
    void requestBook();
}



class KidUsers implements LibraryUser {
     int age;
     String bookType;
     public void registerAccount() {
        if (age<12) {
            System.out.println("you have successfully register as a kid ");

        } 
        else {
            System.out.println("Age must be less then 12");
        }
     }

     public void requestBook() { 
        if (bookType.equals("Kids")) {
            System.out.println("Book issued return within 10 days");
        } else {
            System.out.println("oops,you are only allowed for Kids books");
        }

     }
}


class AdultUser implements LibraryUser {
     int age;
     String bookType;
     public void registerAccount() {
        if (age>12) {
            System.out.println("you have successfully register as a Adult user");

        } 
        else {
            System.out.println("Age must be greater then 12");
        }
     }

     public void requestBook() { 
        if (bookType.equals("Fiction")) {
            System.out.println("Book Issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
     }
}

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUsers k1 = new KidUsers();
        k1.age=10;
        k1.bookType="Kids";

        k1.registerAccount();
        k1.requestBook();


        KidUsers k2 = new KidUsers();
        k2.age=18;
        k2.bookType="Fiction";

        k2.registerAccount();
        k2.requestBook();

        AdultUser a1= new AdultUser();
        AdultUser a2= new AdultUser();

        a1.age=5;
        a2.age=23;

        a1.bookType="Kids";
        a2.bookType="Fiction";

        a1.registerAccount();
        a1.requestBook();
        a2.registerAccount();
        a2.requestBook();
    }
}
