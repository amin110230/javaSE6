package serializationexample;

import java.io.Serializable;

public class Address implements Serializable {

//    String street;
    transient String street; // property not include in serialization
    String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return new StringBuffer("Street : ").append(this.street).append(" Country : ").append(this.country).toString();
    }

}
