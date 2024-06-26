// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategy {
    private Double samplingRate;

    private TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategy() {}
    public Double samplingRate() {
        return this.samplingRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double samplingRate;
        public Builder() {}
        public Builder(TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.samplingRate = defaults.samplingRate;
        }

        @CustomType.Setter
        public Builder samplingRate(Double samplingRate) {
            this.samplingRate = Objects.requireNonNull(samplingRate);
            return this;
        }
        public TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategy build() {
            final var o = new TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategy();
            o.samplingRate = samplingRate;
            return o;
        }
    }
}
