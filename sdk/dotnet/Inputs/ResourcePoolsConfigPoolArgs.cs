// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Inputs
{

    public sealed class ResourcePoolsConfigPoolArgs : global::Pulumi.ResourceArgs
    {
        [Input("allocation", required: true)]
        public Input<Inputs.ResourcePoolsConfigPoolAllocationArgs> Allocation { get; set; } = null!;

        [Input("matchRule")]
        public Input<string>? MatchRule { get; set; }

        [Input("matchRules")]
        private InputList<string>? _matchRules;
        public InputList<string> MatchRules
        {
            get => _matchRules ?? (_matchRules = new InputList<string>());
            set => _matchRules = value;
        }

        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("priorities")]
        public Input<Inputs.ResourcePoolsConfigPoolPrioritiesArgs>? Priorities { get; set; }

        public ResourcePoolsConfigPoolArgs()
        {
        }
        public static new ResourcePoolsConfigPoolArgs Empty => new ResourcePoolsConfigPoolArgs();
    }
}
