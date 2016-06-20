package banksimulation;

import org.junit.Assert;

public class PersonTest {


	public void test() {
		Person p = new Person("rabia",323.23);
		String n = p.getName();
		Assert.assertEquals("ALI", n);
	}

}

