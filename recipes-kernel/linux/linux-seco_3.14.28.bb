# adapted from linux-imx.inc, copyright (C) 2012-2014 O.S. Systems Software LTDA
# Released under the MIT license (see COPYING.MIT for the terms)

include linux-seco.inc
require recipes-kernel/linux/linux-dtb.inc

DEPENDS += "lzop-native bc-native"

# 3.14.28 branch - based on 3.14.28_1.0.0_ga from Freescale git

SRCREV = "8eeafce66f3be89c6c310a6ee094b4356e219d5c"
LOCALVERSION = "_1.0.0_ga-seco"
