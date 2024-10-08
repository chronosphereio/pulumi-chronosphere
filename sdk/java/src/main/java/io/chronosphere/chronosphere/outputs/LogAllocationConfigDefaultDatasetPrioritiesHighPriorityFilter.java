// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter {
    private String query;

    private LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter() {}
    public String query() {
        return this.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String query;
        public Builder() {}
        public Builder(LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.query = defaults.query;
        }

        @CustomType.Setter
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter build() {
            final var o = new LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter();
            o.query = query;
            return o;
        }
    }
}
