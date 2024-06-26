// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TraceMetricsRuleGroupByKey {
    private @Nullable String namedKey;
    private String type;

    private TraceMetricsRuleGroupByKey() {}
    public Optional<String> namedKey() {
        return Optional.ofNullable(this.namedKey);
    }
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TraceMetricsRuleGroupByKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String namedKey;
        private String type;
        public Builder() {}
        public Builder(TraceMetricsRuleGroupByKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namedKey = defaults.namedKey;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder namedKey(@Nullable String namedKey) {
            this.namedKey = namedKey;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TraceMetricsRuleGroupByKey build() {
            final var o = new TraceMetricsRuleGroupByKey();
            o.namedKey = namedKey;
            o.type = type;
            return o;
        }
    }
}
