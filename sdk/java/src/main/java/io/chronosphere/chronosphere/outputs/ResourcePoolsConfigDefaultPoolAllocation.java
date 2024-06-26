// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.util.Objects;

@CustomType
public final class ResourcePoolsConfigDefaultPoolAllocation {
    private Double percentOfLicense;

    private ResourcePoolsConfigDefaultPoolAllocation() {}
    public Double percentOfLicense() {
        return this.percentOfLicense;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePoolsConfigDefaultPoolAllocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Double percentOfLicense;
        public Builder() {}
        public Builder(ResourcePoolsConfigDefaultPoolAllocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percentOfLicense = defaults.percentOfLicense;
        }

        @CustomType.Setter
        public Builder percentOfLicense(Double percentOfLicense) {
            this.percentOfLicense = Objects.requireNonNull(percentOfLicense);
            return this;
        }
        public ResourcePoolsConfigDefaultPoolAllocation build() {
            final var o = new ResourcePoolsConfigDefaultPoolAllocation();
            o.percentOfLicense = percentOfLicense;
            return o;
        }
    }
}
