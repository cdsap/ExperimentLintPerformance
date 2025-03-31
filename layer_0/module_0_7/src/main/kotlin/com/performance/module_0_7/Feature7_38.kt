package com.performance.module_0_7

class Feature7UseCase2(
    private val repository: Feature7Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
