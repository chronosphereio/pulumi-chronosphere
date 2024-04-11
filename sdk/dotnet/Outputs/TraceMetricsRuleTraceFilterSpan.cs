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
    public sealed class TraceMetricsRuleTraceFilterSpan
    {
        public readonly Outputs.TraceMetricsRuleTraceFilterSpanDuration? Duration;
        public readonly Outputs.TraceMetricsRuleTraceFilterSpanError? Error;
        public readonly string? MatchType;
        public readonly Outputs.TraceMetricsRuleTraceFilterSpanOperation? Operation;
        public readonly Outputs.TraceMetricsRuleTraceFilterSpanParentOperation? ParentOperation;
        public readonly Outputs.TraceMetricsRuleTraceFilterSpanParentService? ParentService;
        public readonly Outputs.TraceMetricsRuleTraceFilterSpanService? Service;
        public readonly Outputs.TraceMetricsRuleTraceFilterSpanSpanCount? SpanCount;
        public readonly ImmutableArray<Outputs.TraceMetricsRuleTraceFilterSpanTag> Tags;

        [OutputConstructor]
        private TraceMetricsRuleTraceFilterSpan(
            Outputs.TraceMetricsRuleTraceFilterSpanDuration? duration,

            Outputs.TraceMetricsRuleTraceFilterSpanError? error,

            string? matchType,

            Outputs.TraceMetricsRuleTraceFilterSpanOperation? operation,

            Outputs.TraceMetricsRuleTraceFilterSpanParentOperation? parentOperation,

            Outputs.TraceMetricsRuleTraceFilterSpanParentService? parentService,

            Outputs.TraceMetricsRuleTraceFilterSpanService? service,

            Outputs.TraceMetricsRuleTraceFilterSpanSpanCount? spanCount,

            ImmutableArray<Outputs.TraceMetricsRuleTraceFilterSpanTag> tags)
        {
            Duration = duration;
            Error = error;
            MatchType = matchType;
            Operation = operation;
            ParentOperation = parentOperation;
            ParentService = parentService;
            Service = service;
            SpanCount = spanCount;
            Tags = tags;
        }
    }
}
