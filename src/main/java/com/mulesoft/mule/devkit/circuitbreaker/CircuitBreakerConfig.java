package com.mulesoft.mule.devkit.circuitbreaker;

import org.mule.api.annotations.Configurable;
import org.mule.api.annotations.components.Configuration;

/**
 * Configuration holder for Circuit Breaker
 * @author Nahuel Lofeudo
 *
 */
@Configuration(configElementName = "config", friendlyName = "config")
public class CircuitBreakerConfig {
	/**
	 * The amount of failures (exceptions) until the circuit breaker is tripped.
	 */
	@Configurable
	private int tripThreshold;

	/**
	 * How long to wait (in milliseconds) until the breaker is automatically reset.
	 */
	@Configurable
	private long tripTimeout;

	/**
	 * The name of this breaker.
	 */
	@Configurable
	private String breakerName;

	public void setTripThreshold(int tripThreshold) {
		this.tripThreshold = tripThreshold;
	}

	public int getTripThreshold() {
		return tripThreshold;
	}

	public void setTripTimeout(long tripTimeout) {
		this.tripTimeout = tripTimeout;
	}

	public long getTripTimeout() {
		return tripTimeout;
	}

	public void setBreakerName(String breakerName) {
		this.breakerName = breakerName;
	}

	public String getBreakerName() {
		return breakerName;
	}

}
