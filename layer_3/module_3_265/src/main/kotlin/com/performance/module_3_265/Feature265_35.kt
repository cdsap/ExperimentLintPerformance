package com.performance.module_3_265

class Feature265UseCase1(
    private val repository: Feature265Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
