// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs extends com.pulumi.resources.ResourceArgs {

    public static final LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs Empty = new LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs();

    @Import(name="query", required=true)
    private Output<String> query;

    public Output<String> query() {
        return this.query;
    }

    private LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs() {}

    private LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs(LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs $) {
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs $;

        public Builder() {
            $ = new LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs();
        }

        public Builder(LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs defaults) {
            $ = new LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs(Objects.requireNonNull(defaults));
        }

        public Builder query(Output<String> query) {
            $.query = query;
            return this;
        }

        public Builder query(String query) {
            return query(Output.of(query));
        }

        public LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs build() {
            $.query = Objects.requireNonNull($.query, "expected parameter 'query' to be non-null");
            return $;
        }
    }

}
