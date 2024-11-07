# Releases

## Unreleased

## v0.9.4

Added:
* Adds support for `labels` in `chronosphere_dashboard`
* Allow `chronosphere_notification_policy` resources without a `team_id`.

Fixed:
* Support dry-run validation of monitor prometheus queries that contain
  dynamic expressions that aren't known at plan time.

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
