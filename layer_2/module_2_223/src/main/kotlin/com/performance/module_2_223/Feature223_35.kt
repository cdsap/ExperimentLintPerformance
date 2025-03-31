package com.performance.module_2_223

class Feature223UseCase1(
    private val repository: Feature223Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
