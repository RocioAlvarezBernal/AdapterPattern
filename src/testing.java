import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testing {

	@Test
	void test() {
		Adapted adapter = new Adapted( new Old() );
		adapter.chooseFirstSelection();
		adapter.chooseSecondSelection();
	}
}
//	@Test
//	void PickOptionA() {
//		Adapter adapter = new Adapter(new old());
//		assertEquals("A", adapter.chooseFirstSelection());
//	}
//
//	@Test
//	void PickOptionA() {
//		Adapter adapter = new Adapter(new old());
//		assertEquals("B", adapter.chooseSecondSelection());
//	}
//
//}
