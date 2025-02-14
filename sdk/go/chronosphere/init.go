// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package chronosphere

import (
	"fmt"

	"github.com/blang/semver"
	"github.com/chronosphereio/pulumi-chronosphere/sdk/go/chronosphere/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type module struct {
	version semver.Version
}

func (m *module) Version() semver.Version {
	return m.version
}

func (m *module) Construct(ctx *pulumi.Context, name, typ, urn string) (r pulumi.Resource, err error) {
	switch typ {
	case "chronosphere:index/blackholeAlertNotifier:BlackholeAlertNotifier":
		r = &BlackholeAlertNotifier{}
	case "chronosphere:index/bucket:Bucket":
		r = &Bucket{}
	case "chronosphere:index/classicDashboard:ClassicDashboard":
		r = &ClassicDashboard{}
	case "chronosphere:index/collection:Collection":
		r = &Collection{}
	case "chronosphere:index/dashboard:Dashboard":
		r = &Dashboard{}
	case "chronosphere:index/dataset:Dataset":
		r = &Dataset{}
	case "chronosphere:index/derivedLabel:DerivedLabel":
		r = &DerivedLabel{}
	case "chronosphere:index/derivedMetric:DerivedMetric":
		r = &DerivedMetric{}
	case "chronosphere:index/dropRule:DropRule":
		r = &DropRule{}
	case "chronosphere:index/emailAlertNotifier:EmailAlertNotifier":
		r = &EmailAlertNotifier{}
	case "chronosphere:index/gcpMetricsIntegration:GcpMetricsIntegration":
		r = &GcpMetricsIntegration{}
	case "chronosphere:index/logAllocationConfig:LogAllocationConfig":
		r = &LogAllocationConfig{}
	case "chronosphere:index/logscaleAction:LogscaleAction":
		r = &LogscaleAction{}
	case "chronosphere:index/logscaleAlert:LogscaleAlert":
		r = &LogscaleAlert{}
	case "chronosphere:index/mappingRule:MappingRule":
		r = &MappingRule{}
	case "chronosphere:index/monitor:Monitor":
		r = &Monitor{}
	case "chronosphere:index/notificationPolicy:NotificationPolicy":
		r = &NotificationPolicy{}
	case "chronosphere:index/opsgenieAlertNotifier:OpsgenieAlertNotifier":
		r = &OpsgenieAlertNotifier{}
	case "chronosphere:index/otelMetricsIngestion:OtelMetricsIngestion":
		r = &OtelMetricsIngestion{}
	case "chronosphere:index/pagerdutyAlertNotifier:PagerdutyAlertNotifier":
		r = &PagerdutyAlertNotifier{}
	case "chronosphere:index/recordingRule:RecordingRule":
		r = &RecordingRule{}
	case "chronosphere:index/resourcePoolsConfig:ResourcePoolsConfig":
		r = &ResourcePoolsConfig{}
	case "chronosphere:index/rollupRule:RollupRule":
		r = &RollupRule{}
	case "chronosphere:index/sLO:SLO":
		r = &SLO{}
	case "chronosphere:index/serviceAccount:ServiceAccount":
		r = &ServiceAccount{}
	case "chronosphere:index/slackAlertNotifier:SlackAlertNotifier":
		r = &SlackAlertNotifier{}
	case "chronosphere:index/team:Team":
		r = &Team{}
	case "chronosphere:index/traceJaegerRemoteSamplingStrategy:TraceJaegerRemoteSamplingStrategy":
		r = &TraceJaegerRemoteSamplingStrategy{}
	case "chronosphere:index/traceMetricsRule:TraceMetricsRule":
		r = &TraceMetricsRule{}
	case "chronosphere:index/traceTailSamplingRules:TraceTailSamplingRules":
		r = &TraceTailSamplingRules{}
	case "chronosphere:index/victoropsAlertNotifier:VictoropsAlertNotifier":
		r = &VictoropsAlertNotifier{}
	case "chronosphere:index/webhookAlertNotifier:WebhookAlertNotifier":
		r = &WebhookAlertNotifier{}
	default:
		return nil, fmt.Errorf("unknown resource type: %s", typ)
	}

	err = ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return
}

type pkg struct {
	version semver.Version
}

func (p *pkg) Version() semver.Version {
	return p.version
}

func (p *pkg) ConstructProvider(ctx *pulumi.Context, name, typ, urn string) (pulumi.ProviderResource, error) {
	if typ != "pulumi:providers:chronosphere" {
		return nil, fmt.Errorf("unknown provider type: %s", typ)
	}

	r := &Provider{}
	err := ctx.RegisterResource(typ, name, nil, r, pulumi.URN_(urn))
	return r, err
}

func init() {
	version, err := internal.PkgVersion()
	if err != nil {
		version = semver.Version{Major: 1}
	}
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/blackholeAlertNotifier",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/bucket",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/classicDashboard",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/collection",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/dashboard",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/dataset",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/derivedLabel",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/derivedMetric",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/dropRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/emailAlertNotifier",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/gcpMetricsIntegration",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/logAllocationConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/logscaleAction",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/logscaleAlert",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/mappingRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/monitor",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/notificationPolicy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/opsgenieAlertNotifier",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/otelMetricsIngestion",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/pagerdutyAlertNotifier",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/recordingRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/resourcePoolsConfig",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/rollupRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/sLO",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/serviceAccount",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/slackAlertNotifier",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/team",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/traceJaegerRemoteSamplingStrategy",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/traceMetricsRule",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/traceTailSamplingRules",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/victoropsAlertNotifier",
		&module{version},
	)
	pulumi.RegisterResourceModule(
		"chronosphere",
		"index/webhookAlertNotifier",
		&module{version},
	)
	pulumi.RegisterResourcePackage(
		"chronosphere",
		&pkg{version},
	)
}
