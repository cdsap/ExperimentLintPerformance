package com.performance.module_1_198

class Feature198UseCase0(
    private val repository: Feature198Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
