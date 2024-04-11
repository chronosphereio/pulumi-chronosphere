// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.chronosphere.chronosphere.NotificationPolicyArgs;
import io.chronosphere.chronosphere.Utilities;
import io.chronosphere.chronosphere.inputs.NotificationPolicyState;
import io.chronosphere.chronosphere.outputs.NotificationPolicyOverride;
import io.chronosphere.chronosphere.outputs.NotificationPolicyRoute;
import io.chronosphere.chronosphere.outputs.NotificationPolicyRule;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="chronosphere:index/notificationPolicy:NotificationPolicy")
public class NotificationPolicy extends com.pulumi.resources.CustomResource {
    @Export(name="isIndependent", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> isIndependent;

    public Output<Boolean> isIndependent() {
        return this.isIndependent;
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> name;

    public Output<Optional<String>> name() {
        return Codegen.optional(this.name);
    }
    @Export(name="notificationPolicyData", refs={String.class}, tree="[0]")
    private Output<String> notificationPolicyData;

    public Output<String> notificationPolicyData() {
        return this.notificationPolicyData;
    }
    @Export(name="overrides", refs={List.class,NotificationPolicyOverride.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NotificationPolicyOverride>> overrides;

    public Output<Optional<List<NotificationPolicyOverride>>> overrides() {
        return Codegen.optional(this.overrides);
    }
    @Export(name="routes", refs={List.class,NotificationPolicyRoute.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NotificationPolicyRoute>> routes;

    public Output<Optional<List<NotificationPolicyRoute>>> routes() {
        return Codegen.optional(this.routes);
    }
    /**
     * @deprecated
     * `rule` is deprecated, use `route` instead.
     * 
     */
    @Deprecated /* `rule` is deprecated, use `route` instead. */
    @Export(name="rules", refs={List.class,NotificationPolicyRule.class}, tree="[0,1]")
    private Output</* @Nullable */ List<NotificationPolicyRule>> rules;

    public Output<Optional<List<NotificationPolicyRule>>> rules() {
        return Codegen.optional(this.rules);
    }
    @Export(name="slug", refs={String.class}, tree="[0]")
    private Output<String> slug;

    public Output<String> slug() {
        return this.slug;
    }
    @Export(name="teamId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> teamId;

    public Output<Optional<String>> teamId() {
        return Codegen.optional(this.teamId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationPolicy(String name) {
        this(name, NotificationPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationPolicy(String name, @Nullable NotificationPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationPolicy(String name, @Nullable NotificationPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/notificationPolicy:NotificationPolicy", name, args == null ? NotificationPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NotificationPolicy(String name, Output<String> id, @Nullable NotificationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/notificationPolicy:NotificationPolicy", name, state, makeResourceOptions(options, id));
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
    public static NotificationPolicy get(String name, Output<String> id, @Nullable NotificationPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotificationPolicy(name, id, state, options);
    }
}
