package com.svetlana.learn.borutoapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.svetlana.learn.borutoapp.data.local.dao.HeroDao
import com.svetlana.learn.borutoapp.data.local.dao.HeroRemoteKeyDao
import com.svetlana.learn.borutoapp.domain.model.Hero
import com.svetlana.learn.borutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class, HeroRemoteKey::class], version = 1)
abstract class BorutoDatabase : RoomDatabase() {

    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeyDao(): HeroRemoteKeyDao
}