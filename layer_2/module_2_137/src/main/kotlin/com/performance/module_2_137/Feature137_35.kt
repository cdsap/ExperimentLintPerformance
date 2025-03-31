package com.performance.module_2_137

class Feature137UseCase1(
    private val repository: Feature137Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
