// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TraceJaegerRemoteSamplingStrategyArgs extends com.pulumi.resources.ResourceArgs {

    public static final TraceJaegerRemoteSamplingStrategyArgs Empty = new TraceJaegerRemoteSamplingStrategyArgs();

    @Import(name="appliedStrategy", required=true)
    private Output<TraceJaegerRemoteSamplingStrategyAppliedStrategyArgs> appliedStrategy;

    public Output<TraceJaegerRemoteSamplingStrategyAppliedStrategyArgs> appliedStrategy() {
        return this.appliedStrategy;
    }

    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    @Import(name="serviceName", required=true)
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }

    @Import(name="slug")
    private @Nullable Output<String> slug;

    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    private TraceJaegerRemoteSamplingStrategyArgs() {}

    private TraceJaegerRemoteSamplingStrategyArgs(TraceJaegerRemoteSamplingStrategyArgs $) {
        this.appliedStrategy = $.appliedStrategy;
        this.name = $.name;
        this.serviceName = $.serviceName;
        this.slug = $.slug;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TraceJaegerRemoteSamplingStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TraceJaegerRemoteSamplingStrategyArgs $;

        public Builder() {
            $ = new TraceJaegerRemoteSamplingStrategyArgs();
        }

        public Builder(TraceJaegerRemoteSamplingStrategyArgs defaults) {
            $ = new TraceJaegerRemoteSamplingStrategyArgs(Objects.requireNonNull(defaults));
        }

        public Builder appliedStrategy(Output<TraceJaegerRemoteSamplingStrategyAppliedStrategyArgs> appliedStrategy) {
            $.appliedStrategy = appliedStrategy;
            return this;
        }

        public Builder appliedStrategy(TraceJaegerRemoteSamplingStrategyAppliedStrategyArgs appliedStrategy) {
            return appliedStrategy(Output.of(appliedStrategy));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder serviceName(Output<String> serviceName) {
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

        public TraceJaegerRemoteSamplingStrategyArgs build() {
            $.appliedStrategy = Objects.requireNonNull($.appliedStrategy, "expected parameter 'appliedStrategy' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            return $;
        }
    }

}
