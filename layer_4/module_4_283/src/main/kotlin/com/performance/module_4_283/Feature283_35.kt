package com.performance.module_4_283

class Feature283UseCase1(
    private val repository: Feature283Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
