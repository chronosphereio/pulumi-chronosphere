// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.MappingRuleStoragePolicyArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MappingRuleState extends com.pulumi.resources.ResourceArgs {

    public static final MappingRuleState Empty = new MappingRuleState();

    @Import(name="aggregations")
    private @Nullable Output<String> aggregations;

    public Optional<Output<String>> aggregations() {
        return Optional.ofNullable(this.aggregations);
    }

    @Import(name="bucketId")
    private @Nullable Output<String> bucketId;

    public Optional<Output<String>> bucketId() {
        return Optional.ofNullable(this.bucketId);
    }

    @Import(name="drop")
    private @Nullable Output<Boolean> drop;

    public Optional<Output<Boolean>> drop() {
        return Optional.ofNullable(this.drop);
    }

    @Import(name="dropTimestamp")
    private @Nullable Output<Boolean> dropTimestamp;

    public Optional<Output<Boolean>> dropTimestamp() {
        return Optional.ofNullable(this.dropTimestamp);
    }

    @Import(name="filter")
    private @Nullable Output<String> filter;

    public Optional<Output<String>> filter() {
        return Optional.ofNullable(this.filter);
    }

    @Import(name="interval")
    private @Nullable Output<String> interval;

    public Optional<Output<String>> interval() {
        return Optional.ofNullable(this.interval);
    }

    @Import(name="mode")
    private @Nullable Output<String> mode;

    public Optional<Output<String>> mode() {
        return Optional.ofNullable(this.mode);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="slug")
    private @Nullable Output<String> slug;

    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    @Import(name="storagePolicy")
    private @Nullable Output<MappingRuleStoragePolicyArgs> storagePolicy;

    public Optional<Output<MappingRuleStoragePolicyArgs>> storagePolicy() {
        return Optional.ofNullable(this.storagePolicy);
    }

    private MappingRuleState() {}

    private MappingRuleState(MappingRuleState $) {
        this.aggregations = $.aggregations;
        this.bucketId = $.bucketId;
        this.drop = $.drop;
        this.dropTimestamp = $.dropTimestamp;
        this.filter = $.filter;
        this.interval = $.interval;
        this.mode = $.mode;
        this.name = $.name;
        this.slug = $.slug;
        this.storagePolicy = $.storagePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MappingRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MappingRuleState $;

        public Builder() {
            $ = new MappingRuleState();
        }

        public Builder(MappingRuleState defaults) {
            $ = new MappingRuleState(Objects.requireNonNull(defaults));
        }

        public Builder aggregations(@Nullable Output<String> aggregations) {
            $.aggregations = aggregations;
            return this;
        }

        public Builder aggregations(String aggregations) {
            return aggregations(Output.of(aggregations));
        }

        public Builder bucketId(@Nullable Output<String> bucketId) {
            $.bucketId = bucketId;
            return this;
        }

        public Builder bucketId(String bucketId) {
            return bucketId(Output.of(bucketId));
        }

        public Builder drop(@Nullable Output<Boolean> drop) {
            $.drop = drop;
            return this;
        }

        public Builder drop(Boolean drop) {
            return drop(Output.of(drop));
        }

        public Builder dropTimestamp(@Nullable Output<Boolean> dropTimestamp) {
            $.dropTimestamp = dropTimestamp;
            return this;
        }

        public Builder dropTimestamp(Boolean dropTimestamp) {
            return dropTimestamp(Output.of(dropTimestamp));
        }

        public Builder filter(@Nullable Output<String> filter) {
            $.filter = filter;
            return this;
        }

        public Builder filter(String filter) {
            return filter(Output.of(filter));
        }

        public Builder interval(@Nullable Output<String> interval) {
            $.interval = interval;
            return this;
        }

        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        public Builder mode(@Nullable Output<String> mode) {
            $.mode = mode;
            return this;
        }

        public Builder mode(String mode) {
            return mode(Output.of(mode));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder slug(@Nullable Output<String> slug) {
            $.slug = slug;
            return this;
        }

        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        public Builder storagePolicy(@Nullable Output<MappingRuleStoragePolicyArgs> storagePolicy) {
            $.storagePolicy = storagePolicy;
            return this;
        }

        public Builder storagePolicy(MappingRuleStoragePolicyArgs storagePolicy) {
            return storagePolicy(Output.of(storagePolicy));
        }

        public MappingRuleState build() {
            return $;
        }
    }

}
