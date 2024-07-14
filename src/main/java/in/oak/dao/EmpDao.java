package in.oak.dao;

import java.util.List;

import in.oak.entity.Emp;

public interface EmpDao {

	public int saveEmp(Emp emp);

	public Emp getEmpById(int id);

	public List<Emp> getAllEmp();

	public void deleteEmp(int id);
}