
# react-native-app-install

## Getting started

`$ npm install react-native-app-install --save`

### Mostly automatic installation

`$ react-native link react-native-app-install`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNAppInstallPackage;` to the imports at the top of the file
  - Add `new RNAppInstallPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-app-install'
  	project(':react-native-app-install').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-app-install/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-app-install')
  	```


## Usage
```javascript
import RNAppInstall from 'react-native-app-install';

RNAppInstall.getApplicationList().then((list) => {
	list.map((item) => {
		// TODO with item
	})
});
```
  