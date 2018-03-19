/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package testannotation.spring;

import org.springframework.test.context.junit.jupiter.DisabledIf;

import java.lang.annotation.*;

/**
 * Demo <em>composed annotation</em> for {@link DisabledIf @DisabledIf} that
 * disables a test class or test method if the current operating system is
 * Mac OS.
 *
 * @author Sam Brannen
 * @since 5.0
 */
@Target({ ElementType.TYPE, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@DisabledIf(expression = "#{systemProperties['os.name'].toLowerCase().contains('mac')}", reason = "Disabled on Mac OS")
public @interface DisabledOnMac {
}
