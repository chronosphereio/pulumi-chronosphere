// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Chronosphere.Pulumi.Inputs
{

    public sealed class MappingRuleStoragePolicyGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("resolution", required: true)]
        public Input<string> Resolution { get; set; } = null!;

        [Input("retention", required: true)]
        public Input<string> Retention { get; set; } = null!;

        public MappingRuleStoragePolicyGetArgs()
        {
        }
        public static new MappingRuleStoragePolicyGetArgs Empty => new MappingRuleStoragePolicyGetArgs();
    }
}
