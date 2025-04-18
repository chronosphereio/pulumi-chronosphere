// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SLOSignalGrouping {
    private @Nullable List<String> labelNames;
    private @Nullable Boolean signalPerSeries;

    private SLOSignalGrouping() {}
    public List<String> labelNames() {
        return this.labelNames == null ? List.of() : this.labelNames;
    }
    public Optional<Boolean> signalPerSeries() {
        return Optional.ofNullable(this.signalPerSeries);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SLOSignalGrouping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> labelNames;
        private @Nullable Boolean signalPerSeries;
        public Builder() {}
        public Builder(SLOSignalGrouping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelNames = defaults.labelNames;
    	      this.signalPerSeries = defaults.signalPerSeries;
        }

        @CustomType.Setter
        public Builder labelNames(@Nullable List<String> labelNames) {
            this.labelNames = labelNames;
            return this;
        }
        public Builder labelNames(String... labelNames) {
            return labelNames(List.of(labelNames));
        }
        @CustomType.Setter
        public Builder signalPerSeries(@Nullable Boolean signalPerSeries) {
            this.signalPerSeries = signalPerSeries;
            return this;
        }
        public SLOSignalGrouping build() {
            final var o = new SLOSignalGrouping();
            o.labelNames = labelNames;
            o.signalPerSeries = signalPerSeries;
            return o;
        }
    }
}
