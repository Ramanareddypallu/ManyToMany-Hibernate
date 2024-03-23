package manytomanyDao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanyDto.Student;

public class StudentDao {
	
	public EntityManager geEntityManager() {
		return Persistence.createEntityManagerFactory("ram").createEntityManager();
	}
	
	
	public void updateStudent(int id, Student student) {
		EntityManager entityManager = geEntityManager();
		Student dbstudent = entityManager.find(Student.class, id);
		if(dbstudent!=null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			student.setId(id);
			student.setCourses(dbstudent.getCourses());
			entityManager.merge(student);
			entityTransaction.commit();
		}
	}
	
	public void findStudent(int id) {
		EntityManager entityManager = geEntityManager();
		Student dbstudent = entityManager.find(Student.class, id);
		if(dbstudent!=null) {
			System.out.println(dbstudent);
			
		}else {
			System.out.println("sorry id is not present");
		}
	}
	
	
	public void deleteStudent(int id) {
		EntityManager entityManager = geEntityManager();
		Student dbstudent = entityManager.find(Student.class, id);
		if(dbstudent!=null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbstudent);
			entityTransaction.commit();
		}
		else {
			System.out.println("sorry id is not present");
		}
	}

}
