// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpanArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpanArgs Empty = new DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpanArgs();

    @Import(name="value", required=true)
    private Output<Boolean> value;

    public Output<Boolean> value() {
        return this.value;
    }

    private DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpanArgs() {}

    private DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpanArgs(DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpanArgs $) {
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpanArgs $;

        public Builder() {
            $ = new DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpanArgs();
        }

        public Builder(DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpanArgs defaults) {
            $ = new DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpanArgs(Objects.requireNonNull(defaults));
        }

        public Builder value(Output<Boolean> value) {
            $.value = value;
            return this;
        }

        public Builder value(Boolean value) {
            return value(Output.of(value));
        }

        public DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpanArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
