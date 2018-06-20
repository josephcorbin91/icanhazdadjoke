/*
 *  Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      https://mindorks.com/license/apache-v2
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License
 */

package com.mindorks.framework.mvvm.data.model.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by amitshekhar on 07/07/17.
 */

public class JokeResponse {


    @Expose
    @SerializedName("results")
    private List<JokeResponse.Joke> data;


    public List<Joke> getData() {
        return data;
    }

    public static class Joke {

        @Expose
        @SerializedName("joke")
        private String joke;


        @Expose
        @SerializedName("id")
        private String id;

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Joke)) {
                return false;
            }

            Joke that = (Joke) o;


            if (!id.equals(that.id)) {
                return false;
            }
            return true;

        }

        @Override
        public int hashCode() {
            int result = this.id.hashCode();
            return result;
        }

        public String getJoke() {
            return joke;
        }
    }

}
