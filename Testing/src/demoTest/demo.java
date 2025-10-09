package demoTest;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class demo {
	@RepeatedTest(2)
	@Test
	public void show()
	{
		System.out.println("this is show method");
	}
	@RepeatedTest(2)
	@Test
	void hello()
	{
		System.out.println("this is hello method");
	}

}
