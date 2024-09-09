// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.LogAllocationConfigDatasetAllocationAllocationArgs;
import io.chronosphere.chronosphere.inputs.LogAllocationConfigDatasetAllocationPrioritiesArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogAllocationConfigDatasetAllocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogAllocationConfigDatasetAllocationArgs Empty = new LogAllocationConfigDatasetAllocationArgs();

    @Import(name="allocation", required=true)
    private Output<LogAllocationConfigDatasetAllocationAllocationArgs> allocation;

    public Output<LogAllocationConfigDatasetAllocationAllocationArgs> allocation() {
        return this.allocation;
    }

    @Import(name="datasetId", required=true)
    private Output<String> datasetId;

    public Output<String> datasetId() {
        return this.datasetId;
    }

    @Import(name="priorities")
    private @Nullable Output<LogAllocationConfigDatasetAllocationPrioritiesArgs> priorities;

    public Optional<Output<LogAllocationConfigDatasetAllocationPrioritiesArgs>> priorities() {
        return Optional.ofNullable(this.priorities);
    }

    private LogAllocationConfigDatasetAllocationArgs() {}

    private LogAllocationConfigDatasetAllocationArgs(LogAllocationConfigDatasetAllocationArgs $) {
        this.allocation = $.allocation;
        this.datasetId = $.datasetId;
        this.priorities = $.priorities;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogAllocationConfigDatasetAllocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogAllocationConfigDatasetAllocationArgs $;

        public Builder() {
            $ = new LogAllocationConfigDatasetAllocationArgs();
        }

        public Builder(LogAllocationConfigDatasetAllocationArgs defaults) {
            $ = new LogAllocationConfigDatasetAllocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder allocation(Output<LogAllocationConfigDatasetAllocationAllocationArgs> allocation) {
            $.allocation = allocation;
            return this;
        }

        public Builder allocation(LogAllocationConfigDatasetAllocationAllocationArgs allocation) {
            return allocation(Output.of(allocation));
        }

        public Builder datasetId(Output<String> datasetId) {
            $.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(String datasetId) {
            return datasetId(Output.of(datasetId));
        }

        public Builder priorities(@Nullable Output<LogAllocationConfigDatasetAllocationPrioritiesArgs> priorities) {
            $.priorities = priorities;
            return this;
        }

        public Builder priorities(LogAllocationConfigDatasetAllocationPrioritiesArgs priorities) {
            return priorities(Output.of(priorities));
        }

        public LogAllocationConfigDatasetAllocationArgs build() {
            $.allocation = Objects.requireNonNull($.allocation, "expected parameter 'allocation' to be non-null");
            $.datasetId = Objects.requireNonNull($.datasetId, "expected parameter 'datasetId' to be non-null");
            return $;
        }
    }

}