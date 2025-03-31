package com.performance.module_0_124

class Feature124UseCase2(
    private val repository: Feature124Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
