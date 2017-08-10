require kselftests.inc

# This is Shuah Khan's next branch
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/shuah/linux-kselftest.git;protocol=https;branch=next;name=linux"
SRCREV = "7d005195e9eb6518017e02c1468e3de693cc7442"
LKFT_VARIANT = "next"

S = "${WORKDIR}/git"
PV = "4.13-rc1+git${SRCPV}"

# Patches inappropriate or not yet merged by upstream
# Some patches mayb have been submitted to upstream
SRC_URI += "\
    file://selftests-lib-allow-to-override-CC-in-the-top-level-.patch \
    file://selftests-breakpoints-re-order-TEST_GEN_PROGS-target.patch \
    file://selftests-gpio-fix-build-error.patch \
    file://selftests-gpio-use-pkg-config-to-determine-libmount-.patch \
    file://selftests-net-use-LDLIBS-instead-of-LDFLAGS.patch \
    file://selftests-seccomp-use-LDLIBS-instead-of-LDFLAGS.patch \
    file://selftests-timers-use-LDLIBS-instead-of-LDFLAGS.patch \
"
