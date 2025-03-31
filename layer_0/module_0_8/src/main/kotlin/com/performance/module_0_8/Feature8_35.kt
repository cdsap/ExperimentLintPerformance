package com.performance.module_0_8

class Feature8UseCase1(
    private val repository: Feature8Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
