package core.designPattern.repository.person;

import core.designPattern.repository.baseEntity.BaseRepository;
import core.model.dto.Person;

import java.sql.Date;
import java.util.Calendar;

public class PersonRepository extends BaseRepository<Person> implements IPersonRepository {

    @Override
    public void updatePersonByNationalId(Person person, String nationalId) {
        try{

            session=getSessionFactory().openSession();
            transaction=session.beginTransaction();
            Person dbo = (Person) session.get(Person.class,nationalId);
            dbo.setFirstName(person.firstName);
            dbo.setMiddleName(person.middleName);
            dbo.setLastName(person.lastName);
            dbo.setGender(person.gender);
            dbo.setBirthDate(person.birthDate);
            dbo.setLastModificationDate(new Date(Calendar.getInstance().getTimeInMillis()));
            session.update(dbo);
            transaction.commit();
            session.close();
        }catch (Exception e){
            e.getStackTrace();
            throw e;
        }
    }

    @Override
    public void createPerson(Person person) {
        try{

            session=getSessionFactory().openSession();
            transaction=session.beginTransaction();
            person.setLastModificationDate(new Date(Calendar.getInstance().getTimeInMillis()));
            session.save(person);
            transaction.commit();
            session.close();
        }catch (Exception e){
            e.getStackTrace();
            throw e;
        }
    }

    @Override
    public Person getPersonByNationalId(Person person, String nationalId) {
        try{

            session=getSessionFactory().openSession();
            transaction=session.beginTransaction();
            person = (Person) session.get(Person.class,nationalId);
            transaction.commit();
            session.close();
        }catch (Exception e){
            e.getStackTrace();
            throw e;
        }
        return person;
    }

    @Override
    public void deletePersonByNationalId(String nationalId) {

    }
}


