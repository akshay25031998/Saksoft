package in.saksoft.crud.app.serviceInterface;

import java.util.List;

import in.saksoft.crud.app.model.Employee;

public interface EmployeeServiceI {

	public void createEmp(Employee e);

	public List<Employee> viewEmp();

	public void deleteEmp(int id);

	public Employee editEmp(Employee e);

	
}
