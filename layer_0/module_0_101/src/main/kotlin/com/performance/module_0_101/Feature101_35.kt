package com.performance.module_0_101

class Feature101UseCase1(
    private val repository: Feature101Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
