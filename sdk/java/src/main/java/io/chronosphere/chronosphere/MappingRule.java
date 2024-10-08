// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.chronosphere.chronosphere.MappingRuleArgs;
import io.chronosphere.chronosphere.Utilities;
import io.chronosphere.chronosphere.inputs.MappingRuleState;
import io.chronosphere.chronosphere.outputs.MappingRuleStoragePolicy;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="chronosphere:index/mappingRule:MappingRule")
public class MappingRule extends com.pulumi.resources.CustomResource {
    @Export(name="aggregations", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> aggregations;

    public Output<Optional<String>> aggregations() {
        return Codegen.optional(this.aggregations);
    }
    @Export(name="bucketId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bucketId;

    public Output<Optional<String>> bucketId() {
        return Codegen.optional(this.bucketId);
    }
    @Export(name="drop", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> drop;

    public Output<Optional<Boolean>> drop() {
        return Codegen.optional(this.drop);
    }
    /**
     * @deprecated
     * drop timestamp is no longer supported
     * 
     */
    @Deprecated /* drop timestamp is no longer supported */
    @Export(name="dropTimestamp", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> dropTimestamp;

    public Output<Optional<Boolean>> dropTimestamp() {
        return Codegen.optional(this.dropTimestamp);
    }
    @Export(name="filter", refs={String.class}, tree="[0]")
    private Output<String> filter;

    public Output<String> filter() {
        return this.filter;
    }
    @Export(name="interval", refs={String.class}, tree="[0]")
    private Output<String> interval;

    public Output<String> interval() {
        return this.interval;
    }
    @Export(name="mode", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> mode;

    public Output<Optional<String>> mode() {
        return Codegen.optional(this.mode);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="slug", refs={String.class}, tree="[0]")
    private Output<String> slug;

    public Output<String> slug() {
        return this.slug;
    }
    /**
     * @deprecated
     * use `interval` instead
     * 
     */
    @Deprecated /* use `interval` instead */
    @Export(name="storagePolicy", refs={MappingRuleStoragePolicy.class}, tree="[0]")
    private Output</* @Nullable */ MappingRuleStoragePolicy> storagePolicy;

    public Output<Optional<MappingRuleStoragePolicy>> storagePolicy() {
        return Codegen.optional(this.storagePolicy);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MappingRule(String name) {
        this(name, MappingRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MappingRule(String name, MappingRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MappingRule(String name, MappingRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/mappingRule:MappingRule", name, args == null ? MappingRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MappingRule(String name, Output<String> id, @Nullable MappingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/mappingRule:MappingRule", name, state, makeResourceOptions(options, id));
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
    public static MappingRule get(String name, Output<String> id, @Nullable MappingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MappingRule(name, id, state, options);
    }
}
