# Difference Between JPA, Hibernate and Spring Data JPA

## Java Persistence API (JPA)

- JPA stands for **Java Persistence API**.
- It is a **specification (JSR 338)** for mapping Java objects to relational databases.
- It defines a standard set of interfaces and annotations.
- JPA itself does **not provide an implementation**.
- It requires an implementation such as Hibernate or EclipseLink.

**Example Annotations:**
- @Entity
- @Table
- @Id
- @Column

---

## Hibernate

- Hibernate is an **Object Relational Mapping (ORM) framework**.
- It is one of the most popular **implementations of JPA**.
- It converts Java objects into database tables and vice versa.
- Hibernate provides additional features beyond the JPA specification.
- Developers manage sessions and transactions manually.

**Example:**

```java
Session session = factory.openSession();
Transaction tx = session.beginTransaction();

session.save(employee);

tx.commit();
session.close();
