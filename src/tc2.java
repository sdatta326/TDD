import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class tc2 {

	@Test
	void test() {
		myclass obj=new myclass();
		int aclen=obj.callength("string1");
	assertEquals(7,aclen);
	System.out.println("actual string length="+" "+aclen);
	}

}
