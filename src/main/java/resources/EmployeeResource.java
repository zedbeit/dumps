/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import entity.Employees;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import repository.EmployeeRepository;

/**
 *
 * @author Ubaita
 */
@Path("employees")
@Consumes("application/json")
@Produces("application/json")
public class EmployeeResource {
    
    @Inject
    EmployeeRepository employeeRepository;
    
    @GET
    public String printEmployee(){
        return "Hello mr. Employee!!";
    }
    
    @POST
    @Path("new")
    public Employees createEmployee(Employees employee){
       employeeRepository.createEmployee(employee);
       return employee;
    }
}
