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
    public sealed class DatasetConfigurationLogDataset
    {
        public readonly Outputs.DatasetConfigurationLogDatasetMatchCriteria? MatchCriteria;

        [OutputConstructor]
        private DatasetConfigurationLogDataset(Outputs.DatasetConfigurationLogDatasetMatchCriteria? matchCriteria)
        {
            MatchCriteria = matchCriteria;
        }
    }
}
