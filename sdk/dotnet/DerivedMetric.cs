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
    [PulumiResourceType("chronosphere:index/derivedMetric:DerivedMetric")]
    public partial class DerivedMetric : global::Pulumi.CustomResource
    {
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("metricName")]
        public Output<string> MetricName { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("queries")]
        public Output<ImmutableArray<Outputs.DerivedMetricQuery>> Queries { get; private set; } = null!;

        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;


        /// <summary>
        /// Create a DerivedMetric resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DerivedMetric(string name, DerivedMetricArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/derivedMetric:DerivedMetric", name, args ?? new DerivedMetricArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DerivedMetric(string name, Input<string> id, DerivedMetricState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/derivedMetric:DerivedMetric", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/chronosphereio",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing DerivedMetric resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DerivedMetric Get(string name, Input<string> id, DerivedMetricState? state = null, CustomResourceOptions? options = null)
        {
            return new DerivedMetric(name, id, state, options);
        }
    }

    public sealed class DerivedMetricArgs : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("metricName", required: true)]
        public Input<string> MetricName { get; set; } = null!;

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("queries", required: true)]
        private InputList<Inputs.DerivedMetricQueryArgs>? _queries;
        public InputList<Inputs.DerivedMetricQueryArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.DerivedMetricQueryArgs>());
            set => _queries = value;
        }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public DerivedMetricArgs()
        {
        }
        public static new DerivedMetricArgs Empty => new DerivedMetricArgs();
    }

    public sealed class DerivedMetricState : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("metricName")]
        public Input<string>? MetricName { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("queries")]
        private InputList<Inputs.DerivedMetricQueryGetArgs>? _queries;
        public InputList<Inputs.DerivedMetricQueryGetArgs> Queries
        {
            get => _queries ?? (_queries = new InputList<Inputs.DerivedMetricQueryGetArgs>());
            set => _queries = value;
        }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public DerivedMetricState()
        {
        }
        public static new DerivedMetricState Empty => new DerivedMetricState();
    }
}
