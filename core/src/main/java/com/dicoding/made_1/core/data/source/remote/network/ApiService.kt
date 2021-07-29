package com.dicoding.made_1.core.data.source.remote.network

import com.dicoding.made_1.core.data.source.remote.response.ListSportResponse
import retrofit2.http.GET

interface ApiService {
    @GET("search_all_teams.php?l=English%20Premier%20League")
    suspend fun getList(): ListSportResponse
}