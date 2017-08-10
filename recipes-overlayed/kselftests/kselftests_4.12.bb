require kselftests.inc

SRC_URI[linux.md5sum] = "fc454157e2d024d401a60905d6481c6b"
SRC_URI[linux.sha256sum] = "a45c3becd4d08ce411c14628a949d08e2433d8cdeca92036c7013980e93858ab"

# Patches from upstream linux-kselftest repository, queued in next branch
# https://git.kernel.org/pub/scm/linux/kernel/git/shuah/linux-kselftest.git/log/?h=next
SRC_URI += "\
    file://0001-selftests-futex-print-testcase-name-and-PASS-FAIL-ER.patch \
    file://0002-selftests-vm-Fix-test-for-virtual-address-range-mapp.patch \
    file://0003-selftests-sync-Skip-the-test-if-kernel-support-is-no.patch \
    file://0004-selftests-Make-test_harness.h-more-generally-availab.patch \
    file://0005-selftests-Cosmetic-renames-in-kselftest_harness.h.patch \
    file://0006-Documentation-dev-tools-Add-kselftest.patch \
    file://0007-Documentation-dev-tools-Use-reStructuredText-markups.patch \
    file://0008-selftests-Remove-the-TEST_API-wrapper-from-kselftest.patch \
    file://0009-Documentation-dev-tools-Add-kselftest_harness-docume.patch \
    file://0010-selftests-seccomp-Force-rebuild-according-to-depende.patch \
    file://0011-selftests-ftrace-Skip-full-glob-matching-filter-test.patch \
    file://0012-selftests-ftrace-Reduce-trace-buffer-checking-overhe.patch \
    file://0013-ftrace-kprobes-selftests-Check-kretprobe-maxactive-i.patch \
    file://0014-selftests-ftrace-Reset-ftrace-filter-on-older-kernel.patch \
    file://0015-selftests-ftrace-Add-instance-indication-in-test-log.patch \
    file://0016-selftests-ftrace-Use-top-level-available_filter_func.patch \
    file://0017-selftests-ftrace-Return-unsupported-if-it-detects-ol.patch \
    file://0018-ksefltest-MAINTAINERS-git-tree-entry-is-incorrect.patch \
    file://0019-kselftest-MAINTAINERS-git-tree-entry-update-files-an.patch \
    file://0020-selftests-kselftest_harness-Fix-compile-warning.patch \
    file://0021-kselftest-add-TAP13-conformant-versions-of-ksft_-fun.patch \
    file://0022-kselftest-membarrier-convert-to-TAP13-output.patch \
    file://0023-kselftest-breakpoints-convert-breakpoint_test-to-TAP.patch \
    file://0024-kselftest-breakpoints-convert-step_after_suspend_tes.patch \
    file://0025-kselftest-convert-get_size-to-use-stricter-TAP13-for.patch \
    file://0026-kselftest-make-ksft_exit_skip-output-a-reason-for-sk.patch \
    file://0027-kselftest-make-callers-of-ksft_exit_skip-output-the-.patch \
    file://0028-kselftest-membarrier-make-test-names-more-informativ.patch \
    file://0029-selftests-lib-Skip-tests-on-missing-test-modules.patch \
    file://0030-selftest-memfd-Makefile-Fix-build-error.patch \
    file://0031-selftest-intel_pstate-aperf-Use-LDLIBS-instead-of-LD.patch \
    file://0032-selftest-net-Makefile-Specify-output-with-OUTPUT.patch \
    file://0033-kselftest.rst-do-some-adjustments-after-ReST-convers.patch \
    file://0034-tools-testing-selftests-sysctl-Add-pre-check-to-the-.patch \
    file://0035-selftests-ftrace-Use-md5sum-to-take-less-time-of-che.patch \
    file://0036-selftests-typo-correction-for-memory-hotplug-test.patch \
    file://0037-selftests-check-hot-pluggagble-memory-for-memory-hot.patch \
    file://0038-selftests-check-percentage-range-for-memory-hotplug-.patch \
    file://0039-selftests-add-missing-test-name-in-memory-hotplug-te.patch \
    file://0040-selftests-fix-memory-hotplug-test.patch \
    file://0041-selftests-intel_pstate-add-.gitignore.patch \
    file://0042-selftests-capabilities-Fix-the-test_execve-test.patch \
"

# Patches inappropriate or not yet merged by upstream
# Some patches mayb have been submitted to upstream
SRC_URI += "\
    file://0001-selftests-lib-allow-to-override-CC-in-the-top-level-Makefile.patch \
    file://0001-selftests-breakpoints-re-order-TEST_GEN_PROGS-target.patch \
    file://0001-selftests-gpio-fix-build-error.patch \
    file://0001-selftests-gpio-use-pkg-config-to-determine-libmount-.patch \
    file://0001-selftests-net-use-LDLIBS-instead-of-LDFLAGS.patch \
    file://0002-selftests-seccomp-use-LDLIBS-instead-of-LDFLAGS.patch \
    file://0003-selftests-timers-use-LDLIBS-instead-of-LDFLAGS.patch \
    file://0001-selftests-splice-fix-installation-for-splice-test.patch \
"
