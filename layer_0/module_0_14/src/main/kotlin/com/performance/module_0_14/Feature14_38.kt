package com.performance.module_0_14

class Feature14UseCase2(
    private val repository: Feature14Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
