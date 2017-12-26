package core.model.dto;

import java.io.Serializable;

/**
 * Id int,
 * Company nvarchar(50),
 * Telephone nvarchar(40),
 * Address nvarchar(150),
 * Position nvarchar(40),
 * Status int
 *
 */
public class JobInfo extends BaseDto implements Serializable{
    public int id;
    public String company;
    public String telephone;
    public String address;
    public String position;
    public int status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public JobInfo(int id, String company, String telephone, String address, String position, int status) {

        this.id = id;
        this.company = company;
        this.telephone = telephone;
        this.address = address;
        this.position = position;
        this.status = status;
    }

    public JobInfo() {
    }
}
