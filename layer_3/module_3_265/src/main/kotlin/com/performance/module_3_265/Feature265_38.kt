package com.performance.module_3_265

class Feature265UseCase2(
    private val repository: Feature265Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
