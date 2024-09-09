// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import io.chronosphere.chronosphere.LogscaleActionArgs;
import io.chronosphere.chronosphere.Utilities;
import io.chronosphere.chronosphere.inputs.LogscaleActionState;
import io.chronosphere.chronosphere.outputs.LogscaleActionEmailAction;
import io.chronosphere.chronosphere.outputs.LogscaleActionHumioAction;
import io.chronosphere.chronosphere.outputs.LogscaleActionOpsGenieAction;
import io.chronosphere.chronosphere.outputs.LogscaleActionPagerDutyAction;
import io.chronosphere.chronosphere.outputs.LogscaleActionSlackAction;
import io.chronosphere.chronosphere.outputs.LogscaleActionSlackPostMessageAction;
import io.chronosphere.chronosphere.outputs.LogscaleActionUploadFileAction;
import io.chronosphere.chronosphere.outputs.LogscaleActionVictorOpsAction;
import io.chronosphere.chronosphere.outputs.LogscaleActionWebhookAction;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="chronosphere:index/logscaleAction:LogscaleAction")
public class LogscaleAction extends com.pulumi.resources.CustomResource {
    @Export(name="emailAction", refs={LogscaleActionEmailAction.class}, tree="[0]")
    private Output</* @Nullable */ LogscaleActionEmailAction> emailAction;

    public Output<Optional<LogscaleActionEmailAction>> emailAction() {
        return Codegen.optional(this.emailAction);
    }
    @Export(name="humioAction", refs={LogscaleActionHumioAction.class}, tree="[0]")
    private Output</* @Nullable */ LogscaleActionHumioAction> humioAction;

    public Output<Optional<LogscaleActionHumioAction>> humioAction() {
        return Codegen.optional(this.humioAction);
    }
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }
    @Export(name="opsGenieAction", refs={LogscaleActionOpsGenieAction.class}, tree="[0]")
    private Output</* @Nullable */ LogscaleActionOpsGenieAction> opsGenieAction;

    public Output<Optional<LogscaleActionOpsGenieAction>> opsGenieAction() {
        return Codegen.optional(this.opsGenieAction);
    }
    @Export(name="pagerDutyAction", refs={LogscaleActionPagerDutyAction.class}, tree="[0]")
    private Output</* @Nullable */ LogscaleActionPagerDutyAction> pagerDutyAction;

    public Output<Optional<LogscaleActionPagerDutyAction>> pagerDutyAction() {
        return Codegen.optional(this.pagerDutyAction);
    }
    @Export(name="repository", refs={String.class}, tree="[0]")
    private Output<String> repository;

    public Output<String> repository() {
        return this.repository;
    }
    @Export(name="slackAction", refs={LogscaleActionSlackAction.class}, tree="[0]")
    private Output</* @Nullable */ LogscaleActionSlackAction> slackAction;

    public Output<Optional<LogscaleActionSlackAction>> slackAction() {
        return Codegen.optional(this.slackAction);
    }
    @Export(name="slackPostMessageAction", refs={LogscaleActionSlackPostMessageAction.class}, tree="[0]")
    private Output</* @Nullable */ LogscaleActionSlackPostMessageAction> slackPostMessageAction;

    public Output<Optional<LogscaleActionSlackPostMessageAction>> slackPostMessageAction() {
        return Codegen.optional(this.slackPostMessageAction);
    }
    @Export(name="slug", refs={String.class}, tree="[0]")
    private Output<String> slug;

    public Output<String> slug() {
        return this.slug;
    }
    @Export(name="uploadFileAction", refs={LogscaleActionUploadFileAction.class}, tree="[0]")
    private Output</* @Nullable */ LogscaleActionUploadFileAction> uploadFileAction;

    public Output<Optional<LogscaleActionUploadFileAction>> uploadFileAction() {
        return Codegen.optional(this.uploadFileAction);
    }
    @Export(name="victorOpsAction", refs={LogscaleActionVictorOpsAction.class}, tree="[0]")
    private Output</* @Nullable */ LogscaleActionVictorOpsAction> victorOpsAction;

    public Output<Optional<LogscaleActionVictorOpsAction>> victorOpsAction() {
        return Codegen.optional(this.victorOpsAction);
    }
    @Export(name="webhookAction", refs={LogscaleActionWebhookAction.class}, tree="[0]")
    private Output</* @Nullable */ LogscaleActionWebhookAction> webhookAction;

    public Output<Optional<LogscaleActionWebhookAction>> webhookAction() {
        return Codegen.optional(this.webhookAction);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogscaleAction(String name) {
        this(name, LogscaleActionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogscaleAction(String name, LogscaleActionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogscaleAction(String name, LogscaleActionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/logscaleAction:LogscaleAction", name, args == null ? LogscaleActionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogscaleAction(String name, Output<String> id, @Nullable LogscaleActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("chronosphere:index/logscaleAction:LogscaleAction", name, state, makeResourceOptions(options, id));
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
    public static LogscaleAction get(String name, Output<String> id, @Nullable LogscaleActionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogscaleAction(name, id, state, options);
    }
}
