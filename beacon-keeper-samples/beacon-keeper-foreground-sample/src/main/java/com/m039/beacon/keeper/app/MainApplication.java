/** MainApplication.java ---
 * 
 * Copyright (C) 2014 Dmitry Mozgin
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

package com.m039.beacon.keeper.app;

import android.app.Application;

import com.m039.beacon.keeper.service.BeaconService;

/**
 *
 *
 * Created:
 *
 * @author
 * @version
 * @since
 */
public class MainApplication extends Application {

    @Override
    public void onCreate () {
        super.onCreate ();

        BeaconService.onApplicationCreate(this);
    }
    
} // MainApplication
