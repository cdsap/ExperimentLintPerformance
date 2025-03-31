package com.performance.module_0_41

class Feature41UseCase1(
    private val repository: Feature41Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
