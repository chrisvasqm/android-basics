package com.chrisvasqm.androidbasics.model

import com.google.gson.annotations.SerializedName

class Article(
        @SerializedName("webTitle") val title: String,
        @SerializedName("sectionName") val section: String,
        @SerializedName("webPublicationDate") val date: String,
        @SerializedName("webUrl") val url: String
)