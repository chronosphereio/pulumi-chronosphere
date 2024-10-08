// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import io.chronosphere.chronosphere.outputs.LogAllocationConfigDatasetAllocationPrioritiesHighPriorityFilter;
import io.chronosphere.chronosphere.outputs.LogAllocationConfigDatasetAllocationPrioritiesLowPriorityFilter;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class LogAllocationConfigDatasetAllocationPriorities {
    private @Nullable List<LogAllocationConfigDatasetAllocationPrioritiesHighPriorityFilter> highPriorityFilters;
    private @Nullable List<LogAllocationConfigDatasetAllocationPrioritiesLowPriorityFilter> lowPriorityFilters;

    private LogAllocationConfigDatasetAllocationPriorities() {}
    public List<LogAllocationConfigDatasetAllocationPrioritiesHighPriorityFilter> highPriorityFilters() {
        return this.highPriorityFilters == null ? List.of() : this.highPriorityFilters;
    }
    public List<LogAllocationConfigDatasetAllocationPrioritiesLowPriorityFilter> lowPriorityFilters() {
        return this.lowPriorityFilters == null ? List.of() : this.lowPriorityFilters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogAllocationConfigDatasetAllocationPriorities defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<LogAllocationConfigDatasetAllocationPrioritiesHighPriorityFilter> highPriorityFilters;
        private @Nullable List<LogAllocationConfigDatasetAllocationPrioritiesLowPriorityFilter> lowPriorityFilters;
        public Builder() {}
        public Builder(LogAllocationConfigDatasetAllocationPriorities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.highPriorityFilters = defaults.highPriorityFilters;
    	      this.lowPriorityFilters = defaults.lowPriorityFilters;
        }

        @CustomType.Setter
        public Builder highPriorityFilters(@Nullable List<LogAllocationConfigDatasetAllocationPrioritiesHighPriorityFilter> highPriorityFilters) {
            this.highPriorityFilters = highPriorityFilters;
            return this;
        }
        public Builder highPriorityFilters(LogAllocationConfigDatasetAllocationPrioritiesHighPriorityFilter... highPriorityFilters) {
            return highPriorityFilters(List.of(highPriorityFilters));
        }
        @CustomType.Setter
        public Builder lowPriorityFilters(@Nullable List<LogAllocationConfigDatasetAllocationPrioritiesLowPriorityFilter> lowPriorityFilters) {
            this.lowPriorityFilters = lowPriorityFilters;
            return this;
        }
        public Builder lowPriorityFilters(LogAllocationConfigDatasetAllocationPrioritiesLowPriorityFilter... lowPriorityFilters) {
            return lowPriorityFilters(List.of(lowPriorityFilters));
        }
        public LogAllocationConfigDatasetAllocationPriorities build() {
            final var o = new LogAllocationConfigDatasetAllocationPriorities();
            o.highPriorityFilters = highPriorityFilters;
            o.lowPriorityFilters = lowPriorityFilters;
            return o;
        }
    }
}
