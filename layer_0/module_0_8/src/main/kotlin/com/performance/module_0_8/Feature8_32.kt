package com.performance.module_0_8

class Feature8UseCase0(
    private val repository: Feature8Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
