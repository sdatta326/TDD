import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testcase1 {

	@Test
	void test() {
	calc obj=new calc();
	int x=10,y=10;int expectedresult=20;
	int actualresult=obj.addNumbers(x,y);
	assertEquals(expectedresult,actualresult);
			
	}

}
