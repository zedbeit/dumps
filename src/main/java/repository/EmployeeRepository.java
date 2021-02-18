/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

//import entity.Book;
import entity.Employees;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ubaita
 */

@Stateless
public class EmployeeRepository {
    
    @PersistenceContext(unitName="myPU")
    EntityManager entityManager;
    
    public Employees createEmployee(Employees employee){
        entityManager.persist(employee);
        return employee;
    }
    
}
