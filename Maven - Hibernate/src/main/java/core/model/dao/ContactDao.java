package core.model.dao;

import core.designPattern.repository.contactInfo.ContactInfoRepository;
import core.model.dto.ContactInfo;

public class ContactDao {
    ContactInfo contactInfo= new ContactInfo();
    ContactInfoRepository repository=new ContactInfoRepository();

    public void addContactInfo(ContactInfo contactInfo) {
        try {
            repository.create(contactInfo);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }

    }

    public ContactInfo getContactInfoById(int id) {
        try {
            contactInfo = repository.getById(ContactInfo.class,id);
        } catch (Exception e) {
            e.getStackTrace();
        }
        return contactInfo;
    }

    public void updateContactInfoById(int id,ContactInfo contactInfo) {
        try {
            repository.update(id,contactInfo);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }

    public void deleteContactInfoById(int id) {
        try {

            repository.deleteById(ContactInfo.class,id);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }

}
