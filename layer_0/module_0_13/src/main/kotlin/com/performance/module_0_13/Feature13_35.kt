package com.performance.module_0_13

class Feature13UseCase1(
    private val repository: Feature13Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
