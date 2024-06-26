// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.DropRuleValueBasedDropArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DropRuleState extends com.pulumi.resources.ResourceArgs {

    public static final DropRuleState Empty = new DropRuleState();

    @Import(name="activatedDropDuration")
    private @Nullable Output<String> activatedDropDuration;

    public Optional<Output<String>> activatedDropDuration() {
        return Optional.ofNullable(this.activatedDropDuration);
    }

    @Import(name="active")
    private @Nullable Output<Boolean> active;

    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    @Import(name="conditionalDrop")
    private @Nullable Output<Boolean> conditionalDrop;

    public Optional<Output<Boolean>> conditionalDrop() {
        return Optional.ofNullable(this.conditionalDrop);
    }

    @Import(name="dropNanValue")
    private @Nullable Output<Boolean> dropNanValue;

    public Optional<Output<Boolean>> dropNanValue() {
        return Optional.ofNullable(this.dropNanValue);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="queries")
    private @Nullable Output<List<String>> queries;

    public Optional<Output<List<String>>> queries() {
        return Optional.ofNullable(this.queries);
    }

    @Import(name="rateLimitThreshold")
    private @Nullable Output<Double> rateLimitThreshold;

    public Optional<Output<Double>> rateLimitThreshold() {
        return Optional.ofNullable(this.rateLimitThreshold);
    }

    @Import(name="slug")
    private @Nullable Output<String> slug;

    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    @Import(name="valueBasedDrop")
    private @Nullable Output<DropRuleValueBasedDropArgs> valueBasedDrop;

    public Optional<Output<DropRuleValueBasedDropArgs>> valueBasedDrop() {
        return Optional.ofNullable(this.valueBasedDrop);
    }

    private DropRuleState() {}

    private DropRuleState(DropRuleState $) {
        this.activatedDropDuration = $.activatedDropDuration;
        this.active = $.active;
        this.conditionalDrop = $.conditionalDrop;
        this.dropNanValue = $.dropNanValue;
        this.name = $.name;
        this.queries = $.queries;
        this.rateLimitThreshold = $.rateLimitThreshold;
        this.slug = $.slug;
        this.valueBasedDrop = $.valueBasedDrop;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DropRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DropRuleState $;

        public Builder() {
            $ = new DropRuleState();
        }

        public Builder(DropRuleState defaults) {
            $ = new DropRuleState(Objects.requireNonNull(defaults));
        }

        public Builder activatedDropDuration(@Nullable Output<String> activatedDropDuration) {
            $.activatedDropDuration = activatedDropDuration;
            return this;
        }

        public Builder activatedDropDuration(String activatedDropDuration) {
            return activatedDropDuration(Output.of(activatedDropDuration));
        }

        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        public Builder conditionalDrop(@Nullable Output<Boolean> conditionalDrop) {
            $.conditionalDrop = conditionalDrop;
            return this;
        }

        public Builder conditionalDrop(Boolean conditionalDrop) {
            return conditionalDrop(Output.of(conditionalDrop));
        }

        public Builder dropNanValue(@Nullable Output<Boolean> dropNanValue) {
            $.dropNanValue = dropNanValue;
            return this;
        }

        public Builder dropNanValue(Boolean dropNanValue) {
            return dropNanValue(Output.of(dropNanValue));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder queries(@Nullable Output<List<String>> queries) {
            $.queries = queries;
            return this;
        }

        public Builder queries(List<String> queries) {
            return queries(Output.of(queries));
        }

        public Builder queries(String... queries) {
            return queries(List.of(queries));
        }

        public Builder rateLimitThreshold(@Nullable Output<Double> rateLimitThreshold) {
            $.rateLimitThreshold = rateLimitThreshold;
            return this;
        }

        public Builder rateLimitThreshold(Double rateLimitThreshold) {
            return rateLimitThreshold(Output.of(rateLimitThreshold));
        }

        public Builder slug(@Nullable Output<String> slug) {
            $.slug = slug;
            return this;
        }

        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        public Builder valueBasedDrop(@Nullable Output<DropRuleValueBasedDropArgs> valueBasedDrop) {
            $.valueBasedDrop = valueBasedDrop;
            return this;
        }

        public Builder valueBasedDrop(DropRuleValueBasedDropArgs valueBasedDrop) {
            return valueBasedDrop(Output.of(valueBasedDrop));
        }

        public DropRuleState build() {
            return $;
        }
    }

}
