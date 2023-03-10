
lsusb
Device 003: ID 0a12:0001 Cambridge Silicon Radio, Ltd Bluetooth Dongle (HCI mode)
sudo rfkill list

 hci0: Bluetooth
	Soft blocked: no
	Hard blocked: no

sudo hciconfig hci0 up

usb-devices
dmesg | grep -i blue
