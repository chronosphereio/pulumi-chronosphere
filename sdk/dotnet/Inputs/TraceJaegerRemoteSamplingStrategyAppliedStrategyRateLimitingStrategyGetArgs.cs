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

    public sealed class TraceJaegerRemoteSamplingStrategyAppliedStrategyRateLimitingStrategyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("maxTracesPerSecond", required: true)]
        public Input<int> MaxTracesPerSecond { get; set; } = null!;

        public TraceJaegerRemoteSamplingStrategyAppliedStrategyRateLimitingStrategyGetArgs()
        {
        }
        public static new TraceJaegerRemoteSamplingStrategyAppliedStrategyRateLimitingStrategyGetArgs Empty => new TraceJaegerRemoteSamplingStrategyAppliedStrategyRateLimitingStrategyGetArgs();
    }
}