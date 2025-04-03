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

    public sealed class SLOSliArgs : global::Pulumi.ResourceArgs
    {
        [Input("additionalPromqlFilters")]
        private InputList<Inputs.SLOSliAdditionalPromqlFilterArgs>? _additionalPromqlFilters;
        public InputList<Inputs.SLOSliAdditionalPromqlFilterArgs> AdditionalPromqlFilters
        {
            get => _additionalPromqlFilters ?? (_additionalPromqlFilters = new InputList<Inputs.SLOSliAdditionalPromqlFilterArgs>());
            set => _additionalPromqlFilters = value;
        }

        [Input("customDimensionLabels")]
        private InputList<string>? _customDimensionLabels;
        public InputList<string> CustomDimensionLabels
        {
            get => _customDimensionLabels ?? (_customDimensionLabels = new InputList<string>());
            set => _customDimensionLabels = value;
        }

        [Input("customIndicator")]
        public Input<Inputs.SLOSliCustomIndicatorArgs>? CustomIndicator { get; set; }

        [Input("endpointAvailability")]
        public Input<Inputs.SLOSliEndpointAvailabilityArgs>? EndpointAvailability { get; set; }

        [Input("endpointLabel")]
        public Input<string>? EndpointLabel { get; set; }

        [Input("endpointLatency")]
        public Input<Inputs.SLOSliEndpointLatencyArgs>? EndpointLatency { get; set; }

        [Input("lensTemplateIndicator")]
        public Input<string>? LensTemplateIndicator { get; set; }

        public SLOSliArgs()
        {
        }
        public static new SLOSliArgs Empty => new SLOSliArgs();
    }
}
