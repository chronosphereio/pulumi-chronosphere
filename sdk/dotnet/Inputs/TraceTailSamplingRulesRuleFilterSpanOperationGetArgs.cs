// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Inputs
{

    public sealed class TraceTailSamplingRulesRuleFilterSpanOperationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("match")]
        public Input<string>? Match { get; set; }

        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public TraceTailSamplingRulesRuleFilterSpanOperationGetArgs()
        {
        }
        public static new TraceTailSamplingRulesRuleFilterSpanOperationGetArgs Empty => new TraceTailSamplingRulesRuleFilterSpanOperationGetArgs();
    }
}
