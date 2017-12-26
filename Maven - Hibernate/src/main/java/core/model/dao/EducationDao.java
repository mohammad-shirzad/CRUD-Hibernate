package core.model.dao;

import core.model.dto.EducationInfo;
import core.designPattern.repository.educationInfo.EducationInfoRepository;

public class EducationDao {
    EducationInfo educationInfo= new EducationInfo();
    EducationInfoRepository repository=new EducationInfoRepository();

    public void addEducationInfo(EducationInfo educationInfo) {
        try {
            repository.create(educationInfo);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }

    }

    public EducationInfo getEducationInfoById(int id) {
        try {
            educationInfo= repository.getById(EducationInfo.class,id);
        } catch (Exception e) {
            e.getStackTrace();
        }
        return educationInfo;
    }

    public void updateEducationInfoById(int id,EducationInfo educationInfo) {
        try {
            repository.update(id,educationInfo);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }

    public void deleteEducationInfoById(int id) {
        try {

            repository.deleteById(EducationInfo.class,id);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }
}
