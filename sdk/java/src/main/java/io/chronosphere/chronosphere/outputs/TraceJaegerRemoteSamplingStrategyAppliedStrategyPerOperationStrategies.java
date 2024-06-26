// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import io.chronosphere.chronosphere.outputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategy;
import java.lang.Double;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategies {
    private @Nullable Double defaultLowerBoundTracesPerSecond;
    private Double defaultSamplingRate;
    private @Nullable Double defaultUpperBoundTracesPerSecond;
    private @Nullable List<TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategy> perOperationStrategies;

    private TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategies() {}
    public Optional<Double> defaultLowerBoundTracesPerSecond() {
        return Optional.ofNullable(this.defaultLowerBoundTracesPerSecond);
    }
    public Double defaultSamplingRate() {
        return this.defaultSamplingRate;
    }
    public Optional<Double> defaultUpperBoundTracesPerSecond() {
        return Optional.ofNullable(this.defaultUpperBoundTracesPerSecond);
    }
    public List<TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategy> perOperationStrategies() {
        return this.perOperationStrategies == null ? List.of() : this.perOperationStrategies;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategies defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Double defaultLowerBoundTracesPerSecond;
        private Double defaultSamplingRate;
        private @Nullable Double defaultUpperBoundTracesPerSecond;
        private @Nullable List<TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategy> perOperationStrategies;
        public Builder() {}
        public Builder(TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategies defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultLowerBoundTracesPerSecond = defaults.defaultLowerBoundTracesPerSecond;
    	      this.defaultSamplingRate = defaults.defaultSamplingRate;
    	      this.defaultUpperBoundTracesPerSecond = defaults.defaultUpperBoundTracesPerSecond;
    	      this.perOperationStrategies = defaults.perOperationStrategies;
        }

        @CustomType.Setter
        public Builder defaultLowerBoundTracesPerSecond(@Nullable Double defaultLowerBoundTracesPerSecond) {
            this.defaultLowerBoundTracesPerSecond = defaultLowerBoundTracesPerSecond;
            return this;
        }
        @CustomType.Setter
        public Builder defaultSamplingRate(Double defaultSamplingRate) {
            this.defaultSamplingRate = Objects.requireNonNull(defaultSamplingRate);
            return this;
        }
        @CustomType.Setter
        public Builder defaultUpperBoundTracesPerSecond(@Nullable Double defaultUpperBoundTracesPerSecond) {
            this.defaultUpperBoundTracesPerSecond = defaultUpperBoundTracesPerSecond;
            return this;
        }
        @CustomType.Setter
        public Builder perOperationStrategies(@Nullable List<TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategy> perOperationStrategies) {
            this.perOperationStrategies = perOperationStrategies;
            return this;
        }
        public Builder perOperationStrategies(TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategy... perOperationStrategies) {
            return perOperationStrategies(List.of(perOperationStrategies));
        }
        public TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategies build() {
            final var o = new TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategies();
            o.defaultLowerBoundTracesPerSecond = defaultLowerBoundTracesPerSecond;
            o.defaultSamplingRate = defaultSamplingRate;
            o.defaultUpperBoundTracesPerSecond = defaultUpperBoundTracesPerSecond;
            o.perOperationStrategies = perOperationStrategies;
            return o;
        }
    }
}
