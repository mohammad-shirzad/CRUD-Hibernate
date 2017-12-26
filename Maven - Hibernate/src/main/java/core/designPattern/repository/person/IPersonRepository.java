package core.designPattern.repository.person;

import core.designPattern.repository.baseEntity.IBaseRepository;
import core.model.dto.Person;

public interface IPersonRepository extends IBaseRepository<Person> {
    public void updatePersonByNationalId(Person person,String nationalId);
    public void createPerson(Person person);
    public Person getPersonByNationalId(Person person,String nationalId);
    public void deletePersonByNationalId(String nationalId);
}
