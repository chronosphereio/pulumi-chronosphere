// Copyright 2024 Chronosphere Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package provider

import (
	_ "embed"
	"fmt"
	"path/filepath"

	"github.com/chronosphereio/pulumi-chronosphere/provider/pkg/version"
	provider "github.com/chronosphereio/terraform-provider-chronosphere/shim"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
)

//go:embed cmd/pulumi-resource-chronosphere/bridge-metadata.json
var metadata []byte

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	// registries for nodejs and python:
	mainPkg = "chronosphere"
	// modules:
	mainMod = "index"
)

// Provider returns additional overlaid schema and metadata associated with the aws package.
func Provider() tfbridge.ProviderInfo {
	p := shimv2.NewProvider(provider.NewProvider())
	return tfbridge.ProviderInfo{
		P:              p,
		Name:           "chronosphere",
		ResourcePrefix: "chronosphere",
		GitHubOrg:      "chronosphereio",
		GitHubHost:     "github.com",
		Description:    "Chronosphere Pulumi Provider",
		Keywords:       []string{"chronosphere", "observability", "prometheus"},
		License:        "Apache-2.0",
		// LogoURL:        "",
		DisplayName: "Chronosphere",
		Publisher:   "Chronosphere",
		Homepage:    "https://chronosphere.io",
		Repository:  "https://github.com/chronosphereio/pulumi-chronosphere",
		Version:     "v0.1.0",
		Config: map[string]*tfbridge.SchemaInfo{
			"org": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"CHRONOSPHERE_ORG", "CHRONOSPHERE_ORG_NAME"}},
			},
			"api_token": {
				Default: &tfbridge.DefaultInfo{EnvVars: []string{"CHRONOSPHERE_API_TOKEN"}},
			},
		},
		// ExtraConfig:              map[string]*tfbridge.ConfigInfo{},
		Resources: map[string]*tfbridge.ResourceInfo{
			"chronosphere_blackhole_alert_notifier": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "BlackholeAlertNotifier"),
			},
			"chronosphere_bucket": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Bucket"),
			},
			"chronosphere_collection": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Collection"),
			},
			"chronosphere_dashboard": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Dashboard"),
			},
			"chronosphere_derived_label": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "DerivedLabel"),
			},
			"chronosphere_derived_metric": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "DerivedMetric"),
			},
			"chronosphere_drop_rule": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "DropRule"),
			},
			"chronosphere_email_alert_notifier": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "EmailAlertNotifier"),
			},
			"chronosphere_classic_dashboard": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "ClassicDashboard"),
			},
			"chronosphere_mapping_rule": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "MappingRule"),
			},
			"chronosphere_monitor": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Monitor"),
			},
			"chronosphere_notification_policy": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "NotificationPolicy"),
			},
			"chronosphere_opsgenie_alert_notifier": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "OpsgenieAlertNotifier"),
			},
			"chronosphere_pagerduty_alert_notifier": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "PagerdutyAlertNotifier"),
			},
			"chronosphere_recording_rule": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "RecordingRule"),
			},
			"chronosphere_resource_pools_config": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "ResourcePoolsConfig"),
			},
			"chronosphere_rollup_rule": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "RollupRule"),
			},
			"chronosphere_service_account": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "ServiceAccount"),
			},
			"chronosphere_slack_alert_notifier": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "SlackAlertNotifier"),
			},
			"chronosphere_team": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Team"),
			},
			"chronosphere_trace_jaeger_remote_sampling_strategy": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "TraceJaegerRemoteSamplingStrategy"),
			},
			"chronosphere_trace_metrics_rule": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "TraceMetricsRule"),
			},
			"chronosphere_trace_tail_sampling_rules": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "TraceTailSamplingRules"),
			},
			"chronosphere_victorops_alert_notifier": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "VictoropsAlertNotifier"),
			},
			"chronosphere_webhook_alert_notifier": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "WebhookAlertNotifier"),
			},
			"chronosphere_gcp_metrics_integration": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "GcpMetricsIntegration"),
			},
			"chronosphere_dataset": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "Dataset"),
			},
			"chronosphere_otel_metrics_ingestion": {
				Tok: tfbridge.MakeResource(mainPkg, mainMod, "OtelMetricsIngestion"),
			},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			"chronosphere_bucket": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "BucketDataSource"),
			},
			"chronosphere_service": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "ServiceDataSource"),
			},
			"chronosphere_collection": {
				Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "CollectionDataSource"),
			},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@pulumi/chronosphere",
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
		},
		Python: &tfbridge.PythonInfo{
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
			PackageName: "chronosphereio_chronosphere",
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/chronosphereio/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		Java: &tfbridge.JavaInfo{
			BasePackage: "io.chronosphere",
		},
		CSharp: &tfbridge.CSharpInfo{
			RootNamespace: "Chronosphere.Pulumi",
		},
		MetadataInfo: tfbridge.NewProviderMetadata(metadata),
		// SkipValidateProviderConfigForPluginFramework: false,
	}
}
