package com.performance.module_0_2

class Feature2UseCase1(
    private val repository: Feature2Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
