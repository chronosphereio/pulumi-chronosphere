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

__all__ = ['SLOArgs', 'SLO']

@pulumi.input_type
class SLOArgs:
    def __init__(__self__, *,
                 collection_id: pulumi.Input[str],
                 definition: pulumi.Input['SLODefinitionArgs'],
                 name: pulumi.Input[str],
                 sli: pulumi.Input['SLOSliArgs'],
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 notification_policy_id: Optional[pulumi.Input[str]] = None,
                 signal_grouping: Optional[pulumi.Input[str]] = None,
                 slug: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a SLO resource.
        """
        pulumi.set(__self__, "collection_id", collection_id)
        pulumi.set(__self__, "definition", definition)
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "sli", sli)
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if notification_policy_id is not None:
            pulumi.set(__self__, "notification_policy_id", notification_policy_id)
        if signal_grouping is not None:
            pulumi.set(__self__, "signal_grouping", signal_grouping)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)

    @property
    @pulumi.getter(name="collectionId")
    def collection_id(self) -> pulumi.Input[str]:
        return pulumi.get(self, "collection_id")

    @collection_id.setter
    def collection_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "collection_id", value)

    @property
    @pulumi.getter
    def definition(self) -> pulumi.Input['SLODefinitionArgs']:
        return pulumi.get(self, "definition")

    @definition.setter
    def definition(self, value: pulumi.Input['SLODefinitionArgs']):
        pulumi.set(self, "definition", value)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def sli(self) -> pulumi.Input['SLOSliArgs']:
        return pulumi.get(self, "sli")

    @sli.setter
    def sli(self, value: pulumi.Input['SLOSliArgs']):
        pulumi.set(self, "sli", value)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter(name="notificationPolicyId")
    def notification_policy_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "notification_policy_id")

    @notification_policy_id.setter
    def notification_policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notification_policy_id", value)

    @property
    @pulumi.getter(name="signalGrouping")
    def signal_grouping(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "signal_grouping")

    @signal_grouping.setter
    def signal_grouping(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "signal_grouping", value)

    @property
    @pulumi.getter
    def slug(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "slug")

    @slug.setter
    def slug(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slug", value)


@pulumi.input_type
class _SLOState:
    def __init__(__self__, *,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 collection_id: Optional[pulumi.Input[str]] = None,
                 definition: Optional[pulumi.Input['SLODefinitionArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notification_policy_id: Optional[pulumi.Input[str]] = None,
                 signal_grouping: Optional[pulumi.Input[str]] = None,
                 sli: Optional[pulumi.Input['SLOSliArgs']] = None,
                 slug: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering SLO resources.
        """
        if annotations is not None:
            pulumi.set(__self__, "annotations", annotations)
        if collection_id is not None:
            pulumi.set(__self__, "collection_id", collection_id)
        if definition is not None:
            pulumi.set(__self__, "definition", definition)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if labels is not None:
            pulumi.set(__self__, "labels", labels)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if notification_policy_id is not None:
            pulumi.set(__self__, "notification_policy_id", notification_policy_id)
        if signal_grouping is not None:
            pulumi.set(__self__, "signal_grouping", signal_grouping)
        if sli is not None:
            pulumi.set(__self__, "sli", sli)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)

    @property
    @pulumi.getter
    def annotations(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "annotations")

    @annotations.setter
    def annotations(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "annotations", value)

    @property
    @pulumi.getter(name="collectionId")
    def collection_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "collection_id")

    @collection_id.setter
    def collection_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "collection_id", value)

    @property
    @pulumi.getter
    def definition(self) -> Optional[pulumi.Input['SLODefinitionArgs']]:
        return pulumi.get(self, "definition")

    @definition.setter
    def definition(self, value: Optional[pulumi.Input['SLODefinitionArgs']]):
        pulumi.set(self, "definition", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def labels(self) -> Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]:
        return pulumi.get(self, "labels")

    @labels.setter
    def labels(self, value: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]]):
        pulumi.set(self, "labels", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="notificationPolicyId")
    def notification_policy_id(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "notification_policy_id")

    @notification_policy_id.setter
    def notification_policy_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "notification_policy_id", value)

    @property
    @pulumi.getter(name="signalGrouping")
    def signal_grouping(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "signal_grouping")

    @signal_grouping.setter
    def signal_grouping(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "signal_grouping", value)

    @property
    @pulumi.getter
    def sli(self) -> Optional[pulumi.Input['SLOSliArgs']]:
        return pulumi.get(self, "sli")

    @sli.setter
    def sli(self, value: Optional[pulumi.Input['SLOSliArgs']]):
        pulumi.set(self, "sli", value)

    @property
    @pulumi.getter
    def slug(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "slug")

    @slug.setter
    def slug(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "slug", value)


