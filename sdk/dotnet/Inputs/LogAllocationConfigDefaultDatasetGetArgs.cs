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

    public sealed class LogAllocationConfigDefaultDatasetGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("allocation", required: true)]
        public Input<Inputs.LogAllocationConfigDefaultDatasetAllocationGetArgs> Allocation { get; set; } = null!;

        [Input("priorities")]
        public Input<Inputs.LogAllocationConfigDefaultDatasetPrioritiesGetArgs>? Priorities { get; set; }

        public LogAllocationConfigDefaultDatasetGetArgs()
        {
        }
        public static new LogAllocationConfigDefaultDatasetGetArgs Empty => new LogAllocationConfigDefaultDatasetGetArgs();
    }
}