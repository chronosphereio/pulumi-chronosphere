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

__all__ = ['RollupRuleArgs', 'RollupRule']

@pulumi.input_type
class RollupRuleArgs:
    def __init__(__self__, *,
                 filter: pulumi.Input[str],
                 metric_type: pulumi.Input[str],
                 name: pulumi.Input[str],
                 slug: pulumi.Input[str],
                 aggregation: Optional[pulumi.Input[str]] = None,
                 bucket_id: Optional[pulumi.Input[str]] = None,
                 drop_raw: Optional[pulumi.Input[bool]] = None,
                 exclude_bies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 graphite_label_policy: Optional[pulumi.Input['RollupRuleGraphiteLabelPolicyArgs']] = None,
                 group_bies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 interval: Optional[pulumi.Input[str]] = None,
                 metric_type_tag: Optional[pulumi.Input[bool]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 new_metric: Optional[pulumi.Input[str]] = None,
                 permissive: Optional[pulumi.Input[bool]] = None,
                 storage_policies: Optional[pulumi.Input['RollupRuleStoragePoliciesArgs']] = None):
        """
        The set of arguments for constructing a RollupRule resource.
        """
        pulumi.set(__self__, "filter", filter)
        pulumi.set(__self__, "metric_type", metric_type)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "slug", slug)
        if aggregation is not None:
            pulumi.set(__self__, "aggregation", aggregation)
        if bucket_id is not None:
            pulumi.set(__self__, "bucket_id", bucket_id)
        if drop_raw is not None:
            pulumi.set(__self__, "drop_raw", drop_raw)
        if exclude_bies is not None:
            pulumi.set(__self__, "exclude_bies", exclude_bies)
        if graphite_label_policy is not None:
            pulumi.set(__self__, "graphite_label_policy", graphite_label_policy)
        if group_bies is not None:
            pulumi.set(__self__, "group_bies", group_bies)
        if interval is not None:
            pulumi.set(__self__, "interval", interval)
        if metric_type_tag is not None:
            pulumi.set(__self__, "metric_type_tag", metric_type_tag)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if new_metric is not None:
            pulumi.set(__self__, "new_metric", new_metric)
        if permissive is not None:
            pulumi.set(__self__, "permissive", permissive)
        if storage_policies is not None:
            warnings.warn("""use `interval` instead""", DeprecationWarning)
            pulumi.log.warn("""storage_policies is deprecated: use `interval` instead""")
        if storage_policies is not None:
            pulumi.set(__self__, "storage_policies", storage_policies)

    @property
    @pulumi.getter
    def filter(self) -> pulumi.Input[str]:
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: pulumi.Input[str]):
        pulumi.set(self, "filter", value)

    @property
    @pulumi.getter(name="metricType")
    def metric_type(self) -> pulumi.Input[str]:
        return pulumi.get(self, "metric_type")

    @metric_type.setter
    def metric_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "metric_type", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def slug(self) -> pulumi.Input[str]:
        return pulumi.get(self, "slug")

    @slug.setter
    def slug(self, value: pulumi.Input[str]):
        pulumi.set(self, "slug", value)

    @property
    @pulumi.getter
    def aggregation(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "aggregation")

    @aggregation.setter
    def aggregation(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aggregation", value)

    @property
    @pulumi.getter(name="bucketId")
    def bucket_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "bucket_id")

    @bucket_id.setter
    def bucket_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket_id", value)

    @property
    @pulumi.getter(name="dropRaw")
    def drop_raw(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "drop_raw")

    @drop_raw.setter
    def drop_raw(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "drop_raw", value)

    @property
    @pulumi.getter(name="excludeBies")
    def exclude_bies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "exclude_bies")

    @exclude_bies.setter
    def exclude_bies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "exclude_bies", value)

    @property
    @pulumi.getter(name="graphiteLabelPolicy")
    def graphite_label_policy(self) -> Optional[pulumi.Input['RollupRuleGraphiteLabelPolicyArgs']]:
        return pulumi.get(self, "graphite_label_policy")

    @graphite_label_policy.setter
    def graphite_label_policy(self, value: Optional[pulumi.Input['RollupRuleGraphiteLabelPolicyArgs']]):
        pulumi.set(self, "graphite_label_policy", value)

    @property
    @pulumi.getter(name="groupBies")
    def group_bies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "group_bies")

    @group_bies.setter
    def group_bies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "group_bies", value)

    @property
    @pulumi.getter
    def interval(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter(name="metricTypeTag")
    def metric_type_tag(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "metric_type_tag")

    @metric_type_tag.setter
    def metric_type_tag(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "metric_type_tag", value)

    @property
    @pulumi.getter
    def mode(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "mode")

    @mode.setter
    def mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "mode", value)

    @property
    @pulumi.getter(name="newMetric")
    def new_metric(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "new_metric")

    @new_metric.setter
    def new_metric(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "new_metric", value)

    @property
    @pulumi.getter
    def permissive(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "permissive")

    @permissive.setter
    def permissive(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "permissive", value)

    @property
    @pulumi.getter(name="storagePolicies")
    def storage_policies(self) -> Optional[pulumi.Input['RollupRuleStoragePoliciesArgs']]:
        warnings.warn("""use `interval` instead""", DeprecationWarning)
        pulumi.log.warn("""storage_policies is deprecated: use `interval` instead""")

        return pulumi.get(self, "storage_policies")

    @storage_policies.setter
    def storage_policies(self, value: Optional[pulumi.Input['RollupRuleStoragePoliciesArgs']]):
        pulumi.set(self, "storage_policies", value)


