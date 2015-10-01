require recipes-bsp/u-boot/u-boot.inc

PV = "2014.04"

#FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# Copyright (C) 2015 RSR.srl for SECO

DESCRIPTION = "U-Boot provided by SECO for SBC-A62 boards."

PROVIDES += "u-boot"

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://Licenses/README;md5=025bf9f768cbcb1a165dbe1a110babfb"

SCMVERSION = "n"

#make sure to set "sslverify = false" in .gitconfig
SRC_URI = "git://secogit.seco.com/imx6_release/u-boot-2014-04-secoboards-imx6_rel.git;protocol=https"
SRCREV = "96e002d8c4b8e1c7be1684c4fe26e18cb7f9d7b6"

S = "${WORKDIR}/git"

inherit fsl-u-boot-localversion

LOCALVERSION ?= "-${SRCBRANCH}"

PACKAGE_ARCH = "${MACHINE_ARCH}"