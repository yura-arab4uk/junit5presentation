
package working;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import testannotation.other.FastTest;

@DisplayName("Tags, Display Names, DI, and Conditions")
//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class TagsDisplayNamesDependencyInjectionAndConditionsTests {

	TestInfo testInfo;

	public TagsDisplayNamesDependencyInjectionAndConditionsTests(TestInfo testInfo) {
		this.testInfo = testInfo;
		System.err.println(testInfo);
	}

	// @Test
	// @Tag("fast")
	@FastTest
	@DisplayName("Fast test! 😱")
	void fastTest(TestInfo testInfo) {
		System.err.println(testInfo);
	}

//  @Disabled
//	@DisabledOnMac
//	@EnabledOnMac
	@Tag("normal")
	@Test
	void normalTest() {
		System.err.println("Normal test");
	}

}
