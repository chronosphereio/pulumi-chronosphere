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

__all__ = [
    'NotificationPolicyDataSourceResult',
    'AwaitableNotificationPolicyDataSourceResult',
    'notification_policy_data_source',
    'notification_policy_data_source_output',
]

@pulumi.output_type
class NotificationPolicyDataSourceResult:
    """
    A collection of values returned by NotificationPolicyDataSource.
    """
    def __init__(__self__, id=None, is_independent=None, name=None, notification_policy_data=None, overrides=None, routes=None, rules=None, slug=None, team_id=None):
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if is_independent and not isinstance(is_independent, bool):
            raise TypeError("Expected argument 'is_independent' to be a bool")
        pulumi.set(__self__, "is_independent", is_independent)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if notification_policy_data and not isinstance(notification_policy_data, str):
            raise TypeError("Expected argument 'notification_policy_data' to be a str")
        pulumi.set(__self__, "notification_policy_data", notification_policy_data)
        if overrides and not isinstance(overrides, list):
            raise TypeError("Expected argument 'overrides' to be a list")
        pulumi.set(__self__, "overrides", overrides)
        if routes and not isinstance(routes, list):
            raise TypeError("Expected argument 'routes' to be a list")
        pulumi.set(__self__, "routes", routes)
        if rules and not isinstance(rules, list):
            raise TypeError("Expected argument 'rules' to be a list")
        pulumi.set(__self__, "rules", rules)
        if slug and not isinstance(slug, str):
            raise TypeError("Expected argument 'slug' to be a str")
        pulumi.set(__self__, "slug", slug)
        if team_id and not isinstance(team_id, str):
            raise TypeError("Expected argument 'team_id' to be a str")
        pulumi.set(__self__, "team_id", team_id)

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="isIndependent")
    def is_independent(self) -> bool:
        return pulumi.get(self, "is_independent")

    @property
    @pulumi.getter
    def name(self) -> Optional[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="notificationPolicyData")
    def notification_policy_data(self) -> str:
        return pulumi.get(self, "notification_policy_data")

    @property
    @pulumi.getter
    def overrides(self) -> Optional[Sequence['outputs.NotificationPolicyDataSourceOverrideResult']]:
        return pulumi.get(self, "overrides")

    @property
    @pulumi.getter
    def routes(self) -> Optional[Sequence['outputs.NotificationPolicyDataSourceRouteResult']]:
        return pulumi.get(self, "routes")

    @property
    @pulumi.getter
    def rules(self) -> Optional[Sequence['outputs.NotificationPolicyDataSourceRuleResult']]:
        warnings.warn("""`rule` is deprecated, use `route` instead.""", DeprecationWarning)
        pulumi.log.warn("""rules is deprecated: `rule` is deprecated, use `route` instead.""")

        return pulumi.get(self, "rules")

    @property
    @pulumi.getter
    def slug(self) -> str:
        return pulumi.get(self, "slug")

    @property
    @pulumi.getter(name="teamId")
    def team_id(self) -> Optional[str]:
        return pulumi.get(self, "team_id")


class AwaitableNotificationPolicyDataSourceResult(NotificationPolicyDataSourceResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return NotificationPolicyDataSourceResult(
            id=self.id,
            is_independent=self.is_independent,
            name=self.name,
            notification_policy_data=self.notification_policy_data,
            overrides=self.overrides,
            routes=self.routes,
            rules=self.rules,
            slug=self.slug,
            team_id=self.team_id)


def notification_policy_data_source(name: Optional[str] = None,
                                    notification_policy_data: Optional[str] = None,
                                    overrides: Optional[Sequence[pulumi.InputType['NotificationPolicyDataSourceOverrideArgs']]] = None,
                                    routes: Optional[Sequence[pulumi.InputType['NotificationPolicyDataSourceRouteArgs']]] = None,
                                    rules: Optional[Sequence[pulumi.InputType['NotificationPolicyDataSourceRuleArgs']]] = None,
                                    slug: Optional[str] = None,
                                    team_id: Optional[str] = None,
                                    opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableNotificationPolicyDataSourceResult:
    """
    Use this data source to access information about an existing resource.
    """
    __args__ = dict()
    __args__['name'] = name
    __args__['notificationPolicyData'] = notification_policy_data
    __args__['overrides'] = overrides
    __args__['routes'] = routes
    __args__['rules'] = rules
    __args__['slug'] = slug
    __args__['teamId'] = team_id
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('chronosphere:index/notificationPolicyDataSource:NotificationPolicyDataSource', __args__, opts=opts, typ=NotificationPolicyDataSourceResult).value

    return AwaitableNotificationPolicyDataSourceResult(
        id=pulumi.get(__ret__, 'id'),
        is_independent=pulumi.get(__ret__, 'is_independent'),
        name=pulumi.get(__ret__, 'name'),
        notification_policy_data=pulumi.get(__ret__, 'notification_policy_data'),
        overrides=pulumi.get(__ret__, 'overrides'),
        routes=pulumi.get(__ret__, 'routes'),
        rules=pulumi.get(__ret__, 'rules'),
        slug=pulumi.get(__ret__, 'slug'),
        team_id=pulumi.get(__ret__, 'team_id'))


@_utilities.lift_output_func(notification_policy_data_source)
def notification_policy_data_source_output(name: Optional[pulumi.Input[Optional[str]]] = None,
                                           notification_policy_data: Optional[pulumi.Input[Optional[str]]] = None,
                                           overrides: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['NotificationPolicyDataSourceOverrideArgs']]]]] = None,
                                           routes: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['NotificationPolicyDataSourceRouteArgs']]]]] = None,
                                           rules: Optional[pulumi.Input[Optional[Sequence[pulumi.InputType['NotificationPolicyDataSourceRuleArgs']]]]] = None,
                                           slug: Optional[pulumi.Input[Optional[str]]] = None,
                                           team_id: Optional[pulumi.Input[Optional[str]]] = None,
                                           opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[NotificationPolicyDataSourceResult]:
    """
    Use this data source to access information about an existing resource.
    """
    ...