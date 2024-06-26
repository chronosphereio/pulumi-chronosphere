// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.TraceTailSamplingRulesRuleFilterSpanTagNumericValueArgs;
import io.chronosphere.chronosphere.inputs.TraceTailSamplingRulesRuleFilterSpanTagValueArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TraceTailSamplingRulesRuleFilterSpanTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final TraceTailSamplingRulesRuleFilterSpanTagArgs Empty = new TraceTailSamplingRulesRuleFilterSpanTagArgs();

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="numericValue")
    private @Nullable Output<TraceTailSamplingRulesRuleFilterSpanTagNumericValueArgs> numericValue;

    public Optional<Output<TraceTailSamplingRulesRuleFilterSpanTagNumericValueArgs>> numericValue() {
        return Optional.ofNullable(this.numericValue);
    }

    @Import(name="value")
    private @Nullable Output<TraceTailSamplingRulesRuleFilterSpanTagValueArgs> value;

    public Optional<Output<TraceTailSamplingRulesRuleFilterSpanTagValueArgs>> value() {
        return Optional.ofNullable(this.value);
    }

    private TraceTailSamplingRulesRuleFilterSpanTagArgs() {}

    private TraceTailSamplingRulesRuleFilterSpanTagArgs(TraceTailSamplingRulesRuleFilterSpanTagArgs $) {
        this.key = $.key;
        this.numericValue = $.numericValue;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TraceTailSamplingRulesRuleFilterSpanTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TraceTailSamplingRulesRuleFilterSpanTagArgs $;

        public Builder() {
            $ = new TraceTailSamplingRulesRuleFilterSpanTagArgs();
        }

        public Builder(TraceTailSamplingRulesRuleFilterSpanTagArgs defaults) {
            $ = new TraceTailSamplingRulesRuleFilterSpanTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder numericValue(@Nullable Output<TraceTailSamplingRulesRuleFilterSpanTagNumericValueArgs> numericValue) {
            $.numericValue = numericValue;
            return this;
        }

        public Builder numericValue(TraceTailSamplingRulesRuleFilterSpanTagNumericValueArgs numericValue) {
            return numericValue(Output.of(numericValue));
        }

        public Builder value(@Nullable Output<TraceTailSamplingRulesRuleFilterSpanTagValueArgs> value) {
            $.value = value;
            return this;
        }

        public Builder value(TraceTailSamplingRulesRuleFilterSpanTagValueArgs value) {
            return value(Output.of(value));
        }

        public TraceTailSamplingRulesRuleFilterSpanTagArgs build() {
            return $;
        }
    }

}
