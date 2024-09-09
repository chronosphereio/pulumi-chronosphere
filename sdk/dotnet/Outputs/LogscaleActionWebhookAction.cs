// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Chronosphere.Pulumi.Outputs
{

    [OutputType]
    public sealed class LogscaleActionWebhookAction
    {
        public readonly string? BodyTemplate;
        public readonly ImmutableDictionary<string, string>? Headers;
        public readonly bool? IgnoreSsl;
        public readonly string Method;
        public readonly string Url;
        public readonly bool? UseProxy;

        [OutputConstructor]
        private LogscaleActionWebhookAction(
            string? bodyTemplate,

            ImmutableDictionary<string, string>? headers,

            bool? ignoreSsl,

            string method,

            string url,

            bool? useProxy)
        {
            BodyTemplate = bodyTemplate;
            Headers = headers;
            IgnoreSsl = ignoreSsl;
            Method = method;
            Url = url;
            UseProxy = useProxy;
        }
    }
}
