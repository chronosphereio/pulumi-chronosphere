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

    public sealed class DatasetConfigurationLogDatasetGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("matchCriteria")]
        public Input<Inputs.DatasetConfigurationLogDatasetMatchCriteriaGetArgs>? MatchCriteria { get; set; }

        public DatasetConfigurationLogDatasetGetArgs()
        {
        }
        public static new DatasetConfigurationLogDatasetGetArgs Empty => new DatasetConfigurationLogDatasetGetArgs();
    }
}
