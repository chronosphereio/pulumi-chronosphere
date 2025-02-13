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

    public sealed class DatasetConfigurationTraceDatasetMatchCriteriaSpanGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("duration")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanDurationGetArgs>? Duration { get; set; }

        [Input("error")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorGetArgs>? Error { get; set; }

        [Input("isRootSpan")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpanGetArgs>? IsRootSpan { get; set; }

        [Input("matchType")]
        public Input<string>? MatchType { get; set; }

        [Input("operation")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanOperationGetArgs>? Operation { get; set; }

        [Input("parentOperation")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationGetArgs>? ParentOperation { get; set; }

        [Input("parentService")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentServiceGetArgs>? ParentService { get; set; }

        [Input("service")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanServiceGetArgs>? Service { get; set; }

        [Input("spanCount")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountGetArgs>? SpanCount { get; set; }

        [Input("tags")]
        private InputList<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTagGetArgs>? _tags;
        public InputList<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTagGetArgs>());
            set => _tags = value;
        }

        public DatasetConfigurationTraceDatasetMatchCriteriaSpanGetArgs()
        {
        }
        public static new DatasetConfigurationTraceDatasetMatchCriteriaSpanGetArgs Empty => new DatasetConfigurationTraceDatasetMatchCriteriaSpanGetArgs();
    }
}
