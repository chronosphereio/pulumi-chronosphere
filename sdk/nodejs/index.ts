// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

// Export members:
export { BlackholeAlertNotifierArgs, BlackholeAlertNotifierState } from "./blackholeAlertNotifier";
export type BlackholeAlertNotifier = import("./blackholeAlertNotifier").BlackholeAlertNotifier;
export const BlackholeAlertNotifier: typeof import("./blackholeAlertNotifier").BlackholeAlertNotifier = null as any;
utilities.lazyLoad(exports, ["BlackholeAlertNotifier"], () => require("./blackholeAlertNotifier"));

export { BucketArgs, BucketState } from "./bucket";
export type Bucket = import("./bucket").Bucket;
export const Bucket: typeof import("./bucket").Bucket = null as any;
utilities.lazyLoad(exports, ["Bucket"], () => require("./bucket"));

export { BucketDataSourceArgs, BucketDataSourceResult, BucketDataSourceOutputArgs } from "./bucketDataSource";
export const bucketDataSource: typeof import("./bucketDataSource").bucketDataSource = null as any;
export const bucketDataSourceOutput: typeof import("./bucketDataSource").bucketDataSourceOutput = null as any;
utilities.lazyLoad(exports, ["bucketDataSource","bucketDataSourceOutput"], () => require("./bucketDataSource"));

export { ClassicDashboardArgs, ClassicDashboardState } from "./classicDashboard";
export type ClassicDashboard = import("./classicDashboard").ClassicDashboard;
export const ClassicDashboard: typeof import("./classicDashboard").ClassicDashboard = null as any;
utilities.lazyLoad(exports, ["ClassicDashboard"], () => require("./classicDashboard"));

export { CollectionArgs, CollectionState } from "./collection";
export type Collection = import("./collection").Collection;
export const Collection: typeof import("./collection").Collection = null as any;
utilities.lazyLoad(exports, ["Collection"], () => require("./collection"));

export { CollectionDataSourceArgs, CollectionDataSourceResult, CollectionDataSourceOutputArgs } from "./collectionDataSource";
export const collectionDataSource: typeof import("./collectionDataSource").collectionDataSource = null as any;
export const collectionDataSourceOutput: typeof import("./collectionDataSource").collectionDataSourceOutput = null as any;
utilities.lazyLoad(exports, ["collectionDataSource","collectionDataSourceOutput"], () => require("./collectionDataSource"));

export { DashboardArgs, DashboardState } from "./dashboard";
export type Dashboard = import("./dashboard").Dashboard;
export const Dashboard: typeof import("./dashboard").Dashboard = null as any;
utilities.lazyLoad(exports, ["Dashboard"], () => require("./dashboard"));

export { DatasetArgs, DatasetState } from "./dataset";
export type Dataset = import("./dataset").Dataset;
export const Dataset: typeof import("./dataset").Dataset = null as any;
utilities.lazyLoad(exports, ["Dataset"], () => require("./dataset"));

export { DerivedLabelArgs, DerivedLabelState } from "./derivedLabel";
export type DerivedLabel = import("./derivedLabel").DerivedLabel;
export const DerivedLabel: typeof import("./derivedLabel").DerivedLabel = null as any;
utilities.lazyLoad(exports, ["DerivedLabel"], () => require("./derivedLabel"));

export { DerivedMetricArgs, DerivedMetricState } from "./derivedMetric";
export type DerivedMetric = import("./derivedMetric").DerivedMetric;
export const DerivedMetric: typeof import("./derivedMetric").DerivedMetric = null as any;
utilities.lazyLoad(exports, ["DerivedMetric"], () => require("./derivedMetric"));

export { DropRuleArgs, DropRuleState } from "./dropRule";
export type DropRule = import("./dropRule").DropRule;
export const DropRule: typeof import("./dropRule").DropRule = null as any;
utilities.lazyLoad(exports, ["DropRule"], () => require("./dropRule"));

