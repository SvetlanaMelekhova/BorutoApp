package com.svetlana.learn.borutoapp.domain.use_cases.read_onboarding

import com.svetlana.learn.borutoapp.data.repository.Repository
import kotlinx.coroutines.flow.Flow

class ReadOnBoardingUseCase(
    private val repository: Repository
) {

    operator fun invoke(): Flow<Boolean> {
        return repository.readOnBoardingState()
    }
}