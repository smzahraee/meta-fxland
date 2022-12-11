
FILESEXTRAPATHS:prepend := "${THISDIR}/linux-raspberrypi:"

SRC_URI:append:raspberrypi0-2w-64= " \
		file://fragment.cfg \
		file://fragment2.cfg \
		file://fragment3.cfg \
	    "
