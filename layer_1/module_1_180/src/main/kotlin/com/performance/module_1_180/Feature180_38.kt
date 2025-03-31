package com.performance.module_1_180

class Feature180UseCase2(
    private val repository: Feature180Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
