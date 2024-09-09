// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanDurationArgs;
import io.chronosphere.chronosphere.inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs;
import io.chronosphere.chronosphere.inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanOperationArgs;
import io.chronosphere.chronosphere.inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs;
import io.chronosphere.chronosphere.inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentServiceArgs;
import io.chronosphere.chronosphere.inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanServiceArgs;
import io.chronosphere.chronosphere.inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs;
import io.chronosphere.chronosphere.inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs Empty = new DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs();

    @Import(name="duration")
    private @Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanDurationArgs> duration;

    public Optional<Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanDurationArgs>> duration() {
        return Optional.ofNullable(this.duration);
    }

    @Import(name="error")
    private @Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs> error;

    public Optional<Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs>> error() {
        return Optional.ofNullable(this.error);
    }

    @Import(name="matchType")
    private @Nullable Output<String> matchType;

    public Optional<Output<String>> matchType() {
        return Optional.ofNullable(this.matchType);
    }

    @Import(name="operation")
    private @Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanOperationArgs> operation;

    public Optional<Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanOperationArgs>> operation() {
        return Optional.ofNullable(this.operation);
    }

    @Import(name="parentOperation")
    private @Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs> parentOperation;

    public Optional<Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs>> parentOperation() {
        return Optional.ofNullable(this.parentOperation);
    }

    @Import(name="parentService")
    private @Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanParentServiceArgs> parentService;

    public Optional<Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanParentServiceArgs>> parentService() {
        return Optional.ofNullable(this.parentService);
    }

    @Import(name="service")
    private @Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanServiceArgs> service;

    public Optional<Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanServiceArgs>> service() {
        return Optional.ofNullable(this.service);
    }

    @Import(name="spanCount")
    private @Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs> spanCount;

    public Optional<Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs>> spanCount() {
        return Optional.ofNullable(this.spanCount);
    }

    @Import(name="tags")
    private @Nullable Output<List<DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs>> tags;

    public Optional<Output<List<DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs() {}

    private DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs(DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs $) {
        this.duration = $.duration;
        this.error = $.error;
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
    public static Builder builder(DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs $;

        public Builder() {
            $ = new DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs();
        }

        public Builder(DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs defaults) {
            $ = new DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs(Objects.requireNonNull(defaults));
        }

        public Builder duration(@Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanDurationArgs> duration) {
            $.duration = duration;
            return this;
        }

        public Builder duration(DatasetConfigurationTraceDatasetMatchCriteriaSpanDurationArgs duration) {
            return duration(Output.of(duration));
        }

        public Builder error(@Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs> error) {
            $.error = error;
            return this;
        }

        public Builder error(DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs error) {
            return error(Output.of(error));
        }

        public Builder matchType(@Nullable Output<String> matchType) {
            $.matchType = matchType;
            return this;
        }

        public Builder matchType(String matchType) {
            return matchType(Output.of(matchType));
        }

        public Builder operation(@Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanOperationArgs> operation) {
            $.operation = operation;
            return this;
        }

        public Builder operation(DatasetConfigurationTraceDatasetMatchCriteriaSpanOperationArgs operation) {
            return operation(Output.of(operation));
        }

        public Builder parentOperation(@Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs> parentOperation) {
            $.parentOperation = parentOperation;
            return this;
        }

        public Builder parentOperation(DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs parentOperation) {
            return parentOperation(Output.of(parentOperation));
        }

        public Builder parentService(@Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanParentServiceArgs> parentService) {
            $.parentService = parentService;
            return this;
        }

        public Builder parentService(DatasetConfigurationTraceDatasetMatchCriteriaSpanParentServiceArgs parentService) {
            return parentService(Output.of(parentService));
        }

        public Builder service(@Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanServiceArgs> service) {
            $.service = service;
            return this;
        }

        public Builder service(DatasetConfigurationTraceDatasetMatchCriteriaSpanServiceArgs service) {
            return service(Output.of(service));
        }

        public Builder spanCount(@Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs> spanCount) {
            $.spanCount = spanCount;
            return this;
        }

        public Builder spanCount(DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs spanCount) {
            return spanCount(Output.of(spanCount));
        }

        public Builder tags(@Nullable Output<List<DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs... tags) {
            return tags(List.of(tags));
        }

        public DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs build() {
            return $;
        }
    }

}
