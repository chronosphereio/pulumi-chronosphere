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
    public sealed class TraceTailSamplingRulesRuleFilterSpanIsRootSpan
    {
        public readonly bool Value;

        [OutputConstructor]
        private TraceTailSamplingRulesRuleFilterSpanIsRootSpan(bool value)
        {
            Value = value;
        }
    }
}