export { EmailAlertNotifierArgs, EmailAlertNotifierState } from "./emailAlertNotifier";
export type EmailAlertNotifier = import("./emailAlertNotifier").EmailAlertNotifier;
export const EmailAlertNotifier: typeof import("./emailAlertNotifier").EmailAlertNotifier = null as any;
utilities.lazyLoad(exports, ["EmailAlertNotifier"], () => require("./emailAlertNotifier"));

export { GcpMetricsIntegrationArgs, GcpMetricsIntegrationState } from "./gcpMetricsIntegration";
export type GcpMetricsIntegration = import("./gcpMetricsIntegration").GcpMetricsIntegration;
export const GcpMetricsIntegration: typeof import("./gcpMetricsIntegration").GcpMetricsIntegration = null as any;
utilities.lazyLoad(exports, ["GcpMetricsIntegration"], () => require("./gcpMetricsIntegration"));

export { LogAllocationConfigArgs, LogAllocationConfigState } from "./logAllocationConfig";
export type LogAllocationConfig = import("./logAllocationConfig").LogAllocationConfig;
export const LogAllocationConfig: typeof import("./logAllocationConfig").LogAllocationConfig = null as any;
utilities.lazyLoad(exports, ["LogAllocationConfig"], () => require("./logAllocationConfig"));

export { LogscaleActionArgs, LogscaleActionState } from "./logscaleAction";
export type LogscaleAction = import("./logscaleAction").LogscaleAction;
export const LogscaleAction: typeof import("./logscaleAction").LogscaleAction = null as any;
utilities.lazyLoad(exports, ["LogscaleAction"], () => require("./logscaleAction"));

export { LogscaleAlertArgs, LogscaleAlertState } from "./logscaleAlert";
export type LogscaleAlert = import("./logscaleAlert").LogscaleAlert;
export const LogscaleAlert: typeof import("./logscaleAlert").LogscaleAlert = null as any;
utilities.lazyLoad(exports, ["LogscaleAlert"], () => require("./logscaleAlert"));

export { MappingRuleArgs, MappingRuleState } from "./mappingRule";
export type MappingRule = import("./mappingRule").MappingRule;
export const MappingRule: typeof import("./mappingRule").MappingRule = null as any;
utilities.lazyLoad(exports, ["MappingRule"], () => require("./mappingRule"));

export { MonitorArgs, MonitorState } from "./monitor";
export type Monitor = import("./monitor").Monitor;
export const Monitor: typeof import("./monitor").Monitor = null as any;
utilities.lazyLoad(exports, ["Monitor"], () => require("./monitor"));

export { NotificationPolicyArgs, NotificationPolicyState } from "./notificationPolicy";
export type NotificationPolicy = import("./notificationPolicy").NotificationPolicy;
export const NotificationPolicy: typeof import("./notificationPolicy").NotificationPolicy = null as any;
utilities.lazyLoad(exports, ["NotificationPolicy"], () => require("./notificationPolicy"));

export { OpsgenieAlertNotifierArgs, OpsgenieAlertNotifierState } from "./opsgenieAlertNotifier";
export type OpsgenieAlertNotifier = import("./opsgenieAlertNotifier").OpsgenieAlertNotifier;
export const OpsgenieAlertNotifier: typeof import("./opsgenieAlertNotifier").OpsgenieAlertNotifier = null as any;
utilities.lazyLoad(exports, ["OpsgenieAlertNotifier"], () => require("./opsgenieAlertNotifier"));

export { OtelMetricsIngestionArgs, OtelMetricsIngestionState } from "./otelMetricsIngestion";
export type OtelMetricsIngestion = import("./otelMetricsIngestion").OtelMetricsIngestion;
export const OtelMetricsIngestion: typeof import("./otelMetricsIngestion").OtelMetricsIngestion = null as any;
utilities.lazyLoad(exports, ["OtelMetricsIngestion"], () => require("./otelMetricsIngestion"));

