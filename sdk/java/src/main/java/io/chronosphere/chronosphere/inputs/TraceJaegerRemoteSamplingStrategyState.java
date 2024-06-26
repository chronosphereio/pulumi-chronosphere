// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TraceJaegerRemoteSamplingStrategyState extends com.pulumi.resources.ResourceArgs {

    public static final TraceJaegerRemoteSamplingStrategyState Empty = new TraceJaegerRemoteSamplingStrategyState();

    @Import(name="appliedStrategy")
    private @Nullable Output<TraceJaegerRemoteSamplingStrategyAppliedStrategyArgs> appliedStrategy;

    public Optional<Output<TraceJaegerRemoteSamplingStrategyAppliedStrategyArgs>> appliedStrategy() {
        return Optional.ofNullable(this.appliedStrategy);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="serviceName")
    private @Nullable Output<String> serviceName;

    public Optional<Output<String>> serviceName() {
        return Optional.ofNullable(this.serviceName);
    }

    @Import(name="slug")
    private @Nullable Output<String> slug;

    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    private TraceJaegerRemoteSamplingStrategyState() {}

    private TraceJaegerRemoteSamplingStrategyState(TraceJaegerRemoteSamplingStrategyState $) {
        this.appliedStrategy = $.appliedStrategy;
        this.name = $.name;
        this.serviceName = $.serviceName;
        this.slug = $.slug;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TraceJaegerRemoteSamplingStrategyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TraceJaegerRemoteSamplingStrategyState $;

        public Builder() {
            $ = new TraceJaegerRemoteSamplingStrategyState();
        }

        public Builder(TraceJaegerRemoteSamplingStrategyState defaults) {
            $ = new TraceJaegerRemoteSamplingStrategyState(Objects.requireNonNull(defaults));
        }

        public Builder appliedStrategy(@Nullable Output<TraceJaegerRemoteSamplingStrategyAppliedStrategyArgs> appliedStrategy) {
            $.appliedStrategy = appliedStrategy;
            return this;
        }

        public Builder appliedStrategy(TraceJaegerRemoteSamplingStrategyAppliedStrategyArgs appliedStrategy) {
            return appliedStrategy(Output.of(appliedStrategy));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder serviceName(@Nullable Output<String> serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            return serviceName(Output.of(serviceName));
        }

        public Builder slug(@Nullable Output<String> slug) {
            $.slug = slug;
            return this;
        }

        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        public TraceJaegerRemoteSamplingStrategyState build() {
            return $;
        }
    }

}
