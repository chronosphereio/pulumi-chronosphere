// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";

export interface DatasetConfiguration {
    traceDataset?: outputs.DatasetConfigurationTraceDataset;
    type: string;
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
    matchType?: string;
    operation?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanOperation;
    parentOperation?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentOperation;
    parentService?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanParentService;
    service?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanService;
    spanCount?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanSpanCount;
    tag?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTag[];
    /**
     * @deprecated `tags` is deprecated, use `tag` instead.
     */
    tags?: outputs.DatasetConfigurationTraceDatasetMatchCriteriaSpanTag[];
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaSpanDuration {
    /**
     * @deprecated use max_secs instead
     */
    maxSeconds?: number;
    maxSecs?: number;
    /**
     * @deprecated use min_secs instead
     */
    minSeconds?: number;
    minSecs?: number;
}

export interface DatasetConfigurationTraceDatasetMatchCriteriaSpanError {
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
    /**
     * @deprecated use max_secs instead
     */
    maxSeconds?: number;
    maxSecs?: number;
    /**
     * @deprecated use min_secs instead
     */
    minSeconds?: number;
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

export interface MappingRuleStoragePolicy {
    resolution: string;
    retention: string;
}

export interface MonitorQuery {
    graphiteExpr?: string;
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
    allocation: outputs.ResourcePoolsConfigDefaultPoolAllocation;
    priorities?: outputs.ResourcePoolsConfigDefaultPoolPriorities;
}

export interface ResourcePoolsConfigDefaultPoolAllocation {
    percentOfLicense: number;
}

export interface ResourcePoolsConfigDefaultPoolPriorities {
    highPriorityMatchRules?: string[];
    lowPriorityMatchRules?: string[];
}

export interface ResourcePoolsConfigPool {
    allocation: outputs.ResourcePoolsConfigPoolAllocation;
    /**
     * @deprecated use match_rules
     */
    matchRule?: string;
    matchRules?: string[];
    name: string;
    priorities?: outputs.ResourcePoolsConfigPoolPriorities;
}

export interface ResourcePoolsConfigPoolAllocation {
    percentOfLicense: number;
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
    matchType?: string;
    operation?: outputs.TraceMetricsRuleTraceFilterSpanOperation;
    parentOperation?: outputs.TraceMetricsRuleTraceFilterSpanParentOperation;
    parentService?: outputs.TraceMetricsRuleTraceFilterSpanParentService;
    service?: outputs.TraceMetricsRuleTraceFilterSpanService;
    spanCount?: outputs.TraceMetricsRuleTraceFilterSpanSpanCount;
    tag?: outputs.TraceMetricsRuleTraceFilterSpanTag[];
    /**
     * @deprecated `tags` is deprecated, use `tag` instead.
     */
    tags?: outputs.TraceMetricsRuleTraceFilterSpanTag[];
}

export interface TraceMetricsRuleTraceFilterSpanDuration {
    /**
     * @deprecated use max_secs instead
     */
    maxSeconds?: number;
    maxSecs?: number;
    /**
     * @deprecated use min_secs instead
     */
    minSeconds?: number;
    minSecs?: number;
}

export interface TraceMetricsRuleTraceFilterSpanError {
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
    /**
     * @deprecated use max_secs instead
     */
    maxSeconds?: number;
    maxSecs?: number;
    /**
     * @deprecated use min_secs instead
     */
    minSeconds?: number;
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
    matchType?: string;
    operation?: outputs.TraceTailSamplingRulesRuleFilterSpanOperation;
    parentOperation?: outputs.TraceTailSamplingRulesRuleFilterSpanParentOperation;
    parentService?: outputs.TraceTailSamplingRulesRuleFilterSpanParentService;
    service?: outputs.TraceTailSamplingRulesRuleFilterSpanService;
    spanCount?: outputs.TraceTailSamplingRulesRuleFilterSpanSpanCount;
    tag?: outputs.TraceTailSamplingRulesRuleFilterSpanTag[];
    /**
     * @deprecated `tags` is deprecated, use `tag` instead.
     */
    tags?: outputs.TraceTailSamplingRulesRuleFilterSpanTag[];
}

export interface TraceTailSamplingRulesRuleFilterSpanDuration {
    /**
     * @deprecated use max_secs instead
     */
    maxSeconds?: number;
    maxSecs?: number;
    /**
     * @deprecated use min_secs instead
     */
    minSeconds?: number;
    minSecs?: number;
}

export interface TraceTailSamplingRulesRuleFilterSpanError {
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
    /**
     * @deprecated use max_secs instead
     */
    maxSeconds?: number;
    maxSecs?: number;
    /**
     * @deprecated use min_secs instead
     */
    minSeconds?: number;
    minSecs?: number;
}

export interface TraceTailSamplingRulesRuleFilterTraceError {
    value: boolean;
}

