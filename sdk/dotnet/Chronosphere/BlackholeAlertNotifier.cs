// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Chronosphere.Pulumi.Chronosphere
{
    [ChronosphereResourceType("chronosphere:index/blackholeAlertNotifier:BlackholeAlertNotifier")]
    public partial class BlackholeAlertNotifier : global::Pulumi.CustomResource
    {
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;


        /// <summary>
        /// Create a BlackholeAlertNotifier resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BlackholeAlertNotifier(string name, BlackholeAlertNotifierArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/blackholeAlertNotifier:BlackholeAlertNotifier", name, args ?? new BlackholeAlertNotifierArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BlackholeAlertNotifier(string name, Input<string> id, BlackholeAlertNotifierState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/blackholeAlertNotifier:BlackholeAlertNotifier", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BlackholeAlertNotifier resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BlackholeAlertNotifier Get(string name, Input<string> id, BlackholeAlertNotifierState? state = null, CustomResourceOptions? options = null)
        {
            return new BlackholeAlertNotifier(name, id, state, options);
        }
    }

    public sealed class BlackholeAlertNotifierArgs : global::Pulumi.ResourceArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public BlackholeAlertNotifierArgs()
        {
        }
        public static new BlackholeAlertNotifierArgs Empty => new BlackholeAlertNotifierArgs();
    }

    public sealed class BlackholeAlertNotifierState : global::Pulumi.ResourceArgs
    {
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public BlackholeAlertNotifierState()
        {
        }
        public static new BlackholeAlertNotifierState Empty => new BlackholeAlertNotifierState();
    }
}