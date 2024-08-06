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
    [PulumiResourceType("chronosphere:index/collection:Collection")]
    public partial class Collection : global::Pulumi.CustomResource
    {
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("notificationPolicyId")]
        public Output<string?> NotificationPolicyId { get; private set; } = null!;

        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;

        [Output("teamId")]
        public Output<string?> TeamId { get; private set; } = null!;


        /// <summary>
        /// Create a Collection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Collection(string name, CollectionArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/collection:Collection", name, args ?? new CollectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Collection(string name, Input<string> id, CollectionState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/collection:Collection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Collection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Collection Get(string name, Input<string> id, CollectionState? state = null, CustomResourceOptions? options = null)
        {
            return new Collection(name, id, state, options);
        }
    }

    public sealed class CollectionArgs : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("notificationPolicyId")]
        public Input<string>? NotificationPolicyId { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        public CollectionArgs()
        {
        }
        public static new CollectionArgs Empty => new CollectionArgs();
    }

    public sealed class CollectionState : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notificationPolicyId")]
        public Input<string>? NotificationPolicyId { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        public CollectionState()
        {
        }
        public static new CollectionState Empty => new CollectionState();
    }
}