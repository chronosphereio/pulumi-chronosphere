// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs Empty = new DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs();

    @Import(name="inValues")
    private @Nullable Output<List<String>> inValues;

    public Optional<Output<List<String>>> inValues() {
        return Optional.ofNullable(this.inValues);
    }

    @Import(name="match")
    private @Nullable Output<String> match;

    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    @Import(name="value")
    private @Nullable Output<String> value;

    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs() {}

    private DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs(DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs $) {
        this.inValues = $.inValues;
        this.match = $.match;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs $;

        public Builder() {
            $ = new DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs();
        }

        public Builder(DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs defaults) {
            $ = new DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs(Objects.requireNonNull(defaults));
        }

        public Builder inValues(@Nullable Output<List<String>> inValues) {
            $.inValues = inValues;
            return this;
        }

        public Builder inValues(List<String> inValues) {
            return inValues(Output.of(inValues));
        }

        public Builder inValues(String... inValues) {
            return inValues(List.of(inValues));
        }

        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        public Builder match(String match) {
            return match(Output.of(match));
        }

        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs build() {
            return $;
        }
    }

}
