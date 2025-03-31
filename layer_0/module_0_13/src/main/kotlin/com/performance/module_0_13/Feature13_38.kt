package com.performance.module_0_13

class Feature13UseCase2(
    private val repository: Feature13Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
