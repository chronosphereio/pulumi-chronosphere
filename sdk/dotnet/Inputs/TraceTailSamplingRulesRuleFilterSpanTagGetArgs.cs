// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Inputs
{

    public sealed class TraceTailSamplingRulesRuleFilterSpanTagGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("key")]
        public Input<string>? Key { get; set; }

        [Input("numericValue")]
        public Input<Inputs.TraceTailSamplingRulesRuleFilterSpanTagNumericValueGetArgs>? NumericValue { get; set; }

        [Input("value")]
        public Input<Inputs.TraceTailSamplingRulesRuleFilterSpanTagValueGetArgs>? Value { get; set; }

        public TraceTailSamplingRulesRuleFilterSpanTagGetArgs()
        {
        }
        public static new TraceTailSamplingRulesRuleFilterSpanTagGetArgs Empty => new TraceTailSamplingRulesRuleFilterSpanTagGetArgs();
    }
}
