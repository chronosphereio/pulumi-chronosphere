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

    public sealed class TraceTailSamplingRulesRuleFilterSpanTagNumericValueArgs : global::Pulumi.ResourceArgs
    {
        [Input("comparison", required: true)]
        public Input<string> Comparison { get; set; } = null!;

        [Input("value", required: true)]
        public Input<double> Value { get; set; } = null!;

        public TraceTailSamplingRulesRuleFilterSpanTagNumericValueArgs()
        {
        }
        public static new TraceTailSamplingRulesRuleFilterSpanTagNumericValueArgs Empty => new TraceTailSamplingRulesRuleFilterSpanTagNumericValueArgs();
    }
}
