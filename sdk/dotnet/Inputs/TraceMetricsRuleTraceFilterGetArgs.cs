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

    public sealed class TraceMetricsRuleTraceFilterGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("spans")]
        private InputList<Inputs.TraceMetricsRuleTraceFilterSpanGetArgs>? _spans;
        public InputList<Inputs.TraceMetricsRuleTraceFilterSpanGetArgs> Spans
        {
            get => _spans ?? (_spans = new InputList<Inputs.TraceMetricsRuleTraceFilterSpanGetArgs>());
            set => _spans = value;
        }

        [Input("trace")]
        public Input<Inputs.TraceMetricsRuleTraceFilterTraceGetArgs>? Trace { get; set; }

        public TraceMetricsRuleTraceFilterGetArgs()
        {
        }
        public static new TraceMetricsRuleTraceFilterGetArgs Empty => new TraceMetricsRuleTraceFilterGetArgs();
    }
}