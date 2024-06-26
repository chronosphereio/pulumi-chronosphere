// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import io.chronosphere.chronosphere.outputs.TraceTailSamplingRulesRuleFilterSpan;
import io.chronosphere.chronosphere.outputs.TraceTailSamplingRulesRuleFilterTrace;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TraceTailSamplingRulesRuleFilter {
    private @Nullable List<TraceTailSamplingRulesRuleFilterSpan> spans;
    private @Nullable TraceTailSamplingRulesRuleFilterTrace trace;

    private TraceTailSamplingRulesRuleFilter() {}
    public List<TraceTailSamplingRulesRuleFilterSpan> spans() {
        return this.spans == null ? List.of() : this.spans;
    }
    public Optional<TraceTailSamplingRulesRuleFilterTrace> trace() {
        return Optional.ofNullable(this.trace);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TraceTailSamplingRulesRuleFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<TraceTailSamplingRulesRuleFilterSpan> spans;
        private @Nullable TraceTailSamplingRulesRuleFilterTrace trace;
        public Builder() {}
        public Builder(TraceTailSamplingRulesRuleFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spans = defaults.spans;
    	      this.trace = defaults.trace;
        }

        @CustomType.Setter
        public Builder spans(@Nullable List<TraceTailSamplingRulesRuleFilterSpan> spans) {
            this.spans = spans;
            return this;
        }
        public Builder spans(TraceTailSamplingRulesRuleFilterSpan... spans) {
            return spans(List.of(spans));
        }
        @CustomType.Setter
        public Builder trace(@Nullable TraceTailSamplingRulesRuleFilterTrace trace) {
            this.trace = trace;
            return this;
        }
        public TraceTailSamplingRulesRuleFilter build() {
            final var o = new TraceTailSamplingRulesRuleFilter();
            o.spans = spans;
            o.trace = trace;
            return o;
        }
    }
}
