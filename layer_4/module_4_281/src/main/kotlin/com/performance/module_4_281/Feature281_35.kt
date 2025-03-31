package com.performance.module_4_281

class Feature281UseCase1(
    private val repository: Feature281Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
