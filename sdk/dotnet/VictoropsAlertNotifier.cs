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
    [PulumiResourceType("chronosphere:index/victoropsAlertNotifier:VictoropsAlertNotifier")]
    public partial class VictoropsAlertNotifier : global::Pulumi.CustomResource
    {
        [Output("apiKey")]
        public Output<string> ApiKey { get; private set; } = null!;

        [Output("apiUrl")]
        public Output<string?> ApiUrl { get; private set; } = null!;

        [Output("basicAuthPassword")]
        public Output<string?> BasicAuthPassword { get; private set; } = null!;

        [Output("basicAuthUsername")]
        public Output<string?> BasicAuthUsername { get; private set; } = null!;

        [Output("bearerToken")]
        public Output<string?> BearerToken { get; private set; } = null!;

        [Output("customFields")]
        public Output<ImmutableDictionary<string, string>?> CustomFields { get; private set; } = null!;

        [Output("entityDisplayName")]
        public Output<string?> EntityDisplayName { get; private set; } = null!;

        [Output("messageType")]
        public Output<string?> MessageType { get; private set; } = null!;

        [Output("monitoringTool")]
        public Output<string?> MonitoringTool { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("proxyUrl")]
        public Output<string?> ProxyUrl { get; private set; } = null!;

        [Output("routingKey")]
        public Output<string> RoutingKey { get; private set; } = null!;

        [Output("sendResolved")]
        public Output<bool?> SendResolved { get; private set; } = null!;

        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;

        [Output("stateMessage")]
        public Output<string?> StateMessage { get; private set; } = null!;

        [Output("tlsInsecureSkipVerify")]
        public Output<bool?> TlsInsecureSkipVerify { get; private set; } = null!;


        /// <summary>
        /// Create a VictoropsAlertNotifier resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VictoropsAlertNotifier(string name, VictoropsAlertNotifierArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/victoropsAlertNotifier:VictoropsAlertNotifier", name, args ?? new VictoropsAlertNotifierArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VictoropsAlertNotifier(string name, Input<string> id, VictoropsAlertNotifierState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/victoropsAlertNotifier:VictoropsAlertNotifier", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/chronosphereio",
                AdditionalSecretOutputs =
                {
                    "apiKey",
                    "basicAuthPassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing VictoropsAlertNotifier resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VictoropsAlertNotifier Get(string name, Input<string> id, VictoropsAlertNotifierState? state = null, CustomResourceOptions? options = null)
        {
            return new VictoropsAlertNotifier(name, id, state, options);
        }
    }

    public sealed class VictoropsAlertNotifierArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiKey", required: true)]
        private Input<string>? _apiKey;
        public Input<string>? ApiKey
        {
            get => _apiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("apiUrl")]
        public Input<string>? ApiUrl { get; set; }

        [Input("basicAuthPassword")]
        private Input<string>? _basicAuthPassword;
        public Input<string>? BasicAuthPassword
        {
            get => _basicAuthPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _basicAuthPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("basicAuthUsername")]
        public Input<string>? BasicAuthUsername { get; set; }

        [Input("bearerToken")]
        public Input<string>? BearerToken { get; set; }

        [Input("customFields")]
        private InputMap<string>? _customFields;
        public InputMap<string> CustomFields
        {
            get => _customFields ?? (_customFields = new InputMap<string>());
            set => _customFields = value;
        }

        [Input("entityDisplayName")]
        public Input<string>? EntityDisplayName { get; set; }

        [Input("messageType")]
        public Input<string>? MessageType { get; set; }

        [Input("monitoringTool")]
        public Input<string>? MonitoringTool { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("proxyUrl")]
        public Input<string>? ProxyUrl { get; set; }

        [Input("routingKey", required: true)]
        public Input<string> RoutingKey { get; set; } = null!;

        [Input("sendResolved")]
        public Input<bool>? SendResolved { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("stateMessage")]
        public Input<string>? StateMessage { get; set; }

        [Input("tlsInsecureSkipVerify")]
        public Input<bool>? TlsInsecureSkipVerify { get; set; }

        public VictoropsAlertNotifierArgs()
        {
        }
        public static new VictoropsAlertNotifierArgs Empty => new VictoropsAlertNotifierArgs();
    }

    public sealed class VictoropsAlertNotifierState : global::Pulumi.ResourceArgs
    {
        [Input("apiKey")]
        private Input<string>? _apiKey;
        public Input<string>? ApiKey
        {
            get => _apiKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("apiUrl")]
        public Input<string>? ApiUrl { get; set; }

        [Input("basicAuthPassword")]
        private Input<string>? _basicAuthPassword;
        public Input<string>? BasicAuthPassword
        {
            get => _basicAuthPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _basicAuthPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("basicAuthUsername")]
        public Input<string>? BasicAuthUsername { get; set; }

        [Input("bearerToken")]
        public Input<string>? BearerToken { get; set; }

        [Input("customFields")]
        private InputMap<string>? _customFields;
        public InputMap<string> CustomFields
        {
            get => _customFields ?? (_customFields = new InputMap<string>());
            set => _customFields = value;
        }

        [Input("entityDisplayName")]
        public Input<string>? EntityDisplayName { get; set; }

        [Input("messageType")]
        public Input<string>? MessageType { get; set; }

        [Input("monitoringTool")]
        public Input<string>? MonitoringTool { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("proxyUrl")]
        public Input<string>? ProxyUrl { get; set; }

        [Input("routingKey")]
        public Input<string>? RoutingKey { get; set; }

        [Input("sendResolved")]
        public Input<bool>? SendResolved { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("stateMessage")]
        public Input<string>? StateMessage { get; set; }

        [Input("tlsInsecureSkipVerify")]
        public Input<bool>? TlsInsecureSkipVerify { get; set; }

        public VictoropsAlertNotifierState()
        {
        }
        public static new VictoropsAlertNotifierState Empty => new VictoropsAlertNotifierState();
    }
}
