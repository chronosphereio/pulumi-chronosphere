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

    public sealed class TraceMetricsRuleTraceFilterSpanArgs : global::Pulumi.ResourceArgs
    {
        [Input("duration")]
        public Input<Inputs.TraceMetricsRuleTraceFilterSpanDurationArgs>? Duration { get; set; }

        [Input("error")]
        public Input<Inputs.TraceMetricsRuleTraceFilterSpanErrorArgs>? Error { get; set; }

        [Input("matchType")]
        public Input<string>? MatchType { get; set; }

        [Input("operation")]
        public Input<Inputs.TraceMetricsRuleTraceFilterSpanOperationArgs>? Operation { get; set; }

        [Input("parentOperation")]
        public Input<Inputs.TraceMetricsRuleTraceFilterSpanParentOperationArgs>? ParentOperation { get; set; }

        [Input("parentService")]
        public Input<Inputs.TraceMetricsRuleTraceFilterSpanParentServiceArgs>? ParentService { get; set; }

        [Input("service")]
        public Input<Inputs.TraceMetricsRuleTraceFilterSpanServiceArgs>? Service { get; set; }

        [Input("spanCount")]
        public Input<Inputs.TraceMetricsRuleTraceFilterSpanSpanCountArgs>? SpanCount { get; set; }

        [Input("tags")]
        private InputList<Inputs.TraceMetricsRuleTraceFilterSpanTagArgs>? _tags;
        public InputList<Inputs.TraceMetricsRuleTraceFilterSpanTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.TraceMetricsRuleTraceFilterSpanTagArgs>());
            set => _tags = value;
        }

        public TraceMetricsRuleTraceFilterSpanArgs()
        {
        }
        public static new TraceMetricsRuleTraceFilterSpanArgs Empty => new TraceMetricsRuleTraceFilterSpanArgs();
    }
}
