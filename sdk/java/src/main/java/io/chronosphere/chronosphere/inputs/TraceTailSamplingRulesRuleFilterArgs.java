// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.TraceTailSamplingRulesRuleFilterSpanArgs;
import io.chronosphere.chronosphere.inputs.TraceTailSamplingRulesRuleFilterTraceArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TraceTailSamplingRulesRuleFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final TraceTailSamplingRulesRuleFilterArgs Empty = new TraceTailSamplingRulesRuleFilterArgs();

    @Import(name="spans")
    private @Nullable Output<List<TraceTailSamplingRulesRuleFilterSpanArgs>> spans;

    public Optional<Output<List<TraceTailSamplingRulesRuleFilterSpanArgs>>> spans() {
        return Optional.ofNullable(this.spans);
    }

    @Import(name="trace")
    private @Nullable Output<TraceTailSamplingRulesRuleFilterTraceArgs> trace;

    public Optional<Output<TraceTailSamplingRulesRuleFilterTraceArgs>> trace() {
        return Optional.ofNullable(this.trace);
    }

    private TraceTailSamplingRulesRuleFilterArgs() {}

    private TraceTailSamplingRulesRuleFilterArgs(TraceTailSamplingRulesRuleFilterArgs $) {
        this.spans = $.spans;
        this.trace = $.trace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TraceTailSamplingRulesRuleFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TraceTailSamplingRulesRuleFilterArgs $;

        public Builder() {
            $ = new TraceTailSamplingRulesRuleFilterArgs();
        }

        public Builder(TraceTailSamplingRulesRuleFilterArgs defaults) {
            $ = new TraceTailSamplingRulesRuleFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder spans(@Nullable Output<List<TraceTailSamplingRulesRuleFilterSpanArgs>> spans) {
            $.spans = spans;
            return this;
        }

        public Builder spans(List<TraceTailSamplingRulesRuleFilterSpanArgs> spans) {
            return spans(Output.of(spans));
        }

        public Builder spans(TraceTailSamplingRulesRuleFilterSpanArgs... spans) {
            return spans(List.of(spans));
        }

        public Builder trace(@Nullable Output<TraceTailSamplingRulesRuleFilterTraceArgs> trace) {
            $.trace = trace;
            return this;
        }

        public Builder trace(TraceTailSamplingRulesRuleFilterTraceArgs trace) {
            return trace(Output.of(trace));
        }

        public TraceTailSamplingRulesRuleFilterArgs build() {
            return $;
        }
    }

}
