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

    public sealed class GcpMetricsIntegrationServiceAccountArgs : global::Pulumi.ResourceArgs
    {
        [Input("clientEmail", required: true)]
        public Input<string> ClientEmail { get; set; } = null!;

        public GcpMetricsIntegrationServiceAccountArgs()
        {
        }
        public static new GcpMetricsIntegrationServiceAccountArgs Empty => new GcpMetricsIntegrationServiceAccountArgs();
    }
}
