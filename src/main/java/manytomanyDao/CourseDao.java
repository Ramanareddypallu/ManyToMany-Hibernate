package manytomanyDao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanyDto.Course;

public class CourseDao {
	
	public EntityManager getentityManager() {
		return Persistence.createEntityManagerFactory("ram").createEntityManager();
		
	
	}
	
	public void updateCourse(int id, Course course) {
		EntityManager entityManager = getentityManager();
		Course dbCourse = entityManager.find(Course.class, id);
		if(dbCourse!=null) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		dbCourse.setId(id);
		entityManager.merge(course);
		entityTransaction.commit();
		}else {
			System.out.println("sorry id is not present");
		}
	}
	
	public void findCourse(int id) {
		EntityManager entityManager = getentityManager();
		Course dbCourse = entityManager.find(Course.class, id);
		if(dbCourse!=null) {
			System.out.println(dbCourse);
		}else {
			System.out.println("sorry id is not present");
		}
	}
	
	public void deleteCourse(int id) {
		EntityManager entityManager = getentityManager();
		Course dbCourse = entityManager.find(Course.class, id);
		if(dbCourse!=null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			entityManager.remove(dbCourse);
			entityTransaction.commit();
		}else {
			System.out.println("sorry id is not present");
		}
	}

}
