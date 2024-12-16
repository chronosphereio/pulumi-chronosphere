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
    [PulumiResourceType("chronosphere:index/traceTailSamplingRules:TraceTailSamplingRules")]
    public partial class TraceTailSamplingRules : global::Pulumi.CustomResource
    {
        [Output("defaultSampleRate")]
        public Output<Outputs.TraceTailSamplingRulesDefaultSampleRate?> DefaultSampleRate { get; private set; } = null!;

        [Output("rules")]
        public Output<ImmutableArray<Outputs.TraceTailSamplingRulesRule>> Rules { get; private set; } = null!;


        /// <summary>
        /// Create a TraceTailSamplingRules resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TraceTailSamplingRules(string name, TraceTailSamplingRulesArgs? args = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/traceTailSamplingRules:TraceTailSamplingRules", name, args ?? new TraceTailSamplingRulesArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TraceTailSamplingRules(string name, Input<string> id, TraceTailSamplingRulesState? state = null, CustomResourceOptions? options = null)
            : base("chronosphere:index/traceTailSamplingRules:TraceTailSamplingRules", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TraceTailSamplingRules resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TraceTailSamplingRules Get(string name, Input<string> id, TraceTailSamplingRulesState? state = null, CustomResourceOptions? options = null)
        {
            return new TraceTailSamplingRules(name, id, state, options);
        }
    }

    public sealed class TraceTailSamplingRulesArgs : global::Pulumi.ResourceArgs
    {
        [Input("defaultSampleRate")]
        public Input<Inputs.TraceTailSamplingRulesDefaultSampleRateArgs>? DefaultSampleRate { get; set; }

        [Input("rules")]
        private InputList<Inputs.TraceTailSamplingRulesRuleArgs>? _rules;
        public InputList<Inputs.TraceTailSamplingRulesRuleArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.TraceTailSamplingRulesRuleArgs>());
            set => _rules = value;
        }

        public TraceTailSamplingRulesArgs()
        {
        }
        public static new TraceTailSamplingRulesArgs Empty => new TraceTailSamplingRulesArgs();
    }

    public sealed class TraceTailSamplingRulesState : global::Pulumi.ResourceArgs
    {
        [Input("defaultSampleRate")]
        public Input<Inputs.TraceTailSamplingRulesDefaultSampleRateGetArgs>? DefaultSampleRate { get; set; }

        [Input("rules")]
        private InputList<Inputs.TraceTailSamplingRulesRuleGetArgs>? _rules;
        public InputList<Inputs.TraceTailSamplingRulesRuleGetArgs> Rules
        {
            get => _rules ?? (_rules = new InputList<Inputs.TraceTailSamplingRulesRuleGetArgs>());
            set => _rules = value;
        }

        public TraceTailSamplingRulesState()
        {
        }
        public static new TraceTailSamplingRulesState Empty => new TraceTailSamplingRulesState();
    }
}
