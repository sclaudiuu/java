package custom.metrics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.CompositeMeterRegistryAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.metrics.SystemMetricsAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.metrics.export.simple.SimpleMetricsExportAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.metrics.jdbc.DataSourcePoolMetricsAutoConfiguration;
import org.springframework.boot.actuate.autoconfigure.metrics.web.tomcat.TomcatMetricsAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = { CompositeMeterRegistryAutoConfiguration.class,
		DataSourcePoolMetricsAutoConfiguration.class, TomcatMetricsAutoConfiguration.class,
		SimpleMetricsExportAutoConfiguration.class, SystemMetricsAutoConfiguration.class, })
public class MainClass {

	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
	}
}
