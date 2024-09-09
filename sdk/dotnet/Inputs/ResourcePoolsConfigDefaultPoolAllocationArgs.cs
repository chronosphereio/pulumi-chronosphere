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

    public sealed class ResourcePoolsConfigDefaultPoolAllocationArgs : global::Pulumi.ResourceArgs
    {
        [Input("fixedValues")]
        private InputList<Inputs.ResourcePoolsConfigDefaultPoolAllocationFixedValueArgs>? _fixedValues;
        public InputList<Inputs.ResourcePoolsConfigDefaultPoolAllocationFixedValueArgs> FixedValues
        {
            get => _fixedValues ?? (_fixedValues = new InputList<Inputs.ResourcePoolsConfigDefaultPoolAllocationFixedValueArgs>());
            set => _fixedValues = value;
        }

        [Input("percentOfLicense")]
        public Input<double>? PercentOfLicense { get; set; }

        public ResourcePoolsConfigDefaultPoolAllocationArgs()
        {
        }
        public static new ResourcePoolsConfigDefaultPoolAllocationArgs Empty => new ResourcePoolsConfigDefaultPoolAllocationArgs();
    }
}
