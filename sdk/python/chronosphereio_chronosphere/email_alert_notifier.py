# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['EmailAlertNotifierArgs', 'EmailAlertNotifier']

@pulumi.input_type
class EmailAlertNotifierArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 to: pulumi.Input[str],
                 html: Optional[pulumi.Input[str]] = None,
                 send_resolved: Optional[pulumi.Input[bool]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 text: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a EmailAlertNotifier resource.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "to", to)
        if html is not None:
            pulumi.set(__self__, "html", html)
        if send_resolved is not None:
            pulumi.set(__self__, "send_resolved", send_resolved)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)
        if text is not None:
            pulumi.set(__self__, "text", text)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def to(self) -> pulumi.Input[str]:
        return pulumi.get(self, "to")

    @to.setter
    def to(self, value: pulumi.Input[str]):
        pulumi.set(self, "to", value)

    @property
    @pulumi.getter
    def html(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "html")

    @html.setter
    def html(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "html", value)

    @property
    @pulumi.getter(name="sendResolved")
    def send_resolved(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "send_resolved")

    @send_resolved.setter
    def send_resolved(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "send_resolved", value)

    @property
    @pulumi.getter
    def slug(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "slug")

    @slug.setter
    def slug(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slug", value)

    @property
    @pulumi.getter
    def text(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "text")

    @text.setter
    def text(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "text", value)


@pulumi.input_type
class _EmailAlertNotifierState:
    def __init__(__self__, *,
                 html: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 send_resolved: Optional[pulumi.Input[bool]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 text: Optional[pulumi.Input[str]] = None,
                 to: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering EmailAlertNotifier resources.
        """
        if html is not None:
            pulumi.set(__self__, "html", html)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if send_resolved is not None:
            pulumi.set(__self__, "send_resolved", send_resolved)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)
        if text is not None:
            pulumi.set(__self__, "text", text)
        if to is not None:
            pulumi.set(__self__, "to", to)

    @property
    @pulumi.getter
    def html(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "html")

    @html.setter
    def html(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "html", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="sendResolved")
    def send_resolved(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "send_resolved")

    @send_resolved.setter
    def send_resolved(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "send_resolved", value)

    @property
    @pulumi.getter
    def slug(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "slug")

    @slug.setter
    def slug(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slug", value)

    @property
    @pulumi.getter
    def text(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "text")

    @text.setter
    def text(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "text", value)

    @property
    @pulumi.getter
    def to(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "to")

    @to.setter
    def to(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "to", value)


class EmailAlertNotifier(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 html: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 send_resolved: Optional[pulumi.Input[bool]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 text: Optional[pulumi.Input[str]] = None,
                 to: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a EmailAlertNotifier resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: EmailAlertNotifierArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a EmailAlertNotifier resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param EmailAlertNotifierArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(EmailAlertNotifierArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 html: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 send_resolved: Optional[pulumi.Input[bool]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 text: Optional[pulumi.Input[str]] = None,
                 to: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = EmailAlertNotifierArgs.__new__(EmailAlertNotifierArgs)

            __props__.__dict__["html"] = html
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["send_resolved"] = send_resolved
            __props__.__dict__["slug"] = slug
            __props__.__dict__["text"] = text
            if to is None and not opts.urn:
                raise TypeError("Missing required property 'to'")
            __props__.__dict__["to"] = to
        super(EmailAlertNotifier, __self__).__init__(
            'chronosphere:index/emailAlertNotifier:EmailAlertNotifier',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            html: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            send_resolved: Optional[pulumi.Input[bool]] = None,
            slug: Optional[pulumi.Input[str]] = None,
            text: Optional[pulumi.Input[str]] = None,
            to: Optional[pulumi.Input[str]] = None) -> 'EmailAlertNotifier':
        """
        Get an existing EmailAlertNotifier resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _EmailAlertNotifierState.__new__(_EmailAlertNotifierState)

        __props__.__dict__["html"] = html
        __props__.__dict__["name"] = name
        __props__.__dict__["send_resolved"] = send_resolved
        __props__.__dict__["slug"] = slug
        __props__.__dict__["text"] = text
        __props__.__dict__["to"] = to
        return EmailAlertNotifier(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def html(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "html")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="sendResolved")
    def send_resolved(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "send_resolved")

    @property
    @pulumi.getter
    def slug(self) -> pulumi.Output[str]:
        return pulumi.get(self, "slug")

    @property
    @pulumi.getter
    def text(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "text")

    @property
    @pulumi.getter
    def to(self) -> pulumi.Output[str]:
        return pulumi.get(self, "to")

