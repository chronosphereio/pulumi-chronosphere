// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import io.chronosphere.chronosphere.outputs.LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter;
import io.chronosphere.chronosphere.outputs.LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilter;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class LogAllocationConfigDefaultDatasetPriorities {
    private @Nullable List<LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter> highPriorityFilters;
    private @Nullable List<LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilter> lowPriorityFilters;

    private LogAllocationConfigDefaultDatasetPriorities() {}
    public List<LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter> highPriorityFilters() {
        return this.highPriorityFilters == null ? List.of() : this.highPriorityFilters;
    }
    public List<LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilter> lowPriorityFilters() {
        return this.lowPriorityFilters == null ? List.of() : this.lowPriorityFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAllocationConfigDefaultDatasetPriorities defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter> highPriorityFilters;
        private @Nullable List<LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilter> lowPriorityFilters;
        public Builder() {}
        public Builder(LogAllocationConfigDefaultDatasetPriorities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.highPriorityFilters = defaults.highPriorityFilters;
    	      this.lowPriorityFilters = defaults.lowPriorityFilters;
        }

        @CustomType.Setter
        public Builder highPriorityFilters(@Nullable List<LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter> highPriorityFilters) {
            this.highPriorityFilters = highPriorityFilters;
            return this;
        }
        public Builder highPriorityFilters(LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter... highPriorityFilters) {
            return highPriorityFilters(List.of(highPriorityFilters));
        }
        @CustomType.Setter
        public Builder lowPriorityFilters(@Nullable List<LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilter> lowPriorityFilters) {
            this.lowPriorityFilters = lowPriorityFilters;
            return this;
        }
        public Builder lowPriorityFilters(LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilter... lowPriorityFilters) {
            return lowPriorityFilters(List.of(lowPriorityFilters));
        }
        public LogAllocationConfigDefaultDatasetPriorities build() {
            final var o = new LogAllocationConfigDefaultDatasetPriorities();
            o.highPriorityFilters = highPriorityFilters;
            o.lowPriorityFilters = lowPriorityFilters;
            return o;
        }
    }
}
