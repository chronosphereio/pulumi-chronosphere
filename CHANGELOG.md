# Releases

## Unreleased

v0.9.15
Removed:
* Remove `trace_filter` field from `chronosphere_consumption_config` partition filter conditions.

Changed:
* Changed the singular `routing_key` field in the VictorOps destination in `v1/config/NotificationPolicy` to be plural `routing_keys`

Bug fixes:
* Fix `chronosphere_pagerduty_external_connection` to support PagerDuty REST API keys via a new `pagerduty_rest_api_key` field, mutually exclusive with the existing `pagerduty_api_key` and `pagerduty_events_version` fields.

v0.9.14
Added:
* Add `chronosphere_slack_external_connection`, `chronosphere_pagerduty_external_connection`, `chronosphere_webhook_external_connection`, `chronosphere_victorops_external_connection`, and `chronosphere_opsgenie_external_connection` resources. Manages external connections for notification targets including Slack, PagerDuty, Webhook, VictorOps, and OpsGenie.
* Update `chronosphere_notification_policy` to allow configuration of notification routing to an external connection.

v0.9.13
Added:
* Add `resolve_value` field to `chronosphere_monitor` conditions. Allows configuring a different threshold for resolving an alert.

v0.9.12
Added:
* Add `execution_mode` field to `v1/config/RecordingRule`.
* Pass the value of the `CHRONOSPHERE_ACTOR` environment variable in header `Chronosphere-Actor` header on API requests. The value is recorded as change metadata in Version History.
* Add support for resource `v1/config/LogRetentionConfig`.
* Add `SIGNAL_NOT_EXISTS` condition op to `v1/config/Monitor`. Signal no longer exists. Behavior varies by alert type: single monitor alerts trigger if all series are missing; signal-based alerts trigger if all series in the signal go missing; alert-on-every-series alerts trigger if any individual series disappears.

v0.9.11

Added:
* Add `ROLLING_1_DAY_VOLUME` and `ROLLING_7_DAY_VOLUME` thresholds to `chronosphere_consumption_budget` resource.
* Add `service` to `chronosphere_log_ingest_config` resource.
* Add `chronosphere_service_attributes` resource for setting up service attributes.
* Add `skip_on_conflict` field to `chronosphere_rollup_rule` resource.
* Add `ROLLING_1_HOUR_VOLUME` and `ROLLING_3_HOUR_VOLUME `thresholds to `chronosphere_consumption_budget` resource.

v0.9.10

Added:
* Add `azure_metrics_integration` resource for configuring the cloudscraper Azure metrics integration.
* Add `mode` field to the `chronosphere_drop_rule` resource. This field replaces the `active` field, which is deprecated. The mode field accepts values of `enabled`, `disabled`, and `preview`. Defaults to `enabled`. The `active` field was `disabled` by default.  **This is a breaking change**.
* Add `chronosphere_consumption_budget` and `chronosphere_consumption_config` resources.
* Add `chronosphere_log_control_config` resource.
* Add `field_normalization` to `chronosphere_log_ingest_config` resource.

Deprecated:
* Deprecate the `active` field in the `chronosphere_drop_rule` resource in favor of the `mode` field. This field can't be set to `false`, and is a breaking change that requires switching to the `mode` field.

v0.9.9
Added:

* Add timeslice indicator support to chronosphere_slo resource with custom_timeslice_indicator field.
* Add enable burn rate alerting field to the unstable chronosphere_slo resource.
* Add time window to the unstable chronosphere_slo resource.
* Moved chronosphere_slo resource from stable to v1 API.
* Add log_allocation_config from model conversion
* Add chronosphere_log_ingest_config resource.

Removed:

* Remove query less SLO fields from unstable chronosphere_slo resource.
* Remove reporting_windows from unstable chronosphere_slo resource.

## v0.9.8

Removed:
* Remove deprecated low value field from unstable `chronosphere_slo` resource.
* Deprecated queryless additional_promql_filters in unstable `chronosphere_slo` resource.

Added:
* Add burn rate configs to the unstable `chronosphere_slo` resource.
* Add SLI level additional_promql_filters to the unstable `chronosphere_slo` resource.

## v0.9.7

Added:
* Add `priority_thresholds` to `chronosphere_resource_pools_config` pools.

## v0.9.6

Added:
- Adds support for logging query in the `chronosphere_monitor` resource.
- Adds support for custom dimension labels in the `chronosphere_slo` resource.
- Add v1 `chronosphere_logging_allocation_config` resource
- Add support for `is_root_span` field in common trace span filter type.
- Allow disabling dry-run via provider configuration `disable_dryrun`.

Fixed:
- Fix dry-run for `chronosphere_recording_rule` with `bucket_slug` and `execution_group`.
- Fixed a bug where Set types in terraform plugin SDK could have extra, empty values.

## v0.9.4

Added:
- Adds support for `labels` in `chronosphere_dashboard`
- Allow `chronosphere_notification_policy` resources without a `team_id`.
- Add unstable `chronosphere_slo` resource.

Fixed:
- Support dry-run validation of monitor prometheus queries that contain
  dynamic expressions that aren't known at plan time.
- Fix `chronosphere_resource_pools_config` error when default pool is not set.

## v0.9.3

- Allow creating `chronosphere_slack_notifier` with actions without `action_confirm_text`.
- Fix `chronosphere_rollup_rule` and `chronosphere_mapping_rule` diff after applying a rule without an interval or storage policy.

## v0.9.2

### Features
- Added new resources:
  - `LogAllocationConfig`
  - `LogscaleAction`
    `LogscaleAlert`

### Fixes

- Fixed python package name

## v0.9.1

- Add minimum required docs to publish to Pulumi Registry.

## v0.9.0

- Initial release of the Chronosphere Pulumi provider.
- Update documentation links to point to new Chronosphere Pulumi provider page.
