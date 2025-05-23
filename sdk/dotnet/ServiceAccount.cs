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
    [PulumiResourceType("chronosphere:index/serviceAccount:ServiceAccount")]
    public partial class ServiceAccount : global::Pulumi.CustomResource
    {
        [Output("email")]
        public Output<string> Email { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("restriction")]
        public Output<Outputs.ServiceAccountRestriction?> Restriction { get; private set; } = null!;

        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;

        [Output("token")]
        public Output<string> Token { get; private set; } = null!;

        [Output("unrestricted")]
        public Output<bool?> Unrestricted { get; private set; } = null!;


        /// <summary>
        /// Create a ServiceAccount resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ServiceAccount(string name, ServiceAccountArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/serviceAccount:ServiceAccount", name, args ?? new ServiceAccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ServiceAccount(string name, Input<string> id, ServiceAccountState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/serviceAccount:ServiceAccount", name, state, MakeResourceOptions(options, id))
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
                    "token",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ServiceAccount resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ServiceAccount Get(string name, Input<string> id, ServiceAccountState? state = null, CustomResourceOptions? options = null)
        {
            return new ServiceAccount(name, id, state, options);
        }
    }

    public sealed class ServiceAccountArgs : global::Pulumi.ResourceArgs
    {
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("restriction")]
        public Input<Inputs.ServiceAccountRestrictionArgs>? Restriction { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("unrestricted")]
        public Input<bool>? Unrestricted { get; set; }

        public ServiceAccountArgs()
        {
        }
        public static new ServiceAccountArgs Empty => new ServiceAccountArgs();
    }

    public sealed class ServiceAccountState : global::Pulumi.ResourceArgs
    {
        [Input("email")]
        public Input<string>? Email { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("restriction")]
        public Input<Inputs.ServiceAccountRestrictionGetArgs>? Restriction { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("token")]
        private Input<string>? _token;
        public Input<string>? Token
        {
            get => _token;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _token = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("unrestricted")]
        public Input<bool>? Unrestricted { get; set; }

        public ServiceAccountState()
        {
        }
        public static new ServiceAccountState Empty => new ServiceAccountState();
    }
}
