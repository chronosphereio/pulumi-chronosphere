// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.ResourcePoolsConfigDefaultPoolAllocationFixedValueArgs;
import io.chronosphere.chronosphere.inputs.ResourcePoolsConfigDefaultPoolAllocationPriorityThresholdArgs;
import java.lang.Double;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourcePoolsConfigDefaultPoolAllocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePoolsConfigDefaultPoolAllocationArgs Empty = new ResourcePoolsConfigDefaultPoolAllocationArgs();

    @Import(name="fixedValues")
    private @Nullable Output<List<ResourcePoolsConfigDefaultPoolAllocationFixedValueArgs>> fixedValues;

    public Optional<Output<List<ResourcePoolsConfigDefaultPoolAllocationFixedValueArgs>>> fixedValues() {
        return Optional.ofNullable(this.fixedValues);
    }

    @Import(name="percentOfLicense")
    private @Nullable Output<Double> percentOfLicense;

    public Optional<Output<Double>> percentOfLicense() {
        return Optional.ofNullable(this.percentOfLicense);
    }

    @Import(name="priorityThresholds")
    private @Nullable Output<List<ResourcePoolsConfigDefaultPoolAllocationPriorityThresholdArgs>> priorityThresholds;

    public Optional<Output<List<ResourcePoolsConfigDefaultPoolAllocationPriorityThresholdArgs>>> priorityThresholds() {
        return Optional.ofNullable(this.priorityThresholds);
    }

    private ResourcePoolsConfigDefaultPoolAllocationArgs() {}

    private ResourcePoolsConfigDefaultPoolAllocationArgs(ResourcePoolsConfigDefaultPoolAllocationArgs $) {
        this.fixedValues = $.fixedValues;
        this.percentOfLicense = $.percentOfLicense;
        this.priorityThresholds = $.priorityThresholds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePoolsConfigDefaultPoolAllocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePoolsConfigDefaultPoolAllocationArgs $;

        public Builder() {
            $ = new ResourcePoolsConfigDefaultPoolAllocationArgs();
        }

        public Builder(ResourcePoolsConfigDefaultPoolAllocationArgs defaults) {
            $ = new ResourcePoolsConfigDefaultPoolAllocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder fixedValues(@Nullable Output<List<ResourcePoolsConfigDefaultPoolAllocationFixedValueArgs>> fixedValues) {
            $.fixedValues = fixedValues;
            return this;
        }

        public Builder fixedValues(List<ResourcePoolsConfigDefaultPoolAllocationFixedValueArgs> fixedValues) {
            return fixedValues(Output.of(fixedValues));
        }

        public Builder fixedValues(ResourcePoolsConfigDefaultPoolAllocationFixedValueArgs... fixedValues) {
            return fixedValues(List.of(fixedValues));
        }

        public Builder percentOfLicense(@Nullable Output<Double> percentOfLicense) {
            $.percentOfLicense = percentOfLicense;
            return this;
        }

        public Builder percentOfLicense(Double percentOfLicense) {
            return percentOfLicense(Output.of(percentOfLicense));
        }

        public Builder priorityThresholds(@Nullable Output<List<ResourcePoolsConfigDefaultPoolAllocationPriorityThresholdArgs>> priorityThresholds) {
            $.priorityThresholds = priorityThresholds;
            return this;
        }

        public Builder priorityThresholds(List<ResourcePoolsConfigDefaultPoolAllocationPriorityThresholdArgs> priorityThresholds) {
            return priorityThresholds(Output.of(priorityThresholds));
        }

        public Builder priorityThresholds(ResourcePoolsConfigDefaultPoolAllocationPriorityThresholdArgs... priorityThresholds) {
            return priorityThresholds(List.of(priorityThresholds));
        }

        public ResourcePoolsConfigDefaultPoolAllocationArgs build() {
            return $;
        }
    }

}