class SLO(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 collection_id: Optional[pulumi.Input[str]] = None,
                 definition: Optional[pulumi.Input[pulumi.InputType['SLODefinitionArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notification_policy_id: Optional[pulumi.Input[str]] = None,
                 signal_grouping: Optional[pulumi.Input[str]] = None,
                 sli: Optional[pulumi.Input[pulumi.InputType['SLOSliArgs']]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a SLO resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: SLOArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a SLO resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param SLOArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(SLOArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 collection_id: Optional[pulumi.Input[str]] = None,
                 definition: Optional[pulumi.Input[pulumi.InputType['SLODefinitionArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 notification_policy_id: Optional[pulumi.Input[str]] = None,
                 signal_grouping: Optional[pulumi.Input[str]] = None,
                 sli: Optional[pulumi.Input[pulumi.InputType['SLOSliArgs']]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = SLOArgs.__new__(SLOArgs)

            __props__.__dict__["annotations"] = annotations
            if collection_id is None and not opts.urn:
                raise TypeError("Missing required property 'collection_id'")
            __props__.__dict__["collection_id"] = collection_id
            if definition is None and not opts.urn:
                raise TypeError("Missing required property 'definition'")
            __props__.__dict__["definition"] = definition
            __props__.__dict__["description"] = description
            __props__.__dict__["labels"] = labels
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["notification_policy_id"] = notification_policy_id
            __props__.__dict__["signal_grouping"] = signal_grouping
            if sli is None and not opts.urn:
                raise TypeError("Missing required property 'sli'")
            __props__.__dict__["sli"] = sli
            __props__.__dict__["slug"] = slug
        super(SLO, __self__).__init__(
            'chronosphere:index/sLO:SLO',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            annotations: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            collection_id: Optional[pulumi.Input[str]] = None,
            definition: Optional[pulumi.Input[pulumi.InputType['SLODefinitionArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            labels: Optional[pulumi.Input[Mapping[str, pulumi.Input[str]]]] = None,
            name: Optional[pulumi.Input[str]] = None,
            notification_policy_id: Optional[pulumi.Input[str]] = None,
            signal_grouping: Optional[pulumi.Input[str]] = None,
            sli: Optional[pulumi.Input[pulumi.InputType['SLOSliArgs']]] = None,
            slug: Optional[pulumi.Input[str]] = None) -> 'SLO':
        """
        Get an existing SLO resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _SLOState.__new__(_SLOState)

        __props__.__dict__["annotations"] = annotations
        __props__.__dict__["collection_id"] = collection_id
        __props__.__dict__["definition"] = definition
        __props__.__dict__["description"] = description
        __props__.__dict__["labels"] = labels
        __props__.__dict__["name"] = name
        __props__.__dict__["notification_policy_id"] = notification_policy_id
        __props__.__dict__["signal_grouping"] = signal_grouping
        __props__.__dict__["sli"] = sli
        __props__.__dict__["slug"] = slug
        return SLO(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def annotations(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        return pulumi.get(self, "annotations")

    @property
    @pulumi.getter(name="collectionId")
    def collection_id(self) -> pulumi.Output[str]:
        return pulumi.get(self, "collection_id")

    @property
    @pulumi.getter
    def definition(self) -> pulumi.Output['outputs.SLODefinition']:
        return pulumi.get(self, "definition")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def labels(self) -> pulumi.Output[Optional[Mapping[str, str]]]:
        return pulumi.get(self, "labels")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="notificationPolicyId")
    def notification_policy_id(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "notification_policy_id")

    @property
    @pulumi.getter(name="signalGrouping")
    def signal_grouping(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "signal_grouping")

    @property
    @pulumi.getter
    def sli(self) -> pulumi.Output['outputs.SLOSli']:
        return pulumi.get(self, "sli")

    @property
    @pulumi.getter
    def slug(self) -> pulumi.Output[str]:
        return pulumi.get(self, "slug")
