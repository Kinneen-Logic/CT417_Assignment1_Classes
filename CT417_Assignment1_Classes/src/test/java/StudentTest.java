

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.nuigalway.ct417_assignment1_classes.CourseProgramme;
import com.nuigalway.ct417_assignment1_classes.Student;
import org.joda.time.DateTime;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentTest {
	
	public static void main(String[] args) {
		new StudentTest().testPrintMessage();
	}
	
   // @Test
   public void testPrintMessage() {
           CourseProgramme ece = new CourseProgramme("Electronic and Computer Engineering", new DateTime(2013, 1, 9, 0, 0), new DateTime(2017, 5, 31, 0, 0) );
	   Student aidan = new Student("aidan", 20, new DateTime(1995, 12, 7, 0, 0) , 13539243, ece);
	   String expectedUsername = "aidan20";
	   assertEquals(expectedUsername,aidan.getUsername());
   }
}