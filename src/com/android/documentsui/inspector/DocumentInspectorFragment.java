/*
 * Copyright (C) 2017 The Android Open Source Project
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
 */
package com.android.documentsui.inspector;

import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.documentsui.R;

public class DocumentInspectorFragment extends Fragment {

  private static final String DOC_URI_ARG = "docUri";
  private Uri docUri;

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
      Bundle savedInstanceState) {

      Bundle args = getArguments();
      docUri = (Uri) args.get(DOC_URI_ARG);

      return inflater.inflate(R.layout.document_inspector_fragment, container, false);
  }

  public static DocumentInspectorFragment newInstance(Uri uri) {
    Bundle args = new Bundle();
    args.putParcelable(DOC_URI_ARG, uri);
    DocumentInspectorFragment fragment = new DocumentInspectorFragment();
    fragment.setArguments(args);
    return fragment;
  }
}
