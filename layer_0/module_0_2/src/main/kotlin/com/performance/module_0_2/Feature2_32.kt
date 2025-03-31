package com.performance.module_0_2

class Feature2UseCase0(
    private val repository: Feature2Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
