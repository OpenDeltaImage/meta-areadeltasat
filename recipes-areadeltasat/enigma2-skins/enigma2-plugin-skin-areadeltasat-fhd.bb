DESCRIPTION = "Skin AREADELTSAT FHD"
MAINTAINER = "areadelta"
LICENSE = "CLOSED"
require conf/license/areadeltasat-gplv2.inc

inherit gitpkgv allarch

PV = "0.1+git${SRCPV}"
PKGV = "0.1+git${GITPKGV}"

SRC_URI="git://github.com/OpenDeltaImage/skin-areadeltasat-fhd.git;protocol=git"

FILES_${PN} = "${datadir}/enigma2/"

S = "${WORKDIR}/git"

do_compile[noexec] = "1"

do_install() {
	install -d ${D}${datadir}/enigma2/AREADELTASAT-FHD
	cp -r ${S}${datadir}/enigma2/AREADELTASAT-FHD/* ${D}${datadir}/enigma2/AREADELTASAT-FHD
	chmod -R a+rX ${D}${datadir}/enigma2/
}
