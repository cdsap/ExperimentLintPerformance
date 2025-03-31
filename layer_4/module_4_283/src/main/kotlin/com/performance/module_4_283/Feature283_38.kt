package com.performance.module_4_283

class Feature283UseCase2(
    private val repository: Feature283Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
