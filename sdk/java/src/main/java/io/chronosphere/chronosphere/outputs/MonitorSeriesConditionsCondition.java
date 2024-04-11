// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MonitorSeriesConditionsCondition {
    private String op;
    private @Nullable String resolveSustain;
    private String severity;
    private @Nullable String sustain;
    private @Nullable Double value;

    private MonitorSeriesConditionsCondition() {}
    public String op() {
        return this.op;
    }
    public Optional<String> resolveSustain() {
        return Optional.ofNullable(this.resolveSustain);
    }
    public String severity() {
        return this.severity;
    }
    public Optional<String> sustain() {
        return Optional.ofNullable(this.sustain);
    }
    public Optional<Double> value() {
        return Optional.ofNullable(this.value);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorSeriesConditionsCondition defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String op;
        private @Nullable String resolveSustain;
        private String severity;
        private @Nullable String sustain;
        private @Nullable Double value;
        public Builder() {}
        public Builder(MonitorSeriesConditionsCondition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.op = defaults.op;
    	      this.resolveSustain = defaults.resolveSustain;
    	      this.severity = defaults.severity;
    	      this.sustain = defaults.sustain;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder op(String op) {
            this.op = Objects.requireNonNull(op);
            return this;
        }
        @CustomType.Setter
        public Builder resolveSustain(@Nullable String resolveSustain) {
            this.resolveSustain = resolveSustain;
            return this;
        }
        @CustomType.Setter
        public Builder severity(String severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }
        @CustomType.Setter
        public Builder sustain(@Nullable String sustain) {
            this.sustain = sustain;
            return this;
        }
        @CustomType.Setter
        public Builder value(@Nullable Double value) {
            this.value = value;
            return this;
        }
        public MonitorSeriesConditionsCondition build() {
            final var o = new MonitorSeriesConditionsCondition();
            o.op = op;
            o.resolveSustain = resolveSustain;
            o.severity = severity;
            o.sustain = sustain;
            o.value = value;
            return o;
        }
    }
}
