/***
 Copyright (c) 2014-2016 CommonsWare, LLC
 Licensed under the Apache License, Version 2.0 (the "License"); you may not
 use this file except in compliance with the License. You may obtain a copy
 of the License at http://www.apache.org/licenses/LICENSE-2.0. Unless required
 by applicable law or agreed to in writing, software distributed under the
 License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS
 OF ANY KIND, either express or implied. See the License for the specific
 language governing permissions and limitations under the License.

 Covered in detail in the book _The Busy Coder's Guide to Android Development_
 https://commonsware.com/Android
 */

package com.commonsware.android.dragdrop;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class BugActivity extends AbstractDragDropDemoActivity
  implements View.OnDragListener {

  @Override
  public void onCreate(Bundle icicle) {
    super.onCreate(icicle);

    image=(ImageView)findViewById(R.id.thumbnail_large);
    image.setOnDragListener(this);
    findViewById(R.id.outer_container).setOnDragListener(this);
    findViewById(R.id.inner_container).setOnDragListener(this);
  }

  @Override
  int getDropFrameContentId() {
    return(R.layout.bug);
  }

  @Override
  int getOwnMenuId() {
    return(R.id.bug);
  }
}
