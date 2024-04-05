// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.chronosphere.chronosphere.DropRuleArgs;
import io.chronosphere.chronosphere.Utilities;
import io.chronosphere.chronosphere.inputs.DropRuleState;
import io.chronosphere.chronosphere.outputs.DropRuleValueBasedDrop;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="chronosphere:index/dropRule:DropRule")
public class DropRule extends com.pulumi.resources.CustomResource {
    @Export(name="activatedDropDuration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> activatedDropDuration;

    public Output<Optional<String>> activatedDropDuration() {
        return Codegen.optional(this.activatedDropDuration);
    }
    @Export(name="active", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> active;

    public Output<Optional<Boolean>> active() {
        return Codegen.optional(this.active);
    }
    @Export(name="conditionalDrop", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> conditionalDrop;

    public Output<Optional<Boolean>> conditionalDrop() {
        return Codegen.optional(this.conditionalDrop);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="queries", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> queries;

    public Output<List<String>> queries() {
        return this.queries;
    }
    @Export(name="rateLimitThreshold", refs={Double.class}, tree="[0]")
    private Output</* @Nullable */ Double> rateLimitThreshold;

    public Output<Optional<Double>> rateLimitThreshold() {
        return Codegen.optional(this.rateLimitThreshold);
    }
    @Export(name="slug", refs={String.class}, tree="[0]")
    private Output<String> slug;

    public Output<String> slug() {
        return this.slug;
    }
    @Export(name="valueBasedDrop", refs={DropRuleValueBasedDrop.class}, tree="[0]")
    private Output</* @Nullable */ DropRuleValueBasedDrop> valueBasedDrop;

    public Output<Optional<DropRuleValueBasedDrop>> valueBasedDrop() {
        return Codegen.optional(this.valueBasedDrop);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DropRule(String name) {
        this(name, DropRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DropRule(String name, DropRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DropRule(String name, DropRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/dropRule:DropRule", name, args == null ? DropRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DropRule(String name, Output<String> id, @Nullable DropRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/dropRule:DropRule", name, state, makeResourceOptions(options, id));
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
    public static DropRule get(String name, Output<String> id, @Nullable DropRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DropRule(name, id, state, options);
    }
}
