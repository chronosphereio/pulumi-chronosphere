// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResourcePoolsConfigPoolPrioritiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcePoolsConfigPoolPrioritiesArgs Empty = new ResourcePoolsConfigPoolPrioritiesArgs();

    @Import(name="highPriorityMatchRules")
    private @Nullable Output<List<String>> highPriorityMatchRules;

    public Optional<Output<List<String>>> highPriorityMatchRules() {
        return Optional.ofNullable(this.highPriorityMatchRules);
    }

    @Import(name="lowPriorityMatchRules")
    private @Nullable Output<List<String>> lowPriorityMatchRules;

    public Optional<Output<List<String>>> lowPriorityMatchRules() {
        return Optional.ofNullable(this.lowPriorityMatchRules);
    }

    private ResourcePoolsConfigPoolPrioritiesArgs() {}

    private ResourcePoolsConfigPoolPrioritiesArgs(ResourcePoolsConfigPoolPrioritiesArgs $) {
        this.highPriorityMatchRules = $.highPriorityMatchRules;
        this.lowPriorityMatchRules = $.lowPriorityMatchRules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResourcePoolsConfigPoolPrioritiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResourcePoolsConfigPoolPrioritiesArgs $;

        public Builder() {
            $ = new ResourcePoolsConfigPoolPrioritiesArgs();
        }

        public Builder(ResourcePoolsConfigPoolPrioritiesArgs defaults) {
            $ = new ResourcePoolsConfigPoolPrioritiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder highPriorityMatchRules(@Nullable Output<List<String>> highPriorityMatchRules) {
            $.highPriorityMatchRules = highPriorityMatchRules;
            return this;
        }

        public Builder highPriorityMatchRules(List<String> highPriorityMatchRules) {
            return highPriorityMatchRules(Output.of(highPriorityMatchRules));
        }

        public Builder highPriorityMatchRules(String... highPriorityMatchRules) {
            return highPriorityMatchRules(List.of(highPriorityMatchRules));
        }

        public Builder lowPriorityMatchRules(@Nullable Output<List<String>> lowPriorityMatchRules) {
            $.lowPriorityMatchRules = lowPriorityMatchRules;
            return this;
        }

        public Builder lowPriorityMatchRules(List<String> lowPriorityMatchRules) {
            return lowPriorityMatchRules(Output.of(lowPriorityMatchRules));
        }

        public Builder lowPriorityMatchRules(String... lowPriorityMatchRules) {
            return lowPriorityMatchRules(List.of(lowPriorityMatchRules));
        }

        public ResourcePoolsConfigPoolPrioritiesArgs build() {
            return $;
        }
    }

}
