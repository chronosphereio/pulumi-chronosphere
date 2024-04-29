// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MappingRuleStoragePolicy {
    private String resolution;
    private String retention;

    private MappingRuleStoragePolicy() {}
    public String resolution() {
        return this.resolution;
    }
    public String retention() {
        return this.retention;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MappingRuleStoragePolicy defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String resolution;
        private String retention;
        public Builder() {}
        public Builder(MappingRuleStoragePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resolution = defaults.resolution;
    	      this.retention = defaults.retention;
        }

        @CustomType.Setter
        public Builder resolution(String resolution) {
            this.resolution = Objects.requireNonNull(resolution);
            return this;
        }
        @CustomType.Setter
        public Builder retention(String retention) {
            this.retention = Objects.requireNonNull(retention);
            return this;
        }
        public MappingRuleStoragePolicy build() {
            final var o = new MappingRuleStoragePolicy();
            o.resolution = resolution;
            o.retention = retention;
            return o;
        }
    }
}