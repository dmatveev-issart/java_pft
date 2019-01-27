package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() throws InterruptedException {
        app.getNavigationHelper().gotoHomePage();

        if (! app.getContactHelper().isThereAContact()) {
            app.getContactHelper().createContact(new ContactData("Dennis", "Sergeevich",
                    "Matveev", "MAN", "photo_title", "ISSART",
                    "644005 Omsk sity 3-Cheredovaya street 23", "410814",
                    "89029728081", "411400", "411400", "gitplugin@gmail.com",
                    "gitplugin+2@gmail.com", "gitplugin+3@gmail.com", "www.issart.com",
                    "the second address", "home", "some notes", "test1"));

            Thread.sleep(4000);

        }

        app.getContactHelper().initContactModification();
        app.getContactHelper().submitContactDeletion();
    }

}
