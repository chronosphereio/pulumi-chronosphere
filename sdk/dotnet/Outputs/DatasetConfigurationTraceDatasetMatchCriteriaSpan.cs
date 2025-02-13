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
    public sealed class DatasetConfigurationTraceDatasetMatchCriteriaSpan
    {
        public readonly Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanDuration? Duration;
        public readonly Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanError? Error;
        public readonly Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpan? IsRootSpan;
        public readonly string? MatchType;
        public readonly Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanOperation? Operation;
        public readonly Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperation? ParentOperation;
        public readonly Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentService? ParentService;
        public readonly Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanService? Service;
        public readonly Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCount? SpanCount;
        public readonly ImmutableArray<Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTag> Tags;

        [OutputConstructor]
        private DatasetConfigurationTraceDatasetMatchCriteriaSpan(
            Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanDuration? duration,

            Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanError? error,

            Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpan? isRootSpan,

            string? matchType,

            Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanOperation? operation,

            Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperation? parentOperation,

            Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentService? parentService,

            Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanService? service,

            Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCount? spanCount,

            ImmutableArray<Outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTag> tags)
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
