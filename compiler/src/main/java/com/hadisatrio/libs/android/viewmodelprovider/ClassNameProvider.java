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

import com.squareup.javapoet.ClassName;

class ClassNameProvider {

    private static final String ANDROID_X_VIEW_MODEL_CLASS_NAME = "androidx.lifecycle.ViewModel";
    private static final String ANDROID_X_VIEW_MODEL_FACTORY_CLASS_NAME = "androidx.lifecycle.ViewModelProvider.Factory";
    private static final String ANDROID_X_VIEW_MODEL_PROVIDERS_CLASS_NAME = "androidx.lifecycle.ViewModelProviders";
    private static final String ANDROID_X_FRAGMENT_ACTIVITY_CLASS_NAME = "androidx.fragment.app.FragmentActivity";
    private static final String ANDROID_X_FRAGMENT_CLASS_NAME = "androidx.fragment.app.Fragment";
    private static final String ANDROID_X_NON_NULL_CLASS_NAME = "androidx.annotation.NonNull";
    private static final String ANDROID_X_NULLABLE_CLASS_NAME = "androidx.annotation.Nullable";

    private static final ClassName VIEW_MODEL_PROVIDER_FACTORY_CLASS_NAME = ClassName.get(
            "android.arch.lifecycle",
            "ViewModelProvider",
            "Factory"
    );

    private static final ClassName VIEW_MODEL_CLASS_NAME = ClassName.get(
            "android.arch.lifecycle",
            "ViewModel"
    );

    private static final ClassName VIEW_MODEL_PROVIDERS_CLASS_NAME = ClassName.get(
            "android.arch.lifecycle",
            "ViewModelProviders"
    );

    private static final ClassName FRAGMENT_ACTIVITY_CLASS_NAME = ClassName.get(
            "android.support.v4.app",
            "FragmentActivity"
    );

    private static final ClassName FRAGMENT_CLASS_NAME = ClassName.get(
            "android.support.v4.app",
            "Fragment"
    );

    private static final ClassName NON_NULL_CLASS_NAME = ClassName.get(
            "android.support.annotation",
            "NonNull"
    );

    private static final ClassName NULLABLE_CLASS_NAME = ClassName.get(
            "android.support.annotation",
            "Nullable"
    );

    static ClassName vieModel() {
        try {
            Class clazz = Class.forName(ANDROID_X_VIEW_MODEL_CLASS_NAME);

            return ClassName.get(clazz);
        } catch (ClassNotFoundException e) {
            return VIEW_MODEL_CLASS_NAME;
        }
    }

    static ClassName vieModelFactory() {
        try {
            Class clazz = Class.forName(ANDROID_X_VIEW_MODEL_FACTORY_CLASS_NAME);

            return ClassName.get(clazz);
        } catch (ClassNotFoundException e) {
            return VIEW_MODEL_PROVIDER_FACTORY_CLASS_NAME;
        }
    }

    static ClassName vieModelProviders() {
        try {
            Class clazz = Class.forName(ANDROID_X_VIEW_MODEL_PROVIDERS_CLASS_NAME);

            return ClassName.get(clazz);
        } catch (ClassNotFoundException e) {
            return VIEW_MODEL_PROVIDERS_CLASS_NAME;
        }
    }

    static ClassName fragmentActivity() {
        try {
            Class clazz = Class.forName(ANDROID_X_FRAGMENT_ACTIVITY_CLASS_NAME);

            return ClassName.get(clazz);
        } catch (ClassNotFoundException e) {
            return FRAGMENT_ACTIVITY_CLASS_NAME;
        }
    }

    static ClassName fragment() {
        try {
            Class clazz = Class.forName(ANDROID_X_FRAGMENT_CLASS_NAME);

            return ClassName.get(clazz);
        } catch (ClassNotFoundException e) {
            return FRAGMENT_CLASS_NAME;
        }
    }

    static ClassName nonNull() {
        try {
            Class clazz = Class.forName(ANDROID_X_NON_NULL_CLASS_NAME);

            return ClassName.get(clazz);
        } catch (ClassNotFoundException e) {
            return NON_NULL_CLASS_NAME;
        }
    }

    static ClassName nullable() {
        try {
            Class clazz = Class.forName(ANDROID_X_NULLABLE_CLASS_NAME);

            return ClassName.get(clazz);
        } catch (ClassNotFoundException e) {
            return NULLABLE_CLASS_NAME;
        }
    }
}
