package models;

public class Professor {
    private String name, email, officeHours, website;

    public Professor() {
    }

    public Professor(String name, String email, String officeHours, String website) {
        this.name = name;
        this.email = email;
        this.officeHours = officeHours;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
