package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getNavigationHelper().gotoHomePage();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("Eugene", "Pavlovich",
                "Denisov", "JIGAN", "photo_title_eugene", "MOSTOVIK",
                "644005 Omsk sity, Novgorodskaya 25", "443213", "89136022958",
                "414141", "414141", "edenisov@gmail.com", "edenisov+2@gmail.com",
                "edenisov+3@gmail.com", "www.edenisov.com", "the second address2",
                "home2", "some notes2", null), false);
        app.getContactHelper().submitContactModification();
    }
}

// Initially the following chunk of code was used:

//     public void testContactModification() throws InterruptedException {
//        app.getContactHelper().returnToHomePage();
//        app.getContactHelper().initContactModification();
//Thread.sleep(10000);