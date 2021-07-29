package com.dicoding.made_1.core.data.source.local.room

import androidx.room.*
import com.dicoding.made_1.core.data.source.local.entity.SportEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface SportDao {

    @Query("SELECT * FROM sportTable")
    fun getAllSport(): Flow<List<SportEntity>>

    @Query("SELECT * FROM sportTable where isFavorite = 1")
    fun getFavoriteSport(): Flow<List<SportEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSport(sport: List<SportEntity>)

    @Update
    fun updateFavoriteSport(sport: SportEntity)
}