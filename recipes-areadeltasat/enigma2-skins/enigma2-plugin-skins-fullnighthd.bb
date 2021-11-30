DESCRIPTION = "PLi-FullNightHD"
MAINTAINER = "areadelta"
LICENSE = "CLOSED"

inherit gitpkgv allarch

PV = "0.1+git${SRCPV}"
PKGV = "0.1+git${GITPKGV}"

SRC_URI = "git://github.com/AREADELTASAT/skins-PLi-FullNightHD.git"

FILES_${PN} = "${datadir}/enigma2/"

S = "${WORKDIR}/git"

do_compile[noexec] = "1"

do_install() {
	install -d ${D}${datadir}/enigma2/PLi-FullNightHD
	cp -r ${S}${datadir}/enigma2/PLi-FullNightHD/* ${D}${datadir}/enigma2/PLi-FullNightHD
	chmod -R a+rX ${D}${datadir}/enigma2/
}
