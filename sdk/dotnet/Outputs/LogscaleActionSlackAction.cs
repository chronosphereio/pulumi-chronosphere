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
    public sealed class LogscaleActionSlackAction
    {
        public readonly ImmutableDictionary<string, string>? Fields;
        public readonly string Url;
        public readonly bool? UseProxy;

        [OutputConstructor]
        private LogscaleActionSlackAction(
            ImmutableDictionary<string, string>? fields,

            string url,

            bool? useProxy)
        {
            Fields = fields;
            Url = url;
            UseProxy = useProxy;
        }
    }
}
