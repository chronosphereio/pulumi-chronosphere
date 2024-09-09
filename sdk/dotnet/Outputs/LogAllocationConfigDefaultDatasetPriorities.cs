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
    public sealed class LogAllocationConfigDefaultDatasetPriorities
    {
        public readonly ImmutableArray<Outputs.LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter> HighPriorityFilters;
        public readonly ImmutableArray<Outputs.LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilter> LowPriorityFilters;

        [OutputConstructor]
        private LogAllocationConfigDefaultDatasetPriorities(
            ImmutableArray<Outputs.LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter> highPriorityFilters,

            ImmutableArray<Outputs.LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilter> lowPriorityFilters)
        {
            HighPriorityFilters = highPriorityFilters;
            LowPriorityFilters = lowPriorityFilters;
        }
    }
}