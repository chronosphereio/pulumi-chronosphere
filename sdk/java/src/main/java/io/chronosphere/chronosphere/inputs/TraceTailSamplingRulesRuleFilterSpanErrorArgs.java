// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class TraceTailSamplingRulesRuleFilterSpanErrorArgs extends com.pulumi.resources.ResourceArgs {

    public static final TraceTailSamplingRulesRuleFilterSpanErrorArgs Empty = new TraceTailSamplingRulesRuleFilterSpanErrorArgs();

    @Import(name="value", required=true)
    private Output<Boolean> value;

    public Output<Boolean> value() {
        return this.value;
    }

    private TraceTailSamplingRulesRuleFilterSpanErrorArgs() {}

    private TraceTailSamplingRulesRuleFilterSpanErrorArgs(TraceTailSamplingRulesRuleFilterSpanErrorArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TraceTailSamplingRulesRuleFilterSpanErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TraceTailSamplingRulesRuleFilterSpanErrorArgs $;

        public Builder() {
            $ = new TraceTailSamplingRulesRuleFilterSpanErrorArgs();
        }

        public Builder(TraceTailSamplingRulesRuleFilterSpanErrorArgs defaults) {
            $ = new TraceTailSamplingRulesRuleFilterSpanErrorArgs(Objects.requireNonNull(defaults));
        }

        public Builder value(Output<Boolean> value) {
            $.value = value;
            return this;
        }

        public Builder value(Boolean value) {
            return value(Output.of(value));
        }

        public TraceTailSamplingRulesRuleFilterSpanErrorArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
