DESCRIPTION = "meta package for usbserial drivers"
RRECOMMENDS_${PN} = "kernel-module-usbserial kernel-module-ftdi-sio kernel-module-pl2303 kernel-module-belkin-sa kernel-module-keyspan"

require conf/license/areadeltasat-gplv2.inc

PV = "1.0"

ALLOW_EMPTY_${PN} = "1"
