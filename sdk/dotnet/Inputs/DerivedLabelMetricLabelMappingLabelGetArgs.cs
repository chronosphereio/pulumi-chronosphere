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

    public sealed class DerivedLabelMetricLabelMappingLabelGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("nameMappings")]
        private InputList<Inputs.DerivedLabelMetricLabelMappingLabelNameMappingGetArgs>? _nameMappings;
        public InputList<Inputs.DerivedLabelMetricLabelMappingLabelNameMappingGetArgs> NameMappings
        {
            get => _nameMappings ?? (_nameMappings = new InputList<Inputs.DerivedLabelMetricLabelMappingLabelNameMappingGetArgs>());
            set => _nameMappings = value;
        }

        [Input("valueMappings")]
        private InputList<Inputs.DerivedLabelMetricLabelMappingLabelValueMappingGetArgs>? _valueMappings;
        public InputList<Inputs.DerivedLabelMetricLabelMappingLabelValueMappingGetArgs> ValueMappings
        {
            get => _valueMappings ?? (_valueMappings = new InputList<Inputs.DerivedLabelMetricLabelMappingLabelValueMappingGetArgs>());
            set => _valueMappings = value;
        }

        public DerivedLabelMetricLabelMappingLabelGetArgs()
        {
        }
        public static new DerivedLabelMetricLabelMappingLabelGetArgs Empty => new DerivedLabelMetricLabelMappingLabelGetArgs();
    }
}
