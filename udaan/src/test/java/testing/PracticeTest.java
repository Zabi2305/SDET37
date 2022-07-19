package testing;

import org.testng.annotations.Test;

public class PracticeTest {
	@Test(priority = 4)
	public void lionTest(){
		System.out.println("lion is a king of jungle");
	}
	
	@Test(priority = 2)
	public void tigerTest1() {
		System.out.println("tiger is the national animal");
		}
	@Test(priority = 3)
	public void elephantTest() {
		System.out.println("Elephant is a big animal");
	}
	@Test(priority = 1)
	public void cheethaTest() {
		System.out.println("Cheethan is the fastest animal");
	}
	
}
