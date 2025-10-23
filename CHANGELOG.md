# Releases

## Unreleased

v0.9.10

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
