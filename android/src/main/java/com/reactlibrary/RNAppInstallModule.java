
package com.reactlibrary;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;

import java.util.List;

public class RNAppInstallModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  @ReactMethod
  public void getApplicationList(final Promise promise){
    final PackageManager pm = reactContext.getPackageManager();

    List<ApplicationInfo> packages =  pm.getInstalledApplications(0);
    WritableArray list = new WritableNativeArray();

    for (ApplicationInfo packageInfo : packages) {
      WritableMap object = new WritableNativeMap();
      final String label = (String) pm.getApplicationLabel(packageInfo);

      object.putString("label", label);
      object.putString("packageName", packageInfo.packageName);

      list.pushMap(object);
    }

    promise.resolve(list);

  }

  public RNAppInstallModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNAppInstall";
  }
}