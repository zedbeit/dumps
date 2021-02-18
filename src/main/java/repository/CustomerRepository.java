/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import entity.Customer;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Ubaita
 */
@Stateless
public class CustomerRepository {
    @PersistenceContext()
    EntityManager entityManager;
    
    public Customer createCustomer(Customer customer){
        entityManager.persist(customer);
        return customer;
    }
}
