# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['ProviderArgs', 'Provider']

@pulumi.input_type
class ProviderArgs:
    def __init__(__self__, *,
                 api_token: Optional[pulumi.Input[str]] = None,
                 disable_dryrun: Optional[pulumi.Input[bool]] = None,
                 entity_namespace: Optional[pulumi.Input[str]] = None,
                 org: Optional[pulumi.Input[str]] = None,
                 unstable: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a Provider resource.
        """
        if api_token is None:
            api_token = _utilities.get_env('CHRONOSPHERE_API_TOKEN')
        if api_token is not None:
            pulumi.set(__self__, "api_token", api_token)
        if disable_dryrun is not None:
            pulumi.set(__self__, "disable_dryrun", disable_dryrun)
        if entity_namespace is not None:
            pulumi.set(__self__, "entity_namespace", entity_namespace)
        if org is None:
            org = _utilities.get_env('CHRONOSPHERE_ORG', 'CHRONOSPHERE_ORG_NAME')
        if org is not None:
            pulumi.set(__self__, "org", org)
        if unstable is not None:
            pulumi.set(__self__, "unstable", unstable)

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "api_token")

    @api_token.setter
    def api_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "api_token", value)

    @property
    @pulumi.getter(name="disableDryrun")
    def disable_dryrun(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "disable_dryrun")

    @disable_dryrun.setter
    def disable_dryrun(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "disable_dryrun", value)

    @property
    @pulumi.getter(name="entityNamespace")
    def entity_namespace(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "entity_namespace")

    @entity_namespace.setter
    def entity_namespace(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "entity_namespace", value)

    @property
    @pulumi.getter
    def org(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "org")

    @org.setter
    def org(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "org", value)

    @property
    @pulumi.getter
    def unstable(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "unstable")

    @unstable.setter
    def unstable(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "unstable", value)


class Provider(pulumi.ProviderResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_token: Optional[pulumi.Input[str]] = None,
                 disable_dryrun: Optional[pulumi.Input[bool]] = None,
                 entity_namespace: Optional[pulumi.Input[str]] = None,
                 org: Optional[pulumi.Input[str]] = None,
                 unstable: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        """
        The provider type for the chronosphere package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: Optional[ProviderArgs] = None,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        The provider type for the chronosphere package. By default, resources use package-wide configuration
        settings, however an explicit `Provider` instance may be created and passed during resource
        construction to achieve fine-grained programmatic control over provider settings. See the
        [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.

        :param str resource_name: The name of the resource.
        :param ProviderArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ProviderArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 api_token: Optional[pulumi.Input[str]] = None,
                 disable_dryrun: Optional[pulumi.Input[bool]] = None,
                 entity_namespace: Optional[pulumi.Input[str]] = None,
                 org: Optional[pulumi.Input[str]] = None,
                 unstable: Optional[pulumi.Input[bool]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ProviderArgs.__new__(ProviderArgs)

            if api_token is None:
                api_token = _utilities.get_env('CHRONOSPHERE_API_TOKEN')
            __props__.__dict__["api_token"] = None if api_token is None else pulumi.Output.secret(api_token)
            __props__.__dict__["disable_dryrun"] = pulumi.Output.from_input(disable_dryrun).apply(pulumi.runtime.to_json) if disable_dryrun is not None else None
            __props__.__dict__["entity_namespace"] = entity_namespace
            if org is None:
                org = _utilities.get_env('CHRONOSPHERE_ORG', 'CHRONOSPHERE_ORG_NAME')
            __props__.__dict__["org"] = org
            __props__.__dict__["unstable"] = pulumi.Output.from_input(unstable).apply(pulumi.runtime.to_json) if unstable is not None else None
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["apiToken"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(Provider, __self__).__init__(
            'chronosphere',
            resource_name,
            __props__,
            opts)

    @property
    @pulumi.getter(name="apiToken")
    def api_token(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "api_token")

    @property
    @pulumi.getter(name="entityNamespace")
    def entity_namespace(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "entity_namespace")

    @property
    @pulumi.getter
    def org(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "org")

