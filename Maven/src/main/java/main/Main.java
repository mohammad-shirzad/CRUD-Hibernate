package main;

import model.dao.IPersonDao;
import model.dto.Person;
import util.SpringUtil;

public class Main {

    public static void main(String[] args) throws Exception{
        try {
            Person person= (Person) SpringUtil.getBean("person");
            IPersonDao personDao= (IPersonDao) SpringUtil.getBean("personDao");

//            personDao.create(new Person(440177944,"name","family",date of birth,"university major"));
//            ArrayList<Person> people= (ArrayList<Person>) personDao.getPersons();
//            personDao.updatePersonById(id on table,"name","family","university major");
//            personDao.deletePersonById(id on table);

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
