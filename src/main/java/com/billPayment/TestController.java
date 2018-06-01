
package com.billPayment;
import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping("getMgg")
	public String getMsg() {
	
		return "hello msg";
	}
	
	@RequestMapping("getEmp")
	public Employee getEmp(Employee emp) {
	
		emp.setId(100);
		emp.setName("raamu");
		emp.setSalary(11223);
		return emp;
	}
	
	@RequestMapping("updateEmp1")
	public Employee saveEmp(@PathParam("name")String name,@PathParam("sal")float sal) {
		System.out.println("save emp");
		Employee emp=new Employee();
		emp.setId(100);
		emp.setName(name);
		emp.setSalary(sal);
		return emp;
	}
	
	@RequestMapping("updateEmp2")
	public Employee changeEmp(@RequestBody Employee emp) {
		emp.setSalary(emp.getSalary()+11223);
		return emp;
	}
	

}
