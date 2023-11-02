package in.saksoft.crud.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.saksoft.crud.app.model.Employee;
import in.saksoft.crud.app.repositary.EmployeeRepositary;
import in.saksoft.crud.app.serviceInterface.EmployeeServiceI;
@Service
public class EmployeeService implements EmployeeServiceI {

	
	@Autowired
	EmployeeRepositary er;

	@Override
	public void createEmp(Employee e) {
		
		er.save(e);
	}

	@Override
	public List<Employee> viewEmp() {
		// TODO Auto-generated method stub
		return er.findAll();
	}

	@Override
	public void deleteEmp(int id) {
		er.deleteById(id);
		
	}

	@Override
	public Employee editEmp(Employee e) {
		
		return er.save(e);
	}
}
