package com.performance.module_1_124

class Feature124UseCase0(
    private val repository: Feature124Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
