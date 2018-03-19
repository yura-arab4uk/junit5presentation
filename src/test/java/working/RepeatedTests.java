
package working;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RepeatedTests {

	@RepeatedTest(5)
	void repeatedTest(RepetitionInfo repetitionInfo) {
		assertEquals(5, repetitionInfo.getTotalRepetitions());
	}

	@RepeatedTest(value = 5, name = "{displayName} {currentRepetition} von {totalRepetitions}")
	@DisplayName("German test")
	void repeatedTestInGerman() {
		// ...
	}

}
