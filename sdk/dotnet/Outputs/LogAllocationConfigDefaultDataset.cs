// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Chronosphere.Pulumi.Outputs
{

    [OutputType]
    public sealed class LogAllocationConfigDefaultDataset
    {
        public readonly Outputs.LogAllocationConfigDefaultDatasetAllocation Allocation;
        public readonly Outputs.LogAllocationConfigDefaultDatasetPriorities? Priorities;

        [OutputConstructor]
        private LogAllocationConfigDefaultDataset(
            Outputs.LogAllocationConfigDefaultDatasetAllocation allocation,

            Outputs.LogAllocationConfigDefaultDatasetPriorities? priorities)
        {
            Allocation = allocation;
            Priorities = priorities;
        }
    }
}
