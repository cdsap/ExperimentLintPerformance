package com.performance.module_1_92

class Feature92UseCase0(
    private val repository: Feature92Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
