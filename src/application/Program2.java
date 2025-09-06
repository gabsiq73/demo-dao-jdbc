package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: department findByID ===");	
		Department department = departmentDao.findById(1);
		System.out.println(department);
		
		System.out.println();
		System.out.println("=== TEST 2: department findAll ===");	
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
		
		
		System.out.println();
		System.out.println("=== TEST 3: department update ===");
		department = departmentDao.findById(13);
		department.setName("Perfumes");
		departmentDao.update(department);
		System.out.println("Update completed!");
		
		/*
		System.out.println();
		System.out.println("=== TEST 4: department insert ===");
		Department newDepartment = new Department(null, "Cosmeticos");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println();
		System.out.println("=== TEST 5: department delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
		*/
	}

}
