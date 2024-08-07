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
    public sealed class NotificationPolicyOverrideRoute
    {
        public readonly Outputs.NotificationPolicyOverrideRouteGroupBy? GroupBy;
        public readonly ImmutableArray<string> Notifiers;
        public readonly string? RepeatInterval;
        public readonly string Severity;

        [OutputConstructor]
        private NotificationPolicyOverrideRoute(
            Outputs.NotificationPolicyOverrideRouteGroupBy? groupBy,

            ImmutableArray<string> notifiers,

            string? repeatInterval,

            string severity)
        {
            GroupBy = groupBy;
            Notifiers = notifiers;
            RepeatInterval = repeatInterval;
            Severity = severity;
        }
    }
}
