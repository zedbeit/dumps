/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import entity.Customer;
import entity.Salary;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
//import repository.CustomerRepository;
import repository.SalaryRepository;

/**
 *
 * @author Ubaita
 */
@Path("salaries")
@Consumes("application/json")
@Produces("application/json")
public class SalaryResource {
    
    
    @Inject
    SalaryRepository salaryRepository;
    
    @GET
    public String printSalary(){
        return "Hello Salary!!";
    }
    
    @POST
    @Path("new")
    public Salary createSalary(Salary salary){
       salaryRepository.createSalary(salary);
       return salary;
    }
}
