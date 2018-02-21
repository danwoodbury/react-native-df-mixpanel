
# react-native-df-mixpanel

## Getting started

`$ npm install react-native-df-mixpanel --save`

### Mostly automatic installation

`$ react-native link react-native-df-mixpanel`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-df-mixpanel` and add `DFMixpanel.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libDFMixpanel.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.devfather.DFMixpanelPackage;` to the imports at the top of the file
  - Add `new DFMixpanelPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-df-mixpanel'
  	project(':react-native-df-mixpanel').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-df-mixpanel/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-df-mixpanel')
  	```


## Usage
```javascript
import DFMixpanel from 'react-native-df-mixpanel';

// TODO: What to do with the module?
DFMixpanel;
```
  