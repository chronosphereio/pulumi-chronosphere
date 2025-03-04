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
    [PulumiResourceType("chronosphere:index/monitor:Monitor")]
    public partial class Monitor : global::Pulumi.CustomResource
    {
        [Output("annotations")]
        public Output<ImmutableDictionary<string, string>?> Annotations { get; private set; } = null!;

        [Output("bucketId")]
        public Output<string?> BucketId { get; private set; } = null!;

        [Output("collectionId")]
        public Output<string?> CollectionId { get; private set; } = null!;

        [Output("interval")]
        public Output<string?> Interval { get; private set; } = null!;

        [Output("labels")]
        public Output<ImmutableDictionary<string, string>?> Labels { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("notificationPolicyId")]
        public Output<string?> NotificationPolicyId { get; private set; } = null!;

        [Output("query")]
        public Output<Outputs.MonitorQuery> Query { get; private set; } = null!;

        [Output("schedule")]
        public Output<Outputs.MonitorSchedule?> Schedule { get; private set; } = null!;

        [Output("seriesConditions")]
        public Output<Outputs.MonitorSeriesConditions> SeriesConditions { get; private set; } = null!;

        [Output("signalGrouping")]
        public Output<Outputs.MonitorSignalGrouping?> SignalGrouping { get; private set; } = null!;

        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;


        /// <summary>
        /// Create a Monitor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Monitor(string name, MonitorArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/monitor:Monitor", name, args ?? new MonitorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Monitor(string name, Input<string> id, MonitorState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/monitor:Monitor", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Monitor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Monitor Get(string name, Input<string> id, MonitorState? state = null, CustomResourceOptions? options = null)
        {
            return new Monitor(name, id, state, options);
        }
    }

    public sealed class MonitorArgs : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        [Input("bucketId")]
        public Input<string>? BucketId { get; set; }

        [Input("collectionId")]
        public Input<string>? CollectionId { get; set; }

        [Input("interval")]
        public Input<string>? Interval { get; set; }

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

        [Input("query", required: true)]
        public Input<Inputs.MonitorQueryArgs> Query { get; set; } = null!;

        [Input("schedule")]
        public Input<Inputs.MonitorScheduleArgs>? Schedule { get; set; }

        [Input("seriesConditions", required: true)]
        public Input<Inputs.MonitorSeriesConditionsArgs> SeriesConditions { get; set; } = null!;

        [Input("signalGrouping")]
        public Input<Inputs.MonitorSignalGroupingArgs>? SignalGrouping { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public MonitorArgs()
        {
        }
        public static new MonitorArgs Empty => new MonitorArgs();
    }

    public sealed class MonitorState : global::Pulumi.ResourceArgs
    {
        [Input("annotations")]
        private InputMap<string>? _annotations;
        public InputMap<string> Annotations
        {
            get => _annotations ?? (_annotations = new InputMap<string>());
            set => _annotations = value;
        }

        [Input("bucketId")]
        public Input<string>? BucketId { get; set; }

        [Input("collectionId")]
        public Input<string>? CollectionId { get; set; }

        [Input("interval")]
        public Input<string>? Interval { get; set; }

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

        [Input("query")]
        public Input<Inputs.MonitorQueryGetArgs>? Query { get; set; }

        [Input("schedule")]
        public Input<Inputs.MonitorScheduleGetArgs>? Schedule { get; set; }

        [Input("seriesConditions")]
        public Input<Inputs.MonitorSeriesConditionsGetArgs>? SeriesConditions { get; set; }

        [Input("signalGrouping")]
        public Input<Inputs.MonitorSignalGroupingGetArgs>? SignalGrouping { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public MonitorState()
        {
        }
        public static new MonitorState Empty => new MonitorState();
    }
}
