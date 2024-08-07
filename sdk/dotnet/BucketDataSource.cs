// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Chronosphere.Pulumi
{
    public static class BucketDataSource
    {
        public static Task<BucketDataSourceResult> InvokeAsync(BucketDataSourceArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<BucketDataSourceResult>("chronosphere:index/bucketDataSource:BucketDataSource", args ?? new BucketDataSourceArgs(), options.WithDefaults());

        public static Output<BucketDataSourceResult> Invoke(BucketDataSourceInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<BucketDataSourceResult>("chronosphere:index/bucketDataSource:BucketDataSource", args ?? new BucketDataSourceInvokeArgs(), options.WithDefaults());
    }


    public sealed class BucketDataSourceArgs : global::Pulumi.InvokeArgs
    {
        [Input("labels")]
        private Dictionary<string, string>? _labels;
        public Dictionary<string, string> Labels
        {
            get => _labels ?? (_labels = new Dictionary<string, string>());
            set => _labels = value;
        }

        [Input("name")]
        public string? Name { get; set; }

        [Input("slug")]
        public string? Slug { get; set; }

        public BucketDataSourceArgs()
        {
        }
        public static new BucketDataSourceArgs Empty => new BucketDataSourceArgs();
    }

    public sealed class BucketDataSourceInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("labels")]
        private InputMap<string>? _labels;
        public InputMap<string> Labels
        {
            get => _labels ?? (_labels = new InputMap<string>());
            set => _labels = value;
        }

        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("slug")]
        public Input<string>? Slug { get; set; }

        public BucketDataSourceInvokeArgs()
        {
        }
        public static new BucketDataSourceInvokeArgs Empty => new BucketDataSourceInvokeArgs();
    }


    [OutputType]
    public sealed class BucketDataSourceResult
    {
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableDictionary<string, string>? Labels;
        public readonly string? Name;
        public readonly string? Slug;

        [OutputConstructor]
        private BucketDataSourceResult(
            string description,

            string id,

            ImmutableDictionary<string, string>? labels,

            string? name,

            string? slug)
        {
            Description = description;
            Id = id;
            Labels = labels;
            Name = name;
            Slug = slug;
        }
    }
}
