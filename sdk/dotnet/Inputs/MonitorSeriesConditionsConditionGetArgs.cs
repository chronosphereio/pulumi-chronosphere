// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Inputs
{

    public sealed class MonitorSeriesConditionsConditionGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("op", required: true)]
        public Input<string> Op { get; set; } = null!;

        [Input("resolveSustain")]
        public Input<string>? ResolveSustain { get; set; }

        [Input("severity", required: true)]
        public Input<string> Severity { get; set; } = null!;

        [Input("sustain")]
        public Input<string>? Sustain { get; set; }

        [Input("value")]
        public Input<double>? Value { get; set; }

        public MonitorSeriesConditionsConditionGetArgs()
        {
        }
        public static new MonitorSeriesConditionsConditionGetArgs Empty => new MonitorSeriesConditionsConditionGetArgs();
    }
}
