package com.performance.module_0_13

class Feature13UseCase0(
    private val repository: Feature13Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
