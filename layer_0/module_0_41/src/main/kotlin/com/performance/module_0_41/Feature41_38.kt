package com.performance.module_0_41

class Feature41UseCase2(
    private val repository: Feature41Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
