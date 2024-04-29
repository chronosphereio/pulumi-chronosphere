// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.chronosphere.chronosphere.TraceJaegerRemoteSamplingStrategyArgs;
import io.chronosphere.chronosphere.Utilities;
import io.chronosphere.chronosphere.inputs.TraceJaegerRemoteSamplingStrategyState;
import io.chronosphere.chronosphere.outputs.TraceJaegerRemoteSamplingStrategyAppliedStrategy;
import java.lang.String;
import javax.annotation.Nullable;

@ResourceType(type="chronosphere:index/traceJaegerRemoteSamplingStrategy:TraceJaegerRemoteSamplingStrategy")
public class TraceJaegerRemoteSamplingStrategy extends com.pulumi.resources.CustomResource {
    @Export(name="appliedStrategy", refs={TraceJaegerRemoteSamplingStrategyAppliedStrategy.class}, tree="[0]")
    private Output<TraceJaegerRemoteSamplingStrategyAppliedStrategy> appliedStrategy;

    public Output<TraceJaegerRemoteSamplingStrategyAppliedStrategy> appliedStrategy() {
        return this.appliedStrategy;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="serviceName", refs={String.class}, tree="[0]")
    private Output<String> serviceName;

    public Output<String> serviceName() {
        return this.serviceName;
    }
    @Export(name="slug", refs={String.class}, tree="[0]")
    private Output<String> slug;

    public Output<String> slug() {
        return this.slug;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public TraceJaegerRemoteSamplingStrategy(String name) {
        this(name, TraceJaegerRemoteSamplingStrategyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public TraceJaegerRemoteSamplingStrategy(String name, TraceJaegerRemoteSamplingStrategyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public TraceJaegerRemoteSamplingStrategy(String name, TraceJaegerRemoteSamplingStrategyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/traceJaegerRemoteSamplingStrategy:TraceJaegerRemoteSamplingStrategy", name, args == null ? TraceJaegerRemoteSamplingStrategyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private TraceJaegerRemoteSamplingStrategy(String name, Output<String> id, @Nullable TraceJaegerRemoteSamplingStrategyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/traceJaegerRemoteSamplingStrategy:TraceJaegerRemoteSamplingStrategy", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static TraceJaegerRemoteSamplingStrategy get(String name, Output<String> id, @Nullable TraceJaegerRemoteSamplingStrategyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new TraceJaegerRemoteSamplingStrategy(name, id, state, options);
    }
}