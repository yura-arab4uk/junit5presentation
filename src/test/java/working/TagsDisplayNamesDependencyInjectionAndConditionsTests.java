
package working;

import org.junit.jupiter.api.*;
import testannotation.other.FastTest;
import testannotation.spring.DisabledOnMac;
import testannotation.spring.EnabledOnMac;

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
