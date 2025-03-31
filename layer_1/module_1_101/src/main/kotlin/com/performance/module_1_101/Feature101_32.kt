package com.performance.module_1_101

class Feature101UseCase0(
    private val repository: Feature101Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
