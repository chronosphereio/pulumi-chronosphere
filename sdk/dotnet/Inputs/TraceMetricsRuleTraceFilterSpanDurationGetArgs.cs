// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Inputs
{

    public sealed class TraceMetricsRuleTraceFilterSpanDurationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("maxSeconds")]
        public Input<double>? MaxSeconds { get; set; }

        [Input("minSeconds")]
        public Input<double>? MinSeconds { get; set; }

        public TraceMetricsRuleTraceFilterSpanDurationGetArgs()
        {
        }
        public static new TraceMetricsRuleTraceFilterSpanDurationGetArgs Empty => new TraceMetricsRuleTraceFilterSpanDurationGetArgs();
    }
}
