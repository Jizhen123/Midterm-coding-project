package com.cisc181.core;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test_Staff() throws PersonException{
		ArrayList<Staff> Stafflist = new ArrayList<Staff>();
		
		Staff S1 = new Staff("Jacob", "A", "Wood", new Date(96,3,15), "address", "(123)-456-7890", "123@udel.edu", "MF", 1, 10000, new Date(97,2,3), eTitle.MR);
	    Staff S2 = new Staff("Mason", "B", "Lee", new Date(95,2,4), "address", "(122)-466-7899", "321@udel.edu", "TF", 2, 20000, new Date(97,2,3), eTitle.MR);
	    Staff S3 = new Staff("William", "C", "Martin", new Date(03,2,1), "address", "(321)-654-9876", "132@udel.edu", "WF", 3, 30000, new Date(04,2,3), eTitle.MR);
	    Staff S4 = new Staff("Taylor", "D", "Thompson", new Date(98,1,3), "address", "(987)-657-1234", "232@udel.edu", "MW", 4, 40000, new Date(97,4,5), eTitle.MS);
	    Staff S5 = new Staff("Jayden", "E", "Clark", new Date(99,6,5), "address", "(112)-564-0987", "322@udel.edu", "RF", 5, 50000, new Date(94,3,2), eTitle.MR);
	    Stafflist.add(S1);
	    Stafflist.add(S2);
	    Stafflist.add(S3);
	    Stafflist.add(S4);
	    Stafflist.add(S5);

	        double sum = 0;
	        double average = 0;
	        for (int i = 0; i < Stafflist.size(); i++) {
	            sum += Stafflist.get(i).getSalary();
	        }
	        average = (float) (sum / Stafflist.size());
	        assertEquals(average, 30000 , 0.001);
	}
	
    @Test
    public void test_PhoneNumber() {

        try{
            Staff S1 = new Staff("Jacob", "A", "Wood", new Date(96,3,15), "address","phone number", "123@udel.edu", "MF", 1, 10000, new Date(97,2,3), eTitle.MR);
            fail();
        }catch (PersonException p){
            assertThat(p.getMessage(), is("Invalid Phone Number"));

        }
    }
}
