// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.TraceMetricsRuleTraceFilterSpanDurationArgs;
import io.chronosphere.chronosphere.inputs.TraceMetricsRuleTraceFilterSpanErrorArgs;
import io.chronosphere.chronosphere.inputs.TraceMetricsRuleTraceFilterSpanIsRootSpanArgs;
import io.chronosphere.chronosphere.inputs.TraceMetricsRuleTraceFilterSpanOperationArgs;
import io.chronosphere.chronosphere.inputs.TraceMetricsRuleTraceFilterSpanParentOperationArgs;
import io.chronosphere.chronosphere.inputs.TraceMetricsRuleTraceFilterSpanParentServiceArgs;
import io.chronosphere.chronosphere.inputs.TraceMetricsRuleTraceFilterSpanServiceArgs;
import io.chronosphere.chronosphere.inputs.TraceMetricsRuleTraceFilterSpanSpanCountArgs;
import io.chronosphere.chronosphere.inputs.TraceMetricsRuleTraceFilterSpanTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TraceMetricsRuleTraceFilterSpanArgs extends com.pulumi.resources.ResourceArgs {

    public static final TraceMetricsRuleTraceFilterSpanArgs Empty = new TraceMetricsRuleTraceFilterSpanArgs();

    @Import(name="duration")
    private @Nullable Output<TraceMetricsRuleTraceFilterSpanDurationArgs> duration;

    public Optional<Output<TraceMetricsRuleTraceFilterSpanDurationArgs>> duration() {
        return Optional.ofNullable(this.duration);
    }

    @Import(name="error")
    private @Nullable Output<TraceMetricsRuleTraceFilterSpanErrorArgs> error;

    public Optional<Output<TraceMetricsRuleTraceFilterSpanErrorArgs>> error() {
        return Optional.ofNullable(this.error);
    }

    @Import(name="isRootSpan")
    private @Nullable Output<TraceMetricsRuleTraceFilterSpanIsRootSpanArgs> isRootSpan;

    public Optional<Output<TraceMetricsRuleTraceFilterSpanIsRootSpanArgs>> isRootSpan() {
        return Optional.ofNullable(this.isRootSpan);
    }

    @Import(name="matchType")
    private @Nullable Output<String> matchType;

    public Optional<Output<String>> matchType() {
        return Optional.ofNullable(this.matchType);
    }

    @Import(name="operation")
    private @Nullable Output<TraceMetricsRuleTraceFilterSpanOperationArgs> operation;

    public Optional<Output<TraceMetricsRuleTraceFilterSpanOperationArgs>> operation() {
        return Optional.ofNullable(this.operation);
    }

    @Import(name="parentOperation")
    private @Nullable Output<TraceMetricsRuleTraceFilterSpanParentOperationArgs> parentOperation;

    public Optional<Output<TraceMetricsRuleTraceFilterSpanParentOperationArgs>> parentOperation() {
        return Optional.ofNullable(this.parentOperation);
    }

    @Import(name="parentService")
    private @Nullable Output<TraceMetricsRuleTraceFilterSpanParentServiceArgs> parentService;

    public Optional<Output<TraceMetricsRuleTraceFilterSpanParentServiceArgs>> parentService() {
        return Optional.ofNullable(this.parentService);
    }

    @Import(name="service")
    private @Nullable Output<TraceMetricsRuleTraceFilterSpanServiceArgs> service;

    public Optional<Output<TraceMetricsRuleTraceFilterSpanServiceArgs>> service() {
        return Optional.ofNullable(this.service);
    }

    @Import(name="spanCount")
    private @Nullable Output<TraceMetricsRuleTraceFilterSpanSpanCountArgs> spanCount;

    public Optional<Output<TraceMetricsRuleTraceFilterSpanSpanCountArgs>> spanCount() {
        return Optional.ofNullable(this.spanCount);
    }

    @Import(name="tags")
    private @Nullable Output<List<TraceMetricsRuleTraceFilterSpanTagArgs>> tags;

    public Optional<Output<List<TraceMetricsRuleTraceFilterSpanTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private TraceMetricsRuleTraceFilterSpanArgs() {}

    private TraceMetricsRuleTraceFilterSpanArgs(TraceMetricsRuleTraceFilterSpanArgs $) {
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
    public static Builder builder(TraceMetricsRuleTraceFilterSpanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TraceMetricsRuleTraceFilterSpanArgs $;

        public Builder() {
            $ = new TraceMetricsRuleTraceFilterSpanArgs();
        }

        public Builder(TraceMetricsRuleTraceFilterSpanArgs defaults) {
            $ = new TraceMetricsRuleTraceFilterSpanArgs(Objects.requireNonNull(defaults));
        }

        public Builder duration(@Nullable Output<TraceMetricsRuleTraceFilterSpanDurationArgs> duration) {
            $.duration = duration;
            return this;
        }

        public Builder duration(TraceMetricsRuleTraceFilterSpanDurationArgs duration) {
            return duration(Output.of(duration));
        }

        public Builder error(@Nullable Output<TraceMetricsRuleTraceFilterSpanErrorArgs> error) {
            $.error = error;
            return this;
        }

        public Builder error(TraceMetricsRuleTraceFilterSpanErrorArgs error) {
            return error(Output.of(error));
        }

        public Builder isRootSpan(@Nullable Output<TraceMetricsRuleTraceFilterSpanIsRootSpanArgs> isRootSpan) {
            $.isRootSpan = isRootSpan;
            return this;
        }

        public Builder isRootSpan(TraceMetricsRuleTraceFilterSpanIsRootSpanArgs isRootSpan) {
            return isRootSpan(Output.of(isRootSpan));
        }

        public Builder matchType(@Nullable Output<String> matchType) {
            $.matchType = matchType;
            return this;
        }

        public Builder matchType(String matchType) {
            return matchType(Output.of(matchType));
        }

        public Builder operation(@Nullable Output<TraceMetricsRuleTraceFilterSpanOperationArgs> operation) {
            $.operation = operation;
            return this;
        }

        public Builder operation(TraceMetricsRuleTraceFilterSpanOperationArgs operation) {
            return operation(Output.of(operation));
        }

        public Builder parentOperation(@Nullable Output<TraceMetricsRuleTraceFilterSpanParentOperationArgs> parentOperation) {
            $.parentOperation = parentOperation;
            return this;
        }

        public Builder parentOperation(TraceMetricsRuleTraceFilterSpanParentOperationArgs parentOperation) {
            return parentOperation(Output.of(parentOperation));
        }

        public Builder parentService(@Nullable Output<TraceMetricsRuleTraceFilterSpanParentServiceArgs> parentService) {
            $.parentService = parentService;
            return this;
        }

        public Builder parentService(TraceMetricsRuleTraceFilterSpanParentServiceArgs parentService) {
            return parentService(Output.of(parentService));
        }

        public Builder service(@Nullable Output<TraceMetricsRuleTraceFilterSpanServiceArgs> service) {
            $.service = service;
            return this;
        }

        public Builder service(TraceMetricsRuleTraceFilterSpanServiceArgs service) {
            return service(Output.of(service));
        }

        public Builder spanCount(@Nullable Output<TraceMetricsRuleTraceFilterSpanSpanCountArgs> spanCount) {
            $.spanCount = spanCount;
            return this;
        }

        public Builder spanCount(TraceMetricsRuleTraceFilterSpanSpanCountArgs spanCount) {
            return spanCount(Output.of(spanCount));
        }

        public Builder tags(@Nullable Output<List<TraceMetricsRuleTraceFilterSpanTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<TraceMetricsRuleTraceFilterSpanTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(TraceMetricsRuleTraceFilterSpanTagArgs... tags) {
            return tags(List.of(tags));
        }

        public TraceMetricsRuleTraceFilterSpanArgs build() {
            return $;
        }
    }

}
