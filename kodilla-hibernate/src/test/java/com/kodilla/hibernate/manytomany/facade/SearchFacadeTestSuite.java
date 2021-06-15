package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SearchFacadeTestSuite {

    @Autowired
    private SearchFacade searchFacade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    private final ArrayList<Company> companies = new ArrayList<>();
    private final ArrayList<Employee> employees = new ArrayList<>();

    @Test
    public void retrieveCompanyLikeTest() {

        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaSmith = new Employee("Linda", "Smith");

        Company softwareMachine = new Company("Software Machine");
        Company softDataMasters = new Company("Soft Data Masters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        softDataMasters.getEmployees().add(stephanieClarckson);
        softDataMasters.getEmployees().add(lindaSmith);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaSmith);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(softDataMasters);
        lindaSmith.getCompanies().add(softDataMasters);
        lindaSmith.getCompanies().add(greyMatter);

        //System.out.println(softwareMachine);
        companyDao.save(softwareMachine);
        companyDao.save(softDataMasters);
        companyDao.save(greyMatter);

        companies.add(softwareMachine);
        companies.add(softDataMasters);

        employees.add(johnSmith);
        employees.add(lindaSmith);

        //When
        List<Company> queryResult = searchFacade.searchCompanyLike("oft");
        //Then
        assertEquals(companies.size(), queryResult.size());
        //CleanUp
        try {
            companyDao.delete(softwareMachine);
            companyDao.delete(softDataMasters);
            companyDao.delete(greyMatter);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

//    @Test
//    public void retrieveEmployeeLikeTest() {
//        //Given
//
//        //When
//        List<Employee> employees = findFacade.findNameOfEmployeeByAnyPartOfName("mith");
//        //Then
//        Assert.assertEquals(2, employees.size());
//    }
}