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
    public sealed class TraceMetricsRuleTraceFilterSpanTag
    {
        public readonly string? Key;
        public readonly Outputs.TraceMetricsRuleTraceFilterSpanTagNumericValue? NumericValue;
        public readonly Outputs.TraceMetricsRuleTraceFilterSpanTagValue? Value;

        [OutputConstructor]
        private TraceMetricsRuleTraceFilterSpanTag(
            string? key,

            Outputs.TraceMetricsRuleTraceFilterSpanTagNumericValue? numericValue,

            Outputs.TraceMetricsRuleTraceFilterSpanTagValue? value)
        {
            Key = key;
            NumericValue = numericValue;
            Value = value;
        }
    }
}
