package com.svetlana.learn.borutoapp.domain.use_cases.get_all_heroes

import androidx.paging.PagingData
import com.svetlana.learn.borutoapp.data.repository.Repository
import com.svetlana.learn.borutoapp.domain.model.Hero
import kotlinx.coroutines.flow.Flow

class GetAllHeroesUseCase(
    private val repository: Repository
) {
    operator fun invoke(): Flow<PagingData<Hero>> {
        return repository.getAllHeroes()
    }
}