export { PagerdutyAlertNotifierArgs, PagerdutyAlertNotifierState } from "./pagerdutyAlertNotifier";
export type PagerdutyAlertNotifier = import("./pagerdutyAlertNotifier").PagerdutyAlertNotifier;
export const PagerdutyAlertNotifier: typeof import("./pagerdutyAlertNotifier").PagerdutyAlertNotifier = null as any;
utilities.lazyLoad(exports, ["PagerdutyAlertNotifier"], () => require("./pagerdutyAlertNotifier"));

export { ProviderArgs } from "./provider";
export type Provider = import("./provider").Provider;
export const Provider: typeof import("./provider").Provider = null as any;
utilities.lazyLoad(exports, ["Provider"], () => require("./provider"));

export { RecordingRuleArgs, RecordingRuleState } from "./recordingRule";
export type RecordingRule = import("./recordingRule").RecordingRule;
export const RecordingRule: typeof import("./recordingRule").RecordingRule = null as any;
utilities.lazyLoad(exports, ["RecordingRule"], () => require("./recordingRule"));

export { ResourcePoolsConfigArgs, ResourcePoolsConfigState } from "./resourcePoolsConfig";
export type ResourcePoolsConfig = import("./resourcePoolsConfig").ResourcePoolsConfig;
export const ResourcePoolsConfig: typeof import("./resourcePoolsConfig").ResourcePoolsConfig = null as any;
utilities.lazyLoad(exports, ["ResourcePoolsConfig"], () => require("./resourcePoolsConfig"));

export { RollupRuleArgs, RollupRuleState } from "./rollupRule";
export type RollupRule = import("./rollupRule").RollupRule;
export const RollupRule: typeof import("./rollupRule").RollupRule = null as any;
utilities.lazyLoad(exports, ["RollupRule"], () => require("./rollupRule"));

export { ServiceAccountArgs, ServiceAccountState } from "./serviceAccount";
export type ServiceAccount = import("./serviceAccount").ServiceAccount;
export const ServiceAccount: typeof import("./serviceAccount").ServiceAccount = null as any;
utilities.lazyLoad(exports, ["ServiceAccount"], () => require("./serviceAccount"));

export { ServiceDataSourceArgs, ServiceDataSourceResult, ServiceDataSourceOutputArgs } from "./serviceDataSource";
export const serviceDataSource: typeof import("./serviceDataSource").serviceDataSource = null as any;
export const serviceDataSourceOutput: typeof import("./serviceDataSource").serviceDataSourceOutput = null as any;
utilities.lazyLoad(exports, ["serviceDataSource","serviceDataSourceOutput"], () => require("./serviceDataSource"));

export { SlackAlertNotifierArgs, SlackAlertNotifierState } from "./slackAlertNotifier";
export type SlackAlertNotifier = import("./slackAlertNotifier").SlackAlertNotifier;
export const SlackAlertNotifier: typeof import("./slackAlertNotifier").SlackAlertNotifier = null as any;
utilities.lazyLoad(exports, ["SlackAlertNotifier"], () => require("./slackAlertNotifier"));

export { SLOArgs, SLOState } from "./slo";
export type SLO = import("./slo").SLO;
export const SLO: typeof import("./slo").SLO = null as any;
utilities.lazyLoad(exports, ["SLO"], () => require("./slo"));

export { TeamArgs, TeamState } from "./team";
export type Team = import("./team").Team;
export const Team: typeof import("./team").Team = null as any;
utilities.lazyLoad(exports, ["Team"], () => require("./team"));

export { TraceJaegerRemoteSamplingStrategyArgs, TraceJaegerRemoteSamplingStrategyState } from "./traceJaegerRemoteSamplingStrategy";
export type TraceJaegerRemoteSamplingStrategy = import("./traceJaegerRemoteSamplingStrategy").TraceJaegerRemoteSamplingStrategy;
export const TraceJaegerRemoteSamplingStrategy: typeof import("./traceJaegerRemoteSamplingStrategy").TraceJaegerRemoteSamplingStrategy = null as any;
utilities.lazyLoad(exports, ["TraceJaegerRemoteSamplingStrategy"], () => require("./traceJaegerRemoteSamplingStrategy"));

