package com.performance.module_1_186

class Feature186UseCase1(
    private val repository: Feature186Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
