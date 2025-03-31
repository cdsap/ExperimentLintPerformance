package com.performance.module_0_2

class Feature2UseCase2(
    private val repository: Feature2Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
