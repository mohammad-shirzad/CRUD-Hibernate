package core.designPattern.repository.educationInfo;

import core.model.dto.EducationInfo;

public interface IEducationInfoRepository{
    public void update(int id, EducationInfo educationInfo);
}
