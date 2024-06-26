// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TraceTailSamplingRulesRuleFilterSpanTagNumericValue {
    private String comparison;
    private Double value;

    private TraceTailSamplingRulesRuleFilterSpanTagNumericValue() {}
    public String comparison() {
        return this.comparison;
    }
    public Double value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TraceTailSamplingRulesRuleFilterSpanTagNumericValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comparison;
        private Double value;
        public Builder() {}
        public Builder(TraceTailSamplingRulesRuleFilterSpanTagNumericValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder comparison(String comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }
        @CustomType.Setter
        public Builder value(Double value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public TraceTailSamplingRulesRuleFilterSpanTagNumericValue build() {
            final var o = new TraceTailSamplingRulesRuleFilterSpanTagNumericValue();
            o.comparison = comparison;
            o.value = value;
            return o;
        }
    }
}
