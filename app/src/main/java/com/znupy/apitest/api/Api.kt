package com.znupy.apitest.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Api {
    private val api: ApiInterface

    private object HOLDER {
        val INSTANCE = Api()
    }

    companion object {
        val api: ApiInterface by lazy { HOLDER.INSTANCE.api }
    }

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.example.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(ApiInterface::class.java)
    }
}