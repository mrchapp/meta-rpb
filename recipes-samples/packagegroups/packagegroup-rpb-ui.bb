SUMMARY = "Organize UI test packages"

inherit packagegroup

RDEPENDS_packagegroup-rpb-ui = "\
    chromium-wayland \
    chromium-wayland-chromedriver \
    opencv \
    python-pip \
    "
