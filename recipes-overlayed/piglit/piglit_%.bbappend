SRC_URI += "file://0001-CMake-define-GBM_BO_MAP-only-when-symbol-is-found.patch \
            file://0002-util-egl-Honour-Surfaceless-MESA-in-get_default_disp.patch \
            file://0003-egl_mesa_platform_surfaceless-Don-t-use-eglGetPlatfo.patch \
            file://0004-egl_mesa_platform_surfaceless-Use-EXT-functions-for-.patch \
"
DEPENDS += "virtual/egl"
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
