package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import java.util.Calendar;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Student> student = new ArrayList<Student>();
	static ArrayList<Course> course = new ArrayList<Course>();
	static ArrayList<Semester> semester = new ArrayList<Semester>();
	static ArrayList<Section> section = new ArrayList<Section>();
	static ArrayList<Enrollment> enrollment = new ArrayList<Enrollment>();

	static UUID PHYS = UUID.randomUUID();
	static UUID ECON = UUID.randomUUID();
	static UUID CHEM = UUID.randomUUID();
	
	static UUID Fall = UUID.randomUUID();
	static UUID Spring = UUID.randomUUID();
	
	@BeforeClass
	public static void setup() throws PersonException {
		
		Course c1 = new Course(UUID.randomUUID(), "PHYS", 100,eMajor.PHYSICS);
        Course c2 = new Course(UUID.randomUUID(), "ECON", 100, eMajor.BUSINESS);
        Course c3 = new Course(UUID.randomUUID(), "CHEM", 100, eMajor.CHEM);
        course.add(c1);
        course.add(c2);
        course.add(c3);
        
        Semester fall = new Semester(Fall,new Date(),new Date());
		Semester spring = new Semester(Spring,new Date(),new Date());
		semester.add(fall);
		semester.add(spring);
		
		Section s1 = new Section(PHYS,Fall,UUID.randomUUID(),207);
		Section s2 = new Section(PHYS,Spring,UUID.randomUUID(),207);
		Section s3 = new Section(ECON,Fall,UUID.randomUUID(),101);
		Section s4 = new Section(ECON,Spring,UUID.randomUUID(),101);
		Section s5 = new Section(CHEM,Fall,UUID.randomUUID(),103);
		Section s6 = new Section(CHEM,Spring,UUID.randomUUID(),103);
		section.add(s1);
		section.add(s2);
		section.add(s3);
		section.add(s4);
		section.add(s5);
		section.add(s6);
		
		Student stu1 = new Student("Student1", "M", "Last name", new Date(), "major", "adress","(123)-456-7890", "stu1@udel.edu");
		Student stu2 = new Student("Student2", "M","Last name" , new Date(), "major", "adress","(123)-456-7890", "stu2@udel.edu");
		Student stu3 = new Student("Student3", "M","Last name" , new Date(), "major", "adress","(123)-456-7890", "stu3@udel.edu");
		Student stu4 = new Student("Student4", "M","Last name" , new Date(), "major", "adress","(123)-456-7890", "stu4@udel.edu");
		Student stu5 = new Student("Student5", "M","Last name" , new Date(), "major", "adress","(123)-456-7890", "stu5@udel.edu");
		Student stu6 = new Student("Student6", "M","Last name" , new Date(), "major", "adress","(123)-456-7890", "stu6@udel.edu");
		Student stu7 = new Student("Student7", "M","Last name" , new Date(), "major", "adress","(123)-456-7890", "stu7@udel.edu");
		Student stu8 = new Student("Student8", "M","Last name" , new Date(), "major", "adress","(123)-456-7890", "stu8@udel.edu");
		Student stu9 = new Student("Student9", "M","Last name" , new Date(), "major", "adress","(123)-456-7890", "stu9@udel.edu");
		Student stu10 = new Student("Student10", "M","Last name" , new Date(), "major", "adress","(123)-456-7890", "stu10@udel.edu");
		
		student.add(stu1);
		student.add(stu2);
		student.add(stu3);
		student.add(stu4);
		student.add(stu5);
		student.add(stu6);
		student.add(stu7);
		student.add(stu8);
		student.add(stu9);
		student.add(stu10);
		}
		
		@Test
		public void test() {
			assertEquals(1, 1);
		}
		public void testGrade() {
			int avgGrade = 0, 
				totalGrade = 0;

			for (Enrollment e : enrollment) {
				if (e.getStudentID() == student.get(1).getStudentID()) {
					totalGrade += e.getGrade();
				}
				avgGrade += e.getGrade();
			}
			avgGrade = totalGrade / 50;
			
			assertEquals(avgGrade, avgGrade);
		}
		
		public void TestGPA() {
			for (int i = 0; i < 10; i++) {
				double GPA = i / 6;
				assertEquals(GPA, 3.0, .00001);
			}
		}
}