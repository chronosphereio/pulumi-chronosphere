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
    [ChronosphereResourceType("chronosphere:index/pagerdutyAlertNotifier:PagerdutyAlertNotifier")]
    public partial class PagerdutyAlertNotifier : global::Pulumi.CustomResource
    {
        [Output("basicAuthPassword")]
        public Output<string?> BasicAuthPassword { get; private set; } = null!;

        [Output("basicAuthUsername")]
        public Output<string?> BasicAuthUsername { get; private set; } = null!;

        [Output("bearerToken")]
        public Output<string?> BearerToken { get; private set; } = null!;

        [Output("class")]
        public Output<string?> Class { get; private set; } = null!;

        [Output("client")]
        public Output<string?> Client { get; private set; } = null!;

        [Output("clientUrl")]
        public Output<string?> ClientUrl { get; private set; } = null!;

        [Output("component")]
        public Output<string?> Component { get; private set; } = null!;

        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("details")]
        public Output<ImmutableDictionary<string, string>?> Details { get; private set; } = null!;

        [Output("group")]
        public Output<string?> Group { get; private set; } = null!;

        [Output("images")]
        public Output<ImmutableArray<Outputs.PagerdutyAlertNotifierImage>> Images { get; private set; } = null!;

        [Output("links")]
        public Output<ImmutableArray<Outputs.PagerdutyAlertNotifierLink>> Links { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("proxyUrl")]
        public Output<string?> ProxyUrl { get; private set; } = null!;

        [Output("routingKey")]
        public Output<string?> RoutingKey { get; private set; } = null!;

        [Output("sendResolved")]
        public Output<bool?> SendResolved { get; private set; } = null!;

        [Output("serviceKey")]
        public Output<string?> ServiceKey { get; private set; } = null!;

        [Output("severity")]
        public Output<string> Severity { get; private set; } = null!;

        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;

        [Output("tlsInsecureSkipVerify")]
        public Output<bool?> TlsInsecureSkipVerify { get; private set; } = null!;

        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a PagerdutyAlertNotifier resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PagerdutyAlertNotifier(string name, PagerdutyAlertNotifierArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/pagerdutyAlertNotifier:PagerdutyAlertNotifier", name, args ?? new PagerdutyAlertNotifierArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PagerdutyAlertNotifier(string name, Input<string> id, PagerdutyAlertNotifierState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/pagerdutyAlertNotifier:PagerdutyAlertNotifier", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "basicAuthPassword",
                    "serviceKey",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing PagerdutyAlertNotifier resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PagerdutyAlertNotifier Get(string name, Input<string> id, PagerdutyAlertNotifierState? state = null, CustomResourceOptions? options = null)
        {
            return new PagerdutyAlertNotifier(name, id, state, options);
        }
    }

    public sealed class PagerdutyAlertNotifierArgs : global::Pulumi.ResourceArgs
    {
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

        [Input("class")]
        public Input<string>? Class { get; set; }

        [Input("client")]
        public Input<string>? Client { get; set; }

        [Input("clientUrl")]
        public Input<string>? ClientUrl { get; set; }

        [Input("component")]
        public Input<string>? Component { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("details")]
        private InputMap<string>? _details;
        public InputMap<string> Details
        {
            get => _details ?? (_details = new InputMap<string>());
            set => _details = value;
        }

        [Input("group")]
        public Input<string>? Group { get; set; }

        [Input("images")]
        private InputList<Inputs.PagerdutyAlertNotifierImageArgs>? _images;
        public InputList<Inputs.PagerdutyAlertNotifierImageArgs> Images
        {
            get => _images ?? (_images = new InputList<Inputs.PagerdutyAlertNotifierImageArgs>());
            set => _images = value;
        }

        [Input("links")]
        private InputList<Inputs.PagerdutyAlertNotifierLinkArgs>? _links;
        public InputList<Inputs.PagerdutyAlertNotifierLinkArgs> Links
        {
            get => _links ?? (_links = new InputList<Inputs.PagerdutyAlertNotifierLinkArgs>());
            set => _links = value;
        }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("proxyUrl")]
        public Input<string>? ProxyUrl { get; set; }

        [Input("routingKey")]
        public Input<string>? RoutingKey { get; set; }

        [Input("sendResolved")]
        public Input<bool>? SendResolved { get; set; }

        [Input("serviceKey")]
        private Input<string>? _serviceKey;
        public Input<string>? ServiceKey
        {
            get => _serviceKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _serviceKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("severity", required: true)]
        public Input<string> Severity { get; set; } = null!;

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("tlsInsecureSkipVerify")]
        public Input<bool>? TlsInsecureSkipVerify { get; set; }

        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public PagerdutyAlertNotifierArgs()
        {
        }
        public static new PagerdutyAlertNotifierArgs Empty => new PagerdutyAlertNotifierArgs();
    }

    public sealed class PagerdutyAlertNotifierState : global::Pulumi.ResourceArgs
    {
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

        [Input("class")]
        public Input<string>? Class { get; set; }

        [Input("client")]
        public Input<string>? Client { get; set; }

        [Input("clientUrl")]
        public Input<string>? ClientUrl { get; set; }

        [Input("component")]
        public Input<string>? Component { get; set; }

        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("details")]
        private InputMap<string>? _details;
        public InputMap<string> Details
        {
            get => _details ?? (_details = new InputMap<string>());
            set => _details = value;
        }

        [Input("group")]
        public Input<string>? Group { get; set; }

        [Input("images")]
        private InputList<Inputs.PagerdutyAlertNotifierImageGetArgs>? _images;
        public InputList<Inputs.PagerdutyAlertNotifierImageGetArgs> Images
        {
            get => _images ?? (_images = new InputList<Inputs.PagerdutyAlertNotifierImageGetArgs>());
            set => _images = value;
        }

        [Input("links")]
        private InputList<Inputs.PagerdutyAlertNotifierLinkGetArgs>? _links;
        public InputList<Inputs.PagerdutyAlertNotifierLinkGetArgs> Links
        {
            get => _links ?? (_links = new InputList<Inputs.PagerdutyAlertNotifierLinkGetArgs>());
            set => _links = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("proxyUrl")]
        public Input<string>? ProxyUrl { get; set; }

        [Input("routingKey")]
        public Input<string>? RoutingKey { get; set; }

        [Input("sendResolved")]
        public Input<bool>? SendResolved { get; set; }

        [Input("serviceKey")]
        private Input<string>? _serviceKey;
        public Input<string>? ServiceKey
        {
            get => _serviceKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _serviceKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("severity")]
        public Input<string>? Severity { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("tlsInsecureSkipVerify")]
        public Input<bool>? TlsInsecureSkipVerify { get; set; }

        [Input("url")]
        public Input<string>? Url { get; set; }

        public PagerdutyAlertNotifierState()
        {
        }
        public static new PagerdutyAlertNotifierState Empty => new PagerdutyAlertNotifierState();
    }
}