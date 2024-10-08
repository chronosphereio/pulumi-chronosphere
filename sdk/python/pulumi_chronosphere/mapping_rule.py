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

__all__ = ['MappingRuleArgs', 'MappingRule']

@pulumi.input_type
class MappingRuleArgs:
    def __init__(__self__, *,
                 filter: pulumi.Input[str],
                 name: pulumi.Input[str],
                 aggregations: Optional[pulumi.Input[str]] = None,
                 bucket_id: Optional[pulumi.Input[str]] = None,
                 drop: Optional[pulumi.Input[bool]] = None,
                 drop_timestamp: Optional[pulumi.Input[bool]] = None,
                 interval: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 storage_policy: Optional[pulumi.Input['MappingRuleStoragePolicyArgs']] = None):
        """
        The set of arguments for constructing a MappingRule resource.
        """
        pulumi.set(__self__, "filter", filter)
        pulumi.set(__self__, "name", name)
        if aggregations is not None:
            pulumi.set(__self__, "aggregations", aggregations)
        if bucket_id is not None:
            pulumi.set(__self__, "bucket_id", bucket_id)
        if drop is not None:
            pulumi.set(__self__, "drop", drop)
        if drop_timestamp is not None:
            warnings.warn("""drop timestamp is no longer supported""", DeprecationWarning)
            pulumi.log.warn("""drop_timestamp is deprecated: drop timestamp is no longer supported""")
        if drop_timestamp is not None:
            pulumi.set(__self__, "drop_timestamp", drop_timestamp)
        if interval is not None:
            pulumi.set(__self__, "interval", interval)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)
        if storage_policy is not None:
            warnings.warn("""use `interval` instead""", DeprecationWarning)
            pulumi.log.warn("""storage_policy is deprecated: use `interval` instead""")
        if storage_policy is not None:
            pulumi.set(__self__, "storage_policy", storage_policy)

    @property
    @pulumi.getter
    def filter(self) -> pulumi.Input[str]:
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: pulumi.Input[str]):
        pulumi.set(self, "filter", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def aggregations(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "aggregations")

    @aggregations.setter
    def aggregations(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aggregations", value)

    @property
    @pulumi.getter(name="bucketId")
    def bucket_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "bucket_id")

    @bucket_id.setter
    def bucket_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket_id", value)

    @property
    @pulumi.getter
    def drop(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "drop")

    @drop.setter
    def drop(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "drop", value)

    @property
    @pulumi.getter(name="dropTimestamp")
    def drop_timestamp(self) -> Optional[pulumi.Input[bool]]:
        warnings.warn("""drop timestamp is no longer supported""", DeprecationWarning)
        pulumi.log.warn("""drop_timestamp is deprecated: drop timestamp is no longer supported""")

        return pulumi.get(self, "drop_timestamp")

    @drop_timestamp.setter
    def drop_timestamp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "drop_timestamp", value)

    @property
    @pulumi.getter
    def interval(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def slug(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "slug")

    @slug.setter
    def slug(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slug", value)

    @property
    @pulumi.getter(name="storagePolicy")
    def storage_policy(self) -> Optional[pulumi.Input['MappingRuleStoragePolicyArgs']]:
        warnings.warn("""use `interval` instead""", DeprecationWarning)
        pulumi.log.warn("""storage_policy is deprecated: use `interval` instead""")

        return pulumi.get(self, "storage_policy")

    @storage_policy.setter
    def storage_policy(self, value: Optional[pulumi.Input['MappingRuleStoragePolicyArgs']]):
        pulumi.set(self, "storage_policy", value)


@pulumi.input_type
class _MappingRuleState:
    def __init__(__self__, *,
                 aggregations: Optional[pulumi.Input[str]] = None,
                 bucket_id: Optional[pulumi.Input[str]] = None,
                 drop: Optional[pulumi.Input[bool]] = None,
                 drop_timestamp: Optional[pulumi.Input[bool]] = None,
                 filter: Optional[pulumi.Input[str]] = None,
                 interval: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 storage_policy: Optional[pulumi.Input['MappingRuleStoragePolicyArgs']] = None):
        """
        Input properties used for looking up and filtering MappingRule resources.
        """
        if aggregations is not None:
            pulumi.set(__self__, "aggregations", aggregations)
        if bucket_id is not None:
            pulumi.set(__self__, "bucket_id", bucket_id)
        if drop is not None:
            pulumi.set(__self__, "drop", drop)
        if drop_timestamp is not None:
            warnings.warn("""drop timestamp is no longer supported""", DeprecationWarning)
            pulumi.log.warn("""drop_timestamp is deprecated: drop timestamp is no longer supported""")
        if drop_timestamp is not None:
            pulumi.set(__self__, "drop_timestamp", drop_timestamp)
        if filter is not None:
            pulumi.set(__self__, "filter", filter)
        if interval is not None:
            pulumi.set(__self__, "interval", interval)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)
        if storage_policy is not None:
            warnings.warn("""use `interval` instead""", DeprecationWarning)
            pulumi.log.warn("""storage_policy is deprecated: use `interval` instead""")
        if storage_policy is not None:
            pulumi.set(__self__, "storage_policy", storage_policy)

    @property
    @pulumi.getter
    def aggregations(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "aggregations")

    @aggregations.setter
    def aggregations(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aggregations", value)

    @property
    @pulumi.getter(name="bucketId")
    def bucket_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "bucket_id")

    @bucket_id.setter
    def bucket_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket_id", value)

    @property
    @pulumi.getter
    def drop(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "drop")

    @drop.setter
    def drop(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "drop", value)

    @property
    @pulumi.getter(name="dropTimestamp")
    def drop_timestamp(self) -> Optional[pulumi.Input[bool]]:
        warnings.warn("""drop timestamp is no longer supported""", DeprecationWarning)
        pulumi.log.warn("""drop_timestamp is deprecated: drop timestamp is no longer supported""")

        return pulumi.get(self, "drop_timestamp")

    @drop_timestamp.setter
    def drop_timestamp(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "drop_timestamp", value)

    @property
    @pulumi.getter
    def filter(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "filter", value)

    @property
    @pulumi.getter
    def interval(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def slug(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "slug")

    @slug.setter
    def slug(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slug", value)

    @property
    @pulumi.getter(name="storagePolicy")
    def storage_policy(self) -> Optional[pulumi.Input['MappingRuleStoragePolicyArgs']]:
        warnings.warn("""use `interval` instead""", DeprecationWarning)
        pulumi.log.warn("""storage_policy is deprecated: use `interval` instead""")

        return pulumi.get(self, "storage_policy")

    @storage_policy.setter
    def storage_policy(self, value: Optional[pulumi.Input['MappingRuleStoragePolicyArgs']]):
        pulumi.set(self, "storage_policy", value)


class MappingRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aggregations: Optional[pulumi.Input[str]] = None,
                 bucket_id: Optional[pulumi.Input[str]] = None,
                 drop: Optional[pulumi.Input[bool]] = None,
                 drop_timestamp: Optional[pulumi.Input[bool]] = None,
                 filter: Optional[pulumi.Input[str]] = None,
                 interval: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 storage_policy: Optional[pulumi.Input[pulumi.InputType['MappingRuleStoragePolicyArgs']]] = None,
                 __props__=None):
        """
        Create a MappingRule resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MappingRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a MappingRule resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param MappingRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MappingRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aggregations: Optional[pulumi.Input[str]] = None,
                 bucket_id: Optional[pulumi.Input[str]] = None,
                 drop: Optional[pulumi.Input[bool]] = None,
                 drop_timestamp: Optional[pulumi.Input[bool]] = None,
                 filter: Optional[pulumi.Input[str]] = None,
                 interval: Optional[pulumi.Input[str]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 storage_policy: Optional[pulumi.Input[pulumi.InputType['MappingRuleStoragePolicyArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MappingRuleArgs.__new__(MappingRuleArgs)

            __props__.__dict__["aggregations"] = aggregations
            __props__.__dict__["bucket_id"] = bucket_id
            __props__.__dict__["drop"] = drop
            __props__.__dict__["drop_timestamp"] = drop_timestamp
            if filter is None and not opts.urn:
                raise TypeError("Missing required property 'filter'")
            __props__.__dict__["filter"] = filter
            __props__.__dict__["interval"] = interval
            __props__.__dict__["mode"] = mode
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["slug"] = slug
            __props__.__dict__["storage_policy"] = storage_policy
        super(MappingRule, __self__).__init__(
            'chronosphere:index/mappingRule:MappingRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aggregations: Optional[pulumi.Input[str]] = None,
            bucket_id: Optional[pulumi.Input[str]] = None,
            drop: Optional[pulumi.Input[bool]] = None,
            drop_timestamp: Optional[pulumi.Input[bool]] = None,
            filter: Optional[pulumi.Input[str]] = None,
            interval: Optional[pulumi.Input[str]] = None,
            mode: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            slug: Optional[pulumi.Input[str]] = None,
            storage_policy: Optional[pulumi.Input[pulumi.InputType['MappingRuleStoragePolicyArgs']]] = None) -> 'MappingRule':
        """
        Get an existing MappingRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MappingRuleState.__new__(_MappingRuleState)

        __props__.__dict__["aggregations"] = aggregations
        __props__.__dict__["bucket_id"] = bucket_id
        __props__.__dict__["drop"] = drop
        __props__.__dict__["drop_timestamp"] = drop_timestamp
        __props__.__dict__["filter"] = filter
        __props__.__dict__["interval"] = interval
        __props__.__dict__["mode"] = mode
        __props__.__dict__["name"] = name
        __props__.__dict__["slug"] = slug
        __props__.__dict__["storage_policy"] = storage_policy
        return MappingRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def aggregations(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "aggregations")

    @property
    @pulumi.getter(name="bucketId")
    def bucket_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "bucket_id")

    @property
    @pulumi.getter
    def drop(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "drop")

    @property
    @pulumi.getter(name="dropTimestamp")
    def drop_timestamp(self) -> pulumi.Output[Optional[bool]]:
        warnings.warn("""drop timestamp is no longer supported""", DeprecationWarning)
        pulumi.log.warn("""drop_timestamp is deprecated: drop timestamp is no longer supported""")

        return pulumi.get(self, "drop_timestamp")

    @property
    @pulumi.getter
    def filter(self) -> pulumi.Output[str]:
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter
    def interval(self) -> pulumi.Output[str]:
        return pulumi.get(self, "interval")

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def slug(self) -> pulumi.Output[str]:
        return pulumi.get(self, "slug")

    @property
    @pulumi.getter(name="storagePolicy")
    def storage_policy(self) -> pulumi.Output[Optional['outputs.MappingRuleStoragePolicy']]:
        warnings.warn("""use `interval` instead""", DeprecationWarning)
        pulumi.log.warn("""storage_policy is deprecated: use `interval` instead""")

        return pulumi.get(self, "storage_policy")

