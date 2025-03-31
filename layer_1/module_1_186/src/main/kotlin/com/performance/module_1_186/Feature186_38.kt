package com.performance.module_1_186

class Feature186UseCase2(
    private val repository: Feature186Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
