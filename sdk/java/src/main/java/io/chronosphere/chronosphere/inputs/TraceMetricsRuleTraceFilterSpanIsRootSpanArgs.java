// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class TraceMetricsRuleTraceFilterSpanIsRootSpanArgs extends com.pulumi.resources.ResourceArgs {

    public static final TraceMetricsRuleTraceFilterSpanIsRootSpanArgs Empty = new TraceMetricsRuleTraceFilterSpanIsRootSpanArgs();

    @Import(name="value", required=true)
    private Output<Boolean> value;

    public Output<Boolean> value() {
        return this.value;
    }

    private TraceMetricsRuleTraceFilterSpanIsRootSpanArgs() {}

    private TraceMetricsRuleTraceFilterSpanIsRootSpanArgs(TraceMetricsRuleTraceFilterSpanIsRootSpanArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TraceMetricsRuleTraceFilterSpanIsRootSpanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TraceMetricsRuleTraceFilterSpanIsRootSpanArgs $;

        public Builder() {
            $ = new TraceMetricsRuleTraceFilterSpanIsRootSpanArgs();
        }

        public Builder(TraceMetricsRuleTraceFilterSpanIsRootSpanArgs defaults) {
            $ = new TraceMetricsRuleTraceFilterSpanIsRootSpanArgs(Objects.requireNonNull(defaults));
        }

        public Builder value(Output<Boolean> value) {
            $.value = value;
            return this;
        }

        public Builder value(Boolean value) {
            return value(Output.of(value));
        }

        public TraceMetricsRuleTraceFilterSpanIsRootSpanArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
