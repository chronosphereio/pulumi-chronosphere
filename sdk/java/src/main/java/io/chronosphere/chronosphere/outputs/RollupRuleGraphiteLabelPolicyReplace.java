// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class RollupRuleGraphiteLabelPolicyReplace {
    private String name;
    private String newValue;

    private RollupRuleGraphiteLabelPolicyReplace() {}
    public String name() {
        return this.name;
    }
    public String newValue() {
        return this.newValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollupRuleGraphiteLabelPolicyReplace defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String name;
        private String newValue;
        public Builder() {}
        public Builder(RollupRuleGraphiteLabelPolicyReplace defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.newValue = defaults.newValue;
        }

        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder newValue(String newValue) {
            this.newValue = Objects.requireNonNull(newValue);
            return this;
        }
        public RollupRuleGraphiteLabelPolicyReplace build() {
            final var o = new RollupRuleGraphiteLabelPolicyReplace();
            o.name = name;
            o.newValue = newValue;
            return o;
        }
    }
}
