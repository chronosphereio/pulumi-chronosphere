// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.LogAllocationConfigDatasetAllocationArgs;
import io.chronosphere.chronosphere.inputs.LogAllocationConfigDefaultDatasetArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogAllocationConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogAllocationConfigArgs Empty = new LogAllocationConfigArgs();

    @Import(name="datasetAllocations")
    private @Nullable Output<List<LogAllocationConfigDatasetAllocationArgs>> datasetAllocations;

    public Optional<Output<List<LogAllocationConfigDatasetAllocationArgs>>> datasetAllocations() {
        return Optional.ofNullable(this.datasetAllocations);
    }

    @Import(name="defaultDataset", required=true)
    private Output<LogAllocationConfigDefaultDatasetArgs> defaultDataset;

    public Output<LogAllocationConfigDefaultDatasetArgs> defaultDataset() {
        return this.defaultDataset;
    }

    private LogAllocationConfigArgs() {}

    private LogAllocationConfigArgs(LogAllocationConfigArgs $) {
        this.datasetAllocations = $.datasetAllocations;
        this.defaultDataset = $.defaultDataset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogAllocationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogAllocationConfigArgs $;

        public Builder() {
            $ = new LogAllocationConfigArgs();
        }

        public Builder(LogAllocationConfigArgs defaults) {
            $ = new LogAllocationConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder datasetAllocations(@Nullable Output<List<LogAllocationConfigDatasetAllocationArgs>> datasetAllocations) {
            $.datasetAllocations = datasetAllocations;
            return this;
        }

        public Builder datasetAllocations(List<LogAllocationConfigDatasetAllocationArgs> datasetAllocations) {
            return datasetAllocations(Output.of(datasetAllocations));
        }

        public Builder datasetAllocations(LogAllocationConfigDatasetAllocationArgs... datasetAllocations) {
            return datasetAllocations(List.of(datasetAllocations));
        }

        public Builder defaultDataset(Output<LogAllocationConfigDefaultDatasetArgs> defaultDataset) {
            $.defaultDataset = defaultDataset;
            return this;
        }

        public Builder defaultDataset(LogAllocationConfigDefaultDatasetArgs defaultDataset) {
            return defaultDataset(Output.of(defaultDataset));
        }

        public LogAllocationConfigArgs build() {
            $.defaultDataset = Objects.requireNonNull($.defaultDataset, "expected parameter 'defaultDataset' to be non-null");
            return $;
        }
    }

}
