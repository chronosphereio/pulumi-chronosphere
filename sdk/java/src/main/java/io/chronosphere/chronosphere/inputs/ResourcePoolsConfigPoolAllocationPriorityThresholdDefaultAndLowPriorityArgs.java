// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs Empty = new ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs();

    @Import(name="fixedValue")
    private @Nullable Output<Integer> fixedValue;

    public Optional<Output<Integer>> fixedValue() {
        return Optional.ofNullable(this.fixedValue);
    }

    @Import(name="percentOfPoolAllocation")
    private @Nullable Output<Double> percentOfPoolAllocation;

    public Optional<Output<Double>> percentOfPoolAllocation() {
        return Optional.ofNullable(this.percentOfPoolAllocation);
    }

    private ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs() {}

    private ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs(ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs $) {
        this.fixedValue = $.fixedValue;
        this.percentOfPoolAllocation = $.percentOfPoolAllocation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs $;

        public Builder() {
            $ = new ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs();
        }

        public Builder(ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs defaults) {
            $ = new ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs(Objects.requireNonNull(defaults));
        }

        public Builder fixedValue(@Nullable Output<Integer> fixedValue) {
            $.fixedValue = fixedValue;
            return this;
        }

        public Builder fixedValue(Integer fixedValue) {
            return fixedValue(Output.of(fixedValue));
        }

        public Builder percentOfPoolAllocation(@Nullable Output<Double> percentOfPoolAllocation) {
            $.percentOfPoolAllocation = percentOfPoolAllocation;
            return this;
        }

        public Builder percentOfPoolAllocation(Double percentOfPoolAllocation) {
            return percentOfPoolAllocation(Output.of(percentOfPoolAllocation));
        }

        public ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs build() {
            return $;
        }
    }

}
