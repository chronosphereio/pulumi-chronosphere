// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Inputs
{

    public sealed class DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs : global::Pulumi.ResourceArgs
    {
        [Input("sourceValueGlobs", required: true)]
        private InputList<string>? _sourceValueGlobs;
        public InputList<string> SourceValueGlobs
        {
            get => _sourceValueGlobs ?? (_sourceValueGlobs = new InputList<string>());
            set => _sourceValueGlobs = value;
        }

        [Input("targetValue", required: true)]
        public Input<string> TargetValue { get; set; } = null!;

        public DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs()
        {
        }
        public static new DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs Empty => new DerivedLabelMetricLabelMappingLabelNameMappingValueMappingArgs();
    }
}
