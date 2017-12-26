package main;

import core.designPattern.singleton.HibernateUtil;
import core.model.dto.ContactInfo;
import core.model.dto.EducationInfo;
import core.model.dto.JobInfo;
import core.model.dto.Person;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Date;

public class Main {

    public static void main(String[] args) throws Exception{
        try {
//            Person person= (Person) SpringUtil.getBean("person");
//            JobInfo jobInfo= (JobInfo) SpringUtil.getBean("job");
//            EducationInfo educationInfo= (EducationInfo) SpringUtil.getBean("education");
//            ContactInfo contactInfo= (ContactInfo) SpringUtil.getBean("contact");
//            PersonDao personDao= (PersonDao) SpringUtil.getBean("personDao");
//            JobDao jobDao= (JobDao) SpringUtil.getBean("jobDao");
//            ContactDao contactDao= (ContactDao) SpringUtil.getBean("contactDao");
//            EducationDao educationDao= (EducationDao) SpringUtil.getBean("educationDao");
//            personDao.addPerson(new Person("1111","mohammad"
//                    ,"arman","shir", Gender.Male.getValue(),new Date(2017,1,1),2));
//            jobDao.addJobInfo(new JobInfo(2,"mofid","8190","jordan, no51","software developer", JobStatus.Working.getValue()));
//            educationDao.addEducationInfo(new EducationInfo(2,"azad univ","cs", Grade.Mater_Of_Science.getValue(),16.65,"poonak","75951", EducationStatus.Graduated.getValue(),new Date(2017,12,11)));
//            contactDao.addContactInfo(new ContactInfo(2,"888","sample","0912","mshirzad70@gmail"));

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
