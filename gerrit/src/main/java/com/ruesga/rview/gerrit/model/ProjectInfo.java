/*
 * Copyright (C) 2016 Jorge Ruesga
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
package com.ruesga.rview.gerrit.model;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

/**
 * @link "https://gerrit-review.googlesource.com/Documentation/rest-api-projects.html#project-info"
 */
public class ProjectInfo {
    @SerializedName("id") public String id;
    @SerializedName("name") public String name;
    @SerializedName("parent") public String parent;
    @SerializedName("description") public String description;
    @SerializedName("state") public ProjectStatus state;
    @SerializedName("branches") public Map<String, String> branches;
    @SerializedName("labels") public Map<String, LabelTypeInfo> labels;
    @SerializedName("web_links") public WebLinkInfo[] webLinks;
}

