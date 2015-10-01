# Common settings for seco boards

include conf/machine/include/imx-base.inc
include conf/machine/include/tune-cortexa9.inc

PREFERRED_PROVIDER_virtual/kernel ?= "linux-seco"
PREFERRED_VERSION_linux-seco ?= "3.14.28"
KERNEL_IMAGETYPE = "zImage"

PREFERRED_PROVIDER_u-boot ?= "u-boot-seco"
PREFERRED_VERSION_u-boot = "2014.04"

SERIAL_CONSOLE = "115200 ttymxc1"

MACHINE_FEATURES += " "
