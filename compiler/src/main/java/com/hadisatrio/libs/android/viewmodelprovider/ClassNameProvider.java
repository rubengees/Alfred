/*
 *    Copyright (C) 2018 Hadi Satrio
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.hadisatrio.libs.android.viewmodelprovider;

public class ClassNameProvider {

    private static final String VIEW_MODEL_CLASS_NAME = "android.arch.lifecycle.ViewModel";
    private static final String VIEW_MODEL_FACTORY_CLASS_NAME = "android.arch.lifecycle.ViewModelProvider.Factory";
    private static final String VIEW_MODEL_PROVIDERS_CLASS_NAME = "android.arch.lifecycle.ViewModelProviders";
    private static final String FRAGMENT_ACTIVITY_CLASS_NAME = "android.support.v4.app.FragmentActivity";
    private static final String FRAGMENT_CLASS_NAME = "android.support.v4.app.Fragment";

    private static final String ANDROID_X_VIEW_MODEL_CLASS_NAME = "androidx.lifecycle.ViewModel";
    private static final String ANDROID_X_VIEW_MODEL_FACTORY_CLASS_NAME = "androidx.lifecycle.ViewModelProvider.Factory";
    private static final String ANDROID_X_VIEW_MODEL_PROVIDERS_CLASS_NAME = "androidx.lifecycle.ViewModelProviders";
    private static final String ANDROID_X_FRAGMENT_ACTIVITY_CLASS_NAME = "androidx.fragment.app.FragmentActivity";
    private static final String ANDROID_X_FRAGMENT_CLASS_NAME = "androidx.fragment.app.Fragment";

    public static String vieModel() {
        try {
            Class.forName(ANDROID_X_VIEW_MODEL_CLASS_NAME);

            return ANDROID_X_VIEW_MODEL_CLASS_NAME;
        } catch (ClassNotFoundException e) {
            return VIEW_MODEL_CLASS_NAME;
        }
    }

    public static String vieModelFactory() {
        try {
            Class.forName(ANDROID_X_VIEW_MODEL_FACTORY_CLASS_NAME);

            return ANDROID_X_VIEW_MODEL_FACTORY_CLASS_NAME;
        } catch (ClassNotFoundException e) {
            return VIEW_MODEL_FACTORY_CLASS_NAME;
        }
    }

    public static String vieModelProviders() {
        try {
            Class.forName(ANDROID_X_VIEW_MODEL_PROVIDERS_CLASS_NAME);

            return ANDROID_X_VIEW_MODEL_PROVIDERS_CLASS_NAME;
        } catch (ClassNotFoundException e) {
            return VIEW_MODEL_PROVIDERS_CLASS_NAME;
        }
    }

    public static String fragmentActivity() {
        try {
            Class.forName(ANDROID_X_FRAGMENT_ACTIVITY_CLASS_NAME);

            return ANDROID_X_FRAGMENT_ACTIVITY_CLASS_NAME;
        } catch (ClassNotFoundException e) {
            return FRAGMENT_ACTIVITY_CLASS_NAME;
        }
    }

    public static String fragment() {
        try {
            Class.forName(ANDROID_X_FRAGMENT_CLASS_NAME);

            return ANDROID_X_FRAGMENT_CLASS_NAME;
        } catch (ClassNotFoundException e) {
            return FRAGMENT_CLASS_NAME;
        }
    }
}
