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
    [PulumiResourceType("chronosphere:index/team:Team")]
    public partial class Team : global::Pulumi.CustomResource
    {
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        [Output("slug")]
        public Output<string> Slug { get; private set; } = null!;

        [Output("userEmails")]
        public Output<ImmutableArray<string>> UserEmails { get; private set; } = null!;


        /// <summary>
        /// Create a Team resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Team(string name, TeamArgs args, CustomResourceOptions? options = null)
            : base("chronosphere:index/team:Team", name, args ?? new TeamArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Team(string name, Input<string> id, TeamState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/team:Team", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Team resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Team Get(string name, Input<string> id, TeamState? state = null, CustomResourceOptions? options = null)
        {
            return new Team(name, id, state, options);
        }
    }

    public sealed class TeamArgs : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("userEmails")]
        private InputList<string>? _userEmails;
        public InputList<string> UserEmails
        {
            get => _userEmails ?? (_userEmails = new InputList<string>());
            set => _userEmails = value;
        }

        public TeamArgs()
        {
        }
        public static new TeamArgs Empty => new TeamArgs();
    }

    public sealed class TeamState : global::Pulumi.ResourceArgs
    {
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        [Input("userEmails")]
        private InputList<string>? _userEmails;
        public InputList<string> UserEmails
        {
            get => _userEmails ?? (_userEmails = new InputList<string>());
            set => _userEmails = value;
        }

        public TeamState()
        {
        }
        public static new TeamState Empty => new TeamState();
    }
}
