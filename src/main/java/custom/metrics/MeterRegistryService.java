package custom.metrics;

import org.springframework.stereotype.Service;

@Service
public class MeterRegistryService {

	private CustomMeterRegistry customMeterRegistry;

	public MeterRegistryService(CustomMeterRegistry customMeterRegistry) {
		this.customMeterRegistry = customMeterRegistry;
	}

	public void increment() {
		customMeterRegistry.counter("custom.metrics", "application", "test", "component", "component").increment();
	}
}
