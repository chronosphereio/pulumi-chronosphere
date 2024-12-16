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
    public sealed class SLOSli
    {
        public readonly Outputs.SLOSliCustomIndicator? CustomIndicator;
        public readonly Outputs.SLOSliEndpointAvailability? EndpointAvailability;
        public readonly string? EndpointLabel;
        public readonly Outputs.SLOSliEndpointLatency? EndpointLatency;
        public readonly string? LensTemplateIndicator;

        [OutputConstructor]
        private SLOSli(
            Outputs.SLOSliCustomIndicator? customIndicator,

            Outputs.SLOSliEndpointAvailability? endpointAvailability,

            string? endpointLabel,

            Outputs.SLOSliEndpointLatency? endpointLatency,

            string? lensTemplateIndicator)
        {
            CustomIndicator = customIndicator;
            EndpointAvailability = endpointAvailability;
            EndpointLabel = endpointLabel;
            EndpointLatency = endpointLatency;
            LensTemplateIndicator = lensTemplateIndicator;
        }
    }
}