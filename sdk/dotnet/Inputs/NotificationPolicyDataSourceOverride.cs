// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Inputs
{

    public sealed class NotificationPolicyDataSourceOverride : global::Pulumi.InvokeArgs
    {
        [Input("alertLabelMatchers", required: true)]
        private List<Inputs.NotificationPolicyDataSourceOverrideAlertLabelMatcher>? _alertLabelMatchers;
        public List<Inputs.NotificationPolicyDataSourceOverrideAlertLabelMatcher> AlertLabelMatchers
        {
            get => _alertLabelMatchers ?? (_alertLabelMatchers = new List<Inputs.NotificationPolicyDataSourceOverrideAlertLabelMatcher>());
            set => _alertLabelMatchers = value;
        }

        [Input("routes")]
        private List<Inputs.NotificationPolicyDataSourceOverrideRoute>? _routes;
        public List<Inputs.NotificationPolicyDataSourceOverrideRoute> Routes
        {
            get => _routes ?? (_routes = new List<Inputs.NotificationPolicyDataSourceOverrideRoute>());
            set => _routes = value;
        }

        public NotificationPolicyDataSourceOverride()
        {
        }
        public static new NotificationPolicyDataSourceOverride Empty => new NotificationPolicyDataSourceOverride();
    }
}