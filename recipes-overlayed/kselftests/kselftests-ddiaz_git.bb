require kselftests.inc

# This is Shuah's next branch on top of Linus' master plus a
# few other nice-to-have patches
SRC_URI = "git://github.com/mrchapp/linux.git;protocol=https;branch=kselftest-next;name=linux"
SRCREV = "39af1e460218d50ac7be8048a794e95b5b9d4d5c"
LKFT_VARIANT = "ddiaz"

S = "${WORKDIR}/git"
PV = "4.13-rc4+git${SRCPV}"
