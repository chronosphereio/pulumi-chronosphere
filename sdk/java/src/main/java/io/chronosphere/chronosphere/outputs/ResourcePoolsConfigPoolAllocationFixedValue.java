// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ResourcePoolsConfigPoolAllocationFixedValue {
    private String license;
    private Integer value;

    private ResourcePoolsConfigPoolAllocationFixedValue() {}
    public String license() {
        return this.license;
    }
    public Integer value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePoolsConfigPoolAllocationFixedValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String license;
        private Integer value;
        public Builder() {}
        public Builder(ResourcePoolsConfigPoolAllocationFixedValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.license = defaults.license;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder license(String license) {
            this.license = Objects.requireNonNull(license);
            return this;
        }
        @CustomType.Setter
        public Builder value(Integer value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ResourcePoolsConfigPoolAllocationFixedValue build() {
            final var o = new ResourcePoolsConfigPoolAllocationFixedValue();
            o.license = license;
            o.value = value;
            return o;
        }
    }
}
