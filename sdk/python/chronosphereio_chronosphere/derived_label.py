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

__all__ = ['DerivedLabelArgs', 'DerivedLabel']

@pulumi.input_type
class DerivedLabelArgs:
    def __init__(__self__, *,
                 label_name: pulumi.Input[str],
                 metric_label: pulumi.Input['DerivedLabelMetricLabelArgs'],
                 name: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 existing_label_policy: Optional[pulumi.Input[str]] = None,
                 slug: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a DerivedLabel resource.
        """
        pulumi.set(__self__, "label_name", label_name)
        pulumi.set(__self__, "metric_label", metric_label)
        pulumi.set(__self__, "name", name)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if existing_label_policy is not None:
            pulumi.set(__self__, "existing_label_policy", existing_label_policy)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)

    @property
    @pulumi.getter(name="labelName")
    def label_name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "label_name")

    @label_name.setter
    def label_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "label_name", value)

    @property
    @pulumi.getter(name="metricLabel")
    def metric_label(self) -> pulumi.Input['DerivedLabelMetricLabelArgs']:
        return pulumi.get(self, "metric_label")

    @metric_label.setter
    def metric_label(self, value: pulumi.Input['DerivedLabelMetricLabelArgs']):
        pulumi.set(self, "metric_label", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="existingLabelPolicy")
    def existing_label_policy(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "existing_label_policy")

    @existing_label_policy.setter
    def existing_label_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "existing_label_policy", value)

    @property
    @pulumi.getter
    def slug(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "slug")

    @slug.setter
    def slug(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slug", value)


@pulumi.input_type
class _DerivedLabelState:
    def __init__(__self__, *,
                 description: Optional[pulumi.Input[str]] = None,
                 existing_label_policy: Optional[pulumi.Input[str]] = None,
                 label_name: Optional[pulumi.Input[str]] = None,
                 metric_label: Optional[pulumi.Input['DerivedLabelMetricLabelArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 slug: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering DerivedLabel resources.
        """
        if description is not None:
            pulumi.set(__self__, "description", description)
        if existing_label_policy is not None:
            pulumi.set(__self__, "existing_label_policy", existing_label_policy)
        if label_name is not None:
            pulumi.set(__self__, "label_name", label_name)
        if metric_label is not None:
            pulumi.set(__self__, "metric_label", metric_label)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="existingLabelPolicy")
    def existing_label_policy(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "existing_label_policy")

    @existing_label_policy.setter
    def existing_label_policy(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "existing_label_policy", value)

    @property
    @pulumi.getter(name="labelName")
    def label_name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "label_name")

    @label_name.setter
    def label_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "label_name", value)

    @property
    @pulumi.getter(name="metricLabel")
    def metric_label(self) -> Optional[pulumi.Input['DerivedLabelMetricLabelArgs']]:
        return pulumi.get(self, "metric_label")

    @metric_label.setter
    def metric_label(self, value: Optional[pulumi.Input['DerivedLabelMetricLabelArgs']]):
        pulumi.set(self, "metric_label", value)

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


class DerivedLabel(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 existing_label_policy: Optional[pulumi.Input[str]] = None,
                 label_name: Optional[pulumi.Input[str]] = None,
                 metric_label: Optional[pulumi.Input[pulumi.InputType['DerivedLabelMetricLabelArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a DerivedLabel resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DerivedLabelArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a DerivedLabel resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param DerivedLabelArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DerivedLabelArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 existing_label_policy: Optional[pulumi.Input[str]] = None,
                 label_name: Optional[pulumi.Input[str]] = None,
                 metric_label: Optional[pulumi.Input[pulumi.InputType['DerivedLabelMetricLabelArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DerivedLabelArgs.__new__(DerivedLabelArgs)

            __props__.__dict__["description"] = description
            __props__.__dict__["existing_label_policy"] = existing_label_policy
            if label_name is None and not opts.urn:
                raise TypeError("Missing required property 'label_name'")
            __props__.__dict__["label_name"] = label_name
            if metric_label is None and not opts.urn:
                raise TypeError("Missing required property 'metric_label'")
            __props__.__dict__["metric_label"] = metric_label
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["slug"] = slug
        super(DerivedLabel, __self__).__init__(
            'chronosphere:index/derivedLabel:DerivedLabel',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            description: Optional[pulumi.Input[str]] = None,
            existing_label_policy: Optional[pulumi.Input[str]] = None,
            label_name: Optional[pulumi.Input[str]] = None,
            metric_label: Optional[pulumi.Input[pulumi.InputType['DerivedLabelMetricLabelArgs']]] = None,
            name: Optional[pulumi.Input[str]] = None,
            slug: Optional[pulumi.Input[str]] = None) -> 'DerivedLabel':
        """
        Get an existing DerivedLabel resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DerivedLabelState.__new__(_DerivedLabelState)

        __props__.__dict__["description"] = description
        __props__.__dict__["existing_label_policy"] = existing_label_policy
        __props__.__dict__["label_name"] = label_name
        __props__.__dict__["metric_label"] = metric_label
        __props__.__dict__["name"] = name
        __props__.__dict__["slug"] = slug
        return DerivedLabel(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="existingLabelPolicy")
    def existing_label_policy(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "existing_label_policy")

    @property
    @pulumi.getter(name="labelName")
    def label_name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "label_name")

    @property
    @pulumi.getter(name="metricLabel")
    def metric_label(self) -> pulumi.Output['outputs.DerivedLabelMetricLabel']:
        return pulumi.get(self, "metric_label")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def slug(self) -> pulumi.Output[str]:
        return pulumi.get(self, "slug")

