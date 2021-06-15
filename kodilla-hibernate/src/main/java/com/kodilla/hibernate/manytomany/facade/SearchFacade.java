package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class SearchFacade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> searchCompanyLike(String nameChunk) {
        return companyDao.findByAnyPartOfName(nameChunk);
    }

//    public List<Employee> retrieveEmployeeLike(String fragmentOfTheName){
//        return employeeDao.retrieveEmployeeLike(fragmentOfTheName);
//    }
}