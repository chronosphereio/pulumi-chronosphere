// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.chronosphere.chronosphere.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import io.chronosphere.chronosphere.inputs.LogscaleActionEmailActionArgs;
import io.chronosphere.chronosphere.inputs.LogscaleActionHumioActionArgs;
import io.chronosphere.chronosphere.inputs.LogscaleActionOpsGenieActionArgs;
import io.chronosphere.chronosphere.inputs.LogscaleActionPagerDutyActionArgs;
import io.chronosphere.chronosphere.inputs.LogscaleActionSlackActionArgs;
import io.chronosphere.chronosphere.inputs.LogscaleActionSlackPostMessageActionArgs;
import io.chronosphere.chronosphere.inputs.LogscaleActionUploadFileActionArgs;
import io.chronosphere.chronosphere.inputs.LogscaleActionVictorOpsActionArgs;
import io.chronosphere.chronosphere.inputs.LogscaleActionWebhookActionArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LogscaleActionState extends com.pulumi.resources.ResourceArgs {

    public static final LogscaleActionState Empty = new LogscaleActionState();

    @Import(name="emailAction")
    private @Nullable Output<LogscaleActionEmailActionArgs> emailAction;

    public Optional<Output<LogscaleActionEmailActionArgs>> emailAction() {
        return Optional.ofNullable(this.emailAction);
    }

    @Import(name="humioAction")
    private @Nullable Output<LogscaleActionHumioActionArgs> humioAction;

    public Optional<Output<LogscaleActionHumioActionArgs>> humioAction() {
        return Optional.ofNullable(this.humioAction);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="opsGenieAction")
    private @Nullable Output<LogscaleActionOpsGenieActionArgs> opsGenieAction;

    public Optional<Output<LogscaleActionOpsGenieActionArgs>> opsGenieAction() {
        return Optional.ofNullable(this.opsGenieAction);
    }

    @Import(name="pagerDutyAction")
    private @Nullable Output<LogscaleActionPagerDutyActionArgs> pagerDutyAction;

    public Optional<Output<LogscaleActionPagerDutyActionArgs>> pagerDutyAction() {
        return Optional.ofNullable(this.pagerDutyAction);
    }

    @Import(name="repository")
    private @Nullable Output<String> repository;

    public Optional<Output<String>> repository() {
        return Optional.ofNullable(this.repository);
    }

    @Import(name="slackAction")
    private @Nullable Output<LogscaleActionSlackActionArgs> slackAction;

    public Optional<Output<LogscaleActionSlackActionArgs>> slackAction() {
        return Optional.ofNullable(this.slackAction);
    }

    @Import(name="slackPostMessageAction")
    private @Nullable Output<LogscaleActionSlackPostMessageActionArgs> slackPostMessageAction;

    public Optional<Output<LogscaleActionSlackPostMessageActionArgs>> slackPostMessageAction() {
        return Optional.ofNullable(this.slackPostMessageAction);
    }

    @Import(name="slug")
    private @Nullable Output<String> slug;

    public Optional<Output<String>> slug() {
        return Optional.ofNullable(this.slug);
    }

    @Import(name="uploadFileAction")
    private @Nullable Output<LogscaleActionUploadFileActionArgs> uploadFileAction;

    public Optional<Output<LogscaleActionUploadFileActionArgs>> uploadFileAction() {
        return Optional.ofNullable(this.uploadFileAction);
    }

    @Import(name="victorOpsAction")
    private @Nullable Output<LogscaleActionVictorOpsActionArgs> victorOpsAction;

    public Optional<Output<LogscaleActionVictorOpsActionArgs>> victorOpsAction() {
        return Optional.ofNullable(this.victorOpsAction);
    }

    @Import(name="webhookAction")
    private @Nullable Output<LogscaleActionWebhookActionArgs> webhookAction;

    public Optional<Output<LogscaleActionWebhookActionArgs>> webhookAction() {
        return Optional.ofNullable(this.webhookAction);
    }

    private LogscaleActionState() {}

    private LogscaleActionState(LogscaleActionState $) {
        this.emailAction = $.emailAction;
        this.humioAction = $.humioAction;
        this.name = $.name;
        this.opsGenieAction = $.opsGenieAction;
        this.pagerDutyAction = $.pagerDutyAction;
        this.repository = $.repository;
        this.slackAction = $.slackAction;
        this.slackPostMessageAction = $.slackPostMessageAction;
        this.slug = $.slug;
        this.uploadFileAction = $.uploadFileAction;
        this.victorOpsAction = $.victorOpsAction;
        this.webhookAction = $.webhookAction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogscaleActionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogscaleActionState $;

        public Builder() {
            $ = new LogscaleActionState();
        }

        public Builder(LogscaleActionState defaults) {
            $ = new LogscaleActionState(Objects.requireNonNull(defaults));
        }

        public Builder emailAction(@Nullable Output<LogscaleActionEmailActionArgs> emailAction) {
            $.emailAction = emailAction;
            return this;
        }

        public Builder emailAction(LogscaleActionEmailActionArgs emailAction) {
            return emailAction(Output.of(emailAction));
        }

        public Builder humioAction(@Nullable Output<LogscaleActionHumioActionArgs> humioAction) {
            $.humioAction = humioAction;
            return this;
        }

        public Builder humioAction(LogscaleActionHumioActionArgs humioAction) {
            return humioAction(Output.of(humioAction));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder opsGenieAction(@Nullable Output<LogscaleActionOpsGenieActionArgs> opsGenieAction) {
            $.opsGenieAction = opsGenieAction;
            return this;
        }

        public Builder opsGenieAction(LogscaleActionOpsGenieActionArgs opsGenieAction) {
            return opsGenieAction(Output.of(opsGenieAction));
        }

        public Builder pagerDutyAction(@Nullable Output<LogscaleActionPagerDutyActionArgs> pagerDutyAction) {
            $.pagerDutyAction = pagerDutyAction;
            return this;
        }

        public Builder pagerDutyAction(LogscaleActionPagerDutyActionArgs pagerDutyAction) {
            return pagerDutyAction(Output.of(pagerDutyAction));
        }

        public Builder repository(@Nullable Output<String> repository) {
            $.repository = repository;
            return this;
        }

        public Builder repository(String repository) {
            return repository(Output.of(repository));
        }

        public Builder slackAction(@Nullable Output<LogscaleActionSlackActionArgs> slackAction) {
            $.slackAction = slackAction;
            return this;
        }

        public Builder slackAction(LogscaleActionSlackActionArgs slackAction) {
            return slackAction(Output.of(slackAction));
        }

        public Builder slackPostMessageAction(@Nullable Output<LogscaleActionSlackPostMessageActionArgs> slackPostMessageAction) {
            $.slackPostMessageAction = slackPostMessageAction;
            return this;
        }

        public Builder slackPostMessageAction(LogscaleActionSlackPostMessageActionArgs slackPostMessageAction) {
            return slackPostMessageAction(Output.of(slackPostMessageAction));
        }

        public Builder slug(@Nullable Output<String> slug) {
            $.slug = slug;
            return this;
        }

        public Builder slug(String slug) {
            return slug(Output.of(slug));
        }

        public Builder uploadFileAction(@Nullable Output<LogscaleActionUploadFileActionArgs> uploadFileAction) {
            $.uploadFileAction = uploadFileAction;
            return this;
        }

        public Builder uploadFileAction(LogscaleActionUploadFileActionArgs uploadFileAction) {
            return uploadFileAction(Output.of(uploadFileAction));
        }

        public Builder victorOpsAction(@Nullable Output<LogscaleActionVictorOpsActionArgs> victorOpsAction) {
            $.victorOpsAction = victorOpsAction;
            return this;
        }

        public Builder victorOpsAction(LogscaleActionVictorOpsActionArgs victorOpsAction) {
            return victorOpsAction(Output.of(victorOpsAction));
        }

        public Builder webhookAction(@Nullable Output<LogscaleActionWebhookActionArgs> webhookAction) {
            $.webhookAction = webhookAction;
            return this;
        }

        public Builder webhookAction(LogscaleActionWebhookActionArgs webhookAction) {
            return webhookAction(Output.of(webhookAction));
        }

        public LogscaleActionState build() {
            return $;
        }
    }

}