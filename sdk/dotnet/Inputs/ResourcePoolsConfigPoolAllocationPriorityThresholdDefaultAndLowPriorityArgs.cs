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

    public sealed class ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs : global::Pulumi.ResourceArgs
    {
        [Input("fixedValue")]
        public Input<int>? FixedValue { get; set; }

        [Input("percentOfPoolAllocation")]
        public Input<double>? PercentOfPoolAllocation { get; set; }

        public ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs()
        {
        }
        public static new ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs Empty => new ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriorityArgs();
    }
}
