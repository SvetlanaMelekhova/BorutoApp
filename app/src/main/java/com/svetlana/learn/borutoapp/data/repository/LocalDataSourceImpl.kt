package com.svetlana.learn.borutoapp.data.repository

import com.svetlana.learn.borutoapp.data.local.BorutoDatabase
import com.svetlana.learn.borutoapp.domain.model.Hero
import com.svetlana.learn.borutoapp.domain.repository.LocalDataSource

class LocalDataSourceImpl(borutoDatabase: BorutoDatabase): LocalDataSource {

    private val heroDao = borutoDatabase.heroDao()

    override suspend fun getSelectedHero(heroId: Int): Hero {
        return heroDao.getSelectedHero(heroId = heroId)
    }
}