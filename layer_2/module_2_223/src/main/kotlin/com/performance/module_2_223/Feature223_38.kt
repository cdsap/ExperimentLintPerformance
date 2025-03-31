package com.performance.module_2_223

class Feature223UseCase2(
    private val repository: Feature223Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