@pulumi.input_type
class _RollupRuleState:
    def __init__(__self__, *,
                 aggregation: Optional[pulumi.Input[str]] = None,
                 bucket_id: Optional[pulumi.Input[str]] = None,
                 drop_raw: Optional[pulumi.Input[bool]] = None,
                 exclude_bies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 filter: Optional[pulumi.Input[str]] = None,
                 graphite_label_policy: Optional[pulumi.Input['RollupRuleGraphiteLabelPolicyArgs']] = None,
                 group_bies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 interval: Optional[pulumi.Input[str]] = None,
                 metric_type: Optional[pulumi.Input[str]] = None,
                 metric_type_tag: Optional[pulumi.Input[bool]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 new_metric: Optional[pulumi.Input[str]] = None,
                 permissive: Optional[pulumi.Input[bool]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 storage_policies: Optional[pulumi.Input['RollupRuleStoragePoliciesArgs']] = None):
        """
        Input properties used for looking up and filtering RollupRule resources.
        """
        if aggregation is not None:
            pulumi.set(__self__, "aggregation", aggregation)
        if bucket_id is not None:
            pulumi.set(__self__, "bucket_id", bucket_id)
        if drop_raw is not None:
            pulumi.set(__self__, "drop_raw", drop_raw)
        if exclude_bies is not None:
            pulumi.set(__self__, "exclude_bies", exclude_bies)
        if filter is not None:
            pulumi.set(__self__, "filter", filter)
        if graphite_label_policy is not None:
            pulumi.set(__self__, "graphite_label_policy", graphite_label_policy)
        if group_bies is not None:
            pulumi.set(__self__, "group_bies", group_bies)
        if interval is not None:
            pulumi.set(__self__, "interval", interval)
        if metric_type is not None:
            pulumi.set(__self__, "metric_type", metric_type)
        if metric_type_tag is not None:
            pulumi.set(__self__, "metric_type_tag", metric_type_tag)
        if mode is not None:
            pulumi.set(__self__, "mode", mode)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if new_metric is not None:
            pulumi.set(__self__, "new_metric", new_metric)
        if permissive is not None:
            pulumi.set(__self__, "permissive", permissive)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)
        if storage_policies is not None:
            warnings.warn("""use `interval` instead""", DeprecationWarning)
            pulumi.log.warn("""storage_policies is deprecated: use `interval` instead""")
        if storage_policies is not None:
            pulumi.set(__self__, "storage_policies", storage_policies)

    @property
    @pulumi.getter
    def aggregation(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "aggregation")

    @aggregation.setter
    def aggregation(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aggregation", value)

    @property
    @pulumi.getter(name="bucketId")
    def bucket_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "bucket_id")

    @bucket_id.setter
    def bucket_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bucket_id", value)

    @property
    @pulumi.getter(name="dropRaw")
    def drop_raw(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "drop_raw")

    @drop_raw.setter
    def drop_raw(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "drop_raw", value)

    @property
    @pulumi.getter(name="excludeBies")
    def exclude_bies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "exclude_bies")

    @exclude_bies.setter
    def exclude_bies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "exclude_bies", value)

    @property
    @pulumi.getter
    def filter(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "filter", value)

    @property
    @pulumi.getter(name="graphiteLabelPolicy")
    def graphite_label_policy(self) -> Optional[pulumi.Input['RollupRuleGraphiteLabelPolicyArgs']]:
        return pulumi.get(self, "graphite_label_policy")

    @graphite_label_policy.setter
    def graphite_label_policy(self, value: Optional[pulumi.Input['RollupRuleGraphiteLabelPolicyArgs']]):
        pulumi.set(self, "graphite_label_policy", value)

    @property
    @pulumi.getter(name="groupBies")
    def group_bies(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        return pulumi.get(self, "group_bies")

    @group_bies.setter
    def group_bies(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "group_bies", value)

    @property
    @pulumi.getter
    def interval(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "interval")

    @interval.setter
    def interval(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "interval", value)

    @property
    @pulumi.getter(name="metricType")
    def metric_type(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "metric_type")

    @metric_type.setter
    def metric_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metric_type", value)

    @property
    @pulumi.getter(name="metricTypeTag")
    def metric_type_tag(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "metric_type_tag")

    @metric_type_tag.setter
    def metric_type_tag(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "metric_type_tag", value)

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
    @pulumi.getter(name="newMetric")
    def new_metric(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "new_metric")

    @new_metric.setter
    def new_metric(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "new_metric", value)

    @property
    @pulumi.getter
    def permissive(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "permissive")

    @permissive.setter
    def permissive(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "permissive", value)

    @property
    @pulumi.getter
    def slug(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "slug")

    @slug.setter
    def slug(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slug", value)

    @property
    @pulumi.getter(name="storagePolicies")
    def storage_policies(self) -> Optional[pulumi.Input['RollupRuleStoragePoliciesArgs']]:
        warnings.warn("""use `interval` instead""", DeprecationWarning)
        pulumi.log.warn("""storage_policies is deprecated: use `interval` instead""")

        return pulumi.get(self, "storage_policies")

    @storage_policies.setter
    def storage_policies(self, value: Optional[pulumi.Input['RollupRuleStoragePoliciesArgs']]):
        pulumi.set(self, "storage_policies", value)


class RollupRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aggregation: Optional[pulumi.Input[str]] = None,
                 bucket_id: Optional[pulumi.Input[str]] = None,
                 drop_raw: Optional[pulumi.Input[bool]] = None,
                 exclude_bies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 filter: Optional[pulumi.Input[str]] = None,
                 graphite_label_policy: Optional[pulumi.Input[pulumi.InputType['RollupRuleGraphiteLabelPolicyArgs']]] = None,
                 group_bies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 interval: Optional[pulumi.Input[str]] = None,
                 metric_type: Optional[pulumi.Input[str]] = None,
                 metric_type_tag: Optional[pulumi.Input[bool]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 new_metric: Optional[pulumi.Input[str]] = None,
                 permissive: Optional[pulumi.Input[bool]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 storage_policies: Optional[pulumi.Input[pulumi.InputType['RollupRuleStoragePoliciesArgs']]] = None,
                 __props__=None):
        """
        Create a RollupRule resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: RollupRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a RollupRule resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param RollupRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(RollupRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 aggregation: Optional[pulumi.Input[str]] = None,
                 bucket_id: Optional[pulumi.Input[str]] = None,
                 drop_raw: Optional[pulumi.Input[bool]] = None,
                 exclude_bies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 filter: Optional[pulumi.Input[str]] = None,
                 graphite_label_policy: Optional[pulumi.Input[pulumi.InputType['RollupRuleGraphiteLabelPolicyArgs']]] = None,
                 group_bies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 interval: Optional[pulumi.Input[str]] = None,
                 metric_type: Optional[pulumi.Input[str]] = None,
                 metric_type_tag: Optional[pulumi.Input[bool]] = None,
                 mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 new_metric: Optional[pulumi.Input[str]] = None,
                 permissive: Optional[pulumi.Input[bool]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 storage_policies: Optional[pulumi.Input[pulumi.InputType['RollupRuleStoragePoliciesArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = RollupRuleArgs.__new__(RollupRuleArgs)

            __props__.__dict__["aggregation"] = aggregation
            __props__.__dict__["bucket_id"] = bucket_id
            __props__.__dict__["drop_raw"] = drop_raw
            __props__.__dict__["exclude_bies"] = exclude_bies
            if filter is None and not opts.urn:
                raise TypeError("Missing required property 'filter'")
            __props__.__dict__["filter"] = filter
            __props__.__dict__["graphite_label_policy"] = graphite_label_policy
            __props__.__dict__["group_bies"] = group_bies
            __props__.__dict__["interval"] = interval
            if metric_type is None and not opts.urn:
                raise TypeError("Missing required property 'metric_type'")
            __props__.__dict__["metric_type"] = metric_type
            __props__.__dict__["metric_type_tag"] = metric_type_tag
            __props__.__dict__["mode"] = mode
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["new_metric"] = new_metric
            __props__.__dict__["permissive"] = permissive
            if slug is None and not opts.urn:
                raise TypeError("Missing required property 'slug'")
            __props__.__dict__["slug"] = slug
            __props__.__dict__["storage_policies"] = storage_policies
        super(RollupRule, __self__).__init__(
            'chronosphere:index/rollupRule:RollupRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            aggregation: Optional[pulumi.Input[str]] = None,
            bucket_id: Optional[pulumi.Input[str]] = None,
            drop_raw: Optional[pulumi.Input[bool]] = None,
            exclude_bies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            filter: Optional[pulumi.Input[str]] = None,
            graphite_label_policy: Optional[pulumi.Input[pulumi.InputType['RollupRuleGraphiteLabelPolicyArgs']]] = None,
            group_bies: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
            interval: Optional[pulumi.Input[str]] = None,
            metric_type: Optional[pulumi.Input[str]] = None,
            metric_type_tag: Optional[pulumi.Input[bool]] = None,
            mode: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            new_metric: Optional[pulumi.Input[str]] = None,
            permissive: Optional[pulumi.Input[bool]] = None,
            slug: Optional[pulumi.Input[str]] = None,
            storage_policies: Optional[pulumi.Input[pulumi.InputType['RollupRuleStoragePoliciesArgs']]] = None) -> 'RollupRule':
        """
        Get an existing RollupRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _RollupRuleState.__new__(_RollupRuleState)

        __props__.__dict__["aggregation"] = aggregation
        __props__.__dict__["bucket_id"] = bucket_id
        __props__.__dict__["drop_raw"] = drop_raw
        __props__.__dict__["exclude_bies"] = exclude_bies
        __props__.__dict__["filter"] = filter
        __props__.__dict__["graphite_label_policy"] = graphite_label_policy
        __props__.__dict__["group_bies"] = group_bies
        __props__.__dict__["interval"] = interval
        __props__.__dict__["metric_type"] = metric_type
        __props__.__dict__["metric_type_tag"] = metric_type_tag
        __props__.__dict__["mode"] = mode
        __props__.__dict__["name"] = name
        __props__.__dict__["new_metric"] = new_metric
        __props__.__dict__["permissive"] = permissive
        __props__.__dict__["slug"] = slug
        __props__.__dict__["storage_policies"] = storage_policies
        return RollupRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def aggregation(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "aggregation")

    @property
    @pulumi.getter(name="bucketId")
    def bucket_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "bucket_id")

    @property
    @pulumi.getter(name="dropRaw")
    def drop_raw(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "drop_raw")

    @property
    @pulumi.getter(name="excludeBies")
    def exclude_bies(self) -> pulumi.Output[Optional[Sequence[str]]]:
        return pulumi.get(self, "exclude_bies")

    @property
    @pulumi.getter
    def filter(self) -> pulumi.Output[str]:
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter(name="graphiteLabelPolicy")
    def graphite_label_policy(self) -> pulumi.Output[Optional['outputs.RollupRuleGraphiteLabelPolicy']]:
        return pulumi.get(self, "graphite_label_policy")

    @property
    @pulumi.getter(name="groupBies")
    def group_bies(self) -> pulumi.Output[Optional[Sequence[str]]]:
        return pulumi.get(self, "group_bies")

    @property
    @pulumi.getter
    def interval(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "interval")

    @property
    @pulumi.getter(name="metricType")
    def metric_type(self) -> pulumi.Output[str]:
        return pulumi.get(self, "metric_type")

    @property
    @pulumi.getter(name="metricTypeTag")
    def metric_type_tag(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "metric_type_tag")

    @property
    @pulumi.getter
    def mode(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "mode")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="newMetric")
    def new_metric(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "new_metric")

    @property
    @pulumi.getter
    def permissive(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "permissive")

    @property
    @pulumi.getter
    def slug(self) -> pulumi.Output[str]:
        return pulumi.get(self, "slug")

    @property
    @pulumi.getter(name="storagePolicies")
    def storage_policies(self) -> pulumi.Output['outputs.RollupRuleStoragePolicies']:
        warnings.warn("""use `interval` instead""", DeprecationWarning)
        pulumi.log.warn("""storage_policies is deprecated: use `interval` instead""")

        return pulumi.get(self, "storage_policies")
