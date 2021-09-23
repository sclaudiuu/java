package custom.metrics;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.ToDoubleFunction;
import java.util.function.ToLongFunction;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import io.micrometer.core.instrument.Clock;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.DistributionSummary;
import io.micrometer.core.instrument.FunctionCounter;
import io.micrometer.core.instrument.FunctionTimer;
import io.micrometer.core.instrument.Gauge;
import io.micrometer.core.instrument.Measurement;
import io.micrometer.core.instrument.Meter;
import io.micrometer.core.instrument.Meter.Id;
import io.micrometer.core.instrument.Meter.Type;
import io.micrometer.core.instrument.MeterRegistry;
import io.micrometer.core.instrument.Timer;
import io.micrometer.core.instrument.distribution.DistributionStatisticConfig;
import io.micrometer.core.instrument.distribution.pause.PauseDetector;

@Endpoint(id="custom-metrics")
public class CustomMeterRegistry extends MeterRegistry {

	public CustomMeterRegistry(CustomRegistryConfig config, Clock clock) {
		super(clock);
	}
	
	@ReadOperation
	public List<Meter> getMeters() {
		return super.getMeters();
	}

	@Override
	protected <T> Gauge newGauge(Id id, T obj, ToDoubleFunction<T> valueFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Counter newCounter(Id id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Timer newTimer(Id id, DistributionStatisticConfig distributionStatisticConfig,
			PauseDetector pauseDetector) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected DistributionSummary newDistributionSummary(Id id, DistributionStatisticConfig distributionStatisticConfig,
			double scale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Meter newMeter(Id id, Type type, Iterable<Measurement> measurements) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected <T> FunctionTimer newFunctionTimer(Id id, T obj, ToLongFunction<T> countFunction,
			ToDoubleFunction<T> totalTimeFunction, TimeUnit totalTimeFunctionUnit) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected <T> FunctionCounter newFunctionCounter(Id id, T obj, ToDoubleFunction<T> countFunction) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected TimeUnit getBaseTimeUnit() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected DistributionStatisticConfig defaultHistogramConfig() {
		// TODO Auto-generated method stub
		return null;
	}
}