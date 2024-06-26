// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ResourcePoolsConfigPoolPriorities {
    private @Nullable List<String> highPriorityMatchRules;
    private @Nullable List<String> lowPriorityMatchRules;

    private ResourcePoolsConfigPoolPriorities() {}
    public List<String> highPriorityMatchRules() {
        return this.highPriorityMatchRules == null ? List.of() : this.highPriorityMatchRules;
    }
    public List<String> lowPriorityMatchRules() {
        return this.lowPriorityMatchRules == null ? List.of() : this.lowPriorityMatchRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcePoolsConfigPoolPriorities defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> highPriorityMatchRules;
        private @Nullable List<String> lowPriorityMatchRules;
        public Builder() {}
        public Builder(ResourcePoolsConfigPoolPriorities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.highPriorityMatchRules = defaults.highPriorityMatchRules;
    	      this.lowPriorityMatchRules = defaults.lowPriorityMatchRules;
        }

        @CustomType.Setter
        public Builder highPriorityMatchRules(@Nullable List<String> highPriorityMatchRules) {
            this.highPriorityMatchRules = highPriorityMatchRules;
            return this;
        }
        public Builder highPriorityMatchRules(String... highPriorityMatchRules) {
            return highPriorityMatchRules(List.of(highPriorityMatchRules));
        }
        @CustomType.Setter
        public Builder lowPriorityMatchRules(@Nullable List<String> lowPriorityMatchRules) {
            this.lowPriorityMatchRules = lowPriorityMatchRules;
            return this;
        }
        public Builder lowPriorityMatchRules(String... lowPriorityMatchRules) {
            return lowPriorityMatchRules(List.of(lowPriorityMatchRules));
        }
        public ResourcePoolsConfigPoolPriorities build() {
            final var o = new ResourcePoolsConfigPoolPriorities();
            o.highPriorityMatchRules = highPriorityMatchRules;
            o.lowPriorityMatchRules = lowPriorityMatchRules;
            return o;
        }
    }
}
