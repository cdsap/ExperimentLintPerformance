package com.performance.module_1_101

class Feature101UseCase2(
    private val repository: Feature101Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
