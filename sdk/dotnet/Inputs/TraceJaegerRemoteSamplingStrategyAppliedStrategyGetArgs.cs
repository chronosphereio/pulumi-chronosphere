// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Inputs
{

    public sealed class TraceJaegerRemoteSamplingStrategyAppliedStrategyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("perOperationStrategies")]
        public Input<Inputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesGetArgs>? PerOperationStrategies { get; set; }

        [Input("probabilisticStrategy")]
        public Input<Inputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyProbabilisticStrategyGetArgs>? ProbabilisticStrategy { get; set; }

        [Input("rateLimitingStrategy")]
        public Input<Inputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyRateLimitingStrategyGetArgs>? RateLimitingStrategy { get; set; }

        public TraceJaegerRemoteSamplingStrategyAppliedStrategyGetArgs()
        {
        }
        public static new TraceJaegerRemoteSamplingStrategyAppliedStrategyGetArgs Empty => new TraceJaegerRemoteSamplingStrategyAppliedStrategyGetArgs();
    }
}
