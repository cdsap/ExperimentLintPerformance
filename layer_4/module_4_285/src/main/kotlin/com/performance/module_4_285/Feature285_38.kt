package com.performance.module_4_285

class Feature285UseCase2(
    private val repository: Feature285Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
