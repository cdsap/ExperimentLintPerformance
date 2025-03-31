package com.performance.module_4_281

class Feature281UseCase2(
    private val repository: Feature281Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
