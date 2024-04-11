// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.TraceTailSamplingRulesRuleFilterTraceDurationArgs;
import io.chronosphere.chronosphere.inputs.TraceTailSamplingRulesRuleFilterTraceErrorArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TraceTailSamplingRulesRuleFilterTraceArgs extends com.pulumi.resources.ResourceArgs {

    public static final TraceTailSamplingRulesRuleFilterTraceArgs Empty = new TraceTailSamplingRulesRuleFilterTraceArgs();

    @Import(name="duration")
    private @Nullable Output<TraceTailSamplingRulesRuleFilterTraceDurationArgs> duration;

    public Optional<Output<TraceTailSamplingRulesRuleFilterTraceDurationArgs>> duration() {
        return Optional.ofNullable(this.duration);
    }

    @Import(name="error")
    private @Nullable Output<TraceTailSamplingRulesRuleFilterTraceErrorArgs> error;

    public Optional<Output<TraceTailSamplingRulesRuleFilterTraceErrorArgs>> error() {
        return Optional.ofNullable(this.error);
    }

    private TraceTailSamplingRulesRuleFilterTraceArgs() {}

    private TraceTailSamplingRulesRuleFilterTraceArgs(TraceTailSamplingRulesRuleFilterTraceArgs $) {
        this.duration = $.duration;
        this.error = $.error;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TraceTailSamplingRulesRuleFilterTraceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TraceTailSamplingRulesRuleFilterTraceArgs $;

        public Builder() {
            $ = new TraceTailSamplingRulesRuleFilterTraceArgs();
        }

        public Builder(TraceTailSamplingRulesRuleFilterTraceArgs defaults) {
            $ = new TraceTailSamplingRulesRuleFilterTraceArgs(Objects.requireNonNull(defaults));
        }

        public Builder duration(@Nullable Output<TraceTailSamplingRulesRuleFilterTraceDurationArgs> duration) {
            $.duration = duration;
            return this;
        }

        public Builder duration(TraceTailSamplingRulesRuleFilterTraceDurationArgs duration) {
            return duration(Output.of(duration));
        }

        public Builder error(@Nullable Output<TraceTailSamplingRulesRuleFilterTraceErrorArgs> error) {
            $.error = error;
            return this;
        }

        public Builder error(TraceTailSamplingRulesRuleFilterTraceErrorArgs error) {
            return error(Output.of(error));
        }

        public TraceTailSamplingRulesRuleFilterTraceArgs build() {
            return $;
        }
    }

}
