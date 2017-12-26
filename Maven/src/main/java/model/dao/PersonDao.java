package model.dao;

import model.dto.Person;
import util.SpringUtil;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
public class PersonDao  implements IPersonDao {
    String connectionDriver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String connectionUrl = "jdbc:sqlserver://localhost:1433;user=test;password=arman123456";
    Connection con = DriverManager.getConnection(connectionUrl);
    PreparedStatement ps;

    PersonDao() throws SQLException {
    }

    void closeConnection(Connection con, PreparedStatement ps) throws SQLException {
        ps.close();
        con.close();
    }

    public void create(Person person) throws Exception {
        try {
            ps = con.
                    prepareStatement("INSERT INTO Person (NationalId,FirstName,LastName,BirthDate,LastModificationDate,Major )" +
                            "VALUES (?,?,?,?,?,?);");
            ps.setString(1, person.getNationalId());
            ps.setString(2, person.getFirstName());
            ps.setString(3, person.getLastName());
            ps.setDate(4, (Date) person.getBirthDate());
            ps.setDate(5, new Date(System.currentTimeMillis()));
            ps.setString(6, person.getMajor());
            ps.executeUpdate();
            closeConnection(con, ps);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }

    }

    public List<Person> getPersons() throws SQLException, ClassNotFoundException {
        try {
            ps = con.prepareStatement("SELECT * FROM Person");
            ResultSet rs = ps.executeQuery();
            ArrayList<Person> lst = new ArrayList<Person>();
            Person person = (Person) SpringUtil.getBean("person");
            while (rs.next()) {
                person.nationalId = rs.getString(1);
                person.firstName = rs.getString(2);
                person.lastName = rs.getString(3);
                person.birthDate = rs.getDate(4);
                person.major = rs.getString(6);
                lst.add(person);
            }
            closeConnection(con, ps);
            return lst;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }

    public void updatePersonById(int id, String firstName, String lastName, String major) throws SQLException, ClassNotFoundException {
        try {

            ps = con.
                    prepareStatement("UPDATE Person SET FirstName=? , LastName=? , Major=? WHERE Id=?");
            ps.setString(1, firstName);
            ps.setString(2, lastName);
            ps.setString(3, major);
            ps.setInt(4, id);
            ps.executeUpdate();
            closeConnection(con, ps);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }

    public void deletePersonById(int nationalId) throws SQLException, ClassNotFoundException {
        try {

            ps = con.
                    prepareStatement("DELETE FROM Person WHERE NationalId=?");
            ps.setInt(1, nationalId);
            ps.executeUpdate();
            closeConnection(con, ps);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            throw ex;
        }
    }
}
