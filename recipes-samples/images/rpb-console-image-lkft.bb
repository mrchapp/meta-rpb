require rpb-console-image.bb

SUMMARY = "Basic console image for LKFT"

IMAGE_ROOTFS_EXTRA_SPACE = "262144"

CORE_IMAGE_BASE_INSTALL += " \
    packagegroup-rpb-tests \
    packagegroup-rpb-lkft \
    "
