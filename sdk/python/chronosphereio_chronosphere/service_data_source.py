# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'ServiceDataSourceResult',
    'AwaitableServiceDataSourceResult',
    'service_data_source',
    'service_data_source_output',
]

@pulumi.output_type
class ServiceDataSourceResult:
    """
    A collection of values returned by ServiceDataSource.
    """
    def __init__(__self__, description=None, id=None, name=None, slug=None):
        if description and not isinstance(description, str):
            raise TypeError("Expected argument 'description' to be a str")
        pulumi.set(__self__, "description", description)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if slug and not isinstance(slug, str):
            raise TypeError("Expected argument 'slug' to be a str")
        pulumi.set(__self__, "slug", slug)

    @property
    @pulumi.getter
    def description(self) -> str:
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def slug(self) -> str:
        return pulumi.get(self, "slug")


class AwaitableServiceDataSourceResult(ServiceDataSourceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return ServiceDataSourceResult(
            description=self.description,
            id=self.id,
            name=self.name,
            slug=self.slug)


def service_data_source(slug: Optional[str] = None,
                        opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableServiceDataSourceResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['slug'] = slug
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('chronosphere:index/serviceDataSource:ServiceDataSource', __args__, opts=opts, typ=ServiceDataSourceResult).value

    return AwaitableServiceDataSourceResult(
        description=pulumi.get(__ret__, 'description'),
        id=pulumi.get(__ret__, 'id'),
        name=pulumi.get(__ret__, 'name'),
        slug=pulumi.get(__ret__, 'slug'))


@_utilities.lift_output_func(service_data_source)
def service_data_source_output(slug: Optional[pulumi.Input[str]] = None,
                               opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[ServiceDataSourceResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...
