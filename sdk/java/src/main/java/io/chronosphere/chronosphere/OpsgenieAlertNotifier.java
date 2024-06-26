// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.chronosphere.chronosphere.OpsgenieAlertNotifierArgs;
import io.chronosphere.chronosphere.Utilities;
import io.chronosphere.chronosphere.inputs.OpsgenieAlertNotifierState;
import io.chronosphere.chronosphere.outputs.OpsgenieAlertNotifierResponder;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="chronosphere:index/opsgenieAlertNotifier:OpsgenieAlertNotifier")
public class OpsgenieAlertNotifier extends com.pulumi.resources.CustomResource {
    @Export(name="apiKey", refs={String.class}, tree="[0]")
    private Output<String> apiKey;

    public Output<String> apiKey() {
        return this.apiKey;
    }
    @Export(name="apiUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> apiUrl;

    public Output<Optional<String>> apiUrl() {
        return Codegen.optional(this.apiUrl);
    }
    @Export(name="basicAuthPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> basicAuthPassword;

    public Output<Optional<String>> basicAuthPassword() {
        return Codegen.optional(this.basicAuthPassword);
    }
    @Export(name="basicAuthUsername", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> basicAuthUsername;

    public Output<Optional<String>> basicAuthUsername() {
        return Codegen.optional(this.basicAuthUsername);
    }
    @Export(name="bearerToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> bearerToken;

    public Output<Optional<String>> bearerToken() {
        return Codegen.optional(this.bearerToken);
    }
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    @Export(name="details", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> details;

    public Output<Optional<Map<String,String>>> details() {
        return Codegen.optional(this.details);
    }
    @Export(name="message", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> message;

    public Output<Optional<String>> message() {
        return Codegen.optional(this.message);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="note", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> note;

    public Output<Optional<String>> note() {
        return Codegen.optional(this.note);
    }
    @Export(name="priority", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> priority;

    public Output<Optional<String>> priority() {
        return Codegen.optional(this.priority);
    }
    /**
     * @deprecated
     * custom proxy URLs are not supported
     * 
     */
    @Deprecated /* custom proxy URLs are not supported */
    @Export(name="proxyUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> proxyUrl;

    public Output<Optional<String>> proxyUrl() {
        return Codegen.optional(this.proxyUrl);
    }
    @Export(name="responders", refs={List.class,OpsgenieAlertNotifierResponder.class}, tree="[0,1]")
    private Output</* @Nullable */ List<OpsgenieAlertNotifierResponder>> responders;

    public Output<Optional<List<OpsgenieAlertNotifierResponder>>> responders() {
        return Codegen.optional(this.responders);
    }
    @Export(name="sendResolved", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> sendResolved;

    public Output<Optional<Boolean>> sendResolved() {
        return Codegen.optional(this.sendResolved);
    }
    @Export(name="slug", refs={String.class}, tree="[0]")
    private Output<String> slug;

    public Output<String> slug() {
        return this.slug;
    }
    @Export(name="source", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> source;

    public Output<Optional<String>> source() {
        return Codegen.optional(this.source);
    }
    @Export(name="tags", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> tags;

    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tlsInsecureSkipVerify", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> tlsInsecureSkipVerify;

    public Output<Optional<Boolean>> tlsInsecureSkipVerify() {
        return Codegen.optional(this.tlsInsecureSkipVerify);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OpsgenieAlertNotifier(String name) {
        this(name, OpsgenieAlertNotifierArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OpsgenieAlertNotifier(String name, OpsgenieAlertNotifierArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OpsgenieAlertNotifier(String name, OpsgenieAlertNotifierArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/opsgenieAlertNotifier:OpsgenieAlertNotifier", name, args == null ? OpsgenieAlertNotifierArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OpsgenieAlertNotifier(String name, Output<String> id, @Nullable OpsgenieAlertNotifierState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/opsgenieAlertNotifier:OpsgenieAlertNotifier", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "apiKey",
                "basicAuthPassword"
            ))
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
    public static OpsgenieAlertNotifier get(String name, Output<String> id, @Nullable OpsgenieAlertNotifierState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OpsgenieAlertNotifier(name, id, state, options);
    }
}
