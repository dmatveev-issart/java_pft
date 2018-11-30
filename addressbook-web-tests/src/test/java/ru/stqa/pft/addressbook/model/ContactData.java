package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String firstname;
    private final String middlename;
    private final String lastname;
    private final String nickname;
    private final String photoTitle;
    private final String company;
    private final String address;
    private final String homeTelephone;
    private final String mobileTelephone;
    private final String workTelephone;
    private final String fax;
    private final String email;
    private final String email2;
    private final String email3;
    private final String homepage;
    private final String address2;
    private final String homeTelephone2;
    private final String notes;
    private String group;

    public ContactData(String firstname, String middlename, String lastname, String nickname, String photoTitle, String company, String address, String homeTelephone, String mobileTelephone, String workTelephone, String fax, String email, String email2, String email3, String homepage, String address2, String homeTelephone2, String notes, String group) {
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.nickname = nickname;
        this.photoTitle = photoTitle;
        this.company = company;
        this.address = address;
        this.homeTelephone = homeTelephone;
        this.mobileTelephone = mobileTelephone;
        this.workTelephone = workTelephone;
        this.fax = fax;
        this.email = email;
        this.email2 = email2;
        this.email3 = email3;
        this.homepage = homepage;
        this.address2 = address2;
        this.homeTelephone2 = homeTelephone2;
        this.notes = notes;
        this.group = group;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getPhotoTitle() {
        return photoTitle;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHomeTelephone() {
        return homeTelephone;
    }

    public String getMobileTelephone() {
        return mobileTelephone;
    }

    public String getWorkTelephone() {
        return workTelephone;
    }

    public String getFax() {
        return fax;
    }

    public String getEmail() {
        return email;
    }

    public String getEmail2() {
        return email2;
    }

    public String getEmail3() {
        return email3;
    }

    public String getHomepage() {
        return homepage;
    }

    public String getAddress2() {
        return address2;
    }

    public String getHomeTelephone2() {
        return homeTelephone2;
    }

    public String getNotes() {
        return notes;
    }

    public String getGroup() { return group; }
}
