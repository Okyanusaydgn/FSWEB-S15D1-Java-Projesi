import model.Contact;
import model.GroceryList;
import model.MobilePhone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Scanner scanner = new Scanner(System.in);
        GroceryList groceryList = new GroceryList();
        int choice;

// do-while da önce while içindeki şartı kontrol eder. Eğer o şart sağlanıyor ise içine girer.
// önce işlemi yapar sonra şartı kontrol eder.
// ilk defa geldiğinde şarta bakmaksızın döngüye direk giriyor. İkinci turdan itibaren şarta bakmaya başlıyor.

        do {
            System.out.println( "Yapılmak istenen operasyonu seçin(0: quit, 1: ekleme, 2: çıkarma)");
            choice = scanner.nextInt();
            scanner.nextLine(); // imleci bir satır aşağıya kaydırmak için kullanılır.
            switch (choice){
                case 1:
                    System.out.println(" eklenmesini istediğiniz elemanları giriniz.(Birden fazla ise virgül kullanın)");
                    String itemsToAdd = scanner.nextLine();
                    groceryList.addItems(itemsToAdd);
                    break;
                case 2:
                    System.out.println(" silinmesini istediğiniz elemanları giriniz.(Birden fazla ise virgül kullanın)");
                    String itemsToRemove = scanner.nextLine();
                    groceryList.removeItems(itemsToRemove);
                    break;
            }
            groceryList.printSorted();
        } while (choice != 0);
        scanner.close();*/
        Contact contact1 = new Contact("okyanus","1212132413");
        Contact contact2 = new Contact("ali","2123434");
        Contact contact3 = new Contact("mehmet","4543534535");
        Contact contact4 = new Contact("emre","1421452535");
        Contact contact5 = new Contact("mert","3456574574");

        MobilePhone mobilePhone = new MobilePhone("333333");
        mobilePhone.addNewContact(contact1);
        mobilePhone.addNewContact(contact2);
        mobilePhone.addNewContact(contact3);
        mobilePhone.addNewContact(contact4);
        mobilePhone.addNewContact(contact5);

        System.out.println("----- initial contacts start ------");
        mobilePhone.printContacts();
        System.out.println("----- initial contacts end ------");

        System.out.println("------updated started ");
        mobilePhone.updateContact(contact2,new Contact("ali","101305300"));
        mobilePhone.printContacts();
        System.out.println("----- updated end ");

        System.out.println("----remove started ");
        mobilePhone.removeContact(contact4);
        mobilePhone.printContacts();
        System.out.println("---- remove ended");

        System.out.println("----query started");
        Contact contact= mobilePhone.queryContact("ali");
        System.out.println(contact.toString());
        System.out.println("----- query ended");

        System.out.println("---find1 started");
        int aliIndex =  mobilePhone.findContact("ali");
        System.out.println("indexof Mmurat =" + aliIndex);
        System.out.println("---find1 ended");

    }
}