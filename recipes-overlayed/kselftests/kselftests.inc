SUMMARY = "Linux Kernel Selftests"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

SRC_URI = "https://www.kernel.org/pub/linux/kernel/v4.x/linux-${PV}.tar.xz;name=linux"
LKFT_VARIANT = "mainline"

S = "${WORKDIR}/linux-${PV}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit kernel-arch

DEPENDS = "fuse libcap libcap-ng pkgconfig-native popt rsync-native util-linux \
    ${@bb.utils.contains("TARGET_ARCH", "arm", "", "numactl", d)} \
"

RDEPENDS_${PN} = "bash bc ethtool fuse-utils iproute2 ncurses sudo"


EXTRA_OEMAKE += "V=1 -C ${S}/tools/testing/selftests INSTALL_PATH=${D}/opt/kselftests/${LKFT_VARIANT} CC="${CC}" LD="${LD}""

do_compile () {
	# Make sure to install the user space API used by some tests
	# but not properly declared as a build dependency
	${MAKE} -C ${S} headers_install
	oe_runmake
}

do_install () {
	# Ignore install errors to workaround breakpoints build errors and
	# continue to install step_after_suspend_test
	oe_runmake --ignore-errors install
	chown -R root:root ${D}
	# fixup run_kselftest.sh due to spurious lines starting by "make[1]:"
	sed -i '/^make/d' ${D}/opt/kselftests/${LKFT_VARIANT}/run_kselftest.sh
}

FILES_${PN} = "/opt/kselftests/${LKFT_VARIANT}"

INSANE_SKIP_${PN} = "already-stripped arch"
