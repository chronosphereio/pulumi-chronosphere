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

    public sealed class TraceTailSamplingRulesDefaultSampleRateGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("sampleRate", required: true)]
        public Input<double> SampleRate { get; set; } = null!;

        public TraceTailSamplingRulesDefaultSampleRateGetArgs()
        {
        }
        public static new TraceTailSamplingRulesDefaultSampleRateGetArgs Empty => new TraceTailSamplingRulesDefaultSampleRateGetArgs();
    }
}