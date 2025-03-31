package com.performance.module_4_285

class Feature285UseCase0(
    private val repository: Feature285Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
