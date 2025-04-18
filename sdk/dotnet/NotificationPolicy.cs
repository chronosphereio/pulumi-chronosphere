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
    [PulumiResourceType("chronosphere:index/notificationPolicy:NotificationPolicy")]
    public partial class NotificationPolicy : global::Pulumi.CustomResource
    {
        [Output("isIndependent")]
        public Output<bool> IsIndependent { get; private set; } = null!;

        [Output("name")]
        public Output<string?> Name { get; private set; } = null!;

        [Output("notificationPolicyData")]
        public Output<string> NotificationPolicyData { get; private set; } = null!;

        [Output("overrides")]
        public Output<ImmutableArray<Outputs.NotificationPolicyOverride>> Overrides { get; private set; } = null!;

        [Output("routes")]
        public Output<ImmutableArray<Outputs.NotificationPolicyRoute>> Routes { get; private set; } = null!;

        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;

        [Output("teamId")]
        public Output<string?> TeamId { get; private set; } = null!;


        /// <summary>
        /// Create a NotificationPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NotificationPolicy(string name, NotificationPolicyArgs? args = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/notificationPolicy:NotificationPolicy", name, args ?? new NotificationPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NotificationPolicy(string name, Input<string> id, NotificationPolicyState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/notificationPolicy:NotificationPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NotificationPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NotificationPolicy Get(string name, Input<string> id, NotificationPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new NotificationPolicy(name, id, state, options);
        }
    }

    public sealed class NotificationPolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notificationPolicyData")]
        public Input<string>? NotificationPolicyData { get; set; }

        [Input("overrides")]
        private InputList<Inputs.NotificationPolicyOverrideArgs>? _overrides;
        public InputList<Inputs.NotificationPolicyOverrideArgs> Overrides
        {
            get => _overrides ?? (_overrides = new InputList<Inputs.NotificationPolicyOverrideArgs>());
            set => _overrides = value;
        }

        [Input("routes")]
        private InputList<Inputs.NotificationPolicyRouteArgs>? _routes;
        public InputList<Inputs.NotificationPolicyRouteArgs> Routes
        {
            get => _routes ?? (_routes = new InputList<Inputs.NotificationPolicyRouteArgs>());
            set => _routes = value;
        }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        public NotificationPolicyArgs()
        {
        }
        public static new NotificationPolicyArgs Empty => new NotificationPolicyArgs();
    }

    public sealed class NotificationPolicyState : global::Pulumi.ResourceArgs
    {
        [Input("isIndependent")]
        public Input<bool>? IsIndependent { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("notificationPolicyData")]
        public Input<string>? NotificationPolicyData { get; set; }

        [Input("overrides")]
        private InputList<Inputs.NotificationPolicyOverrideGetArgs>? _overrides;
        public InputList<Inputs.NotificationPolicyOverrideGetArgs> Overrides
        {
            get => _overrides ?? (_overrides = new InputList<Inputs.NotificationPolicyOverrideGetArgs>());
            set => _overrides = value;
        }

        [Input("routes")]
        private InputList<Inputs.NotificationPolicyRouteGetArgs>? _routes;
        public InputList<Inputs.NotificationPolicyRouteGetArgs> Routes
        {
            get => _routes ?? (_routes = new InputList<Inputs.NotificationPolicyRouteGetArgs>());
            set => _routes = value;
        }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("teamId")]
        public Input<string>? TeamId { get; set; }

        public NotificationPolicyState()
        {
        }
        public static new NotificationPolicyState Empty => new NotificationPolicyState();
    }
}
