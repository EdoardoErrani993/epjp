package s105ex;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestofMyList {
	private MyList myList;

	@BeforeEach
	private void init() {

		myList = new MyList();

	}

	@Test
	void emptyList() { //ok

		assertThat(myList.getSize(), is(0));

	}

	@Test
	void addOne() {//ok

		myList.add(42);

		assertThat(myList.getSize(), is(1));

	}

	@Test
	void addThree() {

		myList.add(42);

		myList.add(Integer.MIN_VALUE);

		myList.add(0);

		assertThat(myList.getSize(), is(3));

	}

	@Test
	void getEmpty() {

		assertThrows(NullPointerException.class, () -> myList.get());

	}

	@Test
	void getEmptyClassic() {

		try {

			myList.get();

			fail("A NullPointerException was expected here");

		} catch (NullPointerException npe) {

		}

	}

	@Test
	void getOne() {

		myList.add(42);

		assertThat(myList.get(), is(42));

	}

	@Test
	void popEmpty() {

		assertThrows(NullPointerException.class, () -> myList.pop());

	}

	@Test

	void popOne() {//ok

		myList.add(42);

		myList.pop();

		assertThat(myList.getSize(), is(0));

	}
	@Test

	void getAfterPop() {//ok

		myList.add(42);

		myList.add(12);

		myList.pop();

		assertThat(myList.get(), is(12));

	}
}
