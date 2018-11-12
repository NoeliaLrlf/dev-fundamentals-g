class Main {
    public static void main(String [] args) {
        ContactsManager myContactsManager = new ContactsManager();

        Contact contact1 = new Contact();
        contact1.name = "Contact name 1";
        contact1.phoneNumber = "22256954";
        myContactsManager.addContact(contact1);

        Contact contact2 = new Contact();
        contact2.name = "Contact name 2";
        contact2.phoneNumber = "22265784";
        myContactsManager.addContact(contact2);

        Contact contact3 = new Contact();
        contact3.name = "Contact name 3";
        contact3.phoneNumber = "22420185";
        myContactsManager.addContact(contact3);

        Contact contact4 = new Contact();
        contact4.name = "Contact name 4";
        contact4.phoneNumber = "22356984";
        myContactsManager.addContact(contact4);

        Contact contact = myContactsManager.searchContact("Contact name 3");
        System.out.println("Contact Name: Contact name 3");
        System.out.println("Phone number: "+ contact.phoneNumber);

    }
}