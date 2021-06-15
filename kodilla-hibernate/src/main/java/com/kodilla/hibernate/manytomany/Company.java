package com.kodilla.hibernate.manytomany;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

//@NamedQuery(
//       name = "Company.retrieveCompanyNameLike",
////        query = "LEFT(company_name, 3) FROM COMPANIES WHERE LEFT(company_name, 3)=:NAME"
//        query = "FROM COMPANIES WHERE COMPANIES.COMPANY_NAME LIKE ':NAME%'"
//)
@NamedNativeQuery(
        name = "Company.findBy3Char",
        query = "SELECT * FROM kodilla_course.companies WHERE LEFT(COMPANY_NAME,3) = :THREECHAR",
        resultClass = Company.class
)

@NamedNativeQuery(
        name = "Company.findByAnyPartOfName",
        query = "SELECT * FROM kodilla_course.companies WHERE COMPANY_NAME LIKE CONCAT('%', :ARG, '%')",
        resultClass = Company.class
)


@Entity
@Table(name = "COMPANIES")
public class Company {
    private int id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public Company() {
    }

    public Company(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
