package com.map.provider;

import com.entity.Employee;
import com.service.EmployeeService;
import java.util.*;

public class EmployeeMapService implements EmployeeService {

	HashMap<Integer, Employee> map = new HashMap<>();
	
	public EmployeeMapService() {
		map.put(100, new Employee(100, "Ramana",45000));
		map.put(200, new Employee(200, "Kishore",65000));
		
	}

	@Override
	public Employee getEmployee(int eid) {
		Employee x = map.get(eid);
		return x;
	}

	@Override
	public boolean saveEmployee(Employee e) {
		if(map.containsKey(e.getEmpId()))
			return false;
		map.put(e.getEmpId(), e);
		return true;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "TEMP";
	}

}
