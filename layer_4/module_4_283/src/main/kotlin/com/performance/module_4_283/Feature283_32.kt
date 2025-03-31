package com.performance.module_4_283

class Feature283UseCase0(
    private val repository: Feature283Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
