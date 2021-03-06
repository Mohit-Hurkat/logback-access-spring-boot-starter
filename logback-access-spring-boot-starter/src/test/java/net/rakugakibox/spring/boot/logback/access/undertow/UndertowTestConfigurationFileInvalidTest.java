package net.rakugakibox.spring.boot.logback.access.undertow;

import net.rakugakibox.spring.boot.logback.access.AbstractTestConfigurationFileInvalidTest;
import net.rakugakibox.spring.boot.logback.access.test.UndertowServletWebServerConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * The test in the case where test configuration files is invalid for Undertow.
 */
public class UndertowTestConfigurationFileInvalidTest extends AbstractTestConfigurationFileInvalidTest {

    /**
     * Constructs an instance.
     */
    public UndertowTestConfigurationFileInvalidTest() {
        super(ContextConfiguration.class);
    }

    /**
     * The context configuration.
     */
    @Configuration
    @Import(UndertowServletWebServerConfiguration.class)
    public static class ContextConfiguration extends AbstractContextConfiguration {
    }

}
