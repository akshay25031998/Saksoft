package in.saksoft.crud.app.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import in.saksoft.crud.app.model.Employee;

@Repository
public interface EmployeeRepositary extends JpaRepository<Employee, Integer> {

}
