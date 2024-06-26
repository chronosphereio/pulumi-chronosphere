# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['WebhookAlertNotifierArgs', 'WebhookAlertNotifier']

@pulumi.input_type
class WebhookAlertNotifierArgs:
    def __init__(__self__, *,
                 name: pulumi.Input[str],
                 url: pulumi.Input[str],
                 basic_auth_password: Optional[pulumi.Input[str]] = None,
                 basic_auth_username: Optional[pulumi.Input[str]] = None,
                 bearer_token: Optional[pulumi.Input[str]] = None,
                 proxy_url: Optional[pulumi.Input[str]] = None,
                 send_resolved: Optional[pulumi.Input[bool]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 tls_insecure_skip_verify: Optional[pulumi.Input[bool]] = None):
        """
        The set of arguments for constructing a WebhookAlertNotifier resource.
        """
        pulumi.set(__self__, "name", name)
        pulumi.set(__self__, "url", url)
        if basic_auth_password is not None:
            pulumi.set(__self__, "basic_auth_password", basic_auth_password)
        if basic_auth_username is not None:
            pulumi.set(__self__, "basic_auth_username", basic_auth_username)
        if bearer_token is not None:
            pulumi.set(__self__, "bearer_token", bearer_token)
        if proxy_url is not None:
            warnings.warn("""custom proxy URLs are not supported""", DeprecationWarning)
            pulumi.log.warn("""proxy_url is deprecated: custom proxy URLs are not supported""")
        if proxy_url is not None:
            pulumi.set(__self__, "proxy_url", proxy_url)
        if send_resolved is not None:
            pulumi.set(__self__, "send_resolved", send_resolved)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)
        if tls_insecure_skip_verify is not None:
            pulumi.set(__self__, "tls_insecure_skip_verify", tls_insecure_skip_verify)

    @property
    @pulumi.getter
    def name(self) -> pulumi.Input[str]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: pulumi.Input[str]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def url(self) -> pulumi.Input[str]:
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: pulumi.Input[str]):
        pulumi.set(self, "url", value)

    @property
    @pulumi.getter(name="basicAuthPassword")
    def basic_auth_password(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "basic_auth_password")

    @basic_auth_password.setter
    def basic_auth_password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "basic_auth_password", value)

    @property
    @pulumi.getter(name="basicAuthUsername")
    def basic_auth_username(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "basic_auth_username")

    @basic_auth_username.setter
    def basic_auth_username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "basic_auth_username", value)

    @property
    @pulumi.getter(name="bearerToken")
    def bearer_token(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "bearer_token")

    @bearer_token.setter
    def bearer_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bearer_token", value)

    @property
    @pulumi.getter(name="proxyUrl")
    def proxy_url(self) -> Optional[pulumi.Input[str]]:
        warnings.warn("""custom proxy URLs are not supported""", DeprecationWarning)
        pulumi.log.warn("""proxy_url is deprecated: custom proxy URLs are not supported""")

        return pulumi.get(self, "proxy_url")

    @proxy_url.setter
    def proxy_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "proxy_url", value)

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
    @pulumi.getter(name="tlsInsecureSkipVerify")
    def tls_insecure_skip_verify(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "tls_insecure_skip_verify")

    @tls_insecure_skip_verify.setter
    def tls_insecure_skip_verify(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "tls_insecure_skip_verify", value)


