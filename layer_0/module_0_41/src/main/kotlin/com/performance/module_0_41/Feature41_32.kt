package com.performance.module_0_41

class Feature41UseCase0(
    private val repository: Feature41Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
