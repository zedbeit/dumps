/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import entity.Customer;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import repository.CustomerRepository;

/**
 *
 * @author Ubaita
 */
@Path("customers")
@Consumes("application/json")
@Produces("application/json")
public class CustomerResource {
    
    
    @Inject
    CustomerRepository customerRepository;
    
    @GET
    public String printCustomer(){
        return "Hello mr.Customer!!";
    }
    
    @POST
    @Path("new")
    public Customer createEmployee(Customer customer){
       customerRepository.createCustomer(customer);
       return customer;
    }
}
