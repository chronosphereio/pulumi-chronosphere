// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Inputs
{

    public sealed class TraceTailSamplingRulesRuleFilterSpanSpanCountGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("max")]
        public Input<int>? Max { get; set; }

        [Input("min")]
        public Input<int>? Min { get; set; }

        public TraceTailSamplingRulesRuleFilterSpanSpanCountGetArgs()
        {
        }
        public static new TraceTailSamplingRulesRuleFilterSpanSpanCountGetArgs Empty => new TraceTailSamplingRulesRuleFilterSpanSpanCountGetArgs();
    }
}
