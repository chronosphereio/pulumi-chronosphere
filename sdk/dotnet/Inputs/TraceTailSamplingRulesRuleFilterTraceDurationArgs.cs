// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Inputs
{

    public sealed class TraceTailSamplingRulesRuleFilterTraceDurationArgs : global::Pulumi.ResourceArgs
    {
        [Input("maxSecs")]
        public Input<double>? MaxSecs { get; set; }

        [Input("minSecs")]
        public Input<double>? MinSecs { get; set; }

        public TraceTailSamplingRulesRuleFilterTraceDurationArgs()
        {
        }
        public static new TraceTailSamplingRulesRuleFilterTraceDurationArgs Empty => new TraceTailSamplingRulesRuleFilterTraceDurationArgs();
    }
}
