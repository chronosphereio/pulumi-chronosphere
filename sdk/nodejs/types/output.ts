// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface DatasetConfiguration {
    logDataset?: outputs.DatasetConfigurationLogDataset;
    traceDataset?: outputs.DatasetConfigurationTraceDataset;
    type: string;
}

export interface DatasetConfigurationLogDataset {
    matchCriteria?: outputs.DatasetConfigurationLogDatasetMatchCriteria;
}

export interface DatasetConfigurationLogDatasetMatchCriteria {
    query: string;
}

export interface DatasetConfigurationTraceDataset {
    matchCriteria: outputs.DatasetConfigurationTraceDatasetMatchCriteria;
}

export interface DatasetConfigurationTraceDatasetMatchCriteria {
    spans?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpan[];
    trace?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaTrace;
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaSpan {
    duration?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanDuration;
    error?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanError;
    isRootSpan?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpan;
    matchType?: string;
    operation?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanOperation;
    parentOperation?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperation;
    parentService?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentService;
    service?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanService;
    spanCount?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCount;
    tags?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTag[];
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaSpanDuration {
    maxSecs?: number;
    minSecs?: number;
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaSpanError {
    value: boolean;
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaSpanIsRootSpan {
    value: boolean;
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaSpanOperation {
    inValues?: string[];
    match?: string;
    value?: string;
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperation {
    inValues?: string[];
    match?: string;
    value?: string;
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaSpanParentService {
    inValues?: string[];
    match?: string;
    value?: string;
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaSpanService {
    inValues?: string[];
    match?: string;
    value?: string;
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCount {
    max?: number;
    min?: number;
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaSpanTag {
    key?: string;
    numericValue?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTagNumericValue;
    value?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTagValue;
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaSpanTagNumericValue {
    comparison: string;
    value: number;
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaSpanTagValue {
    inValues?: string[];
    match?: string;
    value?: string;
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaTrace {
    duration?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaTraceDuration;
    error?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaTraceError;
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaTraceDuration {
    maxSecs?: number;
    minSecs?: number;
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaTraceError {
    value: boolean;
}

export interface DerivedLabelMetricLabel {
    constructedLabel?: outputs.DerivedLabelMetricLabelConstructedLabel;
    mappingLabel?: outputs.DerivedLabelMetricLabelMappingLabel;
}

export interface DerivedLabelMetricLabelConstructedLabel {
    valueDefinitions: outputs.DerivedLabelMetricLabelConstructedLabelValueDefinition[];
}

export interface DerivedLabelMetricLabelConstructedLabelValueDefinition {
    filters: outputs.DerivedLabelMetricLabelConstructedLabelValueDefinitionFilter[];
    value: string;
}

export interface DerivedLabelMetricLabelConstructedLabelValueDefinitionFilter {
    name: string;
    valueGlob: string;
}

export interface DerivedLabelMetricLabelMappingLabel {
    nameMappings?: outputs.DerivedLabelMetricLabelMappingLabelNameMapping[];
    valueMappings?: outputs.DerivedLabelMetricLabelMappingLabelValueMapping[];
}

export interface DerivedLabelMetricLabelMappingLabelNameMapping {
    filters: outputs.DerivedLabelMetricLabelMappingLabelNameMappingFilter[];
    sourceLabel: string;
    valueMappings?: outputs.DerivedLabelMetricLabelMappingLabelNameMappingValueMapping[];
}

export interface DerivedLabelMetricLabelMappingLabelNameMappingFilter {
    name: string;
    valueGlob: string;
}

export interface DerivedLabelMetricLabelMappingLabelNameMappingValueMapping {
    sourceValueGlobs: string[];
    targetValue: string;
}

export interface DerivedLabelMetricLabelMappingLabelValueMapping {
    sourceValueGlobs: string[];
    targetValue: string;
}

export interface DerivedMetricQuery {
    query: outputs.DerivedMetricQueryQuery;
    selector?: outputs.DerivedMetricQuerySelector;
}

export interface DerivedMetricQueryQuery {
    expr: string;
    variables?: outputs.DerivedMetricQueryQueryVariable[];
}

export interface DerivedMetricQueryQueryVariable {
    defaultSelector: string;
    name: string;
}

export interface DerivedMetricQuerySelector {
    labels?: {[key: string]: string};
}

export interface DropRuleValueBasedDrop {
    targetDropValue: number;
}

export interface GcpMetricsIntegrationMetricGroup {
    prefixes?: string[];
    projectId: string;
}

export interface GcpMetricsIntegrationServiceAccount {
    clientEmail: string;
}

export interface LogAllocationConfigDatasetAllocation {
    allocation: outputs.LogAllocationConfigDatasetAllocationAllocation;
    datasetId: string;
    priorities?: outputs.LogAllocationConfigDatasetAllocationPriorities;
}

export interface LogAllocationConfigDatasetAllocationAllocation {
    percentOfLicense: number;
}

export interface LogAllocationConfigDatasetAllocationPriorities {
    highPriorityFilters?: outputs.LogAllocationConfigDatasetAllocationPrioritiesHighPriorityFilter[];
    lowPriorityFilters?: outputs.LogAllocationConfigDatasetAllocationPrioritiesLowPriorityFilter[];
}

export interface LogAllocationConfigDatasetAllocationPrioritiesHighPriorityFilter {
    query: string;
}

export interface LogAllocationConfigDatasetAllocationPrioritiesLowPriorityFilter {
    query: string;
}

export interface LogAllocationConfigDefaultDataset {
    allocation: outputs.LogAllocationConfigDefaultDatasetAllocation;
    priorities?: outputs.LogAllocationConfigDefaultDatasetPriorities;
}

export interface LogAllocationConfigDefaultDatasetAllocation {
    percentOfLicense: number;
}

export interface LogAllocationConfigDefaultDatasetPriorities {
    highPriorityFilters?: outputs.LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter[];
    lowPriorityFilters?: outputs.LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilter[];
}

export interface LogAllocationConfigDefaultDatasetPrioritiesHighPriorityFilter {
    query: string;
}

export interface LogAllocationConfigDefaultDatasetPrioritiesLowPriorityFilter {
    query: string;
}

export interface LogscaleActionEmailAction {
    attachCsv?: boolean;
    bodyTemplate?: string;
    recipients: string[];
    subjectTemplate?: string;
    useProxy?: boolean;
}

export interface LogscaleActionHumioAction {
    ingestToken: string;
}

export interface LogscaleActionOpsGenieAction {
    apiUrl: string;
    opsGenieKey: string;
    useProxy?: boolean;
}

export interface LogscaleActionPagerDutyAction {
    routingKey: string;
    severity: string;
    useProxy?: boolean;
}

export interface LogscaleActionSlackAction {
    fields?: {[key: string]: string};
    url: string;
    useProxy?: boolean;
}

export interface LogscaleActionSlackPostMessageAction {
    apiToken: string;
    channels: string[];
    fields?: {[key: string]: string};
    useProxy?: boolean;
}

export interface LogscaleActionUploadFileAction {
    fileName: string;
}

export interface LogscaleActionVictorOpsAction {
    messageType: string;
    notifyUrl: string;
    useProxy?: boolean;
}

export interface LogscaleActionWebhookAction {
    bodyTemplate?: string;
    headers?: {[key: string]: string};
    ignoreSsl?: boolean;
    method: string;
    url: string;
    useProxy?: boolean;
}

export interface MappingRuleStoragePolicy {
    resolution: string;
    retention: string;
}

export interface MonitorQuery {
    graphiteExpr?: string;
    loggingExpr?: string;
    prometheusExpr?: string;
}

export interface MonitorSchedule {
    ranges?: outputs.MonitorScheduleRange[];
    timezone: string;
}

export interface MonitorScheduleRange {
    day: string;
    end: string;
    start: string;
}

export interface MonitorSeriesConditions {
    conditions: outputs.MonitorSeriesConditionsCondition[];
    overrides?: outputs.MonitorSeriesConditionsOverride[];
}

export interface MonitorSeriesConditionsCondition {
    op: string;
    resolveSustain?: string;
    severity: string;
    sustain?: string;
    value?: number;
}

export interface MonitorSeriesConditionsOverride {
    conditions: outputs.MonitorSeriesConditionsOverrideCondition[];
    labelMatchers: outputs.MonitorSeriesConditionsOverrideLabelMatcher[];
}

export interface MonitorSeriesConditionsOverrideCondition {
    op: string;
    resolveSustain?: string;
    severity: string;
    sustain?: string;
    value?: number;
}

export interface MonitorSeriesConditionsOverrideLabelMatcher {
    name: string;
    type: string;
    value: string;
}

export interface MonitorSignalGrouping {
    labelNames?: string[];
    signalPerSeries?: boolean;
}

export interface NotificationPolicyOverride {
    alertLabelMatchers: outputs.NotificationPolicyOverrideAlertLabelMatcher[];
    routes?: outputs.NotificationPolicyOverrideRoute[];
}

export interface NotificationPolicyOverrideAlertLabelMatcher {
    name: string;
    type: string;
    value: string;
}

export interface NotificationPolicyOverrideRoute {
    groupBy?: outputs.NotificationPolicyOverrideRouteGroupBy;
    notifiers?: string[];
    repeatInterval?: string;
    severity: string;
}

export interface NotificationPolicyOverrideRouteGroupBy {
    labelNames?: string[];
}

export interface NotificationPolicyRoute {
    groupBy?: outputs.NotificationPolicyRouteGroupBy;
    notifiers?: string[];
    repeatInterval?: string;
    severity: string;
}

export interface NotificationPolicyRouteGroupBy {
    labelNames?: string[];
}

export interface OpsgenieAlertNotifierResponder {
    id?: string;
    name?: string;
    type: string;
    username?: string;
}

export interface OtelMetricsIngestionResourceAttributes {
    excludeKeys?: string[];
    filterMode?: string;
    flattenMode?: string;
    generateTargetInfo?: boolean;
}

export interface PagerdutyAlertNotifierImage {
    alt?: string;
    href?: string;
    src: string;
}

export interface PagerdutyAlertNotifierLink {
    href: string;
    text?: string;
}

export interface ResourcePoolsConfigDefaultPool {
    allocation?: outputs.ResourcePoolsConfigDefaultPoolAllocation;
    priorities?: outputs.ResourcePoolsConfigDefaultPoolPriorities;
    priorityThresholds?: outputs.ResourcePoolsConfigDefaultPoolPriorityThreshold[];
}

export interface ResourcePoolsConfigDefaultPoolAllocation {
    fixedValues?: outputs.ResourcePoolsConfigDefaultPoolAllocationFixedValue[];
    percentOfLicense?: number;
    priorityThresholds?: outputs.ResourcePoolsConfigDefaultPoolAllocationPriorityThreshold[];
}

export interface ResourcePoolsConfigDefaultPoolAllocationFixedValue {
    license: string;
    value: number;
}

export interface ResourcePoolsConfigDefaultPoolAllocationPriorityThreshold {
    allPriorities?: outputs.ResourcePoolsConfigDefaultPoolAllocationPriorityThresholdAllPriorities;
    defaultAndLowPriority?: outputs.ResourcePoolsConfigDefaultPoolAllocationPriorityThresholdDefaultAndLowPriority;
    license: string;
    lowPriority?: outputs.ResourcePoolsConfigDefaultPoolAllocationPriorityThresholdLowPriority;
}

export interface ResourcePoolsConfigDefaultPoolAllocationPriorityThresholdAllPriorities {
    fixedValue?: number;
    percentOfPoolAllocation?: number;
}

export interface ResourcePoolsConfigDefaultPoolAllocationPriorityThresholdDefaultAndLowPriority {
    fixedValue?: number;
    percentOfPoolAllocation?: number;
}

export interface ResourcePoolsConfigDefaultPoolAllocationPriorityThresholdLowPriority {
    fixedValue?: number;
    percentOfPoolAllocation?: number;
}

export interface ResourcePoolsConfigDefaultPoolPriorities {
    highPriorityMatchRules?: string[];
    lowPriorityMatchRules?: string[];
}

export interface ResourcePoolsConfigDefaultPoolPriorityThreshold {
    allPriorities?: outputs.ResourcePoolsConfigDefaultPoolPriorityThresholdAllPriorities;
    defaultAndLowPriority?: outputs.ResourcePoolsConfigDefaultPoolPriorityThresholdDefaultAndLowPriority;
    license: string;
    lowPriority?: outputs.ResourcePoolsConfigDefaultPoolPriorityThresholdLowPriority;
}

export interface ResourcePoolsConfigDefaultPoolPriorityThresholdAllPriorities {
    fixedValue?: number;
    percentOfPoolAllocation?: number;
}

export interface ResourcePoolsConfigDefaultPoolPriorityThresholdDefaultAndLowPriority {
    fixedValue?: number;
    percentOfPoolAllocation?: number;
}

export interface ResourcePoolsConfigDefaultPoolPriorityThresholdLowPriority {
    fixedValue?: number;
    percentOfPoolAllocation?: number;
}

export interface ResourcePoolsConfigPool {
    allocation?: outputs.ResourcePoolsConfigPoolAllocation;
    /**
     * @deprecated use match_rules
     */
    matchRule?: string;
    matchRules?: string[];
    name: string;
    priorities?: outputs.ResourcePoolsConfigPoolPriorities;
}

export interface ResourcePoolsConfigPoolAllocation {
    fixedValues?: outputs.ResourcePoolsConfigPoolAllocationFixedValue[];
    percentOfLicense?: number;
    priorityThresholds?: outputs.ResourcePoolsConfigPoolAllocationPriorityThreshold[];
}

export interface ResourcePoolsConfigPoolAllocationFixedValue {
    license: string;
    value: number;
}

export interface ResourcePoolsConfigPoolAllocationPriorityThreshold {
    allPriorities?: outputs.ResourcePoolsConfigPoolAllocationPriorityThresholdAllPriorities;
    defaultAndLowPriority?: outputs.ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriority;
    license: string;
    lowPriority?: outputs.ResourcePoolsConfigPoolAllocationPriorityThresholdLowPriority;
}

export interface ResourcePoolsConfigPoolAllocationPriorityThresholdAllPriorities {
    fixedValue?: number;
    percentOfPoolAllocation?: number;
}

export interface ResourcePoolsConfigPoolAllocationPriorityThresholdDefaultAndLowPriority {
    fixedValue?: number;
    percentOfPoolAllocation?: number;
}

export interface ResourcePoolsConfigPoolAllocationPriorityThresholdLowPriority {
    fixedValue?: number;
    percentOfPoolAllocation?: number;
}

export interface ResourcePoolsConfigPoolPriorities {
    highPriorityMatchRules?: string[];
    lowPriorityMatchRules?: string[];
}

export interface RollupRuleGraphiteLabelPolicy {
    replaces?: outputs.RollupRuleGraphiteLabelPolicyReplace[];
}

export interface RollupRuleGraphiteLabelPolicyReplace {
    name: string;
    newValue: string;
}

export interface RollupRuleStoragePolicies {
    resolution: string;
    retention: string;
}

export interface SLODefinition {
    burnRateAlertingConfigs: outputs.SLODefinitionBurnRateAlertingConfig[];
    objective: number;
    reportingWindows: outputs.SLODefinitionReportingWindow[];
}

export interface SLODefinitionBurnRateAlertingConfig {
    budget: number;
    labels?: {[key: string]: string};
    severity: string;
    window: string;
}

export interface SLODefinitionReportingWindow {
    duration: string;
}

export interface SLOSignalGrouping {
    labelNames?: string[];
    signalPerSeries?: boolean;
}

export interface SLOSli {
    additionalPromqlFilters?: outputs.SLOSliAdditionalPromqlFilter[];
    customDimensionLabels?: string[];
    customIndicator?: outputs.SLOSliCustomIndicator;
    endpointAvailability?: outputs.SLOSliEndpointAvailability;
    endpointLabel?: string;
    endpointLatency?: outputs.SLOSliEndpointLatency;
    lensTemplateIndicator?: string;
}

export interface SLOSliAdditionalPromqlFilter {
    name: string;
    type: string;
    value: string;
}

export interface SLOSliCustomIndicator {
    badQueryTemplate?: string;
    goodQueryTemplate?: string;
    totalQueryTemplate: string;
}

export interface SLOSliEndpointAvailability {
    additionalPromqlFilters?: outputs.SLOSliEndpointAvailabilityAdditionalPromqlFilter[];
    endpointsMonitoreds: string[];
    errorCodes?: string[];
    successCodes?: string[];
}

export interface SLOSliEndpointAvailabilityAdditionalPromqlFilter {
    name: string;
    type: string;
    value: string;
}

export interface SLOSliEndpointLatency {
    additionalPromqlFilters?: outputs.SLOSliEndpointLatencyAdditionalPromqlFilter[];
    endpointsMonitoreds: string[];
    latencyBucket: string;
}

export interface SLOSliEndpointLatencyAdditionalPromqlFilter {
    name: string;
    type: string;
    value: string;
}

export interface ServiceAccountRestriction {
    labels?: {[key: string]: string};
    permission: string;
}

export interface SlackAlertNotifierAction {
    actionConfirmDismissText?: string;
    actionConfirmOkText?: string;
    actionConfirmText?: string;
    actionConfirmTile?: string;
    name?: string;
    style?: string;
    text?: string;
    type?: string;
    url?: string;
    value?: string;
}

export interface SlackAlertNotifierField {
    short?: boolean;
    title?: string;
    value?: string;
}

export interface TraceJaegerRemoteSamplingStrategyAppliedStrategy {
    perOperationStrategies?: outputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategies;
    probabilisticStrategy?: outputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyProbabilisticStrategy;
    rateLimitingStrategy?: outputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyRateLimitingStrategy;
}

export interface TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategies {
    defaultLowerBoundTracesPerSecond?: number;
    defaultSamplingRate: number;
    defaultUpperBoundTracesPerSecond?: number;
    perOperationStrategies?: outputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategy[];
}

export interface TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategy {
    operation: string;
    probabilisticStrategy: outputs.TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategy;
}

export interface TraceJaegerRemoteSamplingStrategyAppliedStrategyPerOperationStrategiesPerOperationStrategyProbabilisticStrategy {
    samplingRate: number;
}

export interface TraceJaegerRemoteSamplingStrategyAppliedStrategyProbabilisticStrategy {
    samplingRate: number;
}

export interface TraceJaegerRemoteSamplingStrategyAppliedStrategyRateLimitingStrategy {
    maxTracesPerSecond: number;
}

export interface TraceMetricsRuleGroupBy {
    key: outputs.TraceMetricsRuleGroupByKey;
    label: string;
}

export interface TraceMetricsRuleGroupByKey {
    namedKey?: string;
    type: string;
}

export interface TraceMetricsRuleTraceFilter {
    spans?: outputs.TraceMetricsRuleTraceFilterSpan[];
    trace?: outputs.TraceMetricsRuleTraceFilterTrace;
}

export interface TraceMetricsRuleTraceFilterSpan {
    duration?: outputs.TraceMetricsRuleTraceFilterSpanDuration;
    error?: outputs.TraceMetricsRuleTraceFilterSpanError;
    isRootSpan?: outputs.TraceMetricsRuleTraceFilterSpanIsRootSpan;
    matchType?: string;
    operation?: outputs.TraceMetricsRuleTraceFilterSpanOperation;
    parentOperation?: outputs.TraceMetricsRuleTraceFilterSpanParentOperation;
    parentService?: outputs.TraceMetricsRuleTraceFilterSpanParentService;
    service?: outputs.TraceMetricsRuleTraceFilterSpanService;
    spanCount?: outputs.TraceMetricsRuleTraceFilterSpanSpanCount;
    tags?: outputs.TraceMetricsRuleTraceFilterSpanTag[];
}

export interface TraceMetricsRuleTraceFilterSpanDuration {
    maxSecs?: number;
    minSecs?: number;
}

export interface TraceMetricsRuleTraceFilterSpanError {
    value: boolean;
}

export interface TraceMetricsRuleTraceFilterSpanIsRootSpan {
    value: boolean;
}

export interface TraceMetricsRuleTraceFilterSpanOperation {
    inValues?: string[];
    match?: string;
    value?: string;
}

export interface TraceMetricsRuleTraceFilterSpanParentOperation {
    inValues?: string[];
    match?: string;
    value?: string;
}

export interface TraceMetricsRuleTraceFilterSpanParentService {
    inValues?: string[];
    match?: string;
    value?: string;
}

export interface TraceMetricsRuleTraceFilterSpanService {
    inValues?: string[];
    match?: string;
    value?: string;
}

export interface TraceMetricsRuleTraceFilterSpanSpanCount {
    max?: number;
    min?: number;
}

export interface TraceMetricsRuleTraceFilterSpanTag {
    key?: string;
    numericValue?: outputs.TraceMetricsRuleTraceFilterSpanTagNumericValue;
    value?: outputs.TraceMetricsRuleTraceFilterSpanTagValue;
}

export interface TraceMetricsRuleTraceFilterSpanTagNumericValue {
    comparison: string;
    value: number;
}

export interface TraceMetricsRuleTraceFilterSpanTagValue {
    inValues?: string[];
    match?: string;
    value?: string;
}

export interface TraceMetricsRuleTraceFilterTrace {
    duration?: outputs.TraceMetricsRuleTraceFilterTraceDuration;
    error?: outputs.TraceMetricsRuleTraceFilterTraceError;
}

export interface TraceMetricsRuleTraceFilterTraceDuration {
    maxSecs?: number;
    minSecs?: number;
}

export interface TraceMetricsRuleTraceFilterTraceError {
    value: boolean;
}

export interface TraceTailSamplingRulesDefaultSampleRate {
    enabled?: boolean;
    sampleRate: number;
}

export interface TraceTailSamplingRulesRule {
    filter: outputs.TraceTailSamplingRulesRuleFilter;
    name?: string;
    sampleRate: number;
    systemName?: string;
}

export interface TraceTailSamplingRulesRuleFilter {
    spans?: outputs.TraceTailSamplingRulesRuleFilterSpan[];
    trace?: outputs.TraceTailSamplingRulesRuleFilterTrace;
}

export interface TraceTailSamplingRulesRuleFilterSpan {
    duration?: outputs.TraceTailSamplingRulesRuleFilterSpanDuration;
    error?: outputs.TraceTailSamplingRulesRuleFilterSpanError;
    isRootSpan?: outputs.TraceTailSamplingRulesRuleFilterSpanIsRootSpan;
    matchType?: string;
    operation?: outputs.TraceTailSamplingRulesRuleFilterSpanOperation;
    parentOperation?: outputs.TraceTailSamplingRulesRuleFilterSpanParentOperation;
    parentService?: outputs.TraceTailSamplingRulesRuleFilterSpanParentService;
    service?: outputs.TraceTailSamplingRulesRuleFilterSpanService;
    spanCount?: outputs.TraceTailSamplingRulesRuleFilterSpanSpanCount;
    tags?: outputs.TraceTailSamplingRulesRuleFilterSpanTag[];
}

export interface TraceTailSamplingRulesRuleFilterSpanDuration {
    maxSecs?: number;
    minSecs?: number;
}

export interface TraceTailSamplingRulesRuleFilterSpanError {
    value: boolean;
}

export interface TraceTailSamplingRulesRuleFilterSpanIsRootSpan {
    value: boolean;
}

export interface TraceTailSamplingRulesRuleFilterSpanOperation {
    inValues?: string[];
    match?: string;
    value?: string;
}

export interface TraceTailSamplingRulesRuleFilterSpanParentOperation {
    inValues?: string[];
    match?: string;
    value?: string;
}

export interface TraceTailSamplingRulesRuleFilterSpanParentService {
    inValues?: string[];
    match?: string;
    value?: string;
}

export interface TraceTailSamplingRulesRuleFilterSpanService {
    inValues?: string[];
    match?: string;
    value?: string;
}

export interface TraceTailSamplingRulesRuleFilterSpanSpanCount {
    max?: number;
    min?: number;
}

export interface TraceTailSamplingRulesRuleFilterSpanTag {
    key?: string;
    numericValue?: outputs.TraceTailSamplingRulesRuleFilterSpanTagNumericValue;
    value?: outputs.TraceTailSamplingRulesRuleFilterSpanTagValue;
}

export interface TraceTailSamplingRulesRuleFilterSpanTagNumericValue {
    comparison: string;
    value: number;
}

export interface TraceTailSamplingRulesRuleFilterSpanTagValue {
    inValues?: string[];
    match?: string;
    value?: string;
}

export interface TraceTailSamplingRulesRuleFilterTrace {
    duration?: outputs.TraceTailSamplingRulesRuleFilterTraceDuration;
    error?: outputs.TraceTailSamplingRulesRuleFilterTraceError;
}

export interface TraceTailSamplingRulesRuleFilterTraceDuration {
    maxSecs?: number;
    minSecs?: number;
}

export interface TraceTailSamplingRulesRuleFilterTraceError {
    value: boolean;
}

