// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourcePoolsConfigDefaultPoolPriorityThresholdLowPriority {
    private @Nullable Integer fixedValue;
    private @Nullable Double percentOfPoolAllocation;

    private ResourcePoolsConfigDefaultPoolPriorityThresholdLowPriority() {}
    public Optional<Integer> fixedValue() {
        return Optional.ofNullable(this.fixedValue);
    }
    public Optional<Double> percentOfPoolAllocation() {
        return Optional.ofNullable(this.percentOfPoolAllocation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePoolsConfigDefaultPoolPriorityThresholdLowPriority defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer fixedValue;
        private @Nullable Double percentOfPoolAllocation;
        public Builder() {}
        public Builder(ResourcePoolsConfigDefaultPoolPriorityThresholdLowPriority defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixedValue = defaults.fixedValue;
    	      this.percentOfPoolAllocation = defaults.percentOfPoolAllocation;
        }

        @CustomType.Setter
        public Builder fixedValue(@Nullable Integer fixedValue) {
            this.fixedValue = fixedValue;
            return this;
        }
        @CustomType.Setter
        public Builder percentOfPoolAllocation(@Nullable Double percentOfPoolAllocation) {
            this.percentOfPoolAllocation = percentOfPoolAllocation;
            return this;
        }
        public ResourcePoolsConfigDefaultPoolPriorityThresholdLowPriority build() {
            final var o = new ResourcePoolsConfigDefaultPoolPriorityThresholdLowPriority();
            o.fixedValue = fixedValue;
            o.percentOfPoolAllocation = percentOfPoolAllocation;
            return o;
        }
    }
}
