require kselftests.inc

# This is Shuah Khan's next branch
SRC_URI = "git://git.kernel.org/pub/scm/linux/kernel/git/shuah/linux-kselftest.git;protocol=https;branch=next;name=linux"
SRCREV = "7d005195e9eb6518017e02c1468e3de693cc7442"
LKFT_VARIANT = "next"

S = "${WORKDIR}/git"
PV = "4.13-rc1+git${SRCPV}"
