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

    public sealed class LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs : global::Pulumi.ResourceArgs
    {
        [Input("query", required: true)]
        public Input<string> Query { get; set; } = null!;

        public LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs()
        {
        }
        public static new LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs Empty => new LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilterArgs();
    }
}
