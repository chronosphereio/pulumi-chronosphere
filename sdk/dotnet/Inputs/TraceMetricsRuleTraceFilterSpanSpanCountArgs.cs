// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Inputs
{

    public sealed class TraceMetricsRuleTraceFilterSpanSpanCountArgs : global::Pulumi.ResourceArgs
    {
        [Input("max")]
        public Input<int>? Max { get; set; }

        [Input("min")]
        public Input<int>? Min { get; set; }

        public TraceMetricsRuleTraceFilterSpanSpanCountArgs()
        {
        }
        public static new TraceMetricsRuleTraceFilterSpanSpanCountArgs Empty => new TraceMetricsRuleTraceFilterSpanSpanCountArgs();
    }
}
