package core.designPattern.repository.contactInfo;

import core.designPattern.repository.baseEntity.BaseRepository;
import core.model.dto.ContactInfo;

import java.sql.Date;
import java.util.Calendar;

public class ContactInfoRepository extends BaseRepository<ContactInfo> implements IContactInfoRepository{
    @Override
    public void update(int id, ContactInfo contactInfo) {
        try{

            session=getSessionFactory().openSession();
            transaction=session.beginTransaction();
            ContactInfo dbo = (ContactInfo) session.get(ContactInfo.class,id);
            dbo.setEmail(contactInfo.email);
            dbo.setHomeAddress(contactInfo.homeAddress);
            dbo.setHomeTel(contactInfo.homeTel);
            dbo.setMobilePhone(contactInfo.mobilePhone);
            dbo.setLastModificationDate(new Date(Calendar.getInstance().getTimeInMillis()));
            session.update(dbo);
            transaction.commit();
            session.close();
        }catch (Exception e){
            e.getStackTrace();
            throw e;
        }
    }
}
