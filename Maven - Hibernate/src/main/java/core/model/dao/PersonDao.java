package core.model.dao;

import core.designPattern.repository.person.PersonRepository;
import core.model.dto.Person;

/**
 * Class for CRUD operations on table named Person in SQL server 2014 with columns:
 * Id int Primary key,
 * FirstName nvarchar(50),
 * LastName nvarchar(50),
 * BirthDate Date,
 * Major nvarchar(50),
 * NationalId nvarchar(50) Unique,
 * LastModificationDate Date
 */
public class PersonDao {

    Person person = new Person();
//    PersonRepository repository = (PersonRepository) SpringUtil.getBean("personRepository");
    PersonRepository repository=new PersonRepository();



    public void addPerson(Person person) {
        try {

                repository.create(person);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }

    }

    public Person getPersonByNationalId(String nationalId) {
        try {
            person = repository.getPersonByNationalId(person,nationalId);
        } catch (Exception e) {
            e.getStackTrace();
        }
        return person;
    }

    public void updatePersonById(String nationalId,Person person) {
        try {
            repository.updatePersonByNationalId(person,nationalId);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }

    public void deletePersonById(String nationalId) {
        try {

            repository.deletePersonByNationalId(nationalId);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }
}
