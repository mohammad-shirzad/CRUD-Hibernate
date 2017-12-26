package core.model.dto;

import java.io.Serializable;


/**
 * Id int,
 HomeTel nvarchar(20),
 HomeAddress nvarchar(150),
 MobilePhone nvarchar(20),
 Email nvarchar(40),
 LastModificationDate datetime
 */
public class ContactInfo extends BaseDto implements Serializable{
    public int id;
    public String homeTel;
    public String homeAddress;
    public String mobilePhone;
    public String email;

    public ContactInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public void setHomeTel(String homeTel) {
        this.homeTel = homeTel;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContactInfo(int id, String homeTel, String homeAddress, String mobilePhone, String email) {

        this.id = id;
        this.homeTel = homeTel;
        this.homeAddress = homeAddress;
        this.mobilePhone = mobilePhone;
        this.email = email;
    }
}
