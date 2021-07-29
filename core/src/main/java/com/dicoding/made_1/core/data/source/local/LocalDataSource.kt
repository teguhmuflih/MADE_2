package com.dicoding.made_1.core.data.source.local

import com.dicoding.made_1.core.data.source.local.entity.SportEntity
import com.dicoding.made_1.core.data.source.local.room.SportDao
import kotlinx.coroutines.flow.Flow

class LocalDataSource(private val sportDao: SportDao) {

    fun getAllSport(): Flow<List<SportEntity>> = sportDao.getAllSport()

    fun getFavoriteSport(): Flow<List<SportEntity>> = sportDao.getFavoriteSport()

    suspend fun insertSport(sportList: List<SportEntity>) = sportDao.insertSport(sportList)

    fun setFavoriteSport(sport: SportEntity, newState: Boolean) {
        sport.isFavorite = newState
        sportDao.updateFavoriteSport(sport)
    }
}