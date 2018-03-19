package working;

import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.extension.ExtendWith;
import testsupport.LoggingExtension;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

import java.util.stream.IntStream;
import java.util.stream.Stream;

@ExtendWith(LoggingExtension.class)
class DynamicTests {

	@TestFactory
	Stream<DynamicNode> firstTenEvenIntegers() {
		//first ten even numbers
		return IntStream.iterate(0, n -> n + 2).limit(10)
				.mapToObj(n -> dynamicTest("test " + n,
						//check if even
						() -> assertTrue(n % 2 == 0)));
	}

	@TestFactory
	Stream<DynamicNode> strings() {
		return Stream.of("A", "B", "C")
				.map(str -> dynamicTest("test " + str, () -> assertTrue(str.charAt(0) < 'Z')));
	}

}