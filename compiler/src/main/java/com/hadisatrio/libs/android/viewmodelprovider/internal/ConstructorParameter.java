/*
 *    Copyright (C) 2017 Hadi Satrio
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

package com.hadisatrio.libs.android.viewmodelprovider.internal;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.squareup.javapoet.ClassName;

import javax.lang.model.type.TypeMirror;

public class ConstructorParameter {

    private final ClassName nullabilityClass;
    private final TypeMirror type;
    private final String name;

    public ConstructorParameter(@Nullable ClassName nullabilityClass, @NonNull TypeMirror type, @NonNull String name) {
        this.nullabilityClass = nullabilityClass;
        this.type = type;
        this.name = name;
    }

    @Nullable
    public ClassName getNullabilityClass() {
        return nullabilityClass;
    }

    @NonNull public TypeMirror getType() {
        return type;
    }

    @NonNull public String getName() {
        return name;
    }
}
