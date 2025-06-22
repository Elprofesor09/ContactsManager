public class Main {
    public static void main(String[] args) {

        ContactsManager myContactsManager = new ContactsManager();


        Contact ami1 = new Contact();
        ami1.name = "Yasmine";
        ami1.phoneNumber = "0700000001";
        myContactsManager.addContact(ami1);

        Contact ami2 = new Contact();
        ami2.name = "Issa";
        ami2.phoneNumber = "0700000002";
        myContactsManager.addContact(ami2);

        Contact ami3 = new Contact();
        ami3.name = "Fatou";
        ami3.phoneNumber = "0700000003";
        myContactsManager.addContact(ami3);

        Contact ami4 = new Contact();
        ami4.name = "Boris";
        ami4.phoneNumber = "0700000004";
        myContactsManager.addContact(ami4);

        Contact ami5 = new Contact();
        ami5.name = "Mariam";
        ami5.phoneNumber = "0700000005";
        myContactsManager.addContact(ami5);


        String nomRecherche = "Fatou";
        Contact resultat = myContactsManager.searchContact(nomRecherche);

        if (resultat != null) {
            System.out.println("Numéro de " + nomRecherche + " : " + resultat.phoneNumber);
        } else {
            System.out.println(nomRecherche + " n'a pas été trouvé(e).");
        }
    }
}
