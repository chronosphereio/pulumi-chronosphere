// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TraceTailSamplingRulesRuleFilterSpanService {
    private @Nullable String match;
    private String value;

    private TraceTailSamplingRulesRuleFilterSpanService() {}
    public Optional<String> match() {
        return Optional.ofNullable(this.match);
    }
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TraceTailSamplingRulesRuleFilterSpanService defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String match;
        private String value;
        public Builder() {}
        public Builder(TraceTailSamplingRulesRuleFilterSpanService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.match = defaults.match;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder match(@Nullable String match) {
            this.match = match;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public TraceTailSamplingRulesRuleFilterSpanService build() {
            final var o = new TraceTailSamplingRulesRuleFilterSpanService();
            o.match = match;
            o.value = value;
            return o;
        }
    }
}
