package core.model.dao;

import core.designPattern.repository.jobInfo.JobInfoRepository;
import core.model.dto.JobInfo;

public class JobDao {
    JobInfo jobInfo= new JobInfo();
    JobInfoRepository repository= new JobInfoRepository();

    public void addJobInfo (JobInfo jobInfo) {
        try {
            repository.create(jobInfo);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }

    }

    public JobInfo getJobInfoId(int id) {
        try {
            jobInfo = repository.getById(JobInfo.class, id);

        } catch (Exception e) {
            e.getStackTrace();
        }
        return jobInfo ;
    }

    public void updatejobInfoById(int id, JobInfo jobInfo) {
        try {
            repository.update(id,jobInfo);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }

    public void deleteJobInfoById(int id) {
        try {

            repository.deleteById(JobInfo.class,id);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }
}
