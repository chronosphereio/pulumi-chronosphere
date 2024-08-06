// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Chronosphere.Pulumi
{
    [PulumiResourceType("chronosphere:index/gcpMetricsIntegration:GcpMetricsIntegration")]
    public partial class GcpMetricsIntegration : global::Pulumi.CustomResource
    {
        [Output("metricGroups")]
        public Output<ImmutableArray<Outputs.GcpMetricsIntegrationMetricGroup>> MetricGroups { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("serviceAccount")]
        public Output<Outputs.GcpMetricsIntegrationServiceAccount?> ServiceAccount { get; private set; } = null!;

        [Output("slug")]
        public Output<string?> Slug { get; private set; } = null!;


        /// <summary>
        /// Create a GcpMetricsIntegration resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GcpMetricsIntegration(string name, GcpMetricsIntegrationArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/gcpMetricsIntegration:GcpMetricsIntegration", name, args ?? new GcpMetricsIntegrationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GcpMetricsIntegration(string name, Input<string> id, GcpMetricsIntegrationState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/gcpMetricsIntegration:GcpMetricsIntegration", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GcpMetricsIntegration resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GcpMetricsIntegration Get(string name, Input<string> id, GcpMetricsIntegrationState? state = null, CustomResourceOptions? options = null)
        {
            return new GcpMetricsIntegration(name, id, state, options);
        }
    }

    public sealed class GcpMetricsIntegrationArgs : global::Pulumi.ResourceArgs
    {
        [Input("metricGroups")]
        private InputList<Inputs.GcpMetricsIntegrationMetricGroupArgs>? _metricGroups;
        public InputList<Inputs.GcpMetricsIntegrationMetricGroupArgs> MetricGroups
        {
            get => _metricGroups ?? (_metricGroups = new InputList<Inputs.GcpMetricsIntegrationMetricGroupArgs>());
            set => _metricGroups = value;
        }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("serviceAccount")]
        public Input<Inputs.GcpMetricsIntegrationServiceAccountArgs>? ServiceAccount { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public GcpMetricsIntegrationArgs()
        {
        }
        public static new GcpMetricsIntegrationArgs Empty => new GcpMetricsIntegrationArgs();
    }

    public sealed class GcpMetricsIntegrationState : global::Pulumi.ResourceArgs
    {
        [Input("metricGroups")]
        private InputList<Inputs.GcpMetricsIntegrationMetricGroupGetArgs>? _metricGroups;
        public InputList<Inputs.GcpMetricsIntegrationMetricGroupGetArgs> MetricGroups
        {
            get => _metricGroups ?? (_metricGroups = new InputList<Inputs.GcpMetricsIntegrationMetricGroupGetArgs>());
            set => _metricGroups = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("serviceAccount")]
        public Input<Inputs.GcpMetricsIntegrationServiceAccountGetArgs>? ServiceAccount { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public GcpMetricsIntegrationState()
        {
        }
        public static new GcpMetricsIntegrationState Empty => new GcpMetricsIntegrationState();
    }
}