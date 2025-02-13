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
    /// <summary>
    /// The provider type for the chronosphere package. By default, resources use package-wide configuration
    /// settings, however an explicit `Provider` instance may be created and passed during resource
    /// construction to achieve fine-grained programmatic control over provider settings. See the
    /// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
    /// </summary>
    [PulumiResourceType("pulumi:providers:chronosphere")]
    public partial class Provider : global::Pulumi.ProviderResource
    {
        [Output("apiToken")]
        public Output<string?> ApiToken { get; private set; } = null!;

        [Output("entityNamespace")]
        public Output<string?> EntityNamespace { get; private set; } = null!;

        [Output("org")]
        public Output<string?> Org { get; private set; } = null!;


        /// <summary>
        /// Create a Provider resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Provider(string name, ProviderArgs? args = null, CustomResourceOptions? options = null)
            : base("chronosphere", name, args ?? new ProviderArgs(), MakeResourceOptions(options, ""))
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
                    "apiToken",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
    }

    public sealed class ProviderArgs : global::Pulumi.ResourceArgs
    {
        [Input("apiToken")]
        private Input<string>? _apiToken;
        public Input<string>? ApiToken
        {
            get => _apiToken;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _apiToken = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("disableDryrun", json: true)]
        public Input<bool>? DisableDryrun { get; set; }

        [Input("entityNamespace")]
        public Input<string>? EntityNamespace { get; set; }

        [Input("org")]
        public Input<string>? Org { get; set; }

        [Input("unstable", json: true)]
        public Input<bool>? Unstable { get; set; }

        public ProviderArgs()
        {
            ApiToken = Utilities.GetEnv("CHRONOSPHERE_API_TOKEN");
            Org = Utilities.GetEnv("CHRONOSPHERE_ORG", "CHRONOSPHERE_ORG_NAME");
        }
        public static new ProviderArgs Empty => new ProviderArgs();
    }
}
