// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import io.chronosphere.chronosphere.outputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategies;
import io.chronosphere.chronosphere.outputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyProbabilisticStrategy;
import io.chronosphere.chronosphere.outputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyRateLimitingStrategy;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TraceJaegerRemoteSamplingStrategyAppliedStrategy {
    private @Nullable TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategies perOperationStrategies;
    private @Nullable TraceJaegerRemoteSamplingStrategyAppliedStrategyProbabilisticStrategy probabilisticStrategy;
    private @Nullable TraceJaegerRemoteSamplingStrategyAppliedStrategyRateLimitingStrategy rateLimitingStrategy;

    private TraceJaegerRemoteSamplingStrategyAppliedStrategy() {}
    public Optional<TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategies> perOperationStrategies() {
        return Optional.ofNullable(this.perOperationStrategies);
    }
    public Optional<TraceJaegerRemoteSamplingStrategyAppliedStrategyProbabilisticStrategy> probabilisticStrategy() {
        return Optional.ofNullable(this.probabilisticStrategy);
    }
    public Optional<TraceJaegerRemoteSamplingStrategyAppliedStrategyRateLimitingStrategy> rateLimitingStrategy() {
        return Optional.ofNullable(this.rateLimitingStrategy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TraceJaegerRemoteSamplingStrategyAppliedStrategy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategies perOperationStrategies;
        private @Nullable TraceJaegerRemoteSamplingStrategyAppliedStrategyProbabilisticStrategy probabilisticStrategy;
        private @Nullable TraceJaegerRemoteSamplingStrategyAppliedStrategyRateLimitingStrategy rateLimitingStrategy;
        public Builder() {}
        public Builder(TraceJaegerRemoteSamplingStrategyAppliedStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.perOperationStrategies = defaults.perOperationStrategies;
    	      this.probabilisticStrategy = defaults.probabilisticStrategy;
    	      this.rateLimitingStrategy = defaults.rateLimitingStrategy;
        }

        @CustomType.Setter
        public Builder perOperationStrategies(@Nullable TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategies perOperationStrategies) {
            this.perOperationStrategies = perOperationStrategies;
            return this;
        }
        @CustomType.Setter
        public Builder probabilisticStrategy(@Nullable TraceJaegerRemoteSamplingStrategyAppliedStrategyProbabilisticStrategy probabilisticStrategy) {
            this.probabilisticStrategy = probabilisticStrategy;
            return this;
        }
        @CustomType.Setter
        public Builder rateLimitingStrategy(@Nullable TraceJaegerRemoteSamplingStrategyAppliedStrategyRateLimitingStrategy rateLimitingStrategy) {
            this.rateLimitingStrategy = rateLimitingStrategy;
            return this;
        }
        public TraceJaegerRemoteSamplingStrategyAppliedStrategy build() {
            final var o = new TraceJaegerRemoteSamplingStrategyAppliedStrategy();
            o.perOperationStrategies = perOperationStrategies;
            o.probabilisticStrategy = probabilisticStrategy;
            o.rateLimitingStrategy = rateLimitingStrategy;
            return o;
        }
    }
}
