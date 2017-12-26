package core.designPattern.repository.jobInfo;

import core.model.dto.JobInfo;

public interface IJobInfoRepository {
    public void update(int id, JobInfo jobInfo);
}
