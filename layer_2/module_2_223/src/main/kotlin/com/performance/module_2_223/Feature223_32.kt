package com.performance.module_2_223

class Feature223UseCase0(
    private val repository: Feature223Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
