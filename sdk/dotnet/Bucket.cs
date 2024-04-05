// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere
{
    [ChronosphereResourceType("chronosphere:index/bucket:Bucket")]
    public partial class Bucket : global::Pulumi.CustomResource
    {
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("notificationPolicyData")]
        public Output<string?> NotificationPolicyData { get; private set; } = null!;

        [Output("notificationPolicyId")]
        public Output<string?> NotificationPolicyId { get; private set; } = null!;

        [Output("notificationPolicySlug")]
        public Output<string> NotificationPolicySlug { get; private set; } = null!;

        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;

        [Output("teamId")]
        public Output<string?> TeamId { get; private set; } = null!;


        /// <summary>
        /// Create a Bucket resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Bucket(string name, BucketArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/bucket:Bucket", name, args ?? new BucketArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Bucket(string name, Input<string> id, BucketState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/bucket:Bucket", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Bucket resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Bucket Get(string name, Input<string> id, BucketState? state = null, CustomResourceOptions? options = null)
        {
            return new Bucket(name, id, state, options);
        }
    }

    public sealed class BucketArgs : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("notificationPolicyData")]
        public Input<string>? NotificationPolicyData { get; set; }

        [Input("notificationPolicyId")]
        public Input<string>? NotificationPolicyId { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        public BucketArgs()
        {
        }
        public static new BucketArgs Empty => new BucketArgs();
    }

    public sealed class BucketState : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("labels")]
        private InputMap<string>? _labels;
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notificationPolicyData")]
        public Input<string>? NotificationPolicyData { get; set; }

        [Input("notificationPolicyId")]
        public Input<string>? NotificationPolicyId { get; set; }

        [Input("notificationPolicySlug")]
        public Input<string>? NotificationPolicySlug { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        public BucketState()
        {
        }
        public static new BucketState Empty => new BucketState();
    }
}
