// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import io.chronosphere.chronosphere.outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanDuration;
import io.chronosphere.chronosphere.outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanError;
import io.chronosphere.chronosphere.outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpan;
import io.chronosphere.chronosphere.outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanOperation;
import io.chronosphere.chronosphere.outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperation;
import io.chronosphere.chronosphere.outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentService;
import io.chronosphere.chronosphere.outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanService;
import io.chronosphere.chronosphere.outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCount;
import io.chronosphere.chronosphere.outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetConfigurationTraceDatasetMatchCriteriaSpan {
    private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanDuration duration;
    private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanError error;
    private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpan isRootSpan;
    private @Nullable String matchType;
    private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanOperation operation;
    private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperation parentOperation;
    private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanParentService parentService;
    private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanService service;
    private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCount spanCount;
    private @Nullable List<DatasetConfigurationTraceDatasetMatchCriteriaSpanTag> tags;

    private DatasetConfigurationTraceDatasetMatchCriteriaSpan() {}
    public Optional<DatasetConfigurationTraceDatasetMatchCriteriaSpanDuration> duration() {
        return Optional.ofNullable(this.duration);
    }
    public Optional<DatasetConfigurationTraceDatasetMatchCriteriaSpanError> error() {
        return Optional.ofNullable(this.error);
    }
    public Optional<DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpan> isRootSpan() {
        return Optional.ofNullable(this.isRootSpan);
    }
    public Optional<String> matchType() {
        return Optional.ofNullable(this.matchType);
    }
    public Optional<DatasetConfigurationTraceDatasetMatchCriteriaSpanOperation> operation() {
        return Optional.ofNullable(this.operation);
    }
    public Optional<DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperation> parentOperation() {
        return Optional.ofNullable(this.parentOperation);
    }
    public Optional<DatasetConfigurationTraceDatasetMatchCriteriaSpanParentService> parentService() {
        return Optional.ofNullable(this.parentService);
    }
    public Optional<DatasetConfigurationTraceDatasetMatchCriteriaSpanService> service() {
        return Optional.ofNullable(this.service);
    }
    public Optional<DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCount> spanCount() {
        return Optional.ofNullable(this.spanCount);
    }
    public List<DatasetConfigurationTraceDatasetMatchCriteriaSpanTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetConfigurationTraceDatasetMatchCriteriaSpan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanDuration duration;
        private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanError error;
        private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpan isRootSpan;
        private @Nullable String matchType;
        private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanOperation operation;
        private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperation parentOperation;
        private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanParentService parentService;
        private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanService service;
        private @Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCount spanCount;
        private @Nullable List<DatasetConfigurationTraceDatasetMatchCriteriaSpanTag> tags;
        public Builder() {}
        public Builder(DatasetConfigurationTraceDatasetMatchCriteriaSpan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.error = defaults.error;
    	      this.isRootSpan = defaults.isRootSpan;
    	      this.matchType = defaults.matchType;
    	      this.operation = defaults.operation;
    	      this.parentOperation = defaults.parentOperation;
    	      this.parentService = defaults.parentService;
    	      this.service = defaults.service;
    	      this.spanCount = defaults.spanCount;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder duration(@Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanDuration duration) {
            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder error(@Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanError error) {
            this.error = error;
            return this;
        }
        @CustomType.Setter
        public Builder isRootSpan(@Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpan isRootSpan) {
            this.isRootSpan = isRootSpan;
            return this;
        }
        @CustomType.Setter
        public Builder matchType(@Nullable String matchType) {
            this.matchType = matchType;
            return this;
        }
        @CustomType.Setter
        public Builder operation(@Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanOperation operation) {
            this.operation = operation;
            return this;
        }
        @CustomType.Setter
        public Builder parentOperation(@Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperation parentOperation) {
            this.parentOperation = parentOperation;
            return this;
        }
        @CustomType.Setter
        public Builder parentService(@Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanParentService parentService) {
            this.parentService = parentService;
            return this;
        }
        @CustomType.Setter
        public Builder service(@Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanService service) {
            this.service = service;
            return this;
        }
        @CustomType.Setter
        public Builder spanCount(@Nullable DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCount spanCount) {
            this.spanCount = spanCount;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<DatasetConfigurationTraceDatasetMatchCriteriaSpanTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(DatasetConfigurationTraceDatasetMatchCriteriaSpanTag... tags) {
            return tags(List.of(tags));
        }
        public DatasetConfigurationTraceDatasetMatchCriteriaSpan build() {
            final var o = new DatasetConfigurationTraceDatasetMatchCriteriaSpan();
            o.duration = duration;
            o.error = error;
            o.isRootSpan = isRootSpan;
            o.matchType = matchType;
            o.operation = operation;
            o.parentOperation = parentOperation;
            o.parentService = parentService;
            o.service = service;
            o.spanCount = spanCount;
            o.tags = tags;
            return o;
        }
    }
}
