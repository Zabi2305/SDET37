package testing;

import org.testng.annotations.Test;

public class DemoTest {
	@Test
	public void Hathi() {
		//passing the data from the maven command and getting the output in the program
		System.out.println("Hathi meri Saathi");
		String url = System.getProperty("URL");
		System.out.println("URL OF THE APP"+ url);
		String password=System.getProperty("PASSWORD");
		System.out.println("PASSWORD OF THE APP"+ password);
	}
	@Test
	public void khathi() {
		System.out.println("Khana khana");
	}

}
