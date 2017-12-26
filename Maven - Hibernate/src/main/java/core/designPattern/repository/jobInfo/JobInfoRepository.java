package core.designPattern.repository.jobInfo;

import core.designPattern.repository.baseEntity.BaseRepository;
import core.model.dto.JobInfo;

import java.sql.Date;
import java.util.Calendar;

public class JobInfoRepository extends BaseRepository<JobInfo> implements IJobInfoRepository {
    @Override
    public void update(int id, JobInfo jobInfo) {
        try{

            session=getSessionFactory().openSession();
            transaction=session.beginTransaction();
            JobInfo dbo = (JobInfo) session.get(JobInfo.class,id);
            dbo.setCompany(jobInfo.company);
            dbo.setPosition(jobInfo.position);
            dbo.setStatus(jobInfo.status);
            dbo.setTelephone(jobInfo.telephone);
            dbo.setAddress(jobInfo.address);
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
