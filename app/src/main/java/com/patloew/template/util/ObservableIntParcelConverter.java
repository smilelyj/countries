package com.patloew.template.util;

import android.databinding.ObservableInt;
import android.os.Parcel;

import org.parceler.ParcelConverter;

/* Copyright 2017 Tailored Media GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. */
public class ObservableIntParcelConverter implements ParcelConverter<ObservableInt> {

    @Override
    public void toParcel(ObservableInt input, Parcel parcel) {
        parcel.writeInt(input.get());
    }

    @Override
    public ObservableInt fromParcel(Parcel parcel) {
        return new ObservableInt(parcel.readInt());
    }
}