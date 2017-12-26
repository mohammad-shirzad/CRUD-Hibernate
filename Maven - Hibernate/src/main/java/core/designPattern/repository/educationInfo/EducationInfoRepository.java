package core.designPattern.repository.educationInfo;

import core.designPattern.repository.baseEntity.BaseRepository;
import core.model.dto.EducationInfo;

import java.sql.Date;
import java.util.Calendar;

public class EducationInfoRepository extends BaseRepository<EducationInfo> implements IEducationInfoRepository {
    @Override
    public void update(int id, EducationInfo educationInfo) {
        try{

            session=getSessionFactory().openSession();
            transaction=session.beginTransaction();
            EducationInfo dbo = (EducationInfo) session.get(EducationInfo.class,id);
            dbo.setSchool(educationInfo.school);
            dbo.setMajor(educationInfo.major);
            dbo.setGrade(educationInfo.grade);
            dbo.setGpa(educationInfo.gpa);
            dbo.setAddress(educationInfo.address);
            dbo.setStatus(educationInfo.status);
            dbo.setTelephone(educationInfo.telephone);
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
