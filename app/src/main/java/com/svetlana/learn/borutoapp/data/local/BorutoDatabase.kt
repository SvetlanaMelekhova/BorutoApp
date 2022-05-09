package com.svetlana.learn.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.svetlana.learn.borutoapp.data.local.dao.HeroDao
import com.svetlana.learn.borutoapp.data.local.dao.HeroRemoteKeysDao
import com.svetlana.learn.borutoapp.domain.model.Hero
import com.svetlana.learn.borutoapp.domain.model.HeroRemoteKeys

@Database(entities = [Hero::class, HeroRemoteKeys::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeysDao(): HeroRemoteKeysDao
}