// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere
{
    [ChronosphereResourceType("chronosphere:index/grafanaDashboard:GrafanaDashboard")]
    public partial class GrafanaDashboard : global::Pulumi.CustomResource
    {
        [Output("bucketId")]
        public Output<string?> BucketId { get; private set; } = null!;

        [Output("collectionId")]
        public Output<string?> CollectionId { get; private set; } = null!;

        [Output("dashboardJson")]
        public Output<string> DashboardJson { get; private set; } = null!;


        /// <summary>
        /// Create a GrafanaDashboard resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GrafanaDashboard(string name, GrafanaDashboardArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/grafanaDashboard:GrafanaDashboard", name, args ?? new GrafanaDashboardArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GrafanaDashboard(string name, Input<string> id, GrafanaDashboardState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/grafanaDashboard:GrafanaDashboard", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GrafanaDashboard resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GrafanaDashboard Get(string name, Input<string> id, GrafanaDashboardState? state = null, CustomResourceOptions? options = null)
        {
            return new GrafanaDashboard(name, id, state, options);
        }
    }

    public sealed class GrafanaDashboardArgs : global::Pulumi.ResourceArgs
    {
        [Input("bucketId")]
        public Input<string>? BucketId { get; set; }

        [Input("collectionId")]
        public Input<string>? CollectionId { get; set; }

        [Input("dashboardJson", required: true)]
        public Input<string> DashboardJson { get; set; } = null!;

        public GrafanaDashboardArgs()
        {
        }
        public static new GrafanaDashboardArgs Empty => new GrafanaDashboardArgs();
    }

    public sealed class GrafanaDashboardState : global::Pulumi.ResourceArgs
    {
        [Input("bucketId")]
        public Input<string>? BucketId { get; set; }

        [Input("collectionId")]
        public Input<string>? CollectionId { get; set; }

        [Input("dashboardJson")]
        public Input<string>? DashboardJson { get; set; }

        public GrafanaDashboardState()
        {
        }
        public static new GrafanaDashboardState Empty => new GrafanaDashboardState();
    }
}