@pulumi.input_type
class _WebhookAlertNotifierState:
    def __init__(__self__, *,
                 basic_auth_password: Optional[pulumi.Input[str]] = None,
                 basic_auth_username: Optional[pulumi.Input[str]] = None,
                 bearer_token: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 proxy_url: Optional[pulumi.Input[str]] = None,
                 send_resolved: Optional[pulumi.Input[bool]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 tls_insecure_skip_verify: Optional[pulumi.Input[bool]] = None,
                 url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering WebhookAlertNotifier resources.
        """
        if basic_auth_password is not None:
            pulumi.set(__self__, "basic_auth_password", basic_auth_password)
        if basic_auth_username is not None:
            pulumi.set(__self__, "basic_auth_username", basic_auth_username)
        if bearer_token is not None:
            pulumi.set(__self__, "bearer_token", bearer_token)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if proxy_url is not None:
            warnings.warn("""custom proxy URLs are not supported""", DeprecationWarning)
            pulumi.log.warn("""proxy_url is deprecated: custom proxy URLs are not supported""")
        if proxy_url is not None:
            pulumi.set(__self__, "proxy_url", proxy_url)
        if send_resolved is not None:
            pulumi.set(__self__, "send_resolved", send_resolved)
        if slug is not None:
            pulumi.set(__self__, "slug", slug)
        if tls_insecure_skip_verify is not None:
            pulumi.set(__self__, "tls_insecure_skip_verify", tls_insecure_skip_verify)
        if url is not None:
            pulumi.set(__self__, "url", url)

    @property
    @pulumi.getter(name="basicAuthPassword")
    def basic_auth_password(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "basic_auth_password")

    @basic_auth_password.setter
    def basic_auth_password(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "basic_auth_password", value)

    @property
    @pulumi.getter(name="basicAuthUsername")
    def basic_auth_username(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "basic_auth_username")

    @basic_auth_username.setter
    def basic_auth_username(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "basic_auth_username", value)

    @property
    @pulumi.getter(name="bearerToken")
    def bearer_token(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "bearer_token")

    @bearer_token.setter
    def bearer_token(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "bearer_token", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="proxyUrl")
    def proxy_url(self) -> Optional[pulumi.Input[str]]:
        warnings.warn("""custom proxy URLs are not supported""", DeprecationWarning)
        pulumi.log.warn("""proxy_url is deprecated: custom proxy URLs are not supported""")

        return pulumi.get(self, "proxy_url")

    @proxy_url.setter
    def proxy_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "proxy_url", value)

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
    @pulumi.getter(name="tlsInsecureSkipVerify")
    def tls_insecure_skip_verify(self) -> Optional[pulumi.Input[bool]]:
        return pulumi.get(self, "tls_insecure_skip_verify")

    @tls_insecure_skip_verify.setter
    def tls_insecure_skip_verify(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "tls_insecure_skip_verify", value)

    @property
    @pulumi.getter
    def url(self) -> Optional[pulumi.Input[str]]:
        return pulumi.get(self, "url")

    @url.setter
    def url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "url", value)


class WebhookAlertNotifier(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 basic_auth_password: Optional[pulumi.Input[str]] = None,
                 basic_auth_username: Optional[pulumi.Input[str]] = None,
                 bearer_token: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 proxy_url: Optional[pulumi.Input[str]] = None,
                 send_resolved: Optional[pulumi.Input[bool]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 tls_insecure_skip_verify: Optional[pulumi.Input[bool]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a WebhookAlertNotifier resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: WebhookAlertNotifierArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a WebhookAlertNotifier resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param WebhookAlertNotifierArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(WebhookAlertNotifierArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 basic_auth_password: Optional[pulumi.Input[str]] = None,
                 basic_auth_username: Optional[pulumi.Input[str]] = None,
                 bearer_token: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 proxy_url: Optional[pulumi.Input[str]] = None,
                 send_resolved: Optional[pulumi.Input[bool]] = None,
                 slug: Optional[pulumi.Input[str]] = None,
                 tls_insecure_skip_verify: Optional[pulumi.Input[bool]] = None,
                 url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = WebhookAlertNotifierArgs.__new__(WebhookAlertNotifierArgs)

            __props__.__dict__["basic_auth_password"] = None if basic_auth_password is None else pulumi.Output.secret(basic_auth_password)
            __props__.__dict__["basic_auth_username"] = basic_auth_username
            __props__.__dict__["bearer_token"] = bearer_token
            if name is None and not opts.urn:
                raise TypeError("Missing required property 'name'")
            __props__.__dict__["name"] = name
            __props__.__dict__["proxy_url"] = proxy_url
            __props__.__dict__["send_resolved"] = send_resolved
            __props__.__dict__["slug"] = slug
            __props__.__dict__["tls_insecure_skip_verify"] = tls_insecure_skip_verify
            if url is None and not opts.urn:
                raise TypeError("Missing required property 'url'")
            __props__.__dict__["url"] = url
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["basicAuthPassword"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(WebhookAlertNotifier, __self__).__init__(
            'chronosphere:index/webhookAlertNotifier:WebhookAlertNotifier',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            basic_auth_password: Optional[pulumi.Input[str]] = None,
            basic_auth_username: Optional[pulumi.Input[str]] = None,
            bearer_token: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            proxy_url: Optional[pulumi.Input[str]] = None,
            send_resolved: Optional[pulumi.Input[bool]] = None,
            slug: Optional[pulumi.Input[str]] = None,
            tls_insecure_skip_verify: Optional[pulumi.Input[bool]] = None,
            url: Optional[pulumi.Input[str]] = None) -> 'WebhookAlertNotifier':
        """
        Get an existing WebhookAlertNotifier resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _WebhookAlertNotifierState.__new__(_WebhookAlertNotifierState)

        __props__.__dict__["basic_auth_password"] = basic_auth_password
        __props__.__dict__["basic_auth_username"] = basic_auth_username
        __props__.__dict__["bearer_token"] = bearer_token
        __props__.__dict__["name"] = name
        __props__.__dict__["proxy_url"] = proxy_url
        __props__.__dict__["send_resolved"] = send_resolved
        __props__.__dict__["slug"] = slug
        __props__.__dict__["tls_insecure_skip_verify"] = tls_insecure_skip_verify
        __props__.__dict__["url"] = url
        return WebhookAlertNotifier(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="basicAuthPassword")
    def basic_auth_password(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "basic_auth_password")

    @property
    @pulumi.getter(name="basicAuthUsername")
    def basic_auth_username(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "basic_auth_username")

    @property
    @pulumi.getter(name="bearerToken")
    def bearer_token(self) -> pulumi.Output[Optional[str]]:
        return pulumi.get(self, "bearer_token")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="proxyUrl")
    def proxy_url(self) -> pulumi.Output[Optional[str]]:
        warnings.warn("""custom proxy URLs are not supported""", DeprecationWarning)
        pulumi.log.warn("""proxy_url is deprecated: custom proxy URLs are not supported""")

        return pulumi.get(self, "proxy_url")

    @property
    @pulumi.getter(name="sendResolved")
    def send_resolved(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "send_resolved")

    @property
    @pulumi.getter
    def slug(self) -> pulumi.Output[str]:
        return pulumi.get(self, "slug")

    @property
    @pulumi.getter(name="tlsInsecureSkipVerify")
    def tls_insecure_skip_verify(self) -> pulumi.Output[Optional[bool]]:
        return pulumi.get(self, "tls_insecure_skip_verify")

    @property
    @pulumi.getter
    def url(self) -> pulumi.Output[str]:
        return pulumi.get(self, "url")

