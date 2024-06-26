// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs Empty = new DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs();

    @Import(name="value", required=true)
    private Output<Boolean> value;

    public Output<Boolean> value() {
        return this.value;
    }

    private DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs() {}

    private DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs(DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs $;

        public Builder() {
            $ = new DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs();
        }

        public Builder(DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs defaults) {
            $ = new DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs(Objects.requireNonNull(defaults));
        }

        public Builder value(Output<Boolean> value) {
            $.value = value;
            return this;
        }

        public Builder value(Boolean value) {
            return value(Output.of(value));
        }

        public DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
