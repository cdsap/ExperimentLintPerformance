package com.performance.module_1_198

class Feature198UseCase2(
    private val repository: Feature198Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
