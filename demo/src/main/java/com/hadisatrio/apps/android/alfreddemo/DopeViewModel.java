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

package com.hadisatrio.apps.android.alfreddemo;

import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.hadisatrio.libs.android.viewmodelprovider.GeneratedProvider;

@GeneratedProvider
public final class DopeViewModel extends ViewModel {

    private final Context context;
    private final Long fucksGiven;

    public DopeViewModel(@NonNull Context context, @Nullable Long fucksGiven) {
        this.context = context;
        this.fucksGiven = fucksGiven;
    }
}
