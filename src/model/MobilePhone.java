package model;

import java.util.ArrayList;

public class MobilePhone {

    private String myPhone;

    private ArrayList<Contact> contacts;

    public MobilePhone(String myPhone) {
        this.myPhone = myPhone;
        this.contacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if (contact == null || contact.getName() == null || contact.getPhoneNumber() == null){
            return false;
        }
        if (findContact(contact.getName())>=0){
            return false;
        }
        this.contacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int oldContactIndex = findContact(oldContact.getName());
        if (oldContactIndex == -1 ){
            return false;
        }
        this.contacts.set(oldContactIndex, newContact);
        return true;
    }

    public boolean removeContact(Contact contact){
        if (findContact(contact.getName()) == -1){
            return false;
        }
        this.contacts.remove(contact);
        return true;
    }

    public int findContact(Contact contact){
            return this.contacts.indexOf(contact);

    }




    public int findContact(String name) {
        for (int i = 0; i < this.contacts.size() ; i ++){
            Contact contact = this.contacts.get(i);
            if (contact.getName().equalsIgnoreCase(name)){
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact( String contactName){
        int index = findContact(contactName);
        if (index>=0){
            return this.contacts.get(index);
        }
        return null;
    }

    public void printContacts(){
        for (Contact contact: this.contacts){
            System.out.println(contact.toString());
        }
    }
}
