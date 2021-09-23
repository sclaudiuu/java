package custom.metrics;

import org.springframework.boot.actuate.autoconfigure.metrics.CompositeMeterRegistryAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.metrics.export.simple.SimpleMetricsExportAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import io.micrometer.core.instrument.Clock;

@Configuration(proxyBeanMethods = false)
@AutoConfigureBefore({CompositeMeterRegistryAutoConfiguration.class,
    SimpleMetricsExportAutoConfiguration.class})
@AutoConfigureAfter(MetricsAutoConfiguration.class)
@EnableConfigurationProperties(CustomRegistryConfig.class)
public class MetricsConfig {

	@Bean
	@ConditionalOnMissingBean
	public CustomRegistryConfig customRegistryConfig() {
		return CustomRegistryConfig.DEFAULT;
	}

	@Bean(name = "customMeterRegistry")
	@ConditionalOnMissingBean
	@Primary
	public CustomMeterRegistry customMeterRegistry(CustomRegistryConfig customRegistryConfig, Clock clock) {
		return new CustomMeterRegistry(customRegistryConfig, clock);
	}

}