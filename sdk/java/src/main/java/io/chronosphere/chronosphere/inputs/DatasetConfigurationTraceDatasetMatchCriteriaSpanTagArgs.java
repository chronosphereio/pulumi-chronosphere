// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTagNumericValueArgs;
import io.chronosphere.chronosphere.inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTagValueArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs Empty = new DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs();

    @Import(name="key")
    private @Nullable Output<String> key;

    public Optional<Output<String>> key() {
        return Optional.ofNullable(this.key);
    }

    @Import(name="numericValue")
    private @Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanTagNumericValueArgs> numericValue;

    public Optional<Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanTagNumericValueArgs>> numericValue() {
        return Optional.ofNullable(this.numericValue);
    }

    @Import(name="value")
    private @Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanTagValueArgs> value;

    public Optional<Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanTagValueArgs>> value() {
        return Optional.ofNullable(this.value);
    }

    private DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs() {}

    private DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs(DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs $) {
        this.key = $.key;
        this.numericValue = $.numericValue;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs $;

        public Builder() {
            $ = new DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs();
        }

        public Builder(DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs defaults) {
            $ = new DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs(Objects.requireNonNull(defaults));
        }

        public Builder key(@Nullable Output<String> key) {
            $.key = key;
            return this;
        }

        public Builder key(String key) {
            return key(Output.of(key));
        }

        public Builder numericValue(@Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanTagNumericValueArgs> numericValue) {
            $.numericValue = numericValue;
            return this;
        }

        public Builder numericValue(DatasetConfigurationTraceDatasetMatchCriteriaSpanTagNumericValueArgs numericValue) {
            return numericValue(Output.of(numericValue));
        }

        public Builder value(@Nullable Output<DatasetConfigurationTraceDatasetMatchCriteriaSpanTagValueArgs> value) {
            $.value = value;
            return this;
        }

        public Builder value(DatasetConfigurationTraceDatasetMatchCriteriaSpanTagValueArgs value) {
            return value(Output.of(value));
        }

        public DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs build() {
            return $;
        }
    }

}
