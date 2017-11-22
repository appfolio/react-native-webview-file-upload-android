package com.oblongmana.webviewfileuploadandroid;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AndroidWebViewPackage implements ReactPackage {
    private AndroidWebViewManager manager;
    private AndroidWebViewModule module;

    @Override public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        manager = new AndroidWebViewManager();
        manager.setPackage(this);
        return Arrays.<ViewManager>asList(manager);
    }

    @Override public List<NativeModule> createNativeModules( ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();
        module = new AndroidWebViewModule(reactContext);
        module.setPackage(this);
        modules.add(module);
        return modules;
    }

    public AndroidWebViewManager getManager(){
        return manager;
    }

    public AndroidWebViewModule getModule(){
        return module;
    }
}
