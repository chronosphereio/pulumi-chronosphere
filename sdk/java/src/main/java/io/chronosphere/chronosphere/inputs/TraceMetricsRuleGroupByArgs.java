// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.TraceMetricsRuleGroupByKeyArgs;
import java.lang.String;
import java.util.Objects;


public final class TraceMetricsRuleGroupByArgs extends com.pulumi.resources.ResourceArgs {

    public static final TraceMetricsRuleGroupByArgs Empty = new TraceMetricsRuleGroupByArgs();

    @Import(name="key", required=true)
    private Output<TraceMetricsRuleGroupByKeyArgs> key;

    public Output<TraceMetricsRuleGroupByKeyArgs> key() {
        return this.key;
    }

    @Import(name="label", required=true)
    private Output<String> label;

    public Output<String> label() {
        return this.label;
    }

    private TraceMetricsRuleGroupByArgs() {}

    private TraceMetricsRuleGroupByArgs(TraceMetricsRuleGroupByArgs $) {
        this.key = $.key;
        this.label = $.label;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TraceMetricsRuleGroupByArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TraceMetricsRuleGroupByArgs $;

        public Builder() {
            $ = new TraceMetricsRuleGroupByArgs();
        }

        public Builder(TraceMetricsRuleGroupByArgs defaults) {
            $ = new TraceMetricsRuleGroupByArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(Output<TraceMetricsRuleGroupByKeyArgs> key) {
            $.key = key;
            return this;
        }

        public Builder key(TraceMetricsRuleGroupByKeyArgs key) {
            return key(Output.of(key));
        }

        public Builder label(Output<String> label) {
            $.label = label;
            return this;
        }

        public Builder label(String label) {
            return label(Output.of(label));
        }

        public TraceMetricsRuleGroupByArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.label = Objects.requireNonNull($.label, "expected parameter 'label' to be non-null");
            return $;
        }
    }

}
