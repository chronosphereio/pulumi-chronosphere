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

    public sealed class DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs : global::Pulumi.ResourceArgs
    {
        [Input("duration")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanDurationArgs>? Duration { get; set; }

        [Input("error")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanErrorArgs>? Error { get; set; }

        [Input("isRootSpan")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpanArgs>? IsRootSpan { get; set; }

        [Input("matchType")]
        public Input<string>? MatchType { get; set; }

        [Input("operation")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanOperationArgs>? Operation { get; set; }

        [Input("parentOperation")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperationArgs>? ParentOperation { get; set; }

        [Input("parentService")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentServiceArgs>? ParentService { get; set; }

        [Input("service")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanServiceArgs>? Service { get; set; }

        [Input("spanCount")]
        public Input<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCountArgs>? SpanCount { get; set; }

        [Input("tags")]
        private InputList<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs>? _tags;
        public InputList<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTagArgs>());
            set => _tags = value;
        }

        public DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs()
        {
        }
        public static new DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs Empty => new DatasetConfigurationTraceDatasetMatchCriteriaSpanArgs();
    }
}
