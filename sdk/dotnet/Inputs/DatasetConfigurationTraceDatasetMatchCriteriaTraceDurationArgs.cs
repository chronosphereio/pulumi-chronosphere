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

    public sealed class DatasetConfigurationTraceDatasetMatchCriteriaTraceDurationArgs : global::Pulumi.ResourceArgs
    {
        [Input("maxSecs")]
        public Input<double>? MaxSecs { get; set; }

        [Input("minSecs")]
        public Input<double>? MinSecs { get; set; }

        public DatasetConfigurationTraceDatasetMatchCriteriaTraceDurationArgs()
        {
        }
        public static new DatasetConfigurationTraceDatasetMatchCriteriaTraceDurationArgs Empty => new DatasetConfigurationTraceDatasetMatchCriteriaTraceDurationArgs();
    }
}
