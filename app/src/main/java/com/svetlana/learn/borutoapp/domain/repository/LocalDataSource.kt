package com.svetlana.learn.borutoapp.domain.repository

import com.svetlana.learn.borutoapp.domain.model.Hero

interface LocalDataSource {

    suspend fun getSelectedHero(heroId: Int): Hero
}