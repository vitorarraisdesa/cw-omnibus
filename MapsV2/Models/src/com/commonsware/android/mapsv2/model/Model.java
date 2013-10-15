/***
  Copyright (c) 2013 CommonsWare, LLC
  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
  by applicable law or agreed to in writing, software distributed under the
  License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
  OF ANY KIND, either express or implied. See the License for the specific
  language governing permissions and limitations under the License.
  
  From _The Busy Coder's Guide to Android Development_
    http://commonsware.com/Android
 */

package com.commonsware.android.mapsv2.model;

import android.content.Context;

public class Model {
  String title;
  String snippet;
  double lat;
  double lon;

  Model(Context ctxt, double lat, double lon, int title,
        int snippet) {
    this.title=ctxt.getString(title);
    this.snippet=ctxt.getString(snippet);
    this.lat=lat;
    this.lon=lon;
  }

  String getTitle() {
    return(title);
  }

  String getSnippet() {
    return(snippet);
  }

  double getLatitude() {
    return(lat);
  }

  double getLongitude() {
    return(lon);
  }
}
