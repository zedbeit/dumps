/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import entity.Customer;
import entity.Salary;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ubaita
 */
@Stateless
public class SalaryRepository {
    @PersistenceContext()
    EntityManager entityManager;
    
    public Salary createSalary(Salary salary){
        entityManager.persist(salary);
        return salary;
    }
}
