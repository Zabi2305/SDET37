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
	}

}
