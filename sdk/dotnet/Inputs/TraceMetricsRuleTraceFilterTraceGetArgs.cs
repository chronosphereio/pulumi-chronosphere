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

    public sealed class TraceMetricsRuleTraceFilterTraceGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("duration")]
        public Input<Inputs.TraceMetricsRuleTraceFilterTraceDurationGetArgs>? Duration { get; set; }

        [Input("error")]
        public Input<Inputs.TraceMetricsRuleTraceFilterTraceErrorGetArgs>? Error { get; set; }

        public TraceMetricsRuleTraceFilterTraceGetArgs()
        {
        }
        public static new TraceMetricsRuleTraceFilterTraceGetArgs Empty => new TraceMetricsRuleTraceFilterTraceGetArgs();
    }
}
