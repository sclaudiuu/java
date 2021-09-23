package custom.metrics;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.instrument.config.MeterRegistryConfig;

@ConfigurationProperties
public interface CustomRegistryConfig extends MeterRegistryConfig {
	
	CustomRegistryConfig DEFAULT = k -> null;
	
	
	@Override
	default String prefix() {
		return "custom";
	}
}