package com.performance.module_0_8

class Feature8UseCase2(
    private val repository: Feature8Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
