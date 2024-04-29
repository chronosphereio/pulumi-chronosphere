// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.util.Objects;


public final class TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategyArgs Empty = new TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategyArgs();

    @Import(name="samplingRate", required=true)
    private Output<Double> samplingRate;

    public Output<Double> samplingRate() {
        return this.samplingRate;
    }

    private TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategyArgs() {}

    private TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategyArgs(TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategyArgs $) {
        this.samplingRate = $.samplingRate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategyArgs $;

        public Builder() {
            $ = new TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategyArgs();
        }

        public Builder(TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategyArgs defaults) {
            $ = new TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategyArgs(Objects.requireNonNull(defaults));
        }

        public Builder samplingRate(Output<Double> samplingRate) {
            $.samplingRate = samplingRate;
            return this;
        }

        public Builder samplingRate(Double samplingRate) {
            return samplingRate(Output.of(samplingRate));
        }

        public TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategyArgs build() {
            $.samplingRate = Objects.requireNonNull($.samplingRate, "expected parameter 'samplingRate' to be non-null");
            return $;
        }
    }

}