import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testing {

	@Test
	void test() {
		Adapted adapter = new Adapted( new Old() );
		adapter.chooseFirstSelection();
		adapter.chooseSecondSelection();
	}

	@Test
	void PickOptionA() {
		Adapted adapter = new Adapted(new Old());
		assertEquals("A", adapter.chooseFirstSelection());
	}

	@Test
	void PickOptionB() {
		Adapted adapter = new Adapted(new Old());
		assertEquals("B", adapter.chooseSecondSelection());
	}

}
