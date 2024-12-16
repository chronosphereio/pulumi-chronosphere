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
    [PulumiResourceType("chronosphere:index/webhookAlertNotifier:WebhookAlertNotifier")]
    public partial class WebhookAlertNotifier : global::Pulumi.CustomResource
    {
        [Output("basicAuthPassword")]
        public Output<string?> BasicAuthPassword { get; private set; } = null!;

        [Output("basicAuthUsername")]
        public Output<string?> BasicAuthUsername { get; private set; } = null!;

        [Output("bearerToken")]
        public Output<string?> BearerToken { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("proxyUrl")]
        public Output<string?> ProxyUrl { get; private set; } = null!;

        [Output("sendResolved")]
        public Output<bool?> SendResolved { get; private set; } = null!;

        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;

        [Output("tlsInsecureSkipVerify")]
        public Output<bool?> TlsInsecureSkipVerify { get; private set; } = null!;

        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a WebhookAlertNotifier resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public WebhookAlertNotifier(string name, WebhookAlertNotifierArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/webhookAlertNotifier:WebhookAlertNotifier", name, args ?? new WebhookAlertNotifierArgs(), MakeResourceOptions(options, ""))
        {
        }

        private WebhookAlertNotifier(string name, Input<string> id, WebhookAlertNotifierState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/webhookAlertNotifier:WebhookAlertNotifier", name, state, MakeResourceOptions(options, id))
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
                    "basicAuthPassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing WebhookAlertNotifier resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static WebhookAlertNotifier Get(string name, Input<string> id, WebhookAlertNotifierState? state = null, CustomResourceOptions? options = null)
        {
            return new WebhookAlertNotifier(name, id, state, options);
        }
    }

    public sealed class WebhookAlertNotifierArgs : global::Pulumi.ResourceArgs
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

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("proxyUrl")]
        public Input<string>? ProxyUrl { get; set; }

        [Input("sendResolved")]
        public Input<bool>? SendResolved { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("tlsInsecureSkipVerify")]
        public Input<bool>? TlsInsecureSkipVerify { get; set; }

        [Input("url", required: true)]
        public Input<string> Url { get; set; } = null!;

        public WebhookAlertNotifierArgs()
        {
        }
        public static new WebhookAlertNotifierArgs Empty => new WebhookAlertNotifierArgs();
    }

    public sealed class WebhookAlertNotifierState : global::Pulumi.ResourceArgs
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

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("proxyUrl")]
        public Input<string>? ProxyUrl { get; set; }

        [Input("sendResolved")]
        public Input<bool>? SendResolved { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("tlsInsecureSkipVerify")]
        public Input<bool>? TlsInsecureSkipVerify { get; set; }

        [Input("url")]
        public Input<string>? Url { get; set; }

        public WebhookAlertNotifierState()
        {
        }
        public static new WebhookAlertNotifierState Empty => new WebhookAlertNotifierState();
    }
}
