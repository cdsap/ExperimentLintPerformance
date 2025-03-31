package com.performance.module_1_137

class Feature137UseCase0(
    private val repository: Feature137Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
