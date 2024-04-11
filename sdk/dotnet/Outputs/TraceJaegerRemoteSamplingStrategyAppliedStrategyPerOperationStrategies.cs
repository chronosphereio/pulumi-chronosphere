// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Outputs
{

    [OutputType]
    public sealed class TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategies
    {
        public readonly double? DefaultLowerBoundTracesPerSecond;
        public readonly double DefaultSamplingRate;
        public readonly double? DefaultUpperBoundTracesPerSecond;
        public readonly ImmutableArray<Outputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategy> PerOperationStrategies;

        [OutputConstructor]
        private TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategies(
            double? defaultLowerBoundTracesPerSecond,

            double defaultSamplingRate,

            double? defaultUpperBoundTracesPerSecond,

            ImmutableArray<Outputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategy> perOperationStrategies)
        {
            DefaultLowerBoundTracesPerSecond = defaultLowerBoundTracesPerSecond;
            DefaultSamplingRate = defaultSamplingRate;
            DefaultUpperBoundTracesPerSecond = defaultUpperBoundTracesPerSecond;
            PerOperationStrategies = perOperationStrategies;
        }
    }
}
