// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Outputs
{

    [OutputType]
    public sealed class NotificationPolicyOverride
    {
        public readonly ImmutableArray<Outputs.NotificationPolicyOverrideAlertLabelMatcher> AlertLabelMatchers;
        public readonly ImmutableArray<Outputs.NotificationPolicyOverrideRoute> Routes;

        [OutputConstructor]
        private NotificationPolicyOverride(
            ImmutableArray<Outputs.NotificationPolicyOverrideAlertLabelMatcher> alertLabelMatchers,

            ImmutableArray<Outputs.NotificationPolicyOverrideRoute> routes)
        {
            AlertLabelMatchers = alertLabelMatchers;
            Routes = routes;
        }
    }
}