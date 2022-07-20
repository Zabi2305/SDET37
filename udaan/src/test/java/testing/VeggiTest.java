package testing;

import org.testng.annotations.Test;

public class VeggiTest {
	@Test(priority = 1)
	public void Vegetables() {
		System.out.println("Veggies are good for health");
	}
	@Test(priority = 2)
	public void Tarkari() {
		System.out.println("Sehat ke leya acha");
		System.out.println("Green veggies are good");
		System.out.println("Green veggies are haribari");
		System.out.println("123");
	}
	
	public void Carrot() {
		String BROWSER = System.getProperty("browser");
		System.out.println("Browser +------>" +BROWSER);
		
		String URL = System.getProperty("url");
		System.out.println("Url +--------->" + URL);
	}

}
