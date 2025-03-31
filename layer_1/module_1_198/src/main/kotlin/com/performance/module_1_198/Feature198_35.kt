package com.performance.module_1_198

class Feature198UseCase1(
    private val repository: Feature198Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
