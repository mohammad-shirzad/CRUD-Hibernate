package core.model.dto;

import javax.persistence.*;
import java.io.Serializable;


/**
 * Table created in MS SQL; Columns are as follows:
 * NationalId nvarchar(50) Primary key,
 * FirstName nvarchar(50),
 * MiddleName nvarchar(50),
 * LastName nvarchar(50),
 * Gender int,
 * BirthDate date,
 * InfoId int,
 * LastModificationDate datetime
 */
@Entity
@Table
public class Person extends BaseDto implements Serializable {

    @Id
    public String nationalId;
    @Column
    public String firstName;
    @Column
    public String lastName;
    @Column
    public String middleName;
    @Column
    public int gender;
    @Column
    public java.sql.Date birthDate;
    @Column
    public int InfoId;

    public ContactInfo contactInfo;

    public EducationInfo educationInfo;

    public JobInfo jobInfo;

    public EducationInfo getEducationInfo() {
        return educationInfo;
    }

    public void setEducationInfo(EducationInfo educationInfo) {
        this.educationInfo = educationInfo;
    }

    public JobInfo getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(JobInfo jobInfo) {
        this.jobInfo = jobInfo;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }


    public int getInfoId() {
        return InfoId;
    }

    public void setInfoId(int infoId) {
        InfoId = infoId;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public java.sql.Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(java.sql.Date birthDate) {
        this.birthDate = birthDate;
    }

    public Person(String nationalId, String firstName, String middleName, String lastName, int gender, java.sql.Date birthDate, int infoId) {
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.InfoId = infoId;
    }

    public Person(String nationalId, String firstName, String middleName,
                  String lastName, int gender, java.sql.Date birthDate, int infoId, ContactInfo contactInfo,
                  EducationInfo educationInfo, JobInfo jobInfo) {
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.InfoId = infoId;
        this.educationInfo=educationInfo;
        this.jobInfo=jobInfo;
    }

    public Person() {
    }
}
