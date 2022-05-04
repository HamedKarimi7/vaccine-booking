package se.lexicon;

import java.util.UUID;

public class Address {

    private String id;
    private String city;
    private String zipCode;
    private String streetAddress;


    public Address(String id, String city, String zipCode, String streetAddress) {
        if (id == null) throw new RuntimeException ("id was null");
        this.id = id;
        this.city = city;
        this.zipCode = zipCode;
        this.streetAddress = streetAddress;
    }

    public String getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }
}
