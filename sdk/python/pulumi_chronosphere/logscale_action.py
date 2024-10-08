# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['LogscaleActionArgs', 'LogscaleAction']

@pulumi.input_type
class LogscaleActionArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 repository: pulumi.Input[str],
                 email_action: Optional[pulumi.Input['LogscaleActionEmailActionArgs']] = None,
                 humio_action: Optional[pulumi.Input['LogscaleActionHumioActionArgs']] = None,
                 ops_genie_action: Optional[pulumi.Input['LogscaleActionOpsGenieActionArgs']] = None,
                 pager_duty_action: Optional[pulumi.Input['LogscaleActionPagerDutyActionArgs']] = None,
                 slack_action: Optional[pulumi.Input['LogscaleActionSlackActionArgs']] = None,
                 slack_post_message_action: Optional[pulumi.Input['LogscaleActionSlackPostMessageActionArgs']] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 upload_file_action: Optional[pulumi.Input['LogscaleActionUploadFileActionArgs']] = None,
                 victor_ops_action: Optional[pulumi.Input['LogscaleActionVictorOpsActionArgs']] = None,
                 webhook_action: Optional[pulumi.Input['LogscaleActionWebhookActionArgs']] = None):
        """
        The set of arguments for constructing a LogscaleAction resource.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "repository", repository)
        if email_action is not None:
            pulumi.set(__self__, "email_action", email_action)
        if humio_action is not None:
            pulumi.set(__self__, "humio_action", humio_action)
        if ops_genie_action is not None:
            pulumi.set(__self__, "ops_genie_action", ops_genie_action)
        if pager_duty_action is not None:
            pulumi.set(__self__, "pager_duty_action", pager_duty_action)
        if slack_action is not None:
            pulumi.set(__self__, "slack_action", slack_action)
        if slack_post_message_action is not None:
            pulumi.set(__self__, "slack_post_message_action", slack_post_message_action)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)
        if upload_file_action is not None:
            pulumi.set(__self__, "upload_file_action", upload_file_action)
        if victor_ops_action is not None:
            pulumi.set(__self__, "victor_ops_action", victor_ops_action)
        if webhook_action is not None:
            pulumi.set(__self__, "webhook_action", webhook_action)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Input[str]:
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: pulumi.Input[str]):
        pulumi.set(self, "repository", value)

    @property
    @pulumi.getter(name="emailAction")
    def email_action(self) -> Optional[pulumi.Input['LogscaleActionEmailActionArgs']]:
        return pulumi.get(self, "email_action")

    @email_action.setter
    def email_action(self, value: Optional[pulumi.Input['LogscaleActionEmailActionArgs']]):
        pulumi.set(self, "email_action", value)

    @property
    @pulumi.getter(name="humioAction")
    def humio_action(self) -> Optional[pulumi.Input['LogscaleActionHumioActionArgs']]:
        return pulumi.get(self, "humio_action")

    @humio_action.setter
    def humio_action(self, value: Optional[pulumi.Input['LogscaleActionHumioActionArgs']]):
        pulumi.set(self, "humio_action", value)

    @property
    @pulumi.getter(name="opsGenieAction")
    def ops_genie_action(self) -> Optional[pulumi.Input['LogscaleActionOpsGenieActionArgs']]:
        return pulumi.get(self, "ops_genie_action")

    @ops_genie_action.setter
    def ops_genie_action(self, value: Optional[pulumi.Input['LogscaleActionOpsGenieActionArgs']]):
        pulumi.set(self, "ops_genie_action", value)

    @property
    @pulumi.getter(name="pagerDutyAction")
    def pager_duty_action(self) -> Optional[pulumi.Input['LogscaleActionPagerDutyActionArgs']]:
        return pulumi.get(self, "pager_duty_action")

    @pager_duty_action.setter
    def pager_duty_action(self, value: Optional[pulumi.Input['LogscaleActionPagerDutyActionArgs']]):
        pulumi.set(self, "pager_duty_action", value)

    @property
    @pulumi.getter(name="slackAction")
    def slack_action(self) -> Optional[pulumi.Input['LogscaleActionSlackActionArgs']]:
        return pulumi.get(self, "slack_action")

    @slack_action.setter
    def slack_action(self, value: Optional[pulumi.Input['LogscaleActionSlackActionArgs']]):
        pulumi.set(self, "slack_action", value)

    @property
    @pulumi.getter(name="slackPostMessageAction")
    def slack_post_message_action(self) -> Optional[pulumi.Input['LogscaleActionSlackPostMessageActionArgs']]:
        return pulumi.get(self, "slack_post_message_action")

    @slack_post_message_action.setter
    def slack_post_message_action(self, value: Optional[pulumi.Input['LogscaleActionSlackPostMessageActionArgs']]):
        pulumi.set(self, "slack_post_message_action", value)

    @property
    @pulumi.getter
    def slug(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "slug")

    @slug.setter
    def slug(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slug", value)

    @property
    @pulumi.getter(name="uploadFileAction")
    def upload_file_action(self) -> Optional[pulumi.Input['LogscaleActionUploadFileActionArgs']]:
        return pulumi.get(self, "upload_file_action")

    @upload_file_action.setter
    def upload_file_action(self, value: Optional[pulumi.Input['LogscaleActionUploadFileActionArgs']]):
        pulumi.set(self, "upload_file_action", value)

    @property
    @pulumi.getter(name="victorOpsAction")
    def victor_ops_action(self) -> Optional[pulumi.Input['LogscaleActionVictorOpsActionArgs']]:
        return pulumi.get(self, "victor_ops_action")

    @victor_ops_action.setter
    def victor_ops_action(self, value: Optional[pulumi.Input['LogscaleActionVictorOpsActionArgs']]):
        pulumi.set(self, "victor_ops_action", value)

    @property
    @pulumi.getter(name="webhookAction")
    def webhook_action(self) -> Optional[pulumi.Input['LogscaleActionWebhookActionArgs']]:
        return pulumi.get(self, "webhook_action")

    @webhook_action.setter
    def webhook_action(self, value: Optional[pulumi.Input['LogscaleActionWebhookActionArgs']]):
        pulumi.set(self, "webhook_action", value)


@pulumi.input_type
class _LogscaleActionState:
    def __init__(__self__, *,
                 email_action: Optional[pulumi.Input['LogscaleActionEmailActionArgs']] = None,
                 humio_action: Optional[pulumi.Input['LogscaleActionHumioActionArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ops_genie_action: Optional[pulumi.Input['LogscaleActionOpsGenieActionArgs']] = None,
                 pager_duty_action: Optional[pulumi.Input['LogscaleActionPagerDutyActionArgs']] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 slack_action: Optional[pulumi.Input['LogscaleActionSlackActionArgs']] = None,
                 slack_post_message_action: Optional[pulumi.Input['LogscaleActionSlackPostMessageActionArgs']] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 upload_file_action: Optional[pulumi.Input['LogscaleActionUploadFileActionArgs']] = None,
                 victor_ops_action: Optional[pulumi.Input['LogscaleActionVictorOpsActionArgs']] = None,
                 webhook_action: Optional[pulumi.Input['LogscaleActionWebhookActionArgs']] = None):
        """
        Input properties used for looking up and filtering LogscaleAction resources.
        """
        if email_action is not None:
            pulumi.set(__self__, "email_action", email_action)
        if humio_action is not None:
            pulumi.set(__self__, "humio_action", humio_action)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if ops_genie_action is not None:
            pulumi.set(__self__, "ops_genie_action", ops_genie_action)
        if pager_duty_action is not None:
            pulumi.set(__self__, "pager_duty_action", pager_duty_action)
        if repository is not None:
            pulumi.set(__self__, "repository", repository)
        if slack_action is not None:
            pulumi.set(__self__, "slack_action", slack_action)
        if slack_post_message_action is not None:
            pulumi.set(__self__, "slack_post_message_action", slack_post_message_action)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)
        if upload_file_action is not None:
            pulumi.set(__self__, "upload_file_action", upload_file_action)
        if victor_ops_action is not None:
            pulumi.set(__self__, "victor_ops_action", victor_ops_action)
        if webhook_action is not None:
            pulumi.set(__self__, "webhook_action", webhook_action)

    @property
    @pulumi.getter(name="emailAction")
    def email_action(self) -> Optional[pulumi.Input['LogscaleActionEmailActionArgs']]:
        return pulumi.get(self, "email_action")

    @email_action.setter
    def email_action(self, value: Optional[pulumi.Input['LogscaleActionEmailActionArgs']]):
        pulumi.set(self, "email_action", value)

    @property
    @pulumi.getter(name="humioAction")
    def humio_action(self) -> Optional[pulumi.Input['LogscaleActionHumioActionArgs']]:
        return pulumi.get(self, "humio_action")

    @humio_action.setter
    def humio_action(self, value: Optional[pulumi.Input['LogscaleActionHumioActionArgs']]):
        pulumi.set(self, "humio_action", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="opsGenieAction")
    def ops_genie_action(self) -> Optional[pulumi.Input['LogscaleActionOpsGenieActionArgs']]:
        return pulumi.get(self, "ops_genie_action")

    @ops_genie_action.setter
    def ops_genie_action(self, value: Optional[pulumi.Input['LogscaleActionOpsGenieActionArgs']]):
        pulumi.set(self, "ops_genie_action", value)

    @property
    @pulumi.getter(name="pagerDutyAction")
    def pager_duty_action(self) -> Optional[pulumi.Input['LogscaleActionPagerDutyActionArgs']]:
        return pulumi.get(self, "pager_duty_action")

    @pager_duty_action.setter
    def pager_duty_action(self, value: Optional[pulumi.Input['LogscaleActionPagerDutyActionArgs']]):
        pulumi.set(self, "pager_duty_action", value)

    @property
    @pulumi.getter
    def repository(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository", value)

    @property
    @pulumi.getter(name="slackAction")
    def slack_action(self) -> Optional[pulumi.Input['LogscaleActionSlackActionArgs']]:
        return pulumi.get(self, "slack_action")

    @slack_action.setter
    def slack_action(self, value: Optional[pulumi.Input['LogscaleActionSlackActionArgs']]):
        pulumi.set(self, "slack_action", value)

    @property
    @pulumi.getter(name="slackPostMessageAction")
    def slack_post_message_action(self) -> Optional[pulumi.Input['LogscaleActionSlackPostMessageActionArgs']]:
        return pulumi.get(self, "slack_post_message_action")

    @slack_post_message_action.setter
    def slack_post_message_action(self, value: Optional[pulumi.Input['LogscaleActionSlackPostMessageActionArgs']]):
        pulumi.set(self, "slack_post_message_action", value)

    @property
    @pulumi.getter
    def slug(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "slug")

    @slug.setter
    def slug(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slug", value)

    @property
    @pulumi.getter(name="uploadFileAction")
    def upload_file_action(self) -> Optional[pulumi.Input['LogscaleActionUploadFileActionArgs']]:
        return pulumi.get(self, "upload_file_action")

    @upload_file_action.setter
    def upload_file_action(self, value: Optional[pulumi.Input['LogscaleActionUploadFileActionArgs']]):
        pulumi.set(self, "upload_file_action", value)

    @property
    @pulumi.getter(name="victorOpsAction")
    def victor_ops_action(self) -> Optional[pulumi.Input['LogscaleActionVictorOpsActionArgs']]:
        return pulumi.get(self, "victor_ops_action")

    @victor_ops_action.setter
    def victor_ops_action(self, value: Optional[pulumi.Input['LogscaleActionVictorOpsActionArgs']]):
        pulumi.set(self, "victor_ops_action", value)

    @property
    @pulumi.getter(name="webhookAction")
    def webhook_action(self) -> Optional[pulumi.Input['LogscaleActionWebhookActionArgs']]:
        return pulumi.get(self, "webhook_action")

    @webhook_action.setter
    def webhook_action(self, value: Optional[pulumi.Input['LogscaleActionWebhookActionArgs']]):
        pulumi.set(self, "webhook_action", value)


class LogscaleAction(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 email_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionEmailActionArgs']]] = None,
                 humio_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionHumioActionArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ops_genie_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionOpsGenieActionArgs']]] = None,
                 pager_duty_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionPagerDutyActionArgs']]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 slack_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionSlackActionArgs']]] = None,
                 slack_post_message_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionSlackPostMessageActionArgs']]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 upload_file_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionUploadFileActionArgs']]] = None,
                 victor_ops_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionVictorOpsActionArgs']]] = None,
                 webhook_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionWebhookActionArgs']]] = None,
                 __props__=None):
        """
        Create a LogscaleAction resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LogscaleActionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a LogscaleAction resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param LogscaleActionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LogscaleActionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 email_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionEmailActionArgs']]] = None,
                 humio_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionHumioActionArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 ops_genie_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionOpsGenieActionArgs']]] = None,
                 pager_duty_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionPagerDutyActionArgs']]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 slack_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionSlackActionArgs']]] = None,
                 slack_post_message_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionSlackPostMessageActionArgs']]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 upload_file_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionUploadFileActionArgs']]] = None,
                 victor_ops_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionVictorOpsActionArgs']]] = None,
                 webhook_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionWebhookActionArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LogscaleActionArgs.__new__(LogscaleActionArgs)

            __props__.__dict__["email_action"] = email_action
            __props__.__dict__["humio_action"] = humio_action
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["ops_genie_action"] = ops_genie_action
            __props__.__dict__["pager_duty_action"] = pager_duty_action
            if repository is None and not opts.urn:
                raise TypeError("Missing required property 'repository'")
            __props__.__dict__["repository"] = repository
            __props__.__dict__["slack_action"] = slack_action
            __props__.__dict__["slack_post_message_action"] = slack_post_message_action
            __props__.__dict__["slug"] = slug
            __props__.__dict__["upload_file_action"] = upload_file_action
            __props__.__dict__["victor_ops_action"] = victor_ops_action
            __props__.__dict__["webhook_action"] = webhook_action
        super(LogscaleAction, __self__).__init__(
            'chronosphere:index/logscaleAction:LogscaleAction',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            email_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionEmailActionArgs']]] = None,
            humio_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionHumioActionArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            ops_genie_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionOpsGenieActionArgs']]] = None,
            pager_duty_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionPagerDutyActionArgs']]] = None,
            repository: Optional[pulumi.Input[str]] = None,
            slack_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionSlackActionArgs']]] = None,
            slack_post_message_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionSlackPostMessageActionArgs']]] = None,
            slug: Optional[pulumi.Input[str]] = None,
            upload_file_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionUploadFileActionArgs']]] = None,
            victor_ops_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionVictorOpsActionArgs']]] = None,
            webhook_action: Optional[pulumi.Input[pulumi.InputType['LogscaleActionWebhookActionArgs']]] = None) -> 'LogscaleAction':
        """
        Get an existing LogscaleAction resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LogscaleActionState.__new__(_LogscaleActionState)

        __props__.__dict__["email_action"] = email_action
        __props__.__dict__["humio_action"] = humio_action
        __props__.__dict__["name"] = name
        __props__.__dict__["ops_genie_action"] = ops_genie_action
        __props__.__dict__["pager_duty_action"] = pager_duty_action
        __props__.__dict__["repository"] = repository
        __props__.__dict__["slack_action"] = slack_action
        __props__.__dict__["slack_post_message_action"] = slack_post_message_action
        __props__.__dict__["slug"] = slug
        __props__.__dict__["upload_file_action"] = upload_file_action
        __props__.__dict__["victor_ops_action"] = victor_ops_action
        __props__.__dict__["webhook_action"] = webhook_action
        return LogscaleAction(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="emailAction")
    def email_action(self) -> pulumi.Output[Optional['outputs.LogscaleActionEmailAction']]:
        return pulumi.get(self, "email_action")

    @property
    @pulumi.getter(name="humioAction")
    def humio_action(self) -> pulumi.Output[Optional['outputs.LogscaleActionHumioAction']]:
        return pulumi.get(self, "humio_action")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="opsGenieAction")
    def ops_genie_action(self) -> pulumi.Output[Optional['outputs.LogscaleActionOpsGenieAction']]:
        return pulumi.get(self, "ops_genie_action")

    @property
    @pulumi.getter(name="pagerDutyAction")
    def pager_duty_action(self) -> pulumi.Output[Optional['outputs.LogscaleActionPagerDutyAction']]:
        return pulumi.get(self, "pager_duty_action")

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Output[str]:
        return pulumi.get(self, "repository")

    @property
    @pulumi.getter(name="slackAction")
    def slack_action(self) -> pulumi.Output[Optional['outputs.LogscaleActionSlackAction']]:
        return pulumi.get(self, "slack_action")

    @property
    @pulumi.getter(name="slackPostMessageAction")
    def slack_post_message_action(self) -> pulumi.Output[Optional['outputs.LogscaleActionSlackPostMessageAction']]:
        return pulumi.get(self, "slack_post_message_action")

    @property
    @pulumi.getter
    def slug(self) -> pulumi.Output[str]:
        return pulumi.get(self, "slug")

    @property
    @pulumi.getter(name="uploadFileAction")
    def upload_file_action(self) -> pulumi.Output[Optional['outputs.LogscaleActionUploadFileAction']]:
        return pulumi.get(self, "upload_file_action")

    @property
    @pulumi.getter(name="victorOpsAction")
    def victor_ops_action(self) -> pulumi.Output[Optional['outputs.LogscaleActionVictorOpsAction']]:
        return pulumi.get(self, "victor_ops_action")

    @property
    @pulumi.getter(name="webhookAction")
    def webhook_action(self) -> pulumi.Output[Optional['outputs.LogscaleActionWebhookAction']]:
        return pulumi.get(self, "webhook_action")

