package com.performance.module_0_7

class Feature7UseCase1(
    private val repository: Feature7Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
