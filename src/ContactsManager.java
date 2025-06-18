public class ContactsManager {
    Contact[] myContacts;
    int contactsCount;

    // Constructeur
    public ContactsManager() {
        myContacts = new Contact[500]; // Espace pour 500 contacts
        contactsCount = 0;
    }

    // Méthode pour ajouter un contact
    public void addContact(Contact contact) {
        myContacts[contactsCount] = contact;
        contactsCount++;
    }

    // Méthode pour chercher un contact par nom
    public Contact searchContact(String searchName) {
        for (int i = 0; i < contactsCount; i++) {
            if (myContacts[i].name.equals(searchName)) {
                return myContacts[i];
            }
        }
        return null;
    }
}
