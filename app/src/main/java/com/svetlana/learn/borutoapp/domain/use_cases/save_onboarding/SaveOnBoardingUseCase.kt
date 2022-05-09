package com.svetlana.learn.borutoapp.domain.use_cases.save_onboarding

import com.svetlana.learn.borutoapp.data.repository.Repository

class SaveOnBoardingUseCase(
    private val repository: Repository
) {

    suspend operator fun invoke(completed: Boolean){
        repository.saveOnBoardingState(completed = completed)
    }
}