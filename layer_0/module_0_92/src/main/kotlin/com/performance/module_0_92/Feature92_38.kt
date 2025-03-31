package com.performance.module_0_92

class Feature92UseCase2(
    private val repository: Feature92Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
