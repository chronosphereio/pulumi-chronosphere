// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Inputs
{

    public sealed class DerivedLabelMetricLabelMappingLabelArgs : global::Pulumi.ResourceArgs
    {
        [Input("nameMappings")]
        private InputList<Inputs.DerivedLabelMetricLabelMappingLabelNameMappingArgs>? _nameMappings;
        public InputList<Inputs.DerivedLabelMetricLabelMappingLabelNameMappingArgs> NameMappings
        {
            get => _nameMappings ?? (_nameMappings = new InputList<Inputs.DerivedLabelMetricLabelMappingLabelNameMappingArgs>());
            set => _nameMappings = value;
        }

        [Input("valueMappings")]
        private InputList<Inputs.DerivedLabelMetricLabelMappingLabelValueMappingArgs>? _valueMappings;
        public InputList<Inputs.DerivedLabelMetricLabelMappingLabelValueMappingArgs> ValueMappings
        {
            get => _valueMappings ?? (_valueMappings = new InputList<Inputs.DerivedLabelMetricLabelMappingLabelValueMappingArgs>());
            set => _valueMappings = value;
        }

        public DerivedLabelMetricLabelMappingLabelArgs()
        {
        }
        public static new DerivedLabelMetricLabelMappingLabelArgs Empty => new DerivedLabelMetricLabelMappingLabelArgs();
    }
}
