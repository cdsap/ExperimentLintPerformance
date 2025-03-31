package com.performance.module_1_124

class Feature124UseCase1(
    private val repository: Feature124Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
