// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RecordingRuleState extends com.pulumi.resources.ResourceArgs {

    public static final RecordingRuleState Empty = new RecordingRuleState();

    @Import(name="bucketId")
    private @Nullable Output<String> bucketId;

    public Optional<Output<String>> bucketId() {
        return Optional.ofNullable(this.bucketId);
    }

    @Import(name="executionGroup")
    private @Nullable Output<String> executionGroup;

    public Optional<Output<String>> executionGroup() {
        return Optional.ofNullable(this.executionGroup);
    }

    @Import(name="expr")
    private @Nullable Output<String> expr;

    public Optional<Output<String>> expr() {
        return Optional.ofNullable(this.expr);
    }

    @Import(name="interval")
    private @Nullable Output<String> interval;

    public Optional<Output<String>> interval() {
        return Optional.ofNullable(this.interval);
    }

    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    @Import(name="metricName")
    private @Nullable Output<String> metricName;

    public Optional<Output<String>> metricName() {
        return Optional.ofNullable(this.metricName);
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

    private RecordingRuleState() {}

    private RecordingRuleState(RecordingRuleState $) {
        this.bucketId = $.bucketId;
        this.executionGroup = $.executionGroup;
        this.expr = $.expr;
        this.interval = $.interval;
        this.labels = $.labels;
        this.metricName = $.metricName;
        this.name = $.name;
        this.slug = $.slug;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecordingRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordingRuleState $;

        public Builder() {
            $ = new RecordingRuleState();
        }

        public Builder(RecordingRuleState defaults) {
            $ = new RecordingRuleState(Objects.requireNonNull(defaults));
        }

        public Builder bucketId(@Nullable Output<String> bucketId) {
            $.bucketId = bucketId;
            return this;
        }

        public Builder bucketId(String bucketId) {
            return bucketId(Output.of(bucketId));
        }

        public Builder executionGroup(@Nullable Output<String> executionGroup) {
            $.executionGroup = executionGroup;
            return this;
        }

        public Builder executionGroup(String executionGroup) {
            return executionGroup(Output.of(executionGroup));
        }

        public Builder expr(@Nullable Output<String> expr) {
            $.expr = expr;
            return this;
        }

        public Builder expr(String expr) {
            return expr(Output.of(expr));
        }

        public Builder interval(@Nullable Output<String> interval) {
            $.interval = interval;
            return this;
        }

        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder metricName(@Nullable Output<String> metricName) {
            $.metricName = metricName;
            return this;
        }

        public Builder metricName(String metricName) {
            return metricName(Output.of(metricName));
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

        public RecordingRuleState build() {
            return $;
        }
    }

}
