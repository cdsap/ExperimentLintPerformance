package com.performance.module_1_92

class Feature92UseCase1(
    private val repository: Feature92Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
