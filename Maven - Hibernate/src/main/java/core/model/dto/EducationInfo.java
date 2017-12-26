package core.model.dto;


import java.io.Serializable;
import java.sql.Date;

/**
 * Id int
 * School nvarchar(50)
 * Major nvarchar(50)
 * Grade nvarchar(40)
 * GPA decimal(2, 2)
 * Telephone nvarchar(40)
 * Address nvarchar(150)
 * Status int
 */
public class EducationInfo extends BaseDto  implements Serializable{
    public int id;
    public String school;
    public String major;
    public int grade;
    public double gpa;
    public String telephone;
    public String address;
    public int status;
    public Date dateOfGraduation;

    public Date getDateOfGraduation() {
        return dateOfGraduation;
    }

    public void setDateOfGraduation(Date dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
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

    public EducationInfo() {
    }

    public EducationInfo(int id, String school, String major, int grade, double gpa, String telephone, String address,int status,Date dateOfGraduation) {
        this.id = id;
        this.school = school;
        this.major = major;
        this.grade = grade;
        this.gpa = gpa;
        this.telephone = telephone;
        this.address = address;
        this.status = status;
        this.dateOfGraduation=dateOfGraduation;
    }
}
