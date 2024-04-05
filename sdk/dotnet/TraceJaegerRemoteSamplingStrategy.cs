// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere
{
    [ChronosphereResourceType("chronosphere:index/traceJaegerRemoteSamplingStrategy:TraceJaegerRemoteSamplingStrategy")]
    public partial class TraceJaegerRemoteSamplingStrategy : global::Pulumi.CustomResource
    {
        [Output("appliedStrategy")]
        public Output<Outputs.TraceJaegerRemoteSamplingStrategyAppliedStrategy> AppliedStrategy { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("serviceName")]
        public Output<string> ServiceName { get; private set; } = null!;

        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;


        /// <summary>
        /// Create a TraceJaegerRemoteSamplingStrategy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TraceJaegerRemoteSamplingStrategy(string name, TraceJaegerRemoteSamplingStrategyArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/traceJaegerRemoteSamplingStrategy:TraceJaegerRemoteSamplingStrategy", name, args ?? new TraceJaegerRemoteSamplingStrategyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TraceJaegerRemoteSamplingStrategy(string name, Input<string> id, TraceJaegerRemoteSamplingStrategyState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/traceJaegerRemoteSamplingStrategy:TraceJaegerRemoteSamplingStrategy", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing TraceJaegerRemoteSamplingStrategy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TraceJaegerRemoteSamplingStrategy Get(string name, Input<string> id, TraceJaegerRemoteSamplingStrategyState? state = null, CustomResourceOptions? options = null)
        {
            return new TraceJaegerRemoteSamplingStrategy(name, id, state, options);
        }
    }

    public sealed class TraceJaegerRemoteSamplingStrategyArgs : global::Pulumi.ResourceArgs
    {
        [Input("appliedStrategy", required: true)]
        public Input<Inputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyArgs> AppliedStrategy { get; set; } = null!;

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("serviceName", required: true)]
        public Input<string> ServiceName { get; set; } = null!;

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public TraceJaegerRemoteSamplingStrategyArgs()
        {
        }
        public static new TraceJaegerRemoteSamplingStrategyArgs Empty => new TraceJaegerRemoteSamplingStrategyArgs();
    }

    public sealed class TraceJaegerRemoteSamplingStrategyState : global::Pulumi.ResourceArgs
    {
        [Input("appliedStrategy")]
        public Input<Inputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyGetArgs>? AppliedStrategy { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("serviceName")]
        public Input<string>? ServiceName { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public TraceJaegerRemoteSamplingStrategyState()
        {
        }
        public static new TraceJaegerRemoteSamplingStrategyState Empty => new TraceJaegerRemoteSamplingStrategyState();
    }
}
