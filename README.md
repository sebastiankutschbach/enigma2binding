enigma2binding for openHAB
==============

Example items:
==============
Number actualVolume {enigma2=">[main:volume]"}

String actualChannel {enigma2=">[main:channel]"}

Dimmer setVolume { enigma2="<[main:volume]" }

Dimmer setChannel {enigma2="<[main:channel]"}

Switch sendPause {enigma2="<[main:pause]"}

Switch sendMute {enigma2="<[main:mute]"}

Example openhab.cfg:
==============
enigma2:main:hostname=192.168.178.25

enigma2:main:username=user

enigma2:main:password=password

enigma2:refresh=10000

Example sitemap:
==============

sitemap demo label="Main Menu"

{

	Frame label=Test {

		Slider item=test
		
		Text item=actualVolume
		
		Text item=actualChannel
		
		Slider item=setChannel
		
		Switch item=sendPause
		
		Switch item=sendMute
	}
}

