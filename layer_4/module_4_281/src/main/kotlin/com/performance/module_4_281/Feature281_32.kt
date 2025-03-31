package com.performance.module_4_281

class Feature281UseCase0(
    private val repository: Feature281Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
