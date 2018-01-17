package alltej.springframework.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by at on 12/15/16.
 */
@Embeddable
public class Address {

    @Column(name = "address_line_1", insertable = false, updatable = false)
    private String addressLine1;
    @Column(name = "address_line_2", insertable = false, updatable = false)
    private String addressLine2;
    @Column(name = "address_city", insertable = false, updatable = false)
    private String city;
    @Column(name = "address_state", insertable = false, updatable = false)
    private String state;
    @Column(name = "address_zip", insertable = false, updatable = false)
    private String zipCode;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}