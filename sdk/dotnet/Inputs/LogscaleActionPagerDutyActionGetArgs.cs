// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Chronosphere.Pulumi.Inputs
{

    public sealed class LogscaleActionPagerDutyActionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("routingKey", required: true)]
        public Input<string> RoutingKey { get; set; } = null!;

        [Input("severity", required: true)]
        public Input<string> Severity { get; set; } = null!;

        [Input("useProxy")]
        public Input<bool>? UseProxy { get; set; }

        public LogscaleActionPagerDutyActionGetArgs()
        {
        }
        public static new LogscaleActionPagerDutyActionGetArgs Empty => new LogscaleActionPagerDutyActionGetArgs();
    }
}