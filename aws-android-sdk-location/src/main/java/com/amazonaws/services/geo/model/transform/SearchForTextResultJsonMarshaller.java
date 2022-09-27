/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.geo.model.transform;

import com.amazonaws.services.geo.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SearchForTextResult
 */
class SearchForTextResultJsonMarshaller {

    public void marshall(SearchForTextResult searchForTextResult, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (searchForTextResult.getDistance() != null) {
            Double distance = searchForTextResult.getDistance();
            jsonWriter.name("Distance");
            jsonWriter.value(distance);
        }
        if (searchForTextResult.getPlace() != null) {
            Place place = searchForTextResult.getPlace();
            jsonWriter.name("Place");
            PlaceJsonMarshaller.getInstance().marshall(place, jsonWriter);
        }
        if (searchForTextResult.getPlaceId() != null) {
            String placeId = searchForTextResult.getPlaceId();
            jsonWriter.name("PlaceId");
            jsonWriter.value(placeId);
        }
        if (searchForTextResult.getRelevance() != null) {
            Double relevance = searchForTextResult.getRelevance();
            jsonWriter.name("Relevance");
            jsonWriter.value(relevance);
        }
        jsonWriter.endObject();
    }

    private static SearchForTextResultJsonMarshaller instance;

    public static SearchForTextResultJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchForTextResultJsonMarshaller();
        return instance;
    }
}
