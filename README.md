# CRUD-Hibernate
A CRUD operation for training and learning purpose that is going to be turned into a *register-login* website over time.
Details to this project is as follows:
  this includes 3 tables, namely **Person**, **ContactInfo**, **EducationInfo** and **JobInfo** to more or less fully embraces a real person information.
  In order for tables to be connected, I add InfoId column in Person table with unique value for each person and pointed its reference to Id columns in other tables.
 ### Technologies and tools:
 1. **Intellij Idea 2017** as IDE
 2. **MS SQL 2014** as database
 3. **Repository** pattern to arrange a hierarchical inheritence for database connection and data and parameters exchange
 4. **Spring 4** to implement beans and aplly dependency injection
 5. **Hibernate 3** to create and manage database connection
 6. **Maven 4** as a build tool
 7. **Singleton** pattern in creating Hibernate and Spring Util
 Other clarifications on database tables and columns are mentioned as comments on top of each class 
