// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Inputs
{

    public sealed class TraceMetricsRuleTraceFilterSpanTagArgs : global::Pulumi.ResourceArgs
    {
        [Input("key", required: true)]
        public Input<string> Key { get; set; } = null!;

        [Input("numericValue")]
        public Input<Inputs.TraceMetricsRuleTraceFilterSpanTagNumericValueArgs>? NumericValue { get; set; }

        [Input("value")]
        public Input<Inputs.TraceMetricsRuleTraceFilterSpanTagValueArgs>? Value { get; set; }

        public TraceMetricsRuleTraceFilterSpanTagArgs()
        {
        }
        public static new TraceMetricsRuleTraceFilterSpanTagArgs Empty => new TraceMetricsRuleTraceFilterSpanTagArgs();
    }
}
