// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Chronosphere.Outputs
{

    [OutputType]
    public sealed class MonitorQuery
    {
        public readonly string? GraphiteExpr;
        public readonly string? PrometheusExpr;

        [OutputConstructor]
        private MonitorQuery(
            string? graphiteExpr,

            string? prometheusExpr)
        {
            GraphiteExpr = graphiteExpr;
            PrometheusExpr = prometheusExpr;
        }
    }
}
