# device_safety_info (Null-Safety)

Flutter JailBreak, Rooted, Emulator/Simulator, External storage and Screen Lock detection.

## Getting Started

In your flutter project add the dependency:

```yml
dependencies:
  ...
  device_safety_info: ^0.0.1
```

## Usage

#### Importing package

```
import 'package:device_safety_info/device_safety_info.dart';
```

#### Using it

Checks whether device JailBroken or Rooted on iOS/Android?

```
bool isRootedDevice = await DeviceSafetyInfo.isRootedDevice;
```

Checks whether device is Real or Emulator/Simulator

```
bool isRealDevice = await DeviceSafetyInfo.isRealDevice;
```

Checks whether screen lock enabled or disabled

```
bool isScreenLock = await DeviceSafetyInfo.isScreenLock;
```

Checks whether application is running on external storage (Android Only)

```
bool isExternalStorage = await DeviceSafetyInfo.isExternalStorage;
```

Checks whether development Options is enable on device (Android Only)

```
bool isDeveloperMode = await DeviceSafetyInfo.isDeveloperMode;
```

Checks VPN status on device

```
final vpnCheck = VPNCheck();

vpnCheck.vpnState.listen((state) {
      if (state == VPNState.CONNECTED) {
        if (kDebugMode) {
          print("VPN connected.");
        }
      } else {
        if (kDebugMode) {
          print("VPN disconnected.");
        }
      }
});
    
```

Checks if new version available

```
appVersionStatus(){
    
final newVersion = NewVersionChecker(
      iOSId: '',
      androidId: '',
    );

    statusCheck(newVersion);
}

statusCheck(NewVersionChecker newVersion) async {
    try {
      final status = await newVersion.getVersionStatus();

      if (status != null) {
        debugPrint(status.appStoreLink);
        debugPrint(status.localVersion);
        debugPrint(status.storeVersion);
        debugPrint(status.canUpdate.toString());

        if (status.canUpdate) {
         // new version available
        }
      }
    } catch (e) {
      if (kDebugMode) {
        print(e.toString());
      }
    }
}
```