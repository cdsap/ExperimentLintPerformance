package com.performance.module_0_92

class Feature92UseCase1(
    private val repository: Feature92Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
