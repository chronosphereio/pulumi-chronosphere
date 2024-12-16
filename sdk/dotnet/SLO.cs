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
    [PulumiResourceType("chronosphere:index/sLO:SLO")]
    public partial class SLO : global::Pulumi.CustomResource
    {
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>?> Annotations { get; private set; } = null!;

        [Output("collectionId")]
        public Output<string> CollectionId { get; private set; } = null!;

        [Output("definition")]
        public Output<Outputs.SLODefinition> Definition { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("notificationPolicyId")]
        public Output<string?> NotificationPolicyId { get; private set; } = null!;

        [Output("signalGrouping")]
        public Output<string?> SignalGrouping { get; private set; } = null!;

        [Output("sli")]
        public Output<Outputs.SLOSli> Sli { get; private set; } = null!;

        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;


        /// <summary>
        /// Create a SLO resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SLO(string name, SLOArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/sLO:SLO", name, args ?? new SLOArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SLO(string name, Input<string> id, SLOState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/sLO:SLO", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SLO resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SLO Get(string name, Input<string> id, SLOState? state = null, CustomResourceOptions? options = null)
        {
            return new SLO(name, id, state, options);
        }
    }

    public sealed class SLOArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        [Input("collectionId", required: true)]
        public Input<string> CollectionId { get; set; } = null!;

        [Input("definition", required: true)]
        public Input<Inputs.SLODefinitionArgs> Definition { get; set; } = null!;

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

        [Input("notificationPolicyId")]
        public Input<string>? NotificationPolicyId { get; set; }

        [Input("signalGrouping")]
        public Input<string>? SignalGrouping { get; set; }

        [Input("sli", required: true)]
        public Input<Inputs.SLOSliArgs> Sli { get; set; } = null!;

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public SLOArgs()
        {
        }
        public static new SLOArgs Empty => new SLOArgs();
    }

    public sealed class SLOState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        [Input("collectionId")]
        public Input<string>? CollectionId { get; set; }

        [Input("definition")]
        public Input<Inputs.SLODefinitionGetArgs>? Definition { get; set; }

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

        [Input("notificationPolicyId")]
        public Input<string>? NotificationPolicyId { get; set; }

        [Input("signalGrouping")]
        public Input<string>? SignalGrouping { get; set; }

        [Input("sli")]
        public Input<Inputs.SLOSliGetArgs>? Sli { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public SLOState()
        {
        }
        public static new SLOState Empty => new SLOState();
    }
}
