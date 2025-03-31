package com.performance.module_4_285

class Feature285UseCase1(
    private val repository: Feature285Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
