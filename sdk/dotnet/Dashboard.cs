// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere
{
    [ChronosphereResourceType("chronosphere:index/dashboard:Dashboard")]
    public partial class Dashboard : global::Pulumi.CustomResource
    {
        [Output("collectionId")]
        public Output<string?> CollectionId { get; private set; } = null!;

        [Output("dashboardJson")]
        public Output<string> DashboardJson { get; private set; } = null!;

        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;


        /// <summary>
        /// Create a Dashboard resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Dashboard(string name, DashboardArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/dashboard:Dashboard", name, args ?? new DashboardArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Dashboard(string name, Input<string> id, DashboardState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/dashboard:Dashboard", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Dashboard resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Dashboard Get(string name, Input<string> id, DashboardState? state = null, CustomResourceOptions? options = null)
        {
            return new Dashboard(name, id, state, options);
        }
    }

    public sealed class DashboardArgs : global::Pulumi.ResourceArgs
    {
        [Input("collectionId")]
        public Input<string>? CollectionId { get; set; }

        [Input("dashboardJson", required: true)]
        public Input<string> DashboardJson { get; set; } = null!;

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public DashboardArgs()
        {
        }
        public static new DashboardArgs Empty => new DashboardArgs();
    }

    public sealed class DashboardState : global::Pulumi.ResourceArgs
    {
        [Input("collectionId")]
        public Input<string>? CollectionId { get; set; }

        [Input("dashboardJson")]
        public Input<string>? DashboardJson { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public DashboardState()
        {
        }
        public static new DashboardState Empty => new DashboardState();
    }
}
