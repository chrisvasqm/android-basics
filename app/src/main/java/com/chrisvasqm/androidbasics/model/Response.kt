package com.chrisvasqm.androidbasics.model

import com.google.gson.annotations.SerializedName

class Response(@SerializedName("results") val articles: List<Article>)