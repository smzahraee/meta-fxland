DESCRIPTION = "RaspberryPi Test Packagegroup"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup


INIT_MANAGER = "systemd"

COMPATIBLE_MACHINE = "^rpi$"

OMXPLAYER  = "${@bb.utils.contains('MACHINE_FEATURES', 'vc4graphics', '', 'omxplayer', d)}"

RDEPENDS:${PN} = "\
	${OMXPLAYER} \
	bcm2835-tests \
	raspi-gpio \
	rpio \
	rpi-gpio \
	pi-blaster \
	python3-adafruit-circuitpython-register \
	python3-adafruit-platformdetect \
	python3-adafruit-pureio \
	python3-rtimu \
	connman \
	connman-client \
	wireless-regdb-static \
	bluez5 \
	openssh \
	openssl libcrypto libssl openssl-dev \
	libusb1 \
	wpa-supplicant linux-firmware-bcm43430 \
	bluez5 udev-rules-rpi \
	module-init-tools \
	networkmanager-nmcli \
	go-helloworld \
"

RRECOMMENDS:${PN} = "\
    ${MACHINE_EXTRA_RRECOMMENDS} \
"
