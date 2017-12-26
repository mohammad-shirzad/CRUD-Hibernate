package core.designPattern.repository.contactInfo;

import core.model.dto.ContactInfo;

public interface IContactInfoRepository {
    public void update(int id, ContactInfo jobInfo);
}
