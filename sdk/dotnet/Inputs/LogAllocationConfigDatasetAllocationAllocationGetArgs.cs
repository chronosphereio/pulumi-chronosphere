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

    public sealed class LogAllocationConfigDatasetAllocationAllocationGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("percentOfLicense", required: true)]
        public Input<double> PercentOfLicense { get; set; } = null!;

        public LogAllocationConfigDatasetAllocationAllocationGetArgs()
        {
        }
        public static new LogAllocationConfigDatasetAllocationAllocationGetArgs Empty => new LogAllocationConfigDatasetAllocationAllocationGetArgs();
    }
}
