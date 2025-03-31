package com.performance.module_3_265

class Feature265UseCase0(
    private val repository: Feature265Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
