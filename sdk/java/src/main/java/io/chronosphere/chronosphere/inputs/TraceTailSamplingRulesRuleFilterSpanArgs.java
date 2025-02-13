// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.TraceTailSamplingRulesRuleFilterSpanDurationArgs;
import io.chronosphere.chronosphere.inputs.TraceTailSamplingRulesRuleFilterSpanErrorArgs;
import io.chronosphere.chronosphere.inputs.TraceTailSamplingRulesRuleFilterSpanIsRootSpanArgs;
import io.chronosphere.chronosphere.inputs.TraceTailSamplingRulesRuleFilterSpanOperationArgs;
import io.chronosphere.chronosphere.inputs.TraceTailSamplingRulesRuleFilterSpanParentOperationArgs;
import io.chronosphere.chronosphere.inputs.TraceTailSamplingRulesRuleFilterSpanParentServiceArgs;
import io.chronosphere.chronosphere.inputs.TraceTailSamplingRulesRuleFilterSpanServiceArgs;
import io.chronosphere.chronosphere.inputs.TraceTailSamplingRulesRuleFilterSpanSpanCountArgs;
import io.chronosphere.chronosphere.inputs.TraceTailSamplingRulesRuleFilterSpanTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TraceTailSamplingRulesRuleFilterSpanArgs extends com.pulumi.resources.ResourceArgs {

    public static final TraceTailSamplingRulesRuleFilterSpanArgs Empty = new TraceTailSamplingRulesRuleFilterSpanArgs();

    @Import(name="duration")
    private @Nullable Output<TraceTailSamplingRulesRuleFilterSpanDurationArgs> duration;

    public Optional<Output<TraceTailSamplingRulesRuleFilterSpanDurationArgs>> duration() {
        return Optional.ofNullable(this.duration);
    }

    @Import(name="error")
    private @Nullable Output<TraceTailSamplingRulesRuleFilterSpanErrorArgs> error;

    public Optional<Output<TraceTailSamplingRulesRuleFilterSpanErrorArgs>> error() {
        return Optional.ofNullable(this.error);
    }

    @Import(name="isRootSpan")
    private @Nullable Output<TraceTailSamplingRulesRuleFilterSpanIsRootSpanArgs> isRootSpan;

    public Optional<Output<TraceTailSamplingRulesRuleFilterSpanIsRootSpanArgs>> isRootSpan() {
        return Optional.ofNullable(this.isRootSpan);
    }

    @Import(name="matchType")
    private @Nullable Output<String> matchType;

    public Optional<Output<String>> matchType() {
        return Optional.ofNullable(this.matchType);
    }

    @Import(name="operation")
    private @Nullable Output<TraceTailSamplingRulesRuleFilterSpanOperationArgs> operation;

    public Optional<Output<TraceTailSamplingRulesRuleFilterSpanOperationArgs>> operation() {
        return Optional.ofNullable(this.operation);
    }

    @Import(name="parentOperation")
    private @Nullable Output<TraceTailSamplingRulesRuleFilterSpanParentOperationArgs> parentOperation;

    public Optional<Output<TraceTailSamplingRulesRuleFilterSpanParentOperationArgs>> parentOperation() {
        return Optional.ofNullable(this.parentOperation);
    }

    @Import(name="parentService")
    private @Nullable Output<TraceTailSamplingRulesRuleFilterSpanParentServiceArgs> parentService;

    public Optional<Output<TraceTailSamplingRulesRuleFilterSpanParentServiceArgs>> parentService() {
        return Optional.ofNullable(this.parentService);
    }

    @Import(name="service")
    private @Nullable Output<TraceTailSamplingRulesRuleFilterSpanServiceArgs> service;

    public Optional<Output<TraceTailSamplingRulesRuleFilterSpanServiceArgs>> service() {
        return Optional.ofNullable(this.service);
    }

    @Import(name="spanCount")
    private @Nullable Output<TraceTailSamplingRulesRuleFilterSpanSpanCountArgs> spanCount;

    public Optional<Output<TraceTailSamplingRulesRuleFilterSpanSpanCountArgs>> spanCount() {
        return Optional.ofNullable(this.spanCount);
    }

    @Import(name="tags")
    private @Nullable Output<List<TraceTailSamplingRulesRuleFilterSpanTagArgs>> tags;

    public Optional<Output<List<TraceTailSamplingRulesRuleFilterSpanTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private TraceTailSamplingRulesRuleFilterSpanArgs() {}

    private TraceTailSamplingRulesRuleFilterSpanArgs(TraceTailSamplingRulesRuleFilterSpanArgs $) {
        this.duration = $.duration;
        this.error = $.error;
        this.isRootSpan = $.isRootSpan;
        this.matchType = $.matchType;
        this.operation = $.operation;
        this.parentOperation = $.parentOperation;
        this.parentService = $.parentService;
        this.service = $.service;
        this.spanCount = $.spanCount;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TraceTailSamplingRulesRuleFilterSpanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TraceTailSamplingRulesRuleFilterSpanArgs $;

        public Builder() {
            $ = new TraceTailSamplingRulesRuleFilterSpanArgs();
        }

        public Builder(TraceTailSamplingRulesRuleFilterSpanArgs defaults) {
            $ = new TraceTailSamplingRulesRuleFilterSpanArgs(Objects.requireNonNull(defaults));
        }

        public Builder duration(@Nullable Output<TraceTailSamplingRulesRuleFilterSpanDurationArgs> duration) {
            $.duration = duration;
            return this;
        }

        public Builder duration(TraceTailSamplingRulesRuleFilterSpanDurationArgs duration) {
            return duration(Output.of(duration));
        }

        public Builder error(@Nullable Output<TraceTailSamplingRulesRuleFilterSpanErrorArgs> error) {
            $.error = error;
            return this;
        }

        public Builder error(TraceTailSamplingRulesRuleFilterSpanErrorArgs error) {
            return error(Output.of(error));
        }

        public Builder isRootSpan(@Nullable Output<TraceTailSamplingRulesRuleFilterSpanIsRootSpanArgs> isRootSpan) {
            $.isRootSpan = isRootSpan;
            return this;
        }

        public Builder isRootSpan(TraceTailSamplingRulesRuleFilterSpanIsRootSpanArgs isRootSpan) {
            return isRootSpan(Output.of(isRootSpan));
        }

        public Builder matchType(@Nullable Output<String> matchType) {
            $.matchType = matchType;
            return this;
        }

        public Builder matchType(String matchType) {
            return matchType(Output.of(matchType));
        }

        public Builder operation(@Nullable Output<TraceTailSamplingRulesRuleFilterSpanOperationArgs> operation) {
            $.operation = operation;
            return this;
        }

        public Builder operation(TraceTailSamplingRulesRuleFilterSpanOperationArgs operation) {
            return operation(Output.of(operation));
        }

        public Builder parentOperation(@Nullable Output<TraceTailSamplingRulesRuleFilterSpanParentOperationArgs> parentOperation) {
            $.parentOperation = parentOperation;
            return this;
        }

        public Builder parentOperation(TraceTailSamplingRulesRuleFilterSpanParentOperationArgs parentOperation) {
            return parentOperation(Output.of(parentOperation));
        }

        public Builder parentService(@Nullable Output<TraceTailSamplingRulesRuleFilterSpanParentServiceArgs> parentService) {
            $.parentService = parentService;
            return this;
        }

        public Builder parentService(TraceTailSamplingRulesRuleFilterSpanParentServiceArgs parentService) {
            return parentService(Output.of(parentService));
        }

        public Builder service(@Nullable Output<TraceTailSamplingRulesRuleFilterSpanServiceArgs> service) {
            $.service = service;
            return this;
        }

        public Builder service(TraceTailSamplingRulesRuleFilterSpanServiceArgs service) {
            return service(Output.of(service));
        }

        public Builder spanCount(@Nullable Output<TraceTailSamplingRulesRuleFilterSpanSpanCountArgs> spanCount) {
            $.spanCount = spanCount;
            return this;
        }

        public Builder spanCount(TraceTailSamplingRulesRuleFilterSpanSpanCountArgs spanCount) {
            return spanCount(Output.of(spanCount));
        }

        public Builder tags(@Nullable Output<List<TraceTailSamplingRulesRuleFilterSpanTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<TraceTailSamplingRulesRuleFilterSpanTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(TraceTailSamplingRulesRuleFilterSpanTagArgs... tags) {
            return tags(List.of(tags));
        }

        public TraceTailSamplingRulesRuleFilterSpanArgs build() {
            return $;
        }
    }

}
