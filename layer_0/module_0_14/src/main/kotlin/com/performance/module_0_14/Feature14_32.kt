package com.performance.module_0_14

class Feature14UseCase0(
    private val repository: Feature14Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
