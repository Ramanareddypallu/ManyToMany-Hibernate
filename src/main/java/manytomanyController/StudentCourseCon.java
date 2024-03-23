package manytomanyController;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytomanyDao.CourseDao;
import manytomanyDao.StudentDao;
import manytomanyDto.Course;
import manytomanyDto.Student;

public class StudentCourseCon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	/*	Course course = new Course();
		course.setId(1);
		course.setName("java");
		course.setFees(5000);

		Course course2 = new Course();
		course2.setId(2);
		course2.setName("Adv-java");
		course2.setFees(5000);

		Course course3 = new Course();
		course3.setId(3);
		course3.setName("SQL");
		course3.setFees(5000);
		*/
		
		List<Course> coursesofRamana = new ArrayList<Course>();
	/*	
		coursesofRamana.add(course);
		coursesofRamana.add(course2);
		coursesofRamana.add(course3);
		
		
		Student student = new Student();
		student.setId(1);
		student.setName("Ramana Reddy");
		student.setAddress("banglore");
		
		student.setCourses(coursesofRamana);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("pavithra Reddy");
		student2.setAddress("banglore");
		
		student2.setCourses(coursesofRamana);
	*/
		
	/*	Student student3 = new Student();
		student3.setId(3);
		student3.setName("chalama Reddy");
		student3.setAddress("kadapa");
		
		student3.setCourses(coursesofRamana);
		*/
	/*	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
	/*	entityManager.persist(course);
		entityManager.persist(course2);
		entityManager.persist(course3);
		entityManager.persist(student);
		entityManager.persist(student2);  
		entityManager.persist(student3);
		entityTransaction.commit(); 
		*/
	/*	Student student3 = new Student();
		student3.setName("chalama reddy");
        student3.setAddress("kadapa");
		StudentDao dao = new StudentDao();
		dao.updateStudent(3, student3);
		*/
		
		
		CourseDao dao = new CourseDao();
		dao.findCourse(1);
		
		StudentDao dao2 = new StudentDao();
		dao2.findStudent(1);
	}

}
