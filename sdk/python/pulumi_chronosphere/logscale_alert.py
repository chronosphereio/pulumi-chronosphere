# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['LogscaleAlertArgs', 'LogscaleAlert']

@pulumi.input_type
class LogscaleAlertArgs:
    def __init__(__self__, *,
                 alert_type: pulumi.Input[str],
                 name: pulumi.Input[str],
                 repository: pulumi.Input[str],
                 run_as_user: pulumi.Input[str],
                 action_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 query: Optional[pulumi.Input[str]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 throttle_duration: Optional[pulumi.Input[str]] = None,
                 throttle_field: Optional[pulumi.Input[str]] = None,
                 time_window: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a LogscaleAlert resource.
        :param pulumi.Input[str] run_as_user: Email of the user that the alert runs on behalf of
        :param pulumi.Input[str] throttle_duration: Required for STANDARD type alerts, optional for FILTER type alerts
        :param pulumi.Input[str] time_window: Required for STANDARD type alerts, ignored for FILTER type alerts
        """
        pulumi.set(__self__, "alert_type", alert_type)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "repository", repository)
        pulumi.set(__self__, "run_as_user", run_as_user)
        if action_ids is not None:
            pulumi.set(__self__, "action_ids", action_ids)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if query is not None:
            pulumi.set(__self__, "query", query)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if throttle_duration is not None:
            pulumi.set(__self__, "throttle_duration", throttle_duration)
        if throttle_field is not None:
            pulumi.set(__self__, "throttle_field", throttle_field)
        if time_window is not None:
            pulumi.set(__self__, "time_window", time_window)

    @property
    @pulumi.getter(name="alertType")
    def alert_type(self) -> pulumi.Input[str]:
        return pulumi.get(self, "alert_type")

    @alert_type.setter
    def alert_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "alert_type", value)

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
    @pulumi.getter(name="runAsUser")
    def run_as_user(self) -> pulumi.Input[str]:
        """
        Email of the user that the alert runs on behalf of
        """
        return pulumi.get(self, "run_as_user")

    @run_as_user.setter
    def run_as_user(self, value: pulumi.Input[str]):
        pulumi.set(self, "run_as_user", value)

    @property
    @pulumi.getter(name="actionIds")
    def action_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "action_ids")

    @action_ids.setter
    def action_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "action_ids", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disabled", value)

    @property
    @pulumi.getter
    def query(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "query")

    @query.setter
    def query(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "query", value)

    @property
    @pulumi.getter
    def slug(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "slug")

    @slug.setter
    def slug(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slug", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="throttleDuration")
    def throttle_duration(self) -> Optional[pulumi.Input[str]]:
        """
        Required for STANDARD type alerts, optional for FILTER type alerts
        """
        return pulumi.get(self, "throttle_duration")

    @throttle_duration.setter
    def throttle_duration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "throttle_duration", value)

    @property
    @pulumi.getter(name="throttleField")
    def throttle_field(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "throttle_field")

    @throttle_field.setter
    def throttle_field(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "throttle_field", value)

    @property
    @pulumi.getter(name="timeWindow")
    def time_window(self) -> Optional[pulumi.Input[str]]:
        """
        Required for STANDARD type alerts, ignored for FILTER type alerts
        """
        return pulumi.get(self, "time_window")

    @time_window.setter
    def time_window(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "time_window", value)


@pulumi.input_type
class _LogscaleAlertState:
    def __init__(__self__, *,
                 action_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 alert_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 query: Optional[pulumi.Input[str]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 run_as_user: Optional[pulumi.Input[str]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 throttle_duration: Optional[pulumi.Input[str]] = None,
                 throttle_field: Optional[pulumi.Input[str]] = None,
                 time_window: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering LogscaleAlert resources.
        :param pulumi.Input[str] run_as_user: Email of the user that the alert runs on behalf of
        :param pulumi.Input[str] throttle_duration: Required for STANDARD type alerts, optional for FILTER type alerts
        :param pulumi.Input[str] time_window: Required for STANDARD type alerts, ignored for FILTER type alerts
        """
        if action_ids is not None:
            pulumi.set(__self__, "action_ids", action_ids)
        if alert_type is not None:
            pulumi.set(__self__, "alert_type", alert_type)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if disabled is not None:
            pulumi.set(__self__, "disabled", disabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if query is not None:
            pulumi.set(__self__, "query", query)
        if repository is not None:
            pulumi.set(__self__, "repository", repository)
        if run_as_user is not None:
            pulumi.set(__self__, "run_as_user", run_as_user)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)
        if tags is not None:
            pulumi.set(__self__, "tags", tags)
        if throttle_duration is not None:
            pulumi.set(__self__, "throttle_duration", throttle_duration)
        if throttle_field is not None:
            pulumi.set(__self__, "throttle_field", throttle_field)
        if time_window is not None:
            pulumi.set(__self__, "time_window", time_window)

    @property
    @pulumi.getter(name="actionIds")
    def action_ids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "action_ids")

    @action_ids.setter
    def action_ids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "action_ids", value)

    @property
    @pulumi.getter(name="alertType")
    def alert_type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "alert_type")

    @alert_type.setter
    def alert_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "alert_type", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def disabled(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "disabled")

    @disabled.setter
    def disabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def query(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "query")

    @query.setter
    def query(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "query", value)

    @property
    @pulumi.getter
    def repository(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "repository")

    @repository.setter
    def repository(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "repository", value)

    @property
    @pulumi.getter(name="runAsUser")
    def run_as_user(self) -> Optional[pulumi.Input[str]]:
        """
        Email of the user that the alert runs on behalf of
        """
        return pulumi.get(self, "run_as_user")

    @run_as_user.setter
    def run_as_user(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "run_as_user", value)

    @property
    @pulumi.getter
    def slug(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "slug")

    @slug.setter
    def slug(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slug", value)

    @property
    @pulumi.getter
    def tags(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "tags")

    @tags.setter
    def tags(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "tags", value)

    @property
    @pulumi.getter(name="throttleDuration")
    def throttle_duration(self) -> Optional[pulumi.Input[str]]:
        """
        Required for STANDARD type alerts, optional for FILTER type alerts
        """
        return pulumi.get(self, "throttle_duration")

    @throttle_duration.setter
    def throttle_duration(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "throttle_duration", value)

    @property
    @pulumi.getter(name="throttleField")
    def throttle_field(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "throttle_field")

    @throttle_field.setter
    def throttle_field(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "throttle_field", value)

    @property
    @pulumi.getter(name="timeWindow")
    def time_window(self) -> Optional[pulumi.Input[str]]:
        """
        Required for STANDARD type alerts, ignored for FILTER type alerts
        """
        return pulumi.get(self, "time_window")

    @time_window.setter
    def time_window(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "time_window", value)


class LogscaleAlert(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 alert_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 query: Optional[pulumi.Input[str]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 run_as_user: Optional[pulumi.Input[str]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 throttle_duration: Optional[pulumi.Input[str]] = None,
                 throttle_field: Optional[pulumi.Input[str]] = None,
                 time_window: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a LogscaleAlert resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] run_as_user: Email of the user that the alert runs on behalf of
        :param pulumi.Input[str] throttle_duration: Required for STANDARD type alerts, optional for FILTER type alerts
        :param pulumi.Input[str] time_window: Required for STANDARD type alerts, ignored for FILTER type alerts
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: LogscaleAlertArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a LogscaleAlert resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param LogscaleAlertArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(LogscaleAlertArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 action_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 alert_type: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 disabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 query: Optional[pulumi.Input[str]] = None,
                 repository: Optional[pulumi.Input[str]] = None,
                 run_as_user: Optional[pulumi.Input[str]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 throttle_duration: Optional[pulumi.Input[str]] = None,
                 throttle_field: Optional[pulumi.Input[str]] = None,
                 time_window: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = LogscaleAlertArgs.__new__(LogscaleAlertArgs)

            __props__.__dict__["action_ids"] = action_ids
            if alert_type is None and not opts.urn:
                raise TypeError("Missing required property 'alert_type'")
            __props__.__dict__["alert_type"] = alert_type
            __props__.__dict__["description"] = description
            __props__.__dict__["disabled"] = disabled
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["query"] = query
            if repository is None and not opts.urn:
                raise TypeError("Missing required property 'repository'")
            __props__.__dict__["repository"] = repository
            if run_as_user is None and not opts.urn:
                raise TypeError("Missing required property 'run_as_user'")
            __props__.__dict__["run_as_user"] = run_as_user
            __props__.__dict__["slug"] = slug
            __props__.__dict__["tags"] = tags
            __props__.__dict__["throttle_duration"] = throttle_duration
            __props__.__dict__["throttle_field"] = throttle_field
            __props__.__dict__["time_window"] = time_window
        super(LogscaleAlert, __self__).__init__(
            'chronosphere:index/logscaleAlert:LogscaleAlert',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            action_ids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            alert_type: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            disabled: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            query: Optional[pulumi.Input[str]] = None,
            repository: Optional[pulumi.Input[str]] = None,
            run_as_user: Optional[pulumi.Input[str]] = None,
            slug: Optional[pulumi.Input[str]] = None,
            tags: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            throttle_duration: Optional[pulumi.Input[str]] = None,
            throttle_field: Optional[pulumi.Input[str]] = None,
            time_window: Optional[pulumi.Input[str]] = None) -> 'LogscaleAlert':
        """
        Get an existing LogscaleAlert resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] run_as_user: Email of the user that the alert runs on behalf of
        :param pulumi.Input[str] throttle_duration: Required for STANDARD type alerts, optional for FILTER type alerts
        :param pulumi.Input[str] time_window: Required for STANDARD type alerts, ignored for FILTER type alerts
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _LogscaleAlertState.__new__(_LogscaleAlertState)

        __props__.__dict__["action_ids"] = action_ids
        __props__.__dict__["alert_type"] = alert_type
        __props__.__dict__["description"] = description
        __props__.__dict__["disabled"] = disabled
        __props__.__dict__["name"] = name
        __props__.__dict__["query"] = query
        __props__.__dict__["repository"] = repository
        __props__.__dict__["run_as_user"] = run_as_user
        __props__.__dict__["slug"] = slug
        __props__.__dict__["tags"] = tags
        __props__.__dict__["throttle_duration"] = throttle_duration
        __props__.__dict__["throttle_field"] = throttle_field
        __props__.__dict__["time_window"] = time_window
        return LogscaleAlert(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="actionIds")
    def action_ids(self) -> pulumi.Output[Optional[Sequence[str]]]:
        return pulumi.get(self, "action_ids")

    @property
    @pulumi.getter(name="alertType")
    def alert_type(self) -> pulumi.Output[str]:
        return pulumi.get(self, "alert_type")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def disabled(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "disabled")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def query(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "query")

    @property
    @pulumi.getter
    def repository(self) -> pulumi.Output[str]:
        return pulumi.get(self, "repository")

    @property
    @pulumi.getter(name="runAsUser")
    def run_as_user(self) -> pulumi.Output[str]:
        """
        Email of the user that the alert runs on behalf of
        """
        return pulumi.get(self, "run_as_user")

    @property
    @pulumi.getter
    def slug(self) -> pulumi.Output[str]:
        return pulumi.get(self, "slug")

    @property
    @pulumi.getter
    def tags(self) -> pulumi.Output[Optional[Sequence[str]]]:
        return pulumi.get(self, "tags")

    @property
    @pulumi.getter(name="throttleDuration")
    def throttle_duration(self) -> pulumi.Output[Optional[str]]:
        """
        Required for STANDARD type alerts, optional for FILTER type alerts
        """
        return pulumi.get(self, "throttle_duration")

    @property
    @pulumi.getter(name="throttleField")
    def throttle_field(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "throttle_field")

    @property
    @pulumi.getter(name="timeWindow")
    def time_window(self) -> pulumi.Output[Optional[str]]:
        """
        Required for STANDARD type alerts, ignored for FILTER type alerts
        """
        return pulumi.get(self, "time_window")

