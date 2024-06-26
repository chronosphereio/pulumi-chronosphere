// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs Empty = new DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs();

    @Import(name="max")
    private @Nullable Output<Integer> max;

    public Optional<Output<Integer>> max() {
        return Optional.ofNullable(this.max);
    }

    @Import(name="min")
    private @Nullable Output<Integer> min;

    public Optional<Output<Integer>> min() {
        return Optional.ofNullable(this.min);
    }

    private DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs() {}

    private DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs(DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs $) {
        this.max = $.max;
        this.min = $.min;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs $;

        public Builder() {
            $ = new DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs();
        }

        public Builder(DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs defaults) {
            $ = new DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs(Objects.requireNonNull(defaults));
        }

        public Builder max(@Nullable Output<Integer> max) {
            $.max = max;
            return this;
        }

        public Builder max(Integer max) {
            return max(Output.of(max));
        }

        public Builder min(@Nullable Output<Integer> min) {
            $.min = min;
            return this;
        }

        public Builder min(Integer min) {
            return min(Output.of(min));
        }

        public DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs build() {
            return $;
        }
    }

}
