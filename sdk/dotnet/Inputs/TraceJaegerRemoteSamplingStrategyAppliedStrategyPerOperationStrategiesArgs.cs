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

    public sealed class TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesArgs : global::Pulumi.ResourceArgs
    {
        [Input("defaultLowerBoundTracesPerSecond")]
        public Input<double>? DefaultLowerBoundTracesPerSecond { get; set; }

        [Input("defaultSamplingRate", required: true)]
        public Input<double> DefaultSamplingRate { get; set; } = null!;

        [Input("defaultUpperBoundTracesPerSecond")]
        public Input<double>? DefaultUpperBoundTracesPerSecond { get; set; }

        [Input("perOperationStrategies")]
        private InputList<Inputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyArgs>? _perOperationStrategies;
        public InputList<Inputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyArgs> PerOperationStrategies
        {
            get => _perOperationStrategies ?? (_perOperationStrategies = new InputList<Inputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyArgs>());
            set => _perOperationStrategies = value;
        }

        public TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesArgs()
        {
        }
        public static new TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesArgs Empty => new TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesArgs();
    }
}
