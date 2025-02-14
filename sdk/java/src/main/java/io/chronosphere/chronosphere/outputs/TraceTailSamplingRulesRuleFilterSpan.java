// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import io.chronosphere.chronosphere.outputs.TraceTailSamplingRulesRuleFilterSpanDuration;
import io.chronosphere.chronosphere.outputs.TraceTailSamplingRulesRuleFilterSpanError;
import io.chronosphere.chronosphere.outputs.TraceTailSamplingRulesRuleFilterSpanIsRootSpan;
import io.chronosphere.chronosphere.outputs.TraceTailSamplingRulesRuleFilterSpanOperation;
import io.chronosphere.chronosphere.outputs.TraceTailSamplingRulesRuleFilterSpanParentOperation;
import io.chronosphere.chronosphere.outputs.TraceTailSamplingRulesRuleFilterSpanParentService;
import io.chronosphere.chronosphere.outputs.TraceTailSamplingRulesRuleFilterSpanService;
import io.chronosphere.chronosphere.outputs.TraceTailSamplingRulesRuleFilterSpanSpanCount;
import io.chronosphere.chronosphere.outputs.TraceTailSamplingRulesRuleFilterSpanTag;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TraceTailSamplingRulesRuleFilterSpan {
    private @Nullable TraceTailSamplingRulesRuleFilterSpanDuration duration;
    private @Nullable TraceTailSamplingRulesRuleFilterSpanError error;
    private @Nullable TraceTailSamplingRulesRuleFilterSpanIsRootSpan isRootSpan;
    private @Nullable String matchType;
    private @Nullable TraceTailSamplingRulesRuleFilterSpanOperation operation;
    private @Nullable TraceTailSamplingRulesRuleFilterSpanParentOperation parentOperation;
    private @Nullable TraceTailSamplingRulesRuleFilterSpanParentService parentService;
    private @Nullable TraceTailSamplingRulesRuleFilterSpanService service;
    private @Nullable TraceTailSamplingRulesRuleFilterSpanSpanCount spanCount;
    private @Nullable List<TraceTailSamplingRulesRuleFilterSpanTag> tags;

    private TraceTailSamplingRulesRuleFilterSpan() {}
    public Optional<TraceTailSamplingRulesRuleFilterSpanDuration> duration() {
        return Optional.ofNullable(this.duration);
    }
    public Optional<TraceTailSamplingRulesRuleFilterSpanError> error() {
        return Optional.ofNullable(this.error);
    }
    public Optional<TraceTailSamplingRulesRuleFilterSpanIsRootSpan> isRootSpan() {
        return Optional.ofNullable(this.isRootSpan);
    }
    public Optional<String> matchType() {
        return Optional.ofNullable(this.matchType);
    }
    public Optional<TraceTailSamplingRulesRuleFilterSpanOperation> operation() {
        return Optional.ofNullable(this.operation);
    }
    public Optional<TraceTailSamplingRulesRuleFilterSpanParentOperation> parentOperation() {
        return Optional.ofNullable(this.parentOperation);
    }
    public Optional<TraceTailSamplingRulesRuleFilterSpanParentService> parentService() {
        return Optional.ofNullable(this.parentService);
    }
    public Optional<TraceTailSamplingRulesRuleFilterSpanService> service() {
        return Optional.ofNullable(this.service);
    }
    public Optional<TraceTailSamplingRulesRuleFilterSpanSpanCount> spanCount() {
        return Optional.ofNullable(this.spanCount);
    }
    public List<TraceTailSamplingRulesRuleFilterSpanTag> tags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TraceTailSamplingRulesRuleFilterSpan defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable TraceTailSamplingRulesRuleFilterSpanDuration duration;
        private @Nullable TraceTailSamplingRulesRuleFilterSpanError error;
        private @Nullable TraceTailSamplingRulesRuleFilterSpanIsRootSpan isRootSpan;
        private @Nullable String matchType;
        private @Nullable TraceTailSamplingRulesRuleFilterSpanOperation operation;
        private @Nullable TraceTailSamplingRulesRuleFilterSpanParentOperation parentOperation;
        private @Nullable TraceTailSamplingRulesRuleFilterSpanParentService parentService;
        private @Nullable TraceTailSamplingRulesRuleFilterSpanService service;
        private @Nullable TraceTailSamplingRulesRuleFilterSpanSpanCount spanCount;
        private @Nullable List<TraceTailSamplingRulesRuleFilterSpanTag> tags;
        public Builder() {}
        public Builder(TraceTailSamplingRulesRuleFilterSpan defaults) {
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
        public Builder duration(@Nullable TraceTailSamplingRulesRuleFilterSpanDuration duration) {
            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder error(@Nullable TraceTailSamplingRulesRuleFilterSpanError error) {
            this.error = error;
            return this;
        }
        @CustomType.Setter
        public Builder isRootSpan(@Nullable TraceTailSamplingRulesRuleFilterSpanIsRootSpan isRootSpan) {
            this.isRootSpan = isRootSpan;
            return this;
        }
        @CustomType.Setter
        public Builder matchType(@Nullable String matchType) {
            this.matchType = matchType;
            return this;
        }
        @CustomType.Setter
        public Builder operation(@Nullable TraceTailSamplingRulesRuleFilterSpanOperation operation) {
            this.operation = operation;
            return this;
        }
        @CustomType.Setter
        public Builder parentOperation(@Nullable TraceTailSamplingRulesRuleFilterSpanParentOperation parentOperation) {
            this.parentOperation = parentOperation;
            return this;
        }
        @CustomType.Setter
        public Builder parentService(@Nullable TraceTailSamplingRulesRuleFilterSpanParentService parentService) {
            this.parentService = parentService;
            return this;
        }
        @CustomType.Setter
        public Builder service(@Nullable TraceTailSamplingRulesRuleFilterSpanService service) {
            this.service = service;
            return this;
        }
        @CustomType.Setter
        public Builder spanCount(@Nullable TraceTailSamplingRulesRuleFilterSpanSpanCount spanCount) {
            this.spanCount = spanCount;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable List<TraceTailSamplingRulesRuleFilterSpanTag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(TraceTailSamplingRulesRuleFilterSpanTag... tags) {
            return tags(List.of(tags));
        }
        public TraceTailSamplingRulesRuleFilterSpan build() {
            final var o = new TraceTailSamplingRulesRuleFilterSpan();
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
