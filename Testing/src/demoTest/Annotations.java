package demoTest;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class Annotations {
	@BeforeClass
	public void hey()
	{
		System.out.println("this is hey method");
	}
	@RepeatedTest(2)
	@Test
	public void show()
	{
		System.out.println("this is show method");
	}
	@Ignore
	void sayHi()
	{
		System.out.println("this is hi method");
	}
	@RepeatedTest(2)
	@Test
	void hello()
	{
		System.out.println("this is hello method");
	}
	


}
