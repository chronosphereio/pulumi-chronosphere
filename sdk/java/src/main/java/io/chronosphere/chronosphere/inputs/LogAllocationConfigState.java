// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.LogAllocationConfigDatasetAllocationArgs;
import io.chronosphere.chronosphere.inputs.LogAllocationConfigDefaultDatasetArgs;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogAllocationConfigState extends com.pulumi.resources.ResourceArgs {

    public static final LogAllocationConfigState Empty = new LogAllocationConfigState();

    @Import(name="datasetAllocations")
    private @Nullable Output<List<LogAllocationConfigDatasetAllocationArgs>> datasetAllocations;

    public Optional<Output<List<LogAllocationConfigDatasetAllocationArgs>>> datasetAllocations() {
        return Optional.ofNullable(this.datasetAllocations);
    }

    @Import(name="defaultDataset")
    private @Nullable Output<LogAllocationConfigDefaultDatasetArgs> defaultDataset;

    public Optional<Output<LogAllocationConfigDefaultDatasetArgs>> defaultDataset() {
        return Optional.ofNullable(this.defaultDataset);
    }

    private LogAllocationConfigState() {}

    private LogAllocationConfigState(LogAllocationConfigState $) {
        this.datasetAllocations = $.datasetAllocations;
        this.defaultDataset = $.defaultDataset;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogAllocationConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogAllocationConfigState $;

        public Builder() {
            $ = new LogAllocationConfigState();
        }

        public Builder(LogAllocationConfigState defaults) {
            $ = new LogAllocationConfigState(Objects.requireNonNull(defaults));
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

        public Builder defaultDataset(@Nullable Output<LogAllocationConfigDefaultDatasetArgs> defaultDataset) {
            $.defaultDataset = defaultDataset;
            return this;
        }

        public Builder defaultDataset(LogAllocationConfigDefaultDatasetArgs defaultDataset) {
            return defaultDataset(Output.of(defaultDataset));
        }

        public LogAllocationConfigState build() {
            return $;
        }
    }

}
