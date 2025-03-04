// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Chronosphere.Pulumi.Outputs
{

    [OutputType]
    public sealed class TraceTailSamplingRulesRuleFilterSpan
    {
        public readonly Outputs.TraceTailSamplingRulesRuleFilterSpanDuration? Duration;
        public readonly Outputs.TraceTailSamplingRulesRuleFilterSpanError? Error;
        public readonly Outputs.TraceTailSamplingRulesRuleFilterSpanIsRootSpan? IsRootSpan;
        public readonly string? MatchType;
        public readonly Outputs.TraceTailSamplingRulesRuleFilterSpanOperation? Operation;
        public readonly Outputs.TraceTailSamplingRulesRuleFilterSpanParentOperation? ParentOperation;
        public readonly Outputs.TraceTailSamplingRulesRuleFilterSpanParentService? ParentService;
        public readonly Outputs.TraceTailSamplingRulesRuleFilterSpanService? Service;
        public readonly Outputs.TraceTailSamplingRulesRuleFilterSpanSpanCount? SpanCount;
        public readonly ImmutableArray<Outputs.TraceTailSamplingRulesRuleFilterSpanTag> Tags;

        [OutputConstructor]
        private TraceTailSamplingRulesRuleFilterSpan(
            Outputs.TraceTailSamplingRulesRuleFilterSpanDuration? duration,

            Outputs.TraceTailSamplingRulesRuleFilterSpanError? error,

            Outputs.TraceTailSamplingRulesRuleFilterSpanIsRootSpan? isRootSpan,

            string? matchType,

            Outputs.TraceTailSamplingRulesRuleFilterSpanOperation? operation,

            Outputs.TraceTailSamplingRulesRuleFilterSpanParentOperation? parentOperation,

            Outputs.TraceTailSamplingRulesRuleFilterSpanParentService? parentService,

            Outputs.TraceTailSamplingRulesRuleFilterSpanService? service,

            Outputs.TraceTailSamplingRulesRuleFilterSpanSpanCount? spanCount,

            ImmutableArray<Outputs.TraceTailSamplingRulesRuleFilterSpanTag> tags)
        {
            Duration = duration;
            Error = error;
            IsRootSpan = isRootSpan;
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
