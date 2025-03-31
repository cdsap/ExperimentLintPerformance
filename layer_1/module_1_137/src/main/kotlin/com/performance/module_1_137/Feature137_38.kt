package com.performance.module_1_137

class Feature137UseCase2(
    private val repository: Feature137Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