export { TraceMetricsRuleArgs, TraceMetricsRuleState } from "./traceMetricsRule";
export type TraceMetricsRule = import("./traceMetricsRule").TraceMetricsRule;
export const TraceMetricsRule: typeof import("./traceMetricsRule").TraceMetricsRule = null as any;
utilities.lazyLoad(exports, ["TraceMetricsRule"], () => require("./traceMetricsRule"));

export { TraceTailSamplingRulesArgs, TraceTailSamplingRulesState } from "./traceTailSamplingRules";
export type TraceTailSamplingRules = import("./traceTailSamplingRules").TraceTailSamplingRules;
export const TraceTailSamplingRules: typeof import("./traceTailSamplingRules").TraceTailSamplingRules = null as any;
utilities.lazyLoad(exports, ["TraceTailSamplingRules"], () => require("./traceTailSamplingRules"));

export { VictoropsAlertNotifierArgs, VictoropsAlertNotifierState } from "./victoropsAlertNotifier";
export type VictoropsAlertNotifier = import("./victoropsAlertNotifier").VictoropsAlertNotifier;
export const VictoropsAlertNotifier: typeof import("./victoropsAlertNotifier").VictoropsAlertNotifier = null as any;
utilities.lazyLoad(exports, ["VictoropsAlertNotifier"], () => require("./victoropsAlertNotifier"));

export { WebhookAlertNotifierArgs, WebhookAlertNotifierState } from "./webhookAlertNotifier";
export type WebhookAlertNotifier = import("./webhookAlertNotifier").WebhookAlertNotifier;
export const WebhookAlertNotifier: typeof import("./webhookAlertNotifier").WebhookAlertNotifier = null as any;
utilities.lazyLoad(exports, ["WebhookAlertNotifier"], () => require("./webhookAlertNotifier"));


// Export sub-modules:
import * as config from "./config";
import * as types from "./types";

export {
    config,
    types,
};

