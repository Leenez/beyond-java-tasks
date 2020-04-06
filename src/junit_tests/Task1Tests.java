package junit_tests;

import static org.junit.Assert.*;

import java.time.LocalTime;
import org.junit.Before;
import org.junit.Test;
import task_1.*;

public class Task1Tests {
	
	private PersonInfo pi;
	private LunchInfo li;
	private VehicleInfo vi;
		
	@Before
	public void init() {
		pi = new PersonInfo();
		pi.setAddress("Address1");
		pi.setDrivingPermit("B");
		pi.setName("John");
		pi.setNationality(NationalityEnum.FIN);
		pi.setPersonId(123);
		
		li = new LunchInfo();
		li.setLunchingTime(LocalTime.now());
		li.setVenue("venue");
		
		vi = new VehicleInfo();
		vi.setLicensePlate("123-A");
		vi.addUser(123);
	}
	
	@Test
	public void testGetInfo() {
		assertEquals("John,123,Address1,FIN,B", pi.getInfo());
	}

	@Test
	public void testCopyingObjects() {
		PersonInfo pi2 = pi.copyPersonInfo(pi);
		assertEquals(pi.getInfo(), pi2.getInfo());
		LunchInfo li2 = pi.copyLunchInfo(li);
		assertEquals(li2.getInfo(), li.getInfo());	
	}
	
	@Test
	public void testComparingSameType() {
		PersonInfo pi3 = pi;
		String data = pi3.compareSameType(pi);
		assertEquals("name personid license nationality drivepermit ", data);
		data = pi3.compareSameType(li);
		assertNull(data);	
	}
	
	@Test
	public void testPersonInfoNationality() {
		assertTrue(pi.checkFin());
	}
	
	@Test
	public void testVehicleInfoAddAndRemoveUsers() {
		vi.addUser(12345);
		assertEquals("[12345, 123]", vi.getUsers().toString());
		vi.removeUser(123);
		assertEquals("[12345]", vi.getUsers().toString());
	}

}