const _module = {
    version: utilities.getVersion(),
    construct: (name: string, type: string, urn: string): pulumi.Resource => {
        switch (type) {
            case "chronosphere:index/blackholeAlertNotifier:BlackholeAlertNotifier":
                return new BlackholeAlertNotifier(name, <any>undefined, { urn })
            case "chronosphere:index/bucket:Bucket":
                return new Bucket(name, <any>undefined, { urn })
            case "chronosphere:index/classicDashboard:ClassicDashboard":
                return new ClassicDashboard(name, <any>undefined, { urn })
            case "chronosphere:index/collection:Collection":
                return new Collection(name, <any>undefined, { urn })
            case "chronosphere:index/dashboard:Dashboard":
                return new Dashboard(name, <any>undefined, { urn })
            case "chronosphere:index/dataset:Dataset":
                return new Dataset(name, <any>undefined, { urn })
            case "chronosphere:index/derivedLabel:DerivedLabel":
                return new DerivedLabel(name, <any>undefined, { urn })
            case "chronosphere:index/derivedMetric:DerivedMetric":
                return new DerivedMetric(name, <any>undefined, { urn })
            case "chronosphere:index/dropRule:DropRule":
                return new DropRule(name, <any>undefined, { urn })
            case "chronosphere:index/emailAlertNotifier:EmailAlertNotifier":
                return new EmailAlertNotifier(name, <any>undefined, { urn })
            case "chronosphere:index/gcpMetricsIntegration:GcpMetricsIntegration":
                return new GcpMetricsIntegration(name, <any>undefined, { urn })
            case "chronosphere:index/logAllocationConfig:LogAllocationConfig":
                return new LogAllocationConfig(name, <any>undefined, { urn })
            case "chronosphere:index/logscaleAction:LogscaleAction":
                return new LogscaleAction(name, <any>undefined, { urn })
            case "chronosphere:index/logscaleAlert:LogscaleAlert":
                return new LogscaleAlert(name, <any>undefined, { urn })
            case "chronosphere:index/mappingRule:MappingRule":
                return new MappingRule(name, <any>undefined, { urn })
            case "chronosphere:index/monitor:Monitor":
                return new Monitor(name, <any>undefined, { urn })
            case "chronosphere:index/notificationPolicy:NotificationPolicy":
                return new NotificationPolicy(name, <any>undefined, { urn })
            case "chronosphere:index/opsgenieAlertNotifier:OpsgenieAlertNotifier":
                return new OpsgenieAlertNotifier(name, <any>undefined, { urn })
            case "chronosphere:index/otelMetricsIngestion:OtelMetricsIngestion":
                return new OtelMetricsIngestion(name, <any>undefined, { urn })
            case "chronosphere:index/pagerdutyAlertNotifier:PagerdutyAlertNotifier":
                return new PagerdutyAlertNotifier(name, <any>undefined, { urn })
            case "chronosphere:index/recordingRule:RecordingRule":
                return new RecordingRule(name, <any>undefined, { urn })
            case "chronosphere:index/resourcePoolsConfig:ResourcePoolsConfig":
                return new ResourcePoolsConfig(name, <any>undefined, { urn })
            case "chronosphere:index/rollupRule:RollupRule":
                return new RollupRule(name, <any>undefined, { urn })
            case "chronosphere:index/sLO:SLO":
                return new SLO(name, <any>undefined, { urn })
            case "chronosphere:index/serviceAccount:ServiceAccount":
                return new ServiceAccount(name, <any>undefined, { urn })
            case "chronosphere:index/slackAlertNotifier:SlackAlertNotifier":
                return new SlackAlertNotifier(name, <any>undefined, { urn })
            case "chronosphere:index/team:Team":
                return new Team(name, <any>undefined, { urn })
            case "chronosphere:index/traceJaegerRemoteSamplingStrategy:TraceJaegerRemoteSamplingStrategy":
                return new TraceJaegerRemoteSamplingStrategy(name, <any>undefined, { urn })
            case "chronosphere:index/traceMetricsRule:TraceMetricsRule":
                return new TraceMetricsRule(name, <any>undefined, { urn })
            case "chronosphere:index/traceTailSamplingRules:TraceTailSamplingRules":
                return new TraceTailSamplingRules(name, <any>undefined, { urn })
            case "chronosphere:index/victoropsAlertNotifier:VictoropsAlertNotifier":
                return new VictoropsAlertNotifier(name, <any>undefined, { urn })
            case "chronosphere:index/webhookAlertNotifier:WebhookAlertNotifier":
                return new WebhookAlertNotifier(name, <any>undefined, { urn })
            default:
                throw new Error(`unknown resource type ${type}`);
        }
    },
};
pulumi.runtime.registerResourceModule("chronosphere", "index/blackholeAlertNotifier", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/bucket", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/classicDashboard", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/collection", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/dashboard", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/dataset", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/derivedLabel", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/derivedMetric", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/dropRule", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/emailAlertNotifier", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/gcpMetricsIntegration", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/logAllocationConfig", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/logscaleAction", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/logscaleAlert", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/mappingRule", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/monitor", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/notificationPolicy", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/opsgenieAlertNotifier", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/otelMetricsIngestion", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/pagerdutyAlertNotifier", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/recordingRule", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/resourcePoolsConfig", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/rollupRule", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/sLO", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/serviceAccount", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/slackAlertNotifier", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/team", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/traceJaegerRemoteSamplingStrategy", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/traceMetricsRule", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/traceTailSamplingRules", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/victoropsAlertNotifier", _module)
pulumi.runtime.registerResourceModule("chronosphere", "index/webhookAlertNotifier", _module)
pulumi.runtime.registerResourcePackage("chronosphere", {
    version: utilities.getVersion(),
    constructProvider: (name: string, type: string, urn: string): pulumi.ProviderResource => {
        if (type !== "pulumi:providers:chronosphere") {
            throw new Error(`unknown provider type ${type}`);
        }
        return new Provider(name, <any>undefined, { urn });
    },
